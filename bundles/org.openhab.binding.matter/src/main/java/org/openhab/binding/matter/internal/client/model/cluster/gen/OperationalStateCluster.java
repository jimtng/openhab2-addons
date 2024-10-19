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
 * OperationalState
 *
 * @author Dan Cunningham - Initial contribution
 */
public class OperationalStateCluster extends BaseCluster {

    public static final String CLUSTER_NAME = "OperationalState";
    public static final int CLUSTER_ID = 0x0060;

    public Integer clusterRevision; // 65533 ClusterRevision
    /**
     * Indicates a list of names of different phases that the device can go through for the selected function or mode.
     * The list may not be in sequence order. For example in a washing machine this could include items such as
     * &quot;pre-soak&quot;, &quot;rinse&quot;, and &quot;spin&quot;. These phases are manufacturer specific and may
     * change when a different function or mode is selected.
     * A null value indicates that the device does not present phases during its operation. When this attribute’s value
     * is null, the CurrentPhase attribute shall also be set to null.
     */
    public List<String> phaseList; // 0 list R V
    /**
     * This attribute represents the current phase of operation being performed by the server. This shall be the
     * positional index representing the value from the set provided in the PhaseList Attribute, where the first item in
     * that list is an index of 0. Thus, this attribute shall have a maximum value that is &quot;length(PhaseList) -
     * 1&quot;.
     * Null if the PhaseList attribute is null or if the PhaseList attribute is an empty list.
     */
    public Integer currentPhase; // 1 uint8 R V
    /**
     * Indicates the estimated time left before the operation is completed, in seconds. Changes to this value shall NOT
     * be reported in a subscription (note the C Quality). A Client implementation may periodically poll this value to
     * ensure alignment of any local rendering of the CountdownTime with the device provided value.
     * A value of 0 means that the operation has completed.
     * When this attribute is null, that represents that there is no time currently defined until operation completion.
     * This may happen, for example, because no operation is in progress or because the completion time is unknown.
     */
    public Integer countdownTime; // 2 elapsed-s R V
    /**
     * This attribute describes the set of possible operational states that the device exposes. An operational state is
     * a fundamental device state such as Running or Error. Details of the phase of a device when, for example, in a
     * state of Running are provided by the CurrentPhase attribute.
     * All devices shall, at a minimum, expose the set of states matching the commands that are also supported by the
     * cluster instance, in addition to Error. The set of possible device states are defined in the
     * OperationalStateEnum. A device type requiring implementation of this cluster shall define the set of states that
     * are applicable to that specific device type.
     */
    public List<OperationalStateStruct> operationalStateList; // 3 list R V
    /**
     * This attribute specifies the current operational state of a device. This shall be populated with a valid
     * OperationalStateID from the set of values in the OperationalStateList Attribute.
     */
    public OperationalStateEnum operationalState; // 4 OperationalStateEnum R V
    /**
     * This attribute shall specify the details of any current error condition being experienced on the device when the
     * OperationalState attribute is populated with Error. Please see ErrorStateStruct for general requirements on the
     * population of this attribute.
     * When there is no error detected, this shall have an ErrorStateID of NoError.
     */
    public ErrorStateStruct operationalError; // 5 ErrorStateStruct R V
    // Structs

    /**
     * The OperationalStateStruct is used to indicate a possible state of the device.
     */
    public class OperationalStateStruct {
        /**
         * This shall be populated with a value from the OperationalStateEnum.
         */
        public OperationalStateEnum operationalStateId; // OperationalStateEnum
        /**
         * This field shall be present if the OperationalStateID is from the set reserved for Manufacturer Specific
         * States, otherwise it shall NOT be present. If present, this shall contain a human-readable description of the
         * operational state.
         */
        public String operationalStateLabel; // string

        public OperationalStateStruct(OperationalStateEnum operationalStateId, String operationalStateLabel) {
            this.operationalStateId = operationalStateId;
            this.operationalStateLabel = operationalStateLabel;
        }
    }

    public class ErrorStateStruct {
        /**
         * This shall be populated with a value from the ErrorStateEnum.
         */
        public ErrorStateEnum errorStateID; // ErrorStateEnum
        /**
         * This field shall be present if the ErrorStateID is from the set reserved for Manufacturer Specific Errors,
         * otherwise it shall NOT be present. If present, this shall contain a human-readable description of the
         * ErrorStateID; e.g. for a manufacturer specific ErrorStateID of &quot;0x80&quot; the ErrorStateLabel may
         * contain &quot;My special error&quot;.
         */
        public String errorStateLabel; // string
        /**
         * This shall be a human-readable string that provides details about the error condition. As an example, if the
         * ErrorStateID indicates that the device is a Robotic Vacuum that is stuck, the ErrorStateDetails contains
         * &quot;left wheel blocked&quot;.
         */
        public String errorStateDetails; // string

