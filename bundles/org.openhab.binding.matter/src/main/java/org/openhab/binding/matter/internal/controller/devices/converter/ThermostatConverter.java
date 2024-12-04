/**
 * Copyright (c) 2010-2024 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.matter.internal.controller.devices.converter;

import static org.openhab.binding.matter.internal.MatterBindingConstants.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.matter.internal.client.model.cluster.gen.ThermostatCluster;
import org.openhab.binding.matter.internal.client.model.ws.AttributeChangedMessage;
import org.openhab.binding.matter.internal.handler.MatterBaseThingHandler;
import org.openhab.core.library.types.DecimalType;
import org.openhab.core.thing.Channel;
import org.openhab.core.thing.ChannelGroupUID;
import org.openhab.core.thing.ChannelUID;
import org.openhab.core.thing.binding.builder.ChannelBuilder;
import org.openhab.core.types.Command;
import org.openhab.core.types.StateDescription;
import org.openhab.core.types.StateDescriptionFragmentBuilder;
import org.openhab.core.types.StateOption;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Dan Cunningham
 */
@NonNullByDefault
public class ThermostatConverter extends GenericConverter<ThermostatCluster> {

    private final Logger logger = LoggerFactory.getLogger(ThermostatConverter.class);

    public ThermostatConverter(ThermostatCluster cluster, MatterBaseThingHandler handler, int endpointNumber,
            String labelPrefix) {
        super(cluster, handler, endpointNumber, labelPrefix);
    }

