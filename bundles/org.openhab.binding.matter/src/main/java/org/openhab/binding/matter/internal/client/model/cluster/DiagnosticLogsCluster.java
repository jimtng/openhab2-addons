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
 * DiagnosticLogs
 * 
 * @author Dan Cunningham - Initial contribution
 */
public class DiagnosticLogsCluster extends BaseCluster {

    public static final String CLUSTER_NAME = "DIAGNOSTIC_LOGS_CLUSTER";
    public static final int CLUSTER_ID = 0x0032;

    // ZCL Enums
    public enum IntentEnum {
        ENDUSERSUPPORT(0, "EndUserSupport"),
        NETWORKDIAG(1, "NetworkDiag"),
        CRASHLOGS(2, "CrashLogs"),
        UNKNOWN_VALUE(3, "UnknownValue");

        public final int value;
        public final String label;

        private IntentEnum(int value, String label) {
            this.value = value;
            this.label = label;
        }
    };

    public enum StatusEnum {
        SUCCESS(0, "Success"),
        EXHAUSTED(1, "Exhausted"),
        NOLOGS(2, "NoLogs"),
        BUSY(3, "Busy"),
        DENIED(4, "Denied"),
        UNKNOWN_VALUE(5, "UnknownValue");

        public final int value;
        public final String label;

        private StatusEnum(int value, String label) {
            this.value = value;
            this.label = label;
        }
    };

    public enum TransferProtocolEnum {
        RESPONSEPAYLOAD(0, "ResponsePayload"),
        BDX(1, "BDX"),
        UNKNOWN_VALUE(2, "UnknownValue");

        public final int value;
        public final String label;

        private TransferProtocolEnum(int value, String label) {
            this.value = value;
            this.label = label;
        }
    };

    public List<Integer> generatedCommandList; // 65528 command_id reportable
    public List<Integer> acceptedCommandList; // 65529 command_id reportable
    public List<Integer> eventList; // 65530 event_id reportable
    public List<Integer> attributeList; // 65531 attrib_id reportable
    public Map<String, Boolean> featureMap; // 65532 bitmap32 reportable
    public Integer clusterRevision; // 65533 int16u reportable

    public DiagnosticLogsCluster(long nodeId, int endpointId) {
        super(nodeId, endpointId, 97, "DiagnosticLogs");
    }

    public void retrieveLogsRequest(MatterClient client, IntentEnum intent, TransferProtocolEnum requestedProtocol,
            String transferFileDesignator) throws Exception {
        final IntentEnum _intent = intent;
        final TransferProtocolEnum _requestedProtocol = requestedProtocol;
        final String _transferFileDesignator = transferFileDesignator;
        Object o = new Object() {
            public IntentEnum intent = _intent;
            public TransferProtocolEnum requestedProtocol = _requestedProtocol;
            public String transferFileDesignator = _transferFileDesignator;
        };
        sendCommand(client, "retrieveLogsRequest", o);
    }

    public void retrieveLogsResponse(MatterClient client, StatusEnum status, String logContent, Long UTCTimeStamp,
            Long timeSinceBoot) throws Exception {
        final StatusEnum _status = status;
        final String _logContent = logContent;
        final Long _UTCTimeStamp = UTCTimeStamp;
        final Long _timeSinceBoot = timeSinceBoot;
        Object o = new Object() {
            public StatusEnum status = _status;
            public String logContent = _logContent;
            public Long UTCTimeStamp = _UTCTimeStamp;
            public Long timeSinceBoot = _timeSinceBoot;
        };
        sendCommand(client, "retrieveLogsResponse", o);
    }

    public String toString() {
        String str = "";
        str += "generatedCommandList : " + generatedCommandList + "\n";
        str += "acceptedCommandList : " + acceptedCommandList + "\n";
        str += "eventList : " + eventList + "\n";
        str += "attributeList : " + attributeList + "\n";
        str += "featureMap : " + featureMap + "\n";
        str += "clusterRevision : " + clusterRevision + "\n";
        return str;
    }
}
