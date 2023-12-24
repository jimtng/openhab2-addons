/**
 * Copyright (c) 2010-2023 Contributors to the openHAB project
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
package org.openhab.binding.matter.internal.handler;

import static org.openhab.binding.matter.internal.MatterBindingConstants.*;

import org.openhab.binding.matter.internal.client.AttributeListener;
import org.openhab.binding.matter.internal.client.MatterClient;
import org.openhab.binding.matter.internal.client.MatterWebsocketClient;
import org.openhab.binding.matter.internal.client.model.cluster.LevelControlCluster;
import org.openhab.core.library.types.DecimalType;
import org.openhab.core.library.types.IncreaseDecreaseType;
import org.openhab.core.library.types.OnOffType;
import org.openhab.core.library.types.PercentType;
import org.openhab.core.thing.ChannelUID;
import org.openhab.core.thing.Thing;
import org.openhab.core.types.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Dan Cunningham
 *
 */
public class LevelControlHandler extends ClusterHandler {
    private final Logger logger = LoggerFactory.getLogger(ClusterHandler.class);

    public LevelControlHandler(Thing thing) {
        super(thing);
    }

    @Override
    protected void registerListeners() {
        // we should pass in the matter client, we should register to listen for cluster events for this
        // node/endpoint/cluster and use generics <T> for the specific cluster
        MatterClient client = this.client;
        if (client == null) {
            logger.debug("Can not register for listeners, client not set");
            return;
        }
        // maybe we should just listen to all events, so we can respond to multiple clusterss
        client.addAttributeListener(new AttributeListener() {
            @Override
            public void onEvent(MatterWebsocketClient.AttributeChangedMessage message) {
                switch (message.path.attributeName) {
                    case "onOff":
                        updateState(CHANNEL_NAME_SWITCH_LEVEL, OnOffType.from(Boolean.valueOf(message.value)));
                        break;
                    case "currentLevel":
                        updateState(CHANNEL_NAME_SWITCH_LEVEL, new DecimalType(message.value));
                }
            }
        }, null, getClusterId(), getClusterId());
    }

    @Override
    public void handleCommand(ChannelUID channelUID, Command command) {
        if (command instanceof OnOffType) {

        } else if (command instanceof PercentType) {

        } else if (command instanceof IncreaseDecreaseType) {

        } else {
            logger.warn("{}: Level converter only accepts PercentType, IncreaseDecreaseType and OnOffType - not {}", "",
                    command.getClass().getSimpleName());
            return;
        }
    }

    public void updateCluster(LevelControlCluster cluster) {
        this.cluster = cluster;
    }

    @Override
    protected void createChannels() {
        createChannel(CHANNEL_NAME_SWITCH_LEVEL, CHANNEL_SWITCH_LEVEL, CHANNEL_LABEL_SWITCH_LEVEL, ITEM_TYPE_DIMMER);
    }
}