        public ErrorStateStruct(ErrorStateEnum errorStateID, String errorStateLabel, String errorStateDetails) {
            this.errorStateID = errorStateID;
            this.errorStateLabel = errorStateLabel;
            this.errorStateDetails = errorStateDetails;
        }
    }

    // Enums
    /**
     * This type defines the set of known operational state values, and is derived from enum8. The following table
     * defines the applicable ranges for values that are defined within this type. All values that are undefined shall
     * be treated as reserved. As shown by the table, states that may be specific to a certain Device Type or other
     * modality shall be defined in a derived cluster of this cluster.
     * The derived cluster-specific state definitions shall NOT duplicate any general state definitions. That is, a
     * derived cluster specification of this cluster cannot define states with the same semantics as the general states
     * defined below.
     * A manufacturer-specific state definition shall NOT duplicate the general state definitions or derived cluster
     * state definitions. That is, a manufacturer-defined state defined for this cluster or a derived cluster thereof
     * cannot define a state with the same semantics as the general states defined below or states defined in a derived
     * cluster. Such manufacturer-specific state definitions shall be scoped in the context of the Vendor ID present in
     * the Basic Information cluster.
     * The following table defines the generally applicable states.
     */
    public enum OperationalStateEnum {
        DEFAULT(0, "Default");

        public final Integer value;
        public final String label;

        private OperationalStateEnum(Integer value, String label) {
            this.value = value;
            this.label = label;
        }
    }

    /**
     * This type defines the set of known operational error values, and is derived from enum8. The following table
     * defines the applicable ranges for values that are defined within this type. All values that
     * are undefined shall be treated as reserved. As shown by the table, errors that may be specific to a certain
     * Device Type or other modality shall be defined in a derived cluster of this cluster.
     * The derived cluster-specific error definitions shall NOT duplicate the general error definitions. That is, a
     * derived cluster specification of this cluster cannot define errors with the same semantics as the general errors
     * defined below.
     * The manufacturer-specific error definitions shall NOT duplicate the general error definitions or derived
     * cluster-specific error definitions. That is, a manufacturer-defined error defined for this cluster or a derived
     * cluster thereof cannot define errors with the same semantics as the general errors defined below or errors
     * defined in a derived cluster. Such manufacturer-specific error definitions shall be scoped in the context of the
     * Vendor ID present in the Basic Information cluster.
     * The set of ErrorStateID field values defined in each of the generic or derived Operational State cluster
     * specifications is called ErrorState.
     */
    public enum ErrorStateEnum {
        DEFAULT(0, "Default");

        public final Integer value;
        public final String label;

        private ErrorStateEnum(Integer value, String label) {
            this.value = value;
            this.label = label;
        }
    }

    /**
     * The following table defines the generally applicable ErrorState values.
     */
    public enum GeneralErrorStateEnum {
        NO_ERROR(0, "NoError"),
        UNABLE_TO_START_OR_RESUME(1, "UnableToStartOrResume"),
        UNABLE_TO_COMPLETE_OPERATION(2, "UnableToCompleteOperation"),
        COMMAND_INVALID_IN_STATE(3, "CommandInvalidInState");

        public final Integer value;
        public final String label;

        private GeneralErrorStateEnum(Integer value, String label) {
            this.value = value;
            this.label = label;
        }
    }

    public OperationalStateCluster(BigInteger nodeId, int endpointId) {
        super(nodeId, endpointId, 96, "OperationalState");
    }

    // commands
    /**
     * This command shall be supported if the device supports remotely pausing the operation. If this command is
     * supported, the Resume command shall also be supported.
     * On receipt of this command, the device shall pause its operation if it is possible based on the current function
     * of the server. For example, if it is at a point where it is safe to do so and/or permitted, but can be restarted
     * from the point at which pause occurred.
     * If this command is received when already in the Paused state the device shall respond with an
     * OperationalCommandResponse command with an ErrorStateID of NoError but take no further action.
     * A device that receives this command in any state which is not Pause-compatible shall respond
     * with an OperationalCommandResponse command with an ErrorStateID of CommandInvalidInState and shall take no
     * further action.
     * States are defined as Pause-compatible as follows:
     * • For states defined in this cluster specification, in Table 3, “Pause Compatibility”.
     * • For states defined by derived cluster specifications, in the corresponding specifications.
     * • For manufacturer-specific states, by the manufacturer.
     * A device that is unable to honor the Pause command for whatever reason shall respond with an
     * OperationalCommandResponse command with an ErrorStateID of CommandInvalidInState but take no further action.
     * Otherwise, on success:
     * • The OperationalState attribute shall be set to Paused.
     * • The device shall respond with an OperationalCommandResponse command with an ErrorStateID of NoError.
     * The following table defines the compatibility of this cluster’s states with the Pause command.
     * ### Table 3. Pause Compatibility
     */
    public static ClusterCommand pause() {
        Map<String, Object> map = new LinkedHashMap<>();

        return new ClusterCommand("pause");
    }

