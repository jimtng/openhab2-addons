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

import static org.openhab.binding.matter.internal.MatterBindingConstants.CHANNEL_MODESELECT_MODE;
import static org.openhab.binding.matter.internal.MatterBindingConstants.ITEM_TYPE_NUMBER;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.matter.internal.client.model.cluster.ClusterCommand;
import org.openhab.binding.matter.internal.client.model.cluster.gen.ModeSelectCluster;
import org.openhab.binding.matter.internal.client.model.ws.AttributeChangedMessage;
import org.openhab.binding.matter.internal.handler.EndpointHandler;
import org.openhab.core.library.types.DecimalType;
import org.openhab.core.thing.Channel;
import org.openhab.core.thing.ChannelUID;
import org.openhab.core.thing.ThingUID;
import org.openhab.core.thing.binding.builder.ChannelBuilder;
import org.openhab.core.types.Command;
import org.openhab.core.types.StateDescription;
import org.openhab.core.types.StateDescriptionFragmentBuilder;
import org.openhab.core.types.StateOption;

/**
 * @author Dan Cunningham
 */
@NonNullByDefault
public class ModeSelectConverter extends GenericConverter<ModeSelectCluster> {

    public ModeSelectConverter(ModeSelectCluster cluster, EndpointHandler handler) {
        super(cluster, handler);
    }

    public Map<Channel, @Nullable StateDescription> createChannels(ThingUID thingUID) {

        Channel channel = ChannelBuilder
                .create(new ChannelUID(thingUID, CHANNEL_MODESELECT_MODE.getId()), ITEM_TYPE_NUMBER)
                .withType(CHANNEL_MODESELECT_MODE).withLabel(cluster.description).build();

        List<StateOption> modeOptions = new ArrayList<>();
        cluster.supportedModes.forEach(mode -> modeOptions.add(new StateOption(mode.mode.toString(), mode.label)));

        @Nullable
        StateDescription stateDescriptionMode = StateDescriptionFragmentBuilder.create().withPattern("%d")
                .withOptions(modeOptions).build().toStateDescription();

        return Collections.singletonMap(channel, stateDescriptionMode);
    }

    public void handleCommand(ChannelUID channelUID, Command command) {
        if (command instanceof DecimalType) {
            ClusterCommand cc = ModeSelectCluster.changeToMode(((DecimalType) command).intValue());
            handler.sendClusterCommand(ModeSelectCluster.CLUSTER_NAME, cc);
        }
    }

    public void onEvent(AttributeChangedMessage message) {
        Integer numberValue = message.value instanceof Number number ? number.intValue() : 0;
        switch (message.path.attributeName) {
            case "currentMode":
                cluster.currentMode = numberValue;
                updateState(CHANNEL_MODESELECT_MODE, new DecimalType(numberValue));
                break;
        }
    }

    public void updateCluster(ModeSelectCluster cluster) {
        super.updateCluster(cluster);
        updateState(CHANNEL_MODESELECT_MODE, new DecimalType(cluster.currentMode));
    }
}
