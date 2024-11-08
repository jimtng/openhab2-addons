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

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.matter.internal.client.model.cluster.BaseCluster;
import org.openhab.binding.matter.internal.client.model.cluster.gen.*;
import org.openhab.binding.matter.internal.handler.EndpointHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Dan Cunningham
 */
@NonNullByDefault
public class ConverterRegistry {
    private static final Logger logger = LoggerFactory.getLogger(ConverterRegistry.class);
    private static final Map<Integer, Class<? extends GenericConverter<? extends BaseCluster>>> converters = new HashMap<>();

    static {
        ConverterRegistry.registerConverter(ColorControlCluster.CLUSTER_ID, ColorControlConverter.class);
        ConverterRegistry.registerConverter(LevelControlCluster.CLUSTER_ID, LevelControlConverter.class);
        ConverterRegistry.registerConverter(ModeSelectCluster.CLUSTER_ID, ModeSelectConverter.class);
        ConverterRegistry.registerConverter(OnOffCluster.CLUSTER_ID, OnOffConverter.class);
        ConverterRegistry.registerConverter(SwitchCluster.CLUSTER_ID, SwitchConverter.class);
        ConverterRegistry.registerConverter(ThermostatCluster.CLUSTER_ID, ThermostatConverter.class);
        ConverterRegistry.registerConverter(WindowCoveringCluster.CLUSTER_ID, WindowCoveringConverter.class);
        ConverterRegistry.registerConverter(PowerSourceCluster.CLUSTER_ID, PowerSourceConverter.class);
        ConverterRegistry.registerConverter(FanControlCluster.CLUSTER_ID, FanControlConverter.class);
        ConverterRegistry.registerConverter(TemperatureMeasurementCluster.CLUSTER_ID,
                TemperatureMeasurementConverter.class);
        ConverterRegistry.registerConverter(OccupancySensingCluster.CLUSTER_ID, OccupancySensingConverter.class);
    }

    public static void registerConverter(Integer clusterId,
            Class<? extends GenericConverter<? extends BaseCluster>> converter) {
        converters.put(clusterId, converter);
    }

    public static @Nullable GenericConverter<? extends BaseCluster> createConverter(BaseCluster cluster,
            EndpointHandler handler) {
        Class<? extends GenericConverter<? extends BaseCluster>> clazz = converters.get(cluster.id);
        if (clazz != null) {
            try {
                Class<?>[] constructorParameterTypes = new Class<?>[] { cluster.getClass(), EndpointHandler.class };
                Constructor<? extends GenericConverter<? extends BaseCluster>> constructor = clazz
                        .getConstructor(constructorParameterTypes);
                return constructor.newInstance(cluster, handler);
            } catch (Exception e) {
                logger.debug("Could not create converter", e);
            }
        } else {
            logger.debug("No converter found for cluster {}", cluster.id);
        }
        return null;
    }
}
