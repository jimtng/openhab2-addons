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
package org.openhab.binding.matter.internal.devices.types;

import static org.openhab.binding.matter.internal.MatterBindingConstants.CHANNEL_LEVEL_LEVEL;
import static org.openhab.binding.matter.internal.MatterBindingConstants.CHANNEL_ONOFF_ONOFF;

import java.util.Map;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.matter.internal.client.model.cluster.BaseCluster;
import org.openhab.binding.matter.internal.client.model.cluster.gen.ColorControlCluster;
import org.openhab.binding.matter.internal.client.model.cluster.gen.DeviceTypes;
import org.openhab.binding.matter.internal.client.model.cluster.gen.LevelControlCluster;
import org.openhab.binding.matter.internal.client.model.cluster.gen.OnOffCluster;
import org.openhab.binding.matter.internal.client.model.ws.AttributeChangedMessage;
import org.openhab.binding.matter.internal.devices.converter.ColorControlConverter;
import org.openhab.binding.matter.internal.devices.converter.GenericConverter;
import org.openhab.binding.matter.internal.handler.EndpointHandler;
import org.openhab.core.library.types.OnOffType;
import org.openhab.core.library.types.PercentType;
import org.openhab.core.thing.type.ChannelTypeUID;
import org.openhab.core.types.State;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Dan Cunningham
 * 
 *         Lighting requires special handling for the OnOff, ColorControl and LevelControl clusters.
 *         For example, the Matter specification mandates Switches also must have a LevelControl cluster, even though
 *         they do not support dimming. We will filter those clusters out as well as coordinate commands among required
 *         clusters
 */
@NonNullByDefault
public class LightingType extends DeviceType {
    private final Logger logger = LoggerFactory.getLogger(LightingType.class);
    private PercentType lastLevel = new PercentType(0);

    public LightingType(Integer deviceType, EndpointHandler handler) {
        super(deviceType, handler);
    }

    @Override
    public void updateCluster(BaseCluster cluster) {
        if (cluster instanceof LevelControlCluster levelControlCluster) {
            lastLevel = GenericConverter.levelToPercent(levelControlCluster.currentLevel);
            if (clusterToConverters
                    .get(ColorControlCluster.CLUSTER_ID) instanceof ColorControlConverter colorControlConverter) {
                colorControlConverter.updateBrightness(lastLevel);
            }
        }
        if (cluster instanceof OnOffCluster onOffCluster) {
            OnOffType onOff = OnOffType.from(Boolean.valueOf(onOffCluster.onOff));
            logger.debug("OnOff {}", onOff);
            updateChannel(OnOffCluster.CLUSTER_ID, CHANNEL_ONOFF_ONOFF, onOff);
            if (clusterToConverters
                    .get(ColorControlCluster.CLUSTER_ID) instanceof ColorControlConverter colorControlConverter) {
                colorControlConverter.updateBrightness(onOff == OnOffType.OFF ? new PercentType(0) : lastLevel);
            }
            updateChannel(LevelControlCluster.CLUSTER_ID, CHANNEL_LEVEL_LEVEL, onOff);
        }
        super.updateCluster(cluster);
    }

    @Override
    public void onEvent(AttributeChangedMessage message) {
        logger.debug("OnEvent: {}", message.path.attributeName);
        Integer numberValue = message.value instanceof Number number ? number.intValue() : 0;
        switch (message.path.attributeName) {
            case "currentLevel":
                lastLevel = GenericConverter.levelToPercent(numberValue);
                if (clusterToConverters
                        .get(ColorControlCluster.CLUSTER_ID) instanceof ColorControlConverter colorControlConverter) {
                    colorControlConverter.updateBrightness(lastLevel);
                }
                break;
            case "onOff":
                OnOffType onOff = OnOffType.from((Boolean) message.value);
                if (clusterToConverters
                        .get(ColorControlCluster.CLUSTER_ID) instanceof ColorControlConverter colorControlConverter) {
                    colorControlConverter.updateBrightness(onOff == OnOffType.OFF ? new PercentType(0) : lastLevel);
                }
                updateChannel(LevelControlCluster.CLUSTER_ID, CHANNEL_LEVEL_LEVEL, onOff);
                break;
        }
        super.onEvent(message);
    }

    @Override
    protected @Nullable GenericConverter<? extends BaseCluster> createConverter(BaseCluster cluster,
            Map<String, BaseCluster> allClusters) {
        logger.debug("checking converter for cluster: {}", cluster.getClass().getSimpleName());
        if (cluster instanceof OnOffCluster) {
            // don't add a switch to dimmable devices or color devices
            if (!isSwitch()) {
                return null;
            }

        }
        if (cluster instanceof LevelControlCluster) {
            // don't add a dimmer to only switchable devices or color devices (as openHAB Color types already support
            // dimming)
            if (isSwitch() || isColor()) {
                return null;
            }
        }

        return super.createConverter(cluster, allClusters);
    }

    private void updateChannel(Integer clusterId, ChannelTypeUID channelTypeUID, State state) {
        GenericConverter<? extends BaseCluster> converter = clusterToConverters.get(clusterId);
        if (converter != null) {
            @SuppressWarnings("unchecked")
            GenericConverter<BaseCluster> specificConverter = (GenericConverter<BaseCluster>) converter;
            specificConverter.updateState(channelTypeUID, state);
        }
    }

    private boolean isSwitch() {
        return deviceType.equals(DeviceTypes.OnOffLight) || deviceType.equals(DeviceTypes.OnOffLightSwitch)
                || deviceType.equals(DeviceTypes.OnOffPlugInUnit);
    }

    private boolean isColor() {
        return deviceType.equals(DeviceTypes.ExtendedColorLight)
                || deviceType.equals(DeviceTypes.ColorTemperatureLight);
    }
}
