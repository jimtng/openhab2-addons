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

// AUTO-GENERATED by zap. DO NOT EDIT!

package org.openhab.binding.matter.internal.client.model.cluster;

import java.util.List;
import java.util.Map;

import org.openhab.binding.matter.internal.client.MatterClient;

/**
 * EthernetNetworkDiagnostics
 * 
 * @author Dan Cunningham - Initial contribution
 */
public class EthernetNetworkDiagnosticsCluster extends BaseCluster {

    public static final String CLUSTER_NAME = "ETHERNET_NETWORK_DIAGNOSTICS_CLUSTER";
    public static final int CLUSTER_ID = 0x0037;

    // ZCL Enums
    public enum PHYRateEnum {
        RATE10M(0, "Rate10M"),
        RATE100M(1, "Rate100M"),
        RATE1G(2, "Rate1G"),
        RATE2_5G(3, "Rate2_5G"),
        RATE5G(4, "Rate5G"),
        RATE10G(5, "Rate10G"),
        RATE40G(6, "Rate40G"),
        RATE100G(7, "Rate100G"),
        RATE200G(8, "Rate200G"),
        RATE400G(9, "Rate400G"),
        UNKNOWN_VALUE(10, "UnknownValue");

        public final int value;
        public final String label;

        private PHYRateEnum(int value, String label) {
            this.value = value;
            this.label = label;
        }
    };

    // ZCL Bitmaps
    public static class Feature {
        public boolean packetCounts;
        public boolean errorCounts;

        public Feature(boolean packetCounts, boolean errorCounts) {
            this.packetCounts = packetCounts;
            this.errorCounts = errorCounts;
        }

        @SuppressWarnings({ "unchecked", "null" })
        public static Feature fromJson(String json) {
            Map<String, Boolean> m = GSON.fromJson(json, Map.class);
            Boolean[] keys = m.values().toArray(new Boolean[0]);
            return new Feature(keys[0], keys[1]);
        }
    }

    public PHYRateEnum PHYRate; // 0 PHYRateEnum reportable
    public Boolean fullDuplex; // 1 boolean reportable
    public Long packetRxCount; // 2 int64u reportable
    public Long packetTxCount; // 3 int64u reportable
    public Long txErrCount; // 4 int64u reportable
    public Long collisionCount; // 5 int64u reportable
    public Long overrunCount; // 6 int64u reportable
    public Boolean carrierDetect; // 7 boolean reportable
    public Long timeSinceReset; // 8 int64u reportable
    public List<Integer> generatedCommandList; // 65528 command_id reportable
    public List<Integer> acceptedCommandList; // 65529 command_id reportable
    public List<Integer> eventList; // 65530 event_id reportable
    public List<Integer> attributeList; // 65531 attrib_id reportable
    public Map<String, Boolean> featureMap; // 65532 bitmap32 reportable
    public Integer clusterRevision; // 65533 int16u reportable

    public EthernetNetworkDiagnosticsCluster(long nodeId, int endpointId) {
        super(nodeId, endpointId, 27, "EthernetNetworkDiagnostics");
    }

    public void resetCounts(MatterClient client) throws Exception {
        Object o = new Object() {
        };
        sendCommand(client, "resetCounts", o);
    }

    public String toString() {
        String str = "";
        str += "PHYRate : " + PHYRate + "\n";
        str += "fullDuplex : " + fullDuplex + "\n";
        str += "packetRxCount : " + packetRxCount + "\n";
        str += "packetTxCount : " + packetTxCount + "\n";
        str += "txErrCount : " + txErrCount + "\n";
        str += "collisionCount : " + collisionCount + "\n";
        str += "overrunCount : " + overrunCount + "\n";
        str += "carrierDetect : " + carrierDetect + "\n";
        str += "timeSinceReset : " + timeSinceReset + "\n";
        str += "generatedCommandList : " + generatedCommandList + "\n";
        str += "acceptedCommandList : " + acceptedCommandList + "\n";
        str += "eventList : " + eventList + "\n";
        str += "attributeList : " + attributeList + "\n";
        str += "featureMap : " + featureMap + "\n";
        str += "clusterRevision : " + clusterRevision + "\n";
        return str;
    }
}
