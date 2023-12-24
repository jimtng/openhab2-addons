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

/**
 * Pm25ConcentrationMeasurement
 * 
 * @author Dan Cunningham - Initial contribution
 */
public class Pm25ConcentrationMeasurementCluster extends BaseCluster {

    public static final String CLUSTER_NAME = "PM2_5_CONCENTRATION_MEASUREMENT_CLUSTER";
    public static final int CLUSTER_ID = 0x042A;

    // ZCL Enums
    public enum LevelValueEnum {
        UNKNOWN(0, "Unknown"),
        LOW(1, "Low"),
        MEDIUM(2, "Medium"),
        HIGH(3, "High"),
        CRITICAL(4, "Critical"),
        UNKNOWN_VALUE(5, "UnknownValue");

        public final int value;
        public final String label;

        private LevelValueEnum(int value, String label) {
            this.value = value;
            this.label = label;
        }
    };

    public enum MeasurementMediumEnum {
        AIR(0, "Air"),
        WATER(1, "Water"),
        SOIL(2, "Soil"),
        UNKNOWN_VALUE(3, "UnknownValue");

        public final int value;
        public final String label;

        private MeasurementMediumEnum(int value, String label) {
            this.value = value;
            this.label = label;
        }
    };

    public enum MeasurementUnitEnum {
        PPM(0, "PPM"),
        PPB(1, "PPB"),
        PPT(2, "PPT"),
        MGM3(3, "MGM3"),
        UGM3(4, "UGM3"),
        NGM3(5, "NGM3"),
        PM3(6, "PM3"),
        BQM3(7, "BQM3"),
        UNKNOWN_VALUE(8, "UnknownValue");

        public final int value;
        public final String label;

        private MeasurementUnitEnum(int value, String label) {
            this.value = value;
            this.label = label;
        }
    };

    // ZCL Bitmaps
    public static class Feature {
        public boolean numericMeasurement;
        public boolean levelIndication;
        public boolean mediumLevel;
        public boolean criticalLevel;
        public boolean peakMeasurement;
        public boolean averageMeasurement;

        public Feature(boolean numericMeasurement, boolean levelIndication, boolean mediumLevel, boolean criticalLevel,
                boolean peakMeasurement, boolean averageMeasurement) {
            this.numericMeasurement = numericMeasurement;
            this.levelIndication = levelIndication;
            this.mediumLevel = mediumLevel;
            this.criticalLevel = criticalLevel;
            this.peakMeasurement = peakMeasurement;
            this.averageMeasurement = averageMeasurement;
        }

        @SuppressWarnings({ "unchecked", "null" })
        public static Feature fromJson(String json) {
            Map<String, Boolean> m = GSON.fromJson(json, Map.class);
            Boolean[] keys = m.values().toArray(new Boolean[0]);
            return new Feature(keys[0], keys[1], keys[2], keys[3], keys[4], keys[5]);
        }
    }

    public Float measuredValue; // 0 single reportable
    public Float minMeasuredValue; // 1 single reportable
    public Float maxMeasuredValue; // 2 single reportable
    public Float peakMeasuredValue; // 3 single reportable
    public Integer peakMeasuredValueWindow; // 4 elapsed_s reportable
    public Float averageMeasuredValue; // 5 single reportable
    public Integer averageMeasuredValueWindow; // 6 elapsed_s reportable
    public Float uncertainty; // 7 single reportable
    public MeasurementUnitEnum measurementUnit; // 8 MeasurementUnitEnum reportable
    public MeasurementMediumEnum measurementMedium; // 9 MeasurementMediumEnum reportable
    public LevelValueEnum levelValue; // 10 LevelValueEnum reportable
    public List<Integer> generatedCommandList; // 65528 command_id reportable
    public List<Integer> acceptedCommandList; // 65529 command_id reportable
    public List<Integer> eventList; // 65530 event_id reportable
    public List<Integer> attributeList; // 65531 attrib_id reportable
    public Map<String, Boolean> featureMap; // 65532 bitmap32 reportable
    public Integer clusterRevision; // 65533 int16u reportable

    public Pm25ConcentrationMeasurementCluster(long nodeId, int endpointId) {
        super(nodeId, endpointId, 103, "Pm25ConcentrationMeasurement");
    }

    public String toString() {
        String str = "";
        str += "measuredValue : " + measuredValue + "\n";
        str += "minMeasuredValue : " + minMeasuredValue + "\n";
        str += "maxMeasuredValue : " + maxMeasuredValue + "\n";
        str += "peakMeasuredValue : " + peakMeasuredValue + "\n";
        str += "peakMeasuredValueWindow : " + peakMeasuredValueWindow + "\n";
        str += "averageMeasuredValue : " + averageMeasuredValue + "\n";
        str += "averageMeasuredValueWindow : " + averageMeasuredValueWindow + "\n";
        str += "uncertainty : " + uncertainty + "\n";
        str += "measurementUnit : " + measurementUnit + "\n";
        str += "measurementMedium : " + measurementMedium + "\n";
        str += "levelValue : " + levelValue + "\n";
        str += "generatedCommandList : " + generatedCommandList + "\n";
        str += "acceptedCommandList : " + acceptedCommandList + "\n";
        str += "eventList : " + eventList + "\n";
        str += "attributeList : " + attributeList + "\n";
        str += "featureMap : " + featureMap + "\n";
        str += "clusterRevision : " + clusterRevision + "\n";
        return str;
    }
}
