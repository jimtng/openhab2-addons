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
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;

import org.openhab.binding.matter.internal.client.model.cluster.BaseCluster;
import org.openhab.binding.matter.internal.client.model.cluster.ClusterCommand;
import org.openhab.binding.matter.internal.client.model.cluster.gen.DataTypes.*;

/**
 * ContentAppObserver
 *
 * @author Dan Cunningham - Initial contribution
 */
public class ContentAppObserverCluster extends BaseCluster {

    public static final String CLUSTER_NAME = "ContentAppObserver";
    public static final int CLUSTER_ID = 0x0510;

    public Integer clusterRevision; // 65533 ClusterRevision 


    //Enums
    public enum StatusEnum {
        SUCCESS(0, "Success"),
        UNEXPECTED_DATA(1, "UnexpectedData");
        public final Integer value;
        public final String label;
        private StatusEnum(Integer value, String label){
            this.value = value;
            this.label = label;
        }
    }


    public ContentAppObserverCluster(BigInteger nodeId, int endpointId) {
        super(nodeId, endpointId, 1296, "ContentAppObserver");
    }

    
    //commands
    /**
    * Upon receipt, the data field may be parsed and interpreted. Message encoding is specific to the Content App. A Content App may when possible read attributes from the Basic Information Cluster on the Observer and use this to determine the Message encoding.
This command returns a ContentAppMessage Response.
    */
    public static ClusterCommand contentAppMessage(String data, String encodingHint) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("data", data);
        map.put("encodingHint", encodingHint);

        return new ClusterCommand("contentAppMessage", map);
    }

    public String toString() {
        String str = "";
        str += "clusterRevision : " + clusterRevision + "\n";
        return str;
    }
}
