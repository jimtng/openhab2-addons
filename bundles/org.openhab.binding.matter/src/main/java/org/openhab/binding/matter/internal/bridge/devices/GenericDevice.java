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
package org.openhab.binding.matter.internal.bridge.devices;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.matter.internal.bridge.MatterBridgeClient;
import org.openhab.binding.matter.internal.client.model.cluster.BaseCluster;
import org.openhab.binding.matter.internal.client.model.cluster.gen.ClusterRegistry;
import org.openhab.core.items.*;
import org.openhab.core.library.types.DecimalType;
import org.openhab.core.library.types.PercentType;
import org.openhab.core.library.types.QuantityType;
import org.openhab.core.library.unit.ImperialUnits;
import org.openhab.core.library.unit.SIUnits;
import org.openhab.core.types.Command;
import org.openhab.core.types.State;
import org.openhab.core.types.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The {@link GenericDevice}
 *
 * @author Dan Cunningham - Initial contribution
 */
@NonNullByDefault
public abstract class GenericDevice implements StateChangeListener {
    protected final Logger logger = LoggerFactory.getLogger(getClass());
    private final static BigDecimal TEMPERATURE_MULTIPLIER = new BigDecimal(100);

    protected final GenericItem primaryItem;
    protected @Nullable Metadata primaryItemMetadata;
    protected final MatterBridgeClient client;
    protected final MetadataRegistry metadataRegistry;

    public GenericDevice(MetadataRegistry metadataRegistry, MatterBridgeClient client, GenericItem primaryItem) {
        this.metadataRegistry = metadataRegistry;
        this.client = client;
        this.primaryItem = primaryItem;
        this.primaryItemMetadata = metadataRegistry.get(new MetadataKey("matter", primaryItem.getUID()));
    }

    abstract public String deviceType();

    abstract public MatterDeviceOptions activate();

    abstract public void dispose();

    abstract public void updateState(Item item, State state);

    abstract public void handleMatterEvent(String clusterName, String attributeName, Object data);

    public void handleMatterEvent(Integer clusterId, String attributeName, Object data) {
        Class<? extends BaseCluster> cluster = ClusterRegistry.CLUSTER_IDS.get(clusterId);
        if (cluster == null) {
            logger.debug("Unknown cluster {}", clusterId);
            return;
        }
        handleMatterEvent(cluster.getName(), attributeName, data);
    }

    @Override
    public void stateChanged(Item item, State oldState, State newState) {
        logger.debug("{} state changed from {} to {}", item.getName(), oldState, newState);
        updateState(item, newState);
    }

    @Override
    public void stateUpdated(Item item, State state) {
        // updateState(item, state);
    }

    public CompletableFuture<String> registerDevice() {
        MatterDeviceOptions options = activate();
        return client.addEndpoint(deviceType(), primaryItem.getName(), options.label, primaryItem.getName(),
                "Type " + primaryItem.getType(), String.valueOf(primaryItem.getName().hashCode()), options.clusters);
    }

    public String getName() {
        return primaryItem.getName();
    }

    public CompletableFuture<Void> setEndpointState(String clusterName, String attributeName, Object state) {
        return client.setEndpointState(primaryItem.getName(), clusterName, attributeName, state);
    }

    // TODO Move all of the following into a shared UTIL class, copied from cluster converters

    /**
     * Converts a ZigBee 8 bit level as used in Level Control cluster and others to a percentage
     *
     * @param level an integer between 0 and 254
     * @return the scaled {@link PercentType}
     */
    public static PercentType levelToPercent(int level) {
        return new PercentType((int) (level * 100.0 / 254.0 + 0.5));
    }

    /**
     * Converts a {@link DecimalType} to an 8 bit level scaled between 0 and 254
     *
     * @param percent the {@link DecimalType} to convert
     * @return a scaled value between 0 and 254
     */

    public static int percentToLevel(PercentType percent) {
        return (int) (percent.floatValue() * 254.0f / 100.0f + 0.5f);
    }

    /**
     * Converts a {@link Command} to a ZigBee / Matter temperature integer
     *
     * @param type the {@link Type} to convert
     * @return the {@link Type} or null if the conversion was not possible
     */
    public static @Nullable Integer temperatureToValue(Type type) {
        BigDecimal value = null;
        if (type instanceof QuantityType<?> quantity) {
            if (quantity.getUnit() == SIUnits.CELSIUS) {
                value = quantity.toBigDecimal();
            } else if (quantity.getUnit() == ImperialUnits.FAHRENHEIT) {
                QuantityType<?> celsius = quantity.toUnit(SIUnits.CELSIUS);
                if (celsius == null) {
                    return null;
                }
                value = celsius.toBigDecimal();
            } else {
                return null;
            }
        } else if (type instanceof Number number) {
            // No scale, so assumed to be Celsius
            value = BigDecimal.valueOf(number.doubleValue());
        }
        if (value == null) {
            return null;
        }
        return value.setScale(2, RoundingMode.CEILING).multiply(TEMPERATURE_MULTIPLIER).intValue();
    }

    /**
     * Converts an integer value into a {@link QuantityType}. The temperature as an integer is assumed to be multiplied
     * by 100 as per the ZigBee / Matter standard format.
     *
     * @param value the integer value to convert
     * @return the {@link QuantityType}
     */
    public static QuantityType valueToTemperature(int value) {
        return new QuantityType<>(BigDecimal.valueOf(value, 2), SIUnits.CELSIUS);
    }

    protected MetaDataMapping metaDataMapping(GenericItem item) {
        Metadata metadata = metadataRegistry.get(new MetadataKey("matter", item.getUID()));
        String label = item.getLabel();
        List<String> attributeList = List.of();
        Map<String, Object> config = Map.of();
        if (metadata != null) {
            attributeList = Arrays.asList(metadata.getValue().split(","));
            config = metadata.getConfiguration();
            if (config.get("label") instanceof String customLabel) {
                label = customLabel;
            }
        }

        if (label == null) {
            label = item.getName();
        }
        return new MetaDataMapping(attributeList, config, label);
    }

    class MetaDataMapping {
        public final List<String> attributes;
        public final Map<String, Object> config;
        public final String label;

        public MetaDataMapping(List<String> attributes, Map<String, Object> config, String label) {
            this.attributes = attributes;
            this.config = config;
            this.label = label;
        }

        public Map<String, Object> getAttributeOptions() {
            return config.entrySet().stream().filter(entry -> entry.getKey().contains("."))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        }
    }

    class MatterDeviceOptions {
        public final Map<String, Map<String, Object>> clusters;
        public final String label;

        public MatterDeviceOptions(Map<String, Object> attributes, String label) {
            this.clusters = mapClusterAttributes(attributes);
            this.label = label;
        }
    }

    Map<String, Map<String, Object>> mapClusterAttributes(Map<String, Object> clusterAttributes) {
        Map<String, Map<String, Object>> returnMap = new HashMap<>();
        clusterAttributes.forEach((key, value) -> {
            String[] parts = key.split("\\.");
            if (parts.length != 2) {
                throw new IllegalArgumentException("Key must be in the format 'clusterName.attributeName'");
            }
            String clusterName = parts[0];
            String attributeName = parts[1];

            // Get or create the child map for the clusterName
            Map<String, Object> attributes = returnMap.computeIfAbsent(clusterName, k -> new HashMap<>());

            // Update the attributeName with the value
            if (attributes != null) {
                attributes.put(attributeName, value);
            }
        });
        return returnMap;
    }
}