    public Map<Channel, @Nullable StateDescription> createChannels(ChannelGroupUID thingUID) {
        Map<Channel, @Nullable StateDescription> channels = new HashMap<>();

        Channel channel = ChannelBuilder
                .create(new ChannelUID(thingUID, CHANNEL_THERMOSTAT_SYSTEMMODE.getId()), ITEM_TYPE_NUMBER)
                .withType(CHANNEL_THERMOSTAT_SYSTEMMODE).withLabel(formatLabel(CHANNEL_LABEL_THERMOSTAT_SYSTEMMODE))
                .build();

        List<StateOption> modeOptions = new ArrayList<>();

        modeOptions.add(new StateOption(ThermostatCluster.SystemModeEnum.OFF.value.toString(),
                ThermostatCluster.SystemModeEnum.OFF.label));
        if (cluster.featureMap.autoMode) {
            modeOptions.add(new StateOption(ThermostatCluster.SystemModeEnum.AUTO.value.toString(),
                    ThermostatCluster.SystemModeEnum.AUTO.label));
        }
        if (cluster.featureMap.cooling) {
            modeOptions.add(new StateOption(ThermostatCluster.SystemModeEnum.COOL.value.toString(),
                    ThermostatCluster.SystemModeEnum.COOL.label));
            modeOptions.add(new StateOption(ThermostatCluster.SystemModeEnum.PRECOOLING.value.toString(),
                    ThermostatCluster.SystemModeEnum.PRECOOLING.label));
        }
        if (cluster.featureMap.heating) {
            modeOptions.add(new StateOption(ThermostatCluster.SystemModeEnum.HEAT.value.toString(),
                    ThermostatCluster.SystemModeEnum.HEAT.label));
            modeOptions.add(new StateOption(ThermostatCluster.SystemModeEnum.EMERGENCY_HEAT.value.toString(),
                    ThermostatCluster.SystemModeEnum.EMERGENCY_HEAT.label));
        }
        modeOptions.add(new StateOption(ThermostatCluster.SystemModeEnum.FAN_ONLY.value.toString(),
                ThermostatCluster.SystemModeEnum.FAN_ONLY.label));
        modeOptions.add(new StateOption(ThermostatCluster.SystemModeEnum.DRY.value.toString(),
                ThermostatCluster.SystemModeEnum.DRY.label));
        modeOptions.add(new StateOption(ThermostatCluster.SystemModeEnum.SLEEP.value.toString(),
                ThermostatCluster.SystemModeEnum.SLEEP.label));

        StateDescription stateDescriptionMode = StateDescriptionFragmentBuilder.create().withPattern("%d")
                .withOptions(modeOptions).build().toStateDescription();
        channels.put(channel, stateDescriptionMode);

        if (!cluster.featureMap.localTemperatureNotExposed) {
            Channel tempChannel = ChannelBuilder
                    .create(new ChannelUID(thingUID, CHANNEL_THERMOSTAT_LOCALTEMPERATURE.getId()),
                            ITEM_TYPE_NUMBER_TEMPERATURE)
                    .withType(CHANNEL_THERMOSTAT_LOCALTEMPERATURE)
                    .withLabel(formatLabel(CHANNEL_LABEL_THERMOSTAT_LOCALTEMPERATURE)).build();

            StateDescription stateDescription = StateDescriptionFragmentBuilder.create().withPattern("%.1f %unit%")
                    .build().toStateDescription();
            channels.put(tempChannel, stateDescription);
        }
        if (cluster.outdoorTemperature != null) {
            Channel tempChannel = ChannelBuilder
                    .create(new ChannelUID(thingUID, CHANNEL_THERMOSTAT_OUTDOORTEMPERATURE.getId()),
                            ITEM_TYPE_NUMBER_TEMPERATURE)
                    .withType(CHANNEL_THERMOSTAT_OUTDOORTEMPERATURE)
                    .withLabel(formatLabel(CHANNEL_LABEL_THERMOSTAT_OUTDOORTEMPERATURE)).build();
            StateDescription stateDescription = StateDescriptionFragmentBuilder.create().withPattern("%.1f %unit%")
                    .build().toStateDescription();
            channels.put(tempChannel, stateDescription);
        }
        if (cluster.featureMap.heating) {
            Channel tempChannel = ChannelBuilder
                    .create(new ChannelUID(thingUID, CHANNEL_THERMOSTAT_OCCUPIEDHEATING.getId()),
                            ITEM_TYPE_NUMBER_TEMPERATURE)
                    .withType(CHANNEL_THERMOSTAT_OCCUPIEDHEATING)
                    .withLabel(formatLabel(CHANNEL_LABEL_THERMOSTAT_OCCUPIEDHEATING)).build();
            StateDescription stateDescription = StateDescriptionFragmentBuilder.create()
                    .withMinimum(valueToTemperature(cluster.absMinHeatSetpointLimit).toBigDecimal())
                    .withMaximum(valueToTemperature(cluster.absMaxHeatSetpointLimit).toBigDecimal())
                    .withStep(BigDecimal.valueOf(1)).withPattern("%.1f %unit%").withReadOnly(false).build()
                    .toStateDescription();
            channels.put(tempChannel, stateDescription);
        }
        if (cluster.featureMap.cooling) {
            Channel tempChannel = ChannelBuilder
                    .create(new ChannelUID(thingUID, CHANNEL_THERMOSTAT_OCCUPIEDCOOLING.getId()),
                            ITEM_TYPE_NUMBER_TEMPERATURE)
                    .withType(CHANNEL_THERMOSTAT_OCCUPIEDCOOLING)
                    .withLabel(formatLabel(CHANNEL_LABEL_THERMOSTAT_OCCUPIEDCOOLING)).build();
            StateDescription stateDescription = StateDescriptionFragmentBuilder.create()
                    .withMinimum(valueToTemperature(cluster.absMinCoolSetpointLimit).toBigDecimal())
                    .withMaximum(valueToTemperature(cluster.absMaxCoolSetpointLimit).toBigDecimal())
                    .withStep(BigDecimal.valueOf(1)).withPattern("%.1f %unit%").withReadOnly(false).build()
                    .toStateDescription();
            channels.put(tempChannel, stateDescription);
        }
        if (cluster.featureMap.occupancy) {
            if (cluster.featureMap.heating) {
                Channel tempChannel = ChannelBuilder
                        .create(new ChannelUID(thingUID, CHANNEL_THERMOSTAT_UNOCCUPIEDHEATING.getId()),
                                ITEM_TYPE_NUMBER_TEMPERATURE)
                        .withType(CHANNEL_THERMOSTAT_UNOCCUPIEDHEATING)
                        .withLabel(formatLabel(CHANNEL_LABEL_THERMOSTAT_UNOCCUPIEDHEATING)).build();
                StateDescription stateDescription = StateDescriptionFragmentBuilder.create()
                        .withMinimum(valueToTemperature(cluster.absMinHeatSetpointLimit).toBigDecimal())
                        .withMaximum(valueToTemperature(cluster.absMaxHeatSetpointLimit).toBigDecimal())
                        .withStep(BigDecimal.valueOf(1)).withPattern("%.1f %unit%").withReadOnly(false).build()
                        .toStateDescription();
                channels.put(tempChannel, stateDescription);
            }
            if (cluster.featureMap.cooling) {
                Channel tempChannel = ChannelBuilder
                        .create(new ChannelUID(thingUID, CHANNEL_THERMOSTAT_UNOCCUPIEDCOOLING.getId()),
                                ITEM_TYPE_NUMBER_TEMPERATURE)
                        .withType(CHANNEL_THERMOSTAT_UNOCCUPIEDCOOLING)
                        .withLabel(formatLabel(CHANNEL_LABEL_THERMOSTAT_UNOCCUPIEDCOOLING)).build();
                StateDescription stateDescription = StateDescriptionFragmentBuilder.create()
                        .withMinimum(valueToTemperature(cluster.absMinCoolSetpointLimit).toBigDecimal())
                        .withMaximum(valueToTemperature(cluster.absMaxCoolSetpointLimit).toBigDecimal())
                        .withStep(BigDecimal.valueOf(1)).withPattern("%.1f %unit%").withReadOnly(false).build()
                        .toStateDescription();
                channels.put(tempChannel, stateDescription);
            }
        }
        if (cluster.thermostatRunningMode != null) {
            Channel tempChannel = ChannelBuilder
                    .create(new ChannelUID(thingUID, CHANNEL_THERMOSTAT_RUNNINGMODE.getId()), ITEM_TYPE_NUMBER)
                    .withType(CHANNEL_THERMOSTAT_RUNNINGMODE)
                    .withLabel(formatLabel(CHANNEL_LABEL_THERMOSTAT_UNOCCUPIEDCOOLING)).build();
            List<StateOption> options = new ArrayList<>();
            options.add(new StateOption(ThermostatCluster.ThermostatRunningModeEnum.OFF.value.toString(),
                    ThermostatCluster.ThermostatRunningModeEnum.OFF.label));
            options.add(new StateOption(ThermostatCluster.ThermostatRunningModeEnum.HEAT.value.toString(),
                    ThermostatCluster.ThermostatRunningModeEnum.HEAT.label));
            options.add(new StateOption(ThermostatCluster.ThermostatRunningModeEnum.COOL.value.toString(),
                    ThermostatCluster.ThermostatRunningModeEnum.COOL.label));
            StateDescription stateDescription = StateDescriptionFragmentBuilder.create().withOptions(options).build()
                    .toStateDescription();
            channels.put(tempChannel, stateDescription);
        }

        return channels;
    }