    /**
     * This command shall be supported if the device supports remotely stopping the operation.
     * On receipt of this command, the device shall stop its operation if it is at a position where it is safe to do so
     * and/or permitted. Restart of the device following the receipt of the Stop command shall require attended
     * operation unless remote start is allowed by the device type and any jurisdiction governing remote operation of
     * the device.
     * If this command is received when already in the Stopped state the device shall respond with an
     * OperationalCommandResponse command with an ErrorStateID of NoError but take no further action.
     * A device that is unable to honor the Stop command for whatever reason shall respond with an
     * OperationalCommandResponse command with an ErrorStateID of CommandInvalidInState but take no further action.
     * Otherwise, on success:
     * • The OperationalState attribute shall be set to Stopped.
     * • The device shall respond with an OperationalCommandResponse command with an ErrorStateID of NoError.
     */
    public static ClusterCommand stop() {
        Map<String, Object> map = new LinkedHashMap<>();

        return new ClusterCommand("stop");
    }

    /**
     * This command shall be supported if the device supports remotely starting the operation. If this command is
     * supported, the &#x27;Stop command shall also be supported.
     * On receipt of this command, the device shall start its operation if it is safe to do so and the device is in an
     * operational state from which it can be started. There may be either regulatory or manufacturer-imposed safety and
     * security requirements that first necessitate some specific action at the device before a Start command can be
     * honored. In such instances, a device shall respond with a status code of CommandInvalidInState if a Start command
     * is received prior to the required on- device action.
     * If this command is received when already in the Running state the device shall respond with an
     * OperationalCommandResponse command with an ErrorStateID of NoError but take no further action.
     * A device that is unable to honor the Start command for whatever reason shall respond with an
     * OperationalCommandResponse command with an ErrorStateID of UnableToStartOrResume but take no further action.
     * Otherwise, on success:
     * • The OperationalState attribute shall be set to Running.
     * • The device shall respond with an OperationalCommandResponse command with an ErrorStateID of NoError.
     */
    public static ClusterCommand start() {
        Map<String, Object> map = new LinkedHashMap<>();

        return new ClusterCommand("start");
    }

    /**
     * This command shall be supported if the device supports remotely resuming the operation. If this command is
     * supported, the Pause command shall also be supported.
     * On receipt of this command, the device shall resume its operation from the point it was at when it received the
     * Pause command, or from the point when it was paused by means outside of this cluster (for example by manual
     * button press).
     * If this command is received when already in the Running state the device shall respond with an
     * OperationalCommandResponse command with an ErrorStateID of NoError but take no further action.
     * A device that receives this command in any state which is not Resume-compatible shall respond with an
     * OperationalCommandResponse command with an ErrorStateID of CommandInvalidInState and shall take no further
     * action.
     * States are defined as Resume-compatible as follows:
     * • For states defined in this cluster specification, in Table 4, “Resume Compatibility”.
     * • For states defined by derived cluster specifications, in the corresponding specifications.
     * • For manufacturer-specific states, by the manufacturer.
     * The following table defines the compatibility of this cluster’s states with the Resume command.
     * ### Table 4. Resume Compatibility
     * A device that is unable to honor the Resume command for any other reason shall respond with an
     * OperationalCommandResponse command with an ErrorStateID of UnableToStartOrResume but take no further action.
     * Otherwise, on success:
     * • The OperationalState attribute shall be set to the most recent non-Error operational state prior to entering
     * the Paused state.
     * • The device shall respond with an OperationalCommandResponse command with an ErrorStateID of NoError.
     */
    public static ClusterCommand resume() {
        Map<String, Object> map = new LinkedHashMap<>();

        return new ClusterCommand("resume");
    }

    public String toString() {
        String str = "";
        str += "clusterRevision : " + clusterRevision + "\n";
        str += "phaseList : " + phaseList + "\n";
        str += "currentPhase : " + currentPhase + "\n";
        str += "countdownTime : " + countdownTime + "\n";
        str += "operationalStateList : " + operationalStateList + "\n";
        str += "operationalState : " + operationalState + "\n";
        str += "operationalError : " + operationalError + "\n";
        return str;
    }
}