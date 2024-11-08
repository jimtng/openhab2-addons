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

/**
 * Messages
 *
 * @author Dan Cunningham - Initial contribution
 */
public class MessagesCluster extends BaseCluster {

    public static final String CLUSTER_NAME = "Messages";
    public static final int CLUSTER_ID = 0x0097;

    public Integer clusterRevision; // 65533 ClusterRevision
    public FeatureMap featureMap; // 65532 FeatureMap
    /**
     * Indicates a list of queued messages.
     * In addition to filtering based upon fabric, to preserve user privacy, the server may further limit the set of
     * messages returned in a read request. At minimum, the server shall return to a client those messages that the
     * client itself created/submitted.
     */
    public List<MessageStruct> messages; // 0 list R F V
    /**
     * Indicates a list of the MessageIDs of the Messages currently being presented. If this list is empty, no messages
     * are currently being presented.
     * This list shall NOT be fabric-scoped; it shall contain MessageIDs for all Messages being presented, no matter
     * what fabric the client that queued them is on.
     */
    public List<String> activeMessageIDs; // 1 list R V
    // Structs

    /**
     * This represents a single message.
     */
    public class MessageStruct {
        /**
         * This field shall indicate a globally unique ID for this message.
         */
        public String messageId; // MessageID
        /**
         * This field shall indicate the priority level for this message.
         */
        public MessagePriorityEnum priority; // MessagePriorityEnum
        /**
         * This field shall indicate control information related to the message.
         */
        public MessageControlBitmap messageControl; // MessageControlBitmap
        /**
         * This field shall indicate the time in UTC at which the message becomes available to be presented. A null
         * value shall indicate &quot;now.&quot;
         */
        public Integer startTime; // epoch-s
        /**
         * This field shall indicate the amount of time, in milliseconds, after the StartTime during which the message
         * is available to be presented. A null value shall indicate &quot;until changed&quot;.
         */
        public BigInteger duration; // uint64
        /**
         * This field shall indicate a string containing the message to be presented.
         */
        public String messageText; // string
        /**
         * This field shall indicate a list of potential responses to the message. The entries in this list shall have
         * unique values of MessageResponseID.
         * If the ResponseRequired bit is set on the message but this list is empty, the device shall provide a generic
         * acknowledgement button, e.g. &quot;OK&quot;.
         * If the ResponseRequired bit is not set on the message, this list shall be ignored.
         */
        public List<MessageResponseOptionStruct> responses; // list
        public Integer fabricIndex; // FabricIndex

        public MessageStruct(String messageId, MessagePriorityEnum priority, MessageControlBitmap messageControl,
                Integer startTime, BigInteger duration, String messageText, List<MessageResponseOptionStruct> responses,
                Integer fabricIndex) {
            this.messageId = messageId;
            this.priority = priority;
            this.messageControl = messageControl;
            this.startTime = startTime;
            this.duration = duration;
            this.messageText = messageText;
            this.responses = responses;
            this.fabricIndex = fabricIndex;
        }
    }

    /**
     * This represents a possible response to a message.
     */
    public class MessageResponseOptionStruct {
        /**
         * This field shall indicate a unique unsigned 32-bit number identifier for this message response option.
         */
        public Integer messageResponseId; // uint32
        /**
         * This field shall indicate the text for this option; e.g. &quot;Yes&quot;, &quot;No&quot;, etc.
         */
        public String label; // string

        public MessageResponseOptionStruct(Integer messageResponseId, String label) {
            this.messageResponseId = messageResponseId;
            this.label = label;
        }
    }

    // Enums
    /**
     * A display device may include this preference in the MessageComplete event as a hint to clients about how to
     * handle future similar messages.
     */
    public enum FutureMessagePreferenceEnum {
        ALLOWED(0, "Allowed"),
        INCREASED(1, "Increased"),
        REDUCED(2, "Reduced"),
        DISALLOWED(3, "Disallowed"),
        BANNED(4, "Banned");

        public final Integer value;
        public final String label;

        private FutureMessagePreferenceEnum(Integer value, String label) {
            this.value = value;
            this.label = label;
        }
    }

    /**
     * Priority SHOULD be used to decide which messages to show when the number of eligible messages is larger than the
     * device’s capacity to present them.
     */
    public enum MessagePriorityEnum {
        LOW(0, "Low"),
        MEDIUM(1, "Medium"),
        HIGH(2, "High"),
        CRITICAL(3, "Critical");

        public final Integer value;
        public final String label;

        private MessagePriorityEnum(Integer value, String label) {
            this.value = value;
            this.label = label;
        }
    }