    public void handleCommand(ChannelUID channelUID, Command command) {
        String id = channelUID.getId();
        if (id.equals(CHANNEL_THERMOSTAT_SYSTEMMODE.getId())) {
            handler.writeAttribute(endpointNumber, ThermostatCluster.CLUSTER_NAME, "systemMode", command.toString());
            return;
        }
        if (id.equals(CHANNEL_THERMOSTAT_OCCUPIEDHEATING.getId())) {
            handler.writeAttribute(endpointNumber, ThermostatCluster.CLUSTER_NAME, "occupiedHeatingSetpoint",
                    String.valueOf(temperatureToValue(command)));
            return;
        }
        if (id.equals(CHANNEL_THERMOSTAT_OCCUPIEDCOOLING.getId())) {
            handler.writeAttribute(endpointNumber, ThermostatCluster.CLUSTER_NAME, "occupiedCoolingSetpoint",
                    String.valueOf(temperatureToValue(command)));
            return;
        }
    }

    public void onEvent(AttributeChangedMessage message) {
        logger.debug("OnEvent: {}", message.path.attributeName);
        Integer numberValue = message.value instanceof Number number ? number.intValue() : 0;
        switch (message.path.attributeName) {
            case "systemMode":
                updateState(CHANNEL_THERMOSTAT_SYSTEMMODE, new DecimalType(numberValue));
                break;
            case "occupiedHeatingSetpoint":
                updateState(CHANNEL_THERMOSTAT_OCCUPIEDHEATING, valueToTemperature(numberValue));
                break;
            case "occupiedCoolingSetpoint":
                updateState(CHANNEL_THERMOSTAT_OCCUPIEDCOOLING, valueToTemperature(numberValue));
                break;
            case "unoccupiedHeatingSetpoint":
                updateState(CHANNEL_THERMOSTAT_UNOCCUPIEDHEATING, valueToTemperature(numberValue));
                break;
            case "unoccupiedCoolingSetpoint":
                updateState(CHANNEL_THERMOSTAT_UNOCCUPIEDCOOLING, valueToTemperature(numberValue));
                break;
            case "localTemperature":
                updateState(CHANNEL_THERMOSTAT_LOCALTEMPERATURE, valueToTemperature(numberValue));
                break;
            case "outdoorTemperature":
                updateState(CHANNEL_THERMOSTAT_OUTDOORTEMPERATURE, valueToTemperature(numberValue));
                break;
            case "thermostatRunningMode":
                updateState(CHANNEL_THERMOSTAT_RUNNINGMODE, new DecimalType(numberValue));
                break;
            default:
                logger.debug("Unknown attribute {}", message.path.attributeName);
        }
    }

