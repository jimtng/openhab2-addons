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

import static org.openhab.binding.matter.internal.MatterBindingConstants.CHANNEL_LABEL_WINDOWCOVERING_LIFT;
import static org.openhab.binding.matter.internal.MatterBindingConstants.CHANNEL_WINDOWCOVERING_LIFT;
import static org.openhab.binding.matter.internal.MatterBindingConstants.ITEM_TYPE_ROLLERSHUTTER;

import java.util.Collections;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.matter.internal.client.model.cluster.ClusterCommand;
import org.openhab.binding.matter.internal.client.model.cluster.gen.WindowCoveringCluster;
import org.openhab.binding.matter.internal.client.model.ws.AttributeChangedMessage;
import org.openhab.binding.matter.internal.handler.EndpointHandler;
import org.openhab.core.library.types.PercentType;
import org.openhab.core.library.types.StopMoveType;
import org.openhab.core.library.types.UpDownType;
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
 */
@NonNullByDefault
public class WindowCoveringConverter extends GenericConverter<WindowCoveringCluster> {

    private final Logger logger = LoggerFactory.getLogger(ModeSelectConverter.class);

    public WindowCoveringConverter(WindowCoveringCluster cluster, EndpointHandler handler) {
        super(cluster, handler);
    }

    public Map<Channel, @Nullable StateDescription> createChannels(ThingUID thingUID) {
        Channel channel = ChannelBuilder
                .create(new ChannelUID(thingUID, CHANNEL_WINDOWCOVERING_LIFT.getId()), ITEM_TYPE_ROLLERSHUTTER)
                .withType(CHANNEL_WINDOWCOVERING_LIFT).withLabel(CHANNEL_LABEL_WINDOWCOVERING_LIFT).build();
        return Collections.singletonMap(channel, null);
    }

    public void handleCommand(ChannelUID channelUID, Command command) {
        if (command instanceof UpDownType upDownType) {
            switch (upDownType) {
                case UP:
                    moveCommand(WindowCoveringCluster.upOrOpen());
                    break;
                case DOWN:
                    moveCommand(WindowCoveringCluster.downOrClose());
                    break;
                default:
                    break;
            }
        } else if (command instanceof StopMoveType stopMoveType) {
            switch (stopMoveType) {
                case STOP:
                    moveCommand(WindowCoveringCluster.stopMotion());
                    break;
                default:
                    break;
            }
        } else if (command instanceof PercentType percentType) {
            moveCommand(WindowCoveringCluster.goToLiftPercentage(percentType.intValue()));
        }
    }

    public void onEvent(AttributeChangedMessage message) {
        Integer numberValue = message.value instanceof Number number ? number.intValue() : 0;
        switch (message.path.attributeName) {
            case "currentPositionLiftPercentage":
                updateState(CHANNEL_WINDOWCOVERING_LIFT, new PercentType(numberValue));
                break;
            case "currentPositionLiftPercent100ths":
                updateState(CHANNEL_WINDOWCOVERING_LIFT, new PercentType(numberValue / 100));
                break;
            default:
                logger.debug("Unknown attribute {}", message.path.attributeName);
        }
    }

    public void updateCluster(WindowCoveringCluster cluster) {
        super.updateCluster(cluster);
        Integer pos = 0;
        if (cluster.currentPositionLift != null) {
            pos = cluster.currentPositionLiftPercentage;
        } else if (cluster.currentPositionLiftPercent100ths != null) {
            pos = cluster.currentPositionLiftPercent100ths / 100;
        }
        updateState(CHANNEL_WINDOWCOVERING_LIFT, new PercentType(pos));
    }

    private void moveCommand(ClusterCommand command) {
        handler.sendClusterCommand(WindowCoveringCluster.CLUSTER_NAME, command);
    }
}
