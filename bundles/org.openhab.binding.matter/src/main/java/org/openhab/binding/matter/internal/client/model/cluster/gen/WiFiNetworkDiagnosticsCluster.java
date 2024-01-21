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

// AUTO-GENERATED by zap. DO NOT EDIT!

package org.openhab.binding.matter.internal.client.model.cluster.gen;

import java.util.List;
import java.util.Map;

import org.openhab.binding.matter.internal.client.model.cluster.BaseCluster;
import org.openhab.binding.matter.internal.client.model.cluster.gen.WiFiNetworkDiagnosticsClusterTypes.*;

/**
 * WiFiNetworkDiagnostics
 *
 * @author Dan Cunningham - Initial contribution
 */
public class WiFiNetworkDiagnosticsCluster extends BaseCluster {

    public static final String CLUSTER_NAME = "WiFiNetworkDiagnostics";
    public static final int CLUSTER_ID = 0x0036;

    public String bssid; // 0 octet_string reportable
    public SecurityTypeEnum securityType; // 1 SecurityTypeEnum reportable
    public WiFiVersionEnum wiFiVersion; // 2 WiFiVersionEnum reportable
    public Integer channelNumber; // 3 int16u reportable
    public Integer rssi; // 4 int8s reportable
    public Integer beaconLostCount; // 5 int32u reportable
    public Integer beaconRxCount; // 6 int32u reportable
    public Integer packetMulticastRxCount; // 7 int32u reportable
    public Integer packetMulticastTxCount; // 8 int32u reportable
    public Integer packetUnicastRxCount; // 9 int32u reportable
    public Integer packetUnicastTxCount; // 10 int32u reportable
    public Long currentMaxRate; // 11 int64u reportable
    public Long overrunCount; // 12 int64u reportable
    public List<Integer> generatedCommandList; // 65528 command_id reportable
    public List<Integer> acceptedCommandList; // 65529 command_id reportable
    public List<Integer> eventList; // 65530 event_id reportable
    public List<Integer> attributeList; // 65531 attrib_id reportable
    public Map<String, Boolean> featureMap; // 65532 bitmap32 reportable
    public Integer clusterRevision; // 65533 int16u reportable

    public WiFiNetworkDiagnosticsCluster(long nodeId, int endpointId) {
        super(nodeId, endpointId, 86, "WiFiNetworkDiagnostics");
    }

    public String toString() {
        String str = "";
        str += "bssid : " + bssid + "\n";
        str += "securityType : " + securityType + "\n";
        str += "wiFiVersion : " + wiFiVersion + "\n";
        str += "channelNumber : " + channelNumber + "\n";
        str += "rssi : " + rssi + "\n";
        str += "beaconLostCount : " + beaconLostCount + "\n";
        str += "beaconRxCount : " + beaconRxCount + "\n";
        str += "packetMulticastRxCount : " + packetMulticastRxCount + "\n";
        str += "packetMulticastTxCount : " + packetMulticastTxCount + "\n";
        str += "packetUnicastRxCount : " + packetUnicastRxCount + "\n";
        str += "packetUnicastTxCount : " + packetUnicastTxCount + "\n";
        str += "currentMaxRate : " + currentMaxRate + "\n";
        str += "overrunCount : " + overrunCount + "\n";
        str += "generatedCommandList : " + generatedCommandList + "\n";
        str += "acceptedCommandList : " + acceptedCommandList + "\n";
        str += "eventList : " + eventList + "\n";
        str += "attributeList : " + attributeList + "\n";
        str += "featureMap : " + featureMap + "\n";
        str += "clusterRevision : " + clusterRevision + "\n";
        return str;
    }
}