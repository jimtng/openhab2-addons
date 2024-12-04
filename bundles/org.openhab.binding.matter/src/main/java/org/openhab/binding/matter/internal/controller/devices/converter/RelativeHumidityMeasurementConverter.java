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

import static org.openhab.binding.matter.internal.MatterBindingConstants.CHANNEL_HUMIDITYMEASURMENT_MEASUREDVALUE;
import static org.openhab.binding.matter.internal.MatterBindingConstants.CHANNEL_LABEL_HUMIDITYMEASURMENT_MEASUREDVALUE;
import static org.openhab.binding.matter.internal.MatterBindingConstants.ITEM_TYPE_NUMBER_TEMPERATURE;

import java.util.Collections;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.matter.internal.client.model.cluster.gen.RelativeHumidityMeasurementCluster;
import org.openhab.binding.matter.internal.client.model.ws.AttributeChangedMessage;
import org.openhab.binding.matter.internal.handler.MatterBaseThingHandler;
import org.openhab.core.library.types.PercentType;
import org.openhab.core.thing.Channel;
import org.openhab.core.thing.ChannelGroupUID;
import org.openhab.core.thing.ChannelUID;
import org.openhab.core.thing.binding.builder.ChannelBuilder;
import org.openhab.core.types.Command;
import org.openhab.core.types.StateDescription;

/**
 * @author Dan Cunningham
 */
@NonNullByDefault
public class RelativeHumidityMeasurementConverter extends GenericConverter<RelativeHumidityMeasurementCluster> {

    public RelativeHumidityMeasurementConverter(RelativeHumidityMeasurementCluster cluster,
            MatterBaseThingHandler handler, int endpointNumber, String labelPrefix) {
        super(cluster, handler, endpointNumber, labelPrefix);
    }

    public Map<Channel, @Nullable StateDescription> createChannels(ChannelGroupUID thingUID) {
        Channel channel = ChannelBuilder
                .create(new ChannelUID(thingUID, CHANNEL_HUMIDITYMEASURMENT_MEASUREDVALUE.getId()),
                        ITEM_TYPE_NUMBER_TEMPERATURE)
                .withType(CHANNEL_HUMIDITYMEASURMENT_MEASUREDVALUE)
                .withLabel(formatLabel(CHANNEL_LABEL_HUMIDITYMEASURMENT_MEASUREDVALUE)).build();
        return Collections.singletonMap(channel, null);
    }

    public void handleCommand(ChannelUID channelUID, Command command) {
    }

    public void onEvent(AttributeChangedMessage message) {
        switch (message.path.attributeName) {
            case "measuredValue":
                updateState(CHANNEL_HUMIDITYMEASURMENT_MEASUREDVALUE, humidityToPercent((Number) message.value));
                break;
        }
    }

    public void updateCluster(RelativeHumidityMeasurementCluster cluster) {
        super.updateCluster(cluster);
        updateState(CHANNEL_HUMIDITYMEASURMENT_MEASUREDVALUE, humidityToPercent(cluster.measuredValue));
    }

    private PercentType humidityToPercent(Number number) {
        int value = number.intValue();
        return new PercentType(value == 0 ? 0 : value / 100);
    }
}
