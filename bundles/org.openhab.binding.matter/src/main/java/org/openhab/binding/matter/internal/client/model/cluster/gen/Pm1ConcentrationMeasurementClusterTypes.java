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

// 

package org.openhab.binding.matter.internal.client.model.cluster.gen;

import org.openhab.binding.matter.internal.client.model.cluster.types.*;

/**
 * AUTO-GENERATED by zap. DO NOT EDIT!
 *
 * Pm1ConcentrationMeasurement
 *
 * @author Dan Cunningham - Initial contribution
 */
public class Pm1ConcentrationMeasurementClusterTypes {

    public static final String CLUSTER_NAME = "PM1_CONCENTRATION_MEASUREMENT_CLUSTER";
    public static final int CLUSTER_ID = 0x042C;

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
    }
}