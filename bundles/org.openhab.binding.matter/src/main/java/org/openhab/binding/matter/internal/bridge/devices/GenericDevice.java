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
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.matter.internal.bridge.MatterBridgeClient;
import org.openhab.core.items.GenericItem;
import org.openhab.core.items.Item;
import org.openhab.core.items.MetadataRegistry;
import org.openhab.core.items.StateChangeListener;
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
    protected final MatterBridgeClient client;
    protected final MetadataRegistry metadataRegistry;

    public GenericDevice(MetadataRegistry metadataRegistry, MatterBridgeClient client, GenericItem primaryItem) {
        this.metadataRegistry = metadataRegistry;
        this.client = client;
        this.primaryItem = primaryItem;
    }

    abstract public String deviceType();

    abstract public Map<String, Object> activate();

    abstract public void dispose();

    abstract public void handleMatterEvent(String clusterName, String attributeName, Object data);

    abstract public void updateState(Item item, State state);

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
        String label = primaryItem.getLabel();
        if (label == null) {
            label = primaryItem.getName();
        }
        return client.addEndpoint(deviceType(), primaryItem.getName(), label, primaryItem.getName(),
                "Type " + primaryItem.getType(), String.valueOf(primaryItem.getName().hashCode()), activate());
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
}