    // Bitmaps
    /**
     * This data type is derived from map16, and indicates control information related to a message.
     */
    public static class MessageControlBitmap {
        /**
         * Message requires confirmation from user
         * This bit shall indicate that the message originator requests a confirmation of receipt by the user. If
         * confirmation is required, the device SHOULD present the message until it is either confirmed by the user
         * selecting a confirmation option, or the message expires.
         */
        public boolean confirmationRequired;
        /**
         * Message requires response from user
         * This bit shall indicate that a MessagePresented event SHOULD be generated based on the response of the user
         * to the message.
         */
        public boolean responseRequired;
        /**
         * Message supports reply message from user
         * This bit shall indicate that a free-form user reply is to be included in the confirmation of receipt.
         */
        public boolean replyMessage;
        /**
         * Message has already been confirmed
         * This bit shall indicate the current confirmation state of a message, which is useful in the event that there
         * are multiple Messages cluster client devices on a network.
         */
        public boolean messageConfirmed;
        /**
         * Message required PIN/password protection
         * This bit shall indicate that user authentication (e.g. by password or PIN) is required before viewing a
         * message.
         */
        public boolean messageProtected;

        public MessageControlBitmap(boolean confirmationRequired, boolean responseRequired, boolean replyMessage,
                boolean messageConfirmed, boolean messageProtected) {
            this.confirmationRequired = confirmationRequired;
            this.responseRequired = responseRequired;
            this.replyMessage = replyMessage;
            this.messageConfirmed = messageConfirmed;
            this.messageProtected = messageProtected;
        }
    }

    public static class FeatureMap {
        /**
         * ReceivedConfirmation
         * This feature shall indicate that the device can get confirmation from a user that the message was received.
         */
        public boolean receivedConfirmation;
        /**
         * ConfirmationResponse
         * This feature shall indicate that the device is capable of presenting a list of responses to the user and
         * recording the user’s choice of response.
         */
        public boolean confirmationResponse;
        /**
         * ConfirmationReply
         * This feature shall indicate that the device is capable of collecting a free-form text response to a message.
         */
        public boolean confirmationReply;
        /**
         * ProtectedMessages
         * This feature shall indicate that the device is capable of requiring the user to authenticate before viewing a
         * message; e.g. entering a PIN or password before viewing a message with billing information.
         */
        public boolean protectedMessages;

        public FeatureMap(boolean receivedConfirmation, boolean confirmationResponse, boolean confirmationReply,
                boolean protectedMessages) {
            this.receivedConfirmation = receivedConfirmation;
            this.confirmationResponse = confirmationResponse;
            this.confirmationReply = confirmationReply;
            this.protectedMessages = protectedMessages;
        }
    }

    public MessagesCluster(BigInteger nodeId, int endpointId) {
        super(nodeId, endpointId, 151, "Messages");
    }

    // commands
    /**
     * Upon receipt, this shall cause the message in the passed fields to be appended to the Messages attribute.
     * If appending the message would cause the number of messages to be greater than the capacity of the list, the
     * device shall NOT append any message to Messages, and shall return a status code of RESOURCE_EXHAUSTED.
     * When displaying a message in response to this command, an indication (ex. visual) of the origin node of the
     * command shall be provided. This could be in the form of a friendly name label which uniquely identifies the node
     * to the user. This friendly name label is typically assigned by the Matter Admin at the time of commissioning and,
     * when it’s a device, is often editable by the user. It might be a combination of a company name and friendly name,
     * for example, ”Acme” or “Acme Streaming Service on Alice’s Phone”.
     * NOTE
     * It is currently not specified where the friendly name label can be found on the node, meaning that clients SHOULD
     * NOT rely on a certain method they happen to observe in a particular server instance, since other instances could
     * employ a different method.
     * The device SHOULD make it possible for the user to view which nodes have access to this cluster and to
     * individually remove privileges for each node.
     */
    public static ClusterCommand presentMessagesRequest(String messageId, MessagePriorityEnum priority,
            MessageControlBitmap messageControl, Integer startTime, BigInteger duration, String messageText,
            List<MessageResponseOptionStruct> responses) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("messageId", messageId);
        map.put("priority", priority);
        map.put("messageControl", messageControl);
        map.put("startTime", startTime);
        map.put("duration", duration);
        map.put("messageText", messageText);
        map.put("responses", responses);

        return new ClusterCommand("presentMessagesRequest", map);
    }

    public static ClusterCommand cancelMessagesRequest(List<String> messageIDs) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("messageIDs", messageIDs);

        return new ClusterCommand("cancelMessagesRequest", map);
    }

    public String toString() {
        String str = "";
        str += "clusterRevision : " + clusterRevision + "\n";
        str += "featureMap : " + featureMap + "\n";
        str += "messages : " + messages + "\n";
        str += "activeMessageIDs : " + activeMessageIDs + "\n";
        return str;
    }
}
