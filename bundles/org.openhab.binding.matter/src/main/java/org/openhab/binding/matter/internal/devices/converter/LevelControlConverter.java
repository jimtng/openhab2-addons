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
package org.openhab.binding.matter.internal.devices.converter;

import static org.openhab.binding.matter.internal.MatterBindingConstants.CHANNEL_LABEL_LEVEL_LEVEL;
import static org.openhab.binding.matter.internal.MatterBindingConstants.CHANNEL_LEVEL_LEVEL;
import static org.openhab.binding.matter.internal.MatterBindingConstants.ITEM_TYPE_DIMMER;

import java.util.Collections;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.matter.internal.client.model.cluster.ClusterCommand;
import org.openhab.binding.matter.internal.client.model.cluster.gen.LevelControlCluster;
import org.openhab.binding.matter.internal.client.model.cluster.gen.LevelControlCluster.OptionsBitmap;
import org.openhab.binding.matter.internal.client.model.ws.AttributeChangedMessage;
import org.openhab.binding.matter.internal.handler.EndpointHandler;
import org.openhab.core.library.types.OnOffType;
import org.openhab.core.library.types.PercentType;
import org.openhab.core.thing.Channel;
import org.openhab.core.thing.ChannelUID;
import org.openhab.core.thing.ThingUID;
import org.openhab.core.thing.binding.builder.ChannelBuilder;
import org.openhab.core.types.Command;
import org.openhab.core.types.StateDescription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Dan Cunningham
 * 
 */
@NonNullByDefault
public class LevelControlConverter extends GenericConverter<LevelControlCluster> {

    private final Logger logger = LoggerFactory.getLogger(LevelControlConverter.class);

    public LevelControlConverter(LevelControlCluster cluster, EndpointHandler handler) {
        super(cluster, handler);
    }

    public Map<Channel, @Nullable StateDescription> createChannels(ThingUID thingUID) {

        Channel channel = ChannelBuilder.create(new ChannelUID(thingUID, CHANNEL_LEVEL_LEVEL.getId()), ITEM_TYPE_DIMMER)
                .withType(CHANNEL_LEVEL_LEVEL).withLabel(CHANNEL_LABEL_LEVEL_LEVEL).build();
        return Collections.singletonMap(channel, null);
    }

    public void handleCommand(ChannelUID channelUID, Command command) {
        if (command instanceof OnOffType onOffType) {
            ClusterCommand levelCommand = LevelControlCluster.moveToLevelWithOnOff(onOffType == OnOffType.OFF ? 0 : 100,
                    0, new OptionsBitmap(true, true), new OptionsBitmap(true, true));
            handler.sendClusterCommand(LevelControlCluster.CLUSTER_NAME, levelCommand);
        } else if (command instanceof PercentType percentType) {
            ClusterCommand levelCommand = LevelControlCluster.moveToLevelWithOnOff(percentToLevel(percentType), 0,
                    new OptionsBitmap(true, true), new OptionsBitmap(true, true));
            handler.sendClusterCommand(LevelControlCluster.CLUSTER_NAME, levelCommand);
        }
    }

    public void onEvent(AttributeChangedMessage message) {
        switch (message.path.attributeName) {
            case "currentLevel":
                Integer numberValue = message.value instanceof Number number ? number.intValue() : 0;
                logger.debug("currentLevel {}", message.value);
                updateState(CHANNEL_LEVEL_LEVEL, levelToPercent(numberValue));
                break;
        }
    }

    public void updateCluster(LevelControlCluster cluster) {
        super.updateCluster(cluster);
        updateState(CHANNEL_LEVEL_LEVEL, levelToPercent(cluster.currentLevel));
    }
}
