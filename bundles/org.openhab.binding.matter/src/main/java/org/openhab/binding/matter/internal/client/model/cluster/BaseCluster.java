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
package org.openhab.binding.matter.internal.client.model.cluster;

import java.math.BigInteger;
import java.util.Map;

import com.google.gson.Gson;

/**
 * @author Dan Cunningham
 *
 */
public abstract class BaseCluster {
    protected static final Gson GSON = new Gson();
    public BigInteger nodeId;
    public int endpointId;
    public int id;
    public String name;
    public static Map<Integer, String> ATTRIBUTE_MAPPING;
    public static Map<Integer, String> COMMAND_MAPPING;

    public interface MatterEnum {
        Integer getValue();

        String getLabel();

        public static <E extends MatterEnum> E fromValue(Class<E> enumClass, int value) {
            E[] constants = enumClass.getEnumConstants();
            if (constants != null) {
                for (E enumConstant : constants) {
                    if (enumConstant != null) {
                        if (enumConstant.getValue().equals(value)) {
                            return enumConstant;
                        }
                    }
                }
            }
            throw new IllegalArgumentException("Unknown value: " + value);
        }
    }

    public BaseCluster(BigInteger nodeId, int endpointId, int clusterId, String clusterName) {
        this.nodeId = nodeId;
        this.endpointId = endpointId;
        this.id = clusterId;
        this.name = clusterName;
    }
}
