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
 * WindowCovering
 * 
 * @author Dan Cunningham - Initial contribution
 */
public class WindowCoveringCluster extends BaseCluster {

    public static final String CLUSTER_NAME = "WINDOW_COVERING_CLUSTER";
    public static final int CLUSTER_ID = 0x0102;

    // ZCL Enums
    public enum EndProductType {
        ROLLERSHADE(0, "RollerShade"),
        ROMANSHADE(1, "RomanShade"),
        BALLOONSHADE(2, "BalloonShade"),
        WOVENWOOD(3, "WovenWood"),
        PLEATEDSHADE(4, "PleatedShade"),
        CELLULARSHADE(5, "CellularShade"),
        LAYEREDSHADE(6, "LayeredShade"),
        LAYEREDSHADE2D(7, "LayeredShade2D"),
        SHEERSHADE(8, "SheerShade"),
        TILTONLYINTERIORBLIND(9, "TiltOnlyInteriorBlind"),
        INTERIORBLIND(10, "InteriorBlind"),
        VERTICALBLINDSTRIPCURTAIN(11, "VerticalBlindStripCurtain"),
        INTERIORVENETIANBLIND(12, "InteriorVenetianBlind"),
        EXTERIORVENETIANBLIND(13, "ExteriorVenetianBlind"),
        LATERALLEFTCURTAIN(14, "LateralLeftCurtain"),
        LATERALRIGHTCURTAIN(15, "LateralRightCurtain"),
        CENTRALCURTAIN(16, "CentralCurtain"),
        ROLLERSHUTTER(17, "RollerShutter"),
        EXTERIORVERTICALSCREEN(18, "ExteriorVerticalScreen"),
        AWNINGTERRACEPATIO(19, "AwningTerracePatio"),
        AWNINGVERTICALSCREEN(20, "AwningVerticalScreen"),
        TILTONLYPERGOLA(21, "TiltOnlyPergola"),
        SWINGINGSHUTTER(22, "SwingingShutter"),
        SLIDINGSHUTTER(23, "SlidingShutter"),
        UNKNOWN(255, "Unknown"),
        UNKNOWN_VALUE(24, "UnknownValue");

        public final int value;
        public final String label;

        private EndProductType(int value, String label) {
            this.value = value;
            this.label = label;
        }
    };

    public enum Type {
        ROLLERSHADE(0, "RollerShade"),
        ROLLERSHADE2MOTOR(1, "RollerShade2Motor"),
        ROLLERSHADEEXTERIOR(2, "RollerShadeExterior"),
        ROLLERSHADEEXTERIOR2MOTOR(3, "RollerShadeExterior2Motor"),
        DRAPERY(4, "Drapery"),
        AWNING(5, "Awning"),
        SHUTTER(6, "Shutter"),
        TILTBLINDTILTONLY(7, "TiltBlindTiltOnly"),
        TILTBLINDLIFTANDTILT(8, "TiltBlindLiftAndTilt"),
        PROJECTORSCREEN(9, "ProjectorScreen"),
        UNKNOWN(255, "Unknown"),
        UNKNOWN_VALUE(10, "UnknownValue");

        public final int value;
        public final String label;

        private Type(int value, String label) {
            this.value = value;
            this.label = label;
        }
    };

    // ZCL Bitmaps
    public static class ConfigStatus {
        public boolean operational;
        public boolean onlineReserved;
        public boolean liftMovementReversed;
        public boolean liftPositionAware;
        public boolean tiltPositionAware;
        public boolean liftEncoderControlled;
        public boolean tiltEncoderControlled;

        public ConfigStatus(boolean operational, boolean onlineReserved, boolean liftMovementReversed,
                boolean liftPositionAware, boolean tiltPositionAware, boolean liftEncoderControlled,
                boolean tiltEncoderControlled) {
            this.operational = operational;
            this.onlineReserved = onlineReserved;
            this.liftMovementReversed = liftMovementReversed;
            this.liftPositionAware = liftPositionAware;
            this.tiltPositionAware = tiltPositionAware;
            this.liftEncoderControlled = liftEncoderControlled;
            this.tiltEncoderControlled = tiltEncoderControlled;
        }

        @SuppressWarnings({ "unchecked", "null" })
        public static ConfigStatus fromJson(String json) {
            Map<String, Boolean> m = GSON.fromJson(json, Map.class);
            Boolean[] keys = m.values().toArray(new Boolean[0]);
            return new ConfigStatus(keys[0], keys[1], keys[2], keys[3], keys[4], keys[5], keys[6]);
        }
    }

    public static class Feature {
        public boolean lift;
        public boolean tilt;
        public boolean positionAwareLift;
        public boolean absolutePosition;
        public boolean positionAwareTilt;

