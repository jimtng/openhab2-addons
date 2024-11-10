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

// AUTO-GENERATED, DO NOT EDIT!

package org.openhab.binding.matter.internal.client.model.cluster.gen;

import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openhab.binding.matter.internal.client.model.cluster.BaseCluster;
import org.openhab.binding.matter.internal.client.model.cluster.ClusterCommand;
import org.openhab.binding.matter.internal.client.model.cluster.gen.DataTypes.*;

/**
 * ValidProxies
 *
 * @author Dan Cunningham - Initial contribution
 */
public class ValidProxiesCluster extends BaseCluster {

    public static final String CLUSTER_NAME = "ValidProxies";
    public static final int CLUSTER_ID = 0x0044;

    public Integer clusterRevision; // 65533 ClusterRevision
    /**
     * List of valid proxies that can proxy this Node. Each entry in this list is fabric-scoped.
     */
    public List<ValidProxyStruct> validProxyList; // 0 list RW
    // Structs

    /**
     * Encapsulates the Node ID of a Valid Proxy.
     */
    public class ValidProxyStruct {
        public BigInteger nodeId; // node-id

        public ValidProxyStruct(BigInteger nodeId) {
            this.nodeId = nodeId;
        }
    }

    public ValidProxiesCluster(BigInteger nodeId, int endpointId) {
        super(nodeId, endpointId, 68, "ValidProxies");
    }

    // commands
    /**
     * This command is used during proxy discovery, as specified in Section 9.15.7, “Proxy Discovery &amp; Assignment
     * Flow”.
     */
    public static ClusterCommand getValidProxiesRequest() {
        Map<String, Object> map = new LinkedHashMap<>();

        return new ClusterCommand("getValidProxiesRequest");
    }

    public String toString() {
        String str = "";
        str += "clusterRevision : " + clusterRevision + "\n";
        str += "validProxyList : " + validProxyList + "\n";
        return str;
    }
}