    public void updateCluster(ThermostatCluster cluster) {
        super.updateCluster(cluster);
        if (cluster.localTemperature != null) {
            updateState(CHANNEL_THERMOSTAT_LOCALTEMPERATURE, valueToTemperature(cluster.localTemperature));
        }
        if (cluster.outdoorTemperature != null) {
            updateState(CHANNEL_THERMOSTAT_OUTDOORTEMPERATURE, valueToTemperature(cluster.outdoorTemperature));
        }
        if (cluster.systemMode != null) {
            updateState(CHANNEL_THERMOSTAT_SYSTEMMODE, new DecimalType(cluster.systemMode.value));
        }
        if (cluster.occupiedHeatingSetpoint != null) {
            updateState(CHANNEL_THERMOSTAT_OCCUPIEDHEATING, valueToTemperature(cluster.occupiedHeatingSetpoint));
        }
        if (cluster.occupiedCoolingSetpoint != null) {
            updateState(CHANNEL_THERMOSTAT_OCCUPIEDCOOLING, valueToTemperature(cluster.occupiedCoolingSetpoint));
        }
        if (cluster.unoccupiedHeatingSetpoint != null) {
            updateState(CHANNEL_THERMOSTAT_UNOCCUPIEDHEATING, valueToTemperature(cluster.unoccupiedHeatingSetpoint));
        }
        if (cluster.unoccupiedCoolingSetpoint != null) {
            updateState(CHANNEL_THERMOSTAT_UNOCCUPIEDCOOLING, valueToTemperature(cluster.unoccupiedCoolingSetpoint));
        }
        if (cluster.thermostatRunningMode != null) {
            updateState(CHANNEL_THERMOSTAT_RUNNINGMODE, new DecimalType(cluster.thermostatRunningMode.value));
        }
    }
}