        public Feature(boolean lift, boolean tilt, boolean positionAwareLift, boolean absolutePosition,
                boolean positionAwareTilt) {
            this.lift = lift;
            this.tilt = tilt;
            this.positionAwareLift = positionAwareLift;
            this.absolutePosition = absolutePosition;
            this.positionAwareTilt = positionAwareTilt;
        }

        @SuppressWarnings({ "unchecked", "null" })
        public static Feature fromJson(String json) {
            Map<String, Boolean> m = GSON.fromJson(json, Map.class);
            Boolean[] keys = m.values().toArray(new Boolean[0]);
            return new Feature(keys[0], keys[1], keys[2], keys[3], keys[4]);
        }
    }

    public static class Mode {
        public boolean motorDirectionReversed;
        public boolean calibrationMode;
        public boolean maintenanceMode;
        public boolean ledFeedback;

        public Mode(boolean motorDirectionReversed, boolean calibrationMode, boolean maintenanceMode,
                boolean ledFeedback) {
            this.motorDirectionReversed = motorDirectionReversed;
            this.calibrationMode = calibrationMode;
            this.maintenanceMode = maintenanceMode;
            this.ledFeedback = ledFeedback;
        }

        @SuppressWarnings({ "unchecked", "null" })
        public static Mode fromJson(String json) {
            Map<String, Boolean> m = GSON.fromJson(json, Map.class);
            Boolean[] keys = m.values().toArray(new Boolean[0]);
            return new Mode(keys[0], keys[1], keys[2], keys[3]);
        }
    }

    public static class OperationalStatus {
        public boolean global;
        public boolean lift;
        public boolean tilt;

        public OperationalStatus(boolean global, boolean lift, boolean tilt) {
            this.global = global;
            this.lift = lift;
            this.tilt = tilt;
        }

        @SuppressWarnings({ "unchecked", "null" })
        public static OperationalStatus fromJson(String json) {
            Map<String, Boolean> m = GSON.fromJson(json, Map.class);
            Boolean[] keys = m.values().toArray(new Boolean[0]);
            return new OperationalStatus(keys[0], keys[1], keys[2]);
        }
    }

    public static class SafetyStatus {
        public boolean remoteLockout;
        public boolean tamperDetection;
        public boolean failedCommunication;
        public boolean positionFailure;
        public boolean thermalProtection;
        public boolean obstacleDetected;
        public boolean power;
        public boolean stopInput;
        public boolean motorJammed;
        public boolean hardwareFailure;
        public boolean manualOperation;
        public boolean protection;

        public SafetyStatus(boolean remoteLockout, boolean tamperDetection, boolean failedCommunication,
                boolean positionFailure, boolean thermalProtection, boolean obstacleDetected, boolean power,
                boolean stopInput, boolean motorJammed, boolean hardwareFailure, boolean manualOperation,
                boolean protection) {
            this.remoteLockout = remoteLockout;
            this.tamperDetection = tamperDetection;
            this.failedCommunication = failedCommunication;
            this.positionFailure = positionFailure;
            this.thermalProtection = thermalProtection;
            this.obstacleDetected = obstacleDetected;
            this.power = power;
            this.stopInput = stopInput;
            this.motorJammed = motorJammed;
            this.hardwareFailure = hardwareFailure;
            this.manualOperation = manualOperation;
            this.protection = protection;
        }

        @SuppressWarnings({ "unchecked", "null" })
        public static SafetyStatus fromJson(String json) {
            Map<String, Boolean> m = GSON.fromJson(json, Map.class);
            Boolean[] keys = m.values().toArray(new Boolean[0]);
            return new SafetyStatus(keys[0], keys[1], keys[2], keys[3], keys[4], keys[5], keys[6], keys[7], keys[8],
                    keys[9], keys[10], keys[11]);
        }
    }

    public Type type; // 0 Type reportable
    public Integer physicalClosedLimitLift; // 1 int16u reportable
    public Integer physicalClosedLimitTilt; // 2 int16u reportable
    public Integer currentPositionLift; // 3 int16u reportable
    public Integer currentPositionTilt; // 4 int16u reportable
    public Integer numberOfActuationsLift; // 5 int16u reportable
    public Integer numberOfActuationsTilt; // 6 int16u reportable
    public ConfigStatus configStatus; // 7 ConfigStatus reportable
    public Integer currentPositionLiftPercentage; // 8 percent reportable
    public Integer currentPositionTiltPercentage; // 9 percent reportable
    public OperationalStatus operationalStatus; // 10 OperationalStatus reportable
    public Integer targetPositionLiftPercent100ths; // 11 percent100ths reportable
    public Integer targetPositionTiltPercent100ths; // 12 percent100ths reportable
    public EndProductType endProductType; // 13 EndProductType reportable
    public Integer currentPositionLiftPercent100ths; // 14 percent100ths reportable
    public Integer currentPositionTiltPercent100ths; // 15 percent100ths reportable
    public Integer installedOpenLimitLift; // 16 int16u reportable
    public Integer installedClosedLimitLift; // 17 int16u reportable
    public Integer installedOpenLimitTilt; // 18 int16u reportable
    public Integer installedClosedLimitTilt; // 19 int16u reportable
    public Mode mode; // 23 Mode reportable writable
    public SafetyStatus safetyStatus; // 26 SafetyStatus reportable
    public List<Integer> generatedCommandList; // 65528 command_id reportable
    public List<Integer> acceptedCommandList; // 65529 command_id reportable
    public List<Integer> eventList; // 65530 event_id reportable
    public List<Integer> attributeList; // 65531 attrib_id reportable
    public Map<String, Boolean> featureMap; // 65532 bitmap32 reportable
    public Integer clusterRevision; // 65533 int16u reportable

