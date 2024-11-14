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

import java.util.*;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.matter.internal.client.AttributeListener;
import org.openhab.binding.matter.internal.client.EventTriggeredListener;
import org.openhab.binding.matter.internal.client.model.cluster.BaseCluster;
import org.openhab.binding.matter.internal.client.model.ws.AttributeChangedMessage;
import org.openhab.binding.matter.internal.client.model.ws.EventTriggeredMessage;
import org.openhab.binding.matter.internal.devices.converter.ConverterRegistry;
import org.openhab.binding.matter.internal.devices.converter.GenericConverter;
import org.openhab.binding.matter.internal.handler.EndpointHandler;
import org.openhab.core.thing.Channel;
import org.openhab.core.thing.ChannelUID;
import org.openhab.core.thing.binding.builder.ThingBuilder;
import org.openhab.core.types.Command;
import org.openhab.core.types.StateDescription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Dan Cunningham
 * 
 *         A Matter Device type is a grouping of clusters that represent a single device, like a thermostat, Light,
 *         etc. This classification specifies which clusters are mandatory and which are optional for a given device
 *         type, although devices can have any number or type of Matter clusters. This is suppose to ease client
 *         development by providing a common interface for interacting with common devices types.
 * 
 *         The DeviceType class coordinates sending openHAB commands to Matter clusters and updating openHAB channels
 *         based on Matter cluster events. Some device types like lighting devices require coordination among their
 *         clusters, others do not. A DeviceType Class depends on one or more GenericConverter classes to handle the
 *         conversion of Matter cluster events to openHAB channel updates and openHAB channel commands to Matter cluster
 *         commands.
 * 
 *         Typically, we map a single openHAB channel or item type, like Color, which accepts multiple command types:
 *         HSB,Percent, and OnOff to multiple Matter clusters, like ColorControl and LevelControl and OnOffControl
 * 
 *         Most Device types need little coordination so the default logic (and GenericType instance) will suffice, but
 *         this can be overridden to provide custom logic for more complex devices (like lighting)
 */
@NonNullByDefault
public abstract class DeviceType implements AttributeListener, EventTriggeredListener {
    private final Logger logger = LoggerFactory.getLogger(DeviceType.class);

    protected Integer deviceType;
    protected EndpointHandler handler;

    protected Map<ChannelUID, GenericConverter<? extends BaseCluster>> channelUIDToConverters = new HashMap<>();
    protected Map<ChannelUID, @Nullable StateDescription> channelUIDToStateDescription = new HashMap<>();

    protected Map<Integer, GenericConverter<? extends BaseCluster>> clusterToConverters = new HashMap<>();

    public DeviceType(Integer deviceType, EndpointHandler handler) {
        this.deviceType = deviceType;
        this.handler = handler;
    }

    public void handleCommand(ChannelUID channelUID, Command command) {
        logger.debug("Handling command for channel: " + channelUID);
        Optional.ofNullable(channelUIDToConverters.get(channelUID))
                .ifPresent(converter -> converter.handleCommand(channelUID, command));
    }

    /**
     * Update the cluster with new data
     * 
     * @param cluster
     */
    public void updateCluster(BaseCluster cluster) {
        GenericConverter<? extends BaseCluster> converter = clusterToConverters.get(cluster.id);
        if (converter != null) {
            @SuppressWarnings("unchecked")
            GenericConverter<BaseCluster> specificConverter = (GenericConverter<BaseCluster>) converter;
            specificConverter.updateCluster(cluster);
        } else {
            logger.debug("updateCluster: finished processing for cluster: " + cluster.id);
        }
    }

    @Override
    public void onEvent(AttributeChangedMessage message) {
        GenericConverter<? extends BaseCluster> converter = clusterToConverters.get(message.path.clusterId);
        if (converter != null) {
            converter.onEvent(message);
        } else {
            logger.debug("onEvent: No converter found for cluster: " + message.path.clusterId);
        }
    }

    @Override
    public void onEvent(EventTriggeredMessage message) {
        GenericConverter<? extends BaseCluster> converter = clusterToConverters.get(message.path.clusterId);
        if (converter != null) {
            converter.onEvent(message);
        } else {
            logger.debug("onEvent: No converter found for cluster: " + message.path.clusterId);
        }
    }

    /**
     * Create openHAB channels for the device type based on the clusters provided
     * 
     * @param clusters
     */
    public final void createChannels(Map<String, BaseCluster> clusters) {
        List<Channel> existingChannels = new ArrayList<>(handler.getThing().getChannels());
        clusters.forEach((clusterName, cluster) -> {
            logger.debug("Creating channels for cluster: " + clusterName);
            GenericConverter<? extends BaseCluster> converter = createConverter(cluster, clusters);
            if (converter != null) {
                logger.debug("Converter found for cluster: " + clusterName);
                Map<Channel, @Nullable StateDescription> converterChannels = converter
                        .createChannels(handler.getThing().getUID());
                for (Channel channel : converterChannels.keySet()) {
                    channelUIDToConverters.put(channel.getUID(), converter);
                    channelUIDToStateDescription.put(channel.getUID(), converterChannels.get(channel));
                    clusterToConverters.put(cluster.id, converter);
                    boolean hasMatchingUID = existingChannels.stream()
                            .anyMatch(c -> channel.getUID().equals(c.getUID()));
                    if (!hasMatchingUID) {
                        existingChannels.add(channel);
                    } else {
                        logger.debug(clusterName + " channel already exists: " + channel.getUID());
                    }
                }
            }
        });
        ThingBuilder thingBuilder = handler.editThing();
        thingBuilder.withChannels(existingChannels);
        handler.updateThing(thingBuilder.build());
    }

    public Map<ChannelUID, @Nullable StateDescription> getStateDescriptions() {
        return Collections.unmodifiableMap(new HashMap<>(channelUIDToStateDescription));
    }

    // This method is designed to be overridden in subclasses
    protected @Nullable GenericConverter<? extends BaseCluster> createConverter(BaseCluster cluster,
            Map<String, BaseCluster> allClusters) {
        return ConverterRegistry.createConverter(cluster, handler);
    }
}
