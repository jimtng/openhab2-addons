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
 * RefrigeratorAndTemperatureControlledCabinetMode
 * 
 * @author Dan Cunningham - Initial contribution
 */
public class RefrigeratorAndTemperatureControlledCabinetModeCluster extends BaseCluster {

    public static final String CLUSTER_NAME = "REFRIGERATOR_AND_TEMPERATURE_CONTROLLED_CABINET_MODE_CLUSTER";
    public static final int CLUSTER_ID = 0x0052;

    class ModeTagStruct {
        public Integer mfgCode; // vendor_id
        public Integer value; // enum16

        public ModeTagStruct(Integer mfgCode, Integer value) {
            this.mfgCode = mfgCode;
            this.value = value;
        }
    }

    class ModeOptionStruct {
        public String label; // char_string
        public Integer mode; // int8u
        public ModeTagStruct[] modeTags; // ModeTagStruct

        public ModeOptionStruct(String label, Integer mode, ModeTagStruct[] modeTags) {
            this.label = label;
            this.mode = mode;
            this.modeTags = modeTags;
        }
    }

    // ZCL Enums
    public enum ModeTag {
        RAPIDCOOL(16384, "RapidCool"),
        RAPIDFREEZE(16385, "RapidFreeze"),
        UNKNOWN_VALUE(0, "UnknownValue");

        public final int value;
        public final String label;

        private ModeTag(int value, String label) {
            this.value = value;
            this.label = label;
        }
    };

    // ZCL Bitmaps
    public static class Feature {
        public boolean onOff;

        public Feature(boolean onOff) {
            this.onOff = onOff;
        }

        @SuppressWarnings({ "unchecked", "null" })
        public static Feature fromJson(String json) {
            Map<String, Boolean> m = GSON.fromJson(json, Map.class);
            Boolean[] keys = m.values().toArray(new Boolean[0]);
            return new Feature(keys[0]);
        }
    }

    public ModeOptionStruct[] supportedModes; // 0 ModeOptionStruct reportable
    public Integer currentMode; // 1 int8u reportable
    public Integer startUpMode; // 2 int8u reportable writable
    public Integer onMode; // 3 int8u reportable writable
    public List<Integer> generatedCommandList; // 65528 command_id reportable
    public List<Integer> acceptedCommandList; // 65529 command_id reportable
    public List<Integer> eventList; // 65530 event_id reportable
    public List<Integer> attributeList; // 65531 attrib_id reportable
    public Map<String, Boolean> featureMap; // 65532 bitmap32 reportable
    public Integer clusterRevision; // 65533 int16u reportable

    public RefrigeratorAndTemperatureControlledCabinetModeCluster(long nodeId, int endpointId) {
        super(nodeId, endpointId, 61, "RefrigeratorAndTemperatureControlledCabinetMode");
    }

    public void changeToMode(MatterClient client, Integer newMode) throws Exception {
        final Integer _newMode = newMode;
        Object o = new Object() {
            public Integer newMode = _newMode;
        };
        sendCommand(client, "changeToMode", o);
    }

    public void changeToModeResponse(MatterClient client, Integer status, String statusText) throws Exception {
        final Integer _status = status;
        final String _statusText = statusText;
        Object o = new Object() {
            public Integer status = _status;
            public String statusText = _statusText;
        };
        sendCommand(client, "changeToModeResponse", o);
    }

    public String toString() {
        String str = "";
        str += "supportedModes : " + supportedModes + "\n";
        str += "currentMode : " + currentMode + "\n";
        str += "startUpMode : " + startUpMode + "\n";
        str += "onMode : " + onMode + "\n";
        str += "generatedCommandList : " + generatedCommandList + "\n";
        str += "acceptedCommandList : " + acceptedCommandList + "\n";
        str += "eventList : " + eventList + "\n";
        str += "attributeList : " + attributeList + "\n";
        str += "featureMap : " + featureMap + "\n";
        str += "clusterRevision : " + clusterRevision + "\n";
        return str;
    }
}