    public WindowCoveringCluster(long nodeId, int endpointId) {
        super(nodeId, endpointId, 85, "WindowCovering");
    }

    public void upOrOpen(MatterClient client) throws Exception {
        Object o = new Object() {
        };
        sendCommand(client, "upOrOpen", o);
    }

    public void downOrClose(MatterClient client) throws Exception {
        Object o = new Object() {
        };
        sendCommand(client, "downOrClose", o);
    }

    public void stopMotion(MatterClient client) throws Exception {
        Object o = new Object() {
        };
        sendCommand(client, "stopMotion", o);
    }

    public void goToLiftValue(MatterClient client, Integer liftValue) throws Exception {
        final Integer _liftValue = liftValue;
        Object o = new Object() {
            public Integer liftValue = _liftValue;
        };
        sendCommand(client, "goToLiftValue", o);
    }

    public void goToLiftPercentage(MatterClient client, Integer liftPercent100thsValue) throws Exception {
        final Integer _liftPercent100thsValue = liftPercent100thsValue;
        Object o = new Object() {
            public Integer liftPercent100thsValue = _liftPercent100thsValue;
        };
        sendCommand(client, "goToLiftPercentage", o);
    }

    public void goToTiltValue(MatterClient client, Integer tiltValue) throws Exception {
        final Integer _tiltValue = tiltValue;
        Object o = new Object() {
            public Integer tiltValue = _tiltValue;
        };
        sendCommand(client, "goToTiltValue", o);
    }

    public void goToTiltPercentage(MatterClient client, Integer tiltPercent100thsValue) throws Exception {
        final Integer _tiltPercent100thsValue = tiltPercent100thsValue;
        Object o = new Object() {
            public Integer tiltPercent100thsValue = _tiltPercent100thsValue;
        };
        sendCommand(client, "goToTiltPercentage", o);
    }

    public String toString() {
        String str = "";
        str += "type : " + type + "\n";
        str += "physicalClosedLimitLift : " + physicalClosedLimitLift + "\n";
        str += "physicalClosedLimitTilt : " + physicalClosedLimitTilt + "\n";
        str += "currentPositionLift : " + currentPositionLift + "\n";
        str += "currentPositionTilt : " + currentPositionTilt + "\n";
        str += "numberOfActuationsLift : " + numberOfActuationsLift + "\n";
        str += "numberOfActuationsTilt : " + numberOfActuationsTilt + "\n";
        str += "configStatus : " + configStatus + "\n";
        str += "currentPositionLiftPercentage : " + currentPositionLiftPercentage + "\n";
        str += "currentPositionTiltPercentage : " + currentPositionTiltPercentage + "\n";
        str += "operationalStatus : " + operationalStatus + "\n";
        str += "targetPositionLiftPercent100ths : " + targetPositionLiftPercent100ths + "\n";
        str += "targetPositionTiltPercent100ths : " + targetPositionTiltPercent100ths + "\n";
        str += "endProductType : " + endProductType + "\n";
        str += "currentPositionLiftPercent100ths : " + currentPositionLiftPercent100ths + "\n";
        str += "currentPositionTiltPercent100ths : " + currentPositionTiltPercent100ths + "\n";
        str += "installedOpenLimitLift : " + installedOpenLimitLift + "\n";
        str += "installedClosedLimitLift : " + installedClosedLimitLift + "\n";
        str += "installedOpenLimitTilt : " + installedOpenLimitTilt + "\n";
        str += "installedClosedLimitTilt : " + installedClosedLimitTilt + "\n";
        str += "mode : " + mode + "\n";
        str += "safetyStatus : " + safetyStatus + "\n";
        str += "generatedCommandList : " + generatedCommandList + "\n";
        str += "acceptedCommandList : " + acceptedCommandList + "\n";
        str += "eventList : " + eventList + "\n";
        str += "attributeList : " + attributeList + "\n";
        str += "featureMap : " + featureMap + "\n";
        str += "clusterRevision : " + clusterRevision + "\n";
        return str;
    }
}
