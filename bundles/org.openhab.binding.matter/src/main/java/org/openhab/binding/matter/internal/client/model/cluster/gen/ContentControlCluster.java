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
 * ContentControl
 *
 * @author Dan Cunningham - Initial contribution
 */
public class ContentControlCluster extends BaseCluster {

    public static final String CLUSTER_NAME = "ContentControl";
    public static final int CLUSTER_ID = 0x050F;

    public Integer clusterRevision; // 65533 ClusterRevision 
    public FeatureMap featureMap; // 65532 FeatureMap 
    /**
    * Indicates whether the Content Control feature implemented on a media device is turned off (FALSE) or turned on (TRUE).
    */
    public Boolean enabled; // 0 bool R V
    /**
    * This attribute shall provide the collection of ratings that are currently valid for this media device. The items should honor the metadata of the on-demand content (e.g. Movie) rating system for one country or region where the media device has been provisioned. For example, for the MPAA system, RatingName may be one value out of &quot;G&quot;, &quot;PG&quot;, &quot;PG-13&quot;, &quot;R&quot;, &quot;NC-17&quot;.
The media device shall have a way to determine which rating system applies for the on-demand content and then populate this attribute. For example, it can do it through examining the Location attribute in the Basic Information cluster, and then determining which rating system applies.
The ratings in this collection shall be in order from a rating for the youngest viewers to the one for the oldest viewers. Each rating in the list shall be unique.
    */
    public List<RatingNameStruct> onDemandRatings; // 1 list R V
    /**
    * Indicates a threshold rating as a content filter which is compared with the rating for on-demand content. For example, if the on-demand content rating is greater than or equal to OnDemandRatingThreshold, for a rating system that is ordered from lower viewer age to higher viewer age, then on-demand content is not appropriate for the User and the Node shall prevent the playback of content.
This attribute shall be set to one of the values present in the OnDemandRatings attribute.
When this attribute changes, the device SHOULD make the user aware of any limits of this feature. For example, if the feature does not control content within apps, then the device should make this clear to the user when the attribute changes.
    */
    public String onDemandRatingThreshold; // 2 string R V
    /**
    * Indicates a collection of ratings which ScheduledContentRatingThreshold can be set to. The items should honor metadata of the scheduled content rating system for the country or region where the media device has been provisioned.
The media device shall have a way to determine which scheduled content rating system applies and then populate this attribute. For example, this can be done by examining the Location attribute in Basic Information cluster, and then determining which rating system applies.
The ratings in this collection shall be in order from a rating for the youngest viewers to the one for the oldest viewers. Each rating in the list shall be unique.
    */
    public List<RatingNameStruct> scheduledContentRatings; // 3 list R V
    /**
    * Indicates a threshold rating as a content filter which is used to compare with the rating for scheduled content. For example, if the scheduled content rating is greater than or equal to ScheduledContentRatingThreshold for a rating system that is ordered from lower viewer age to higher viewer age, then the scheduled content is not appropriate for the User and shall be blocked.
This attribute shall be set to one of the values present in the ScheduledContentRatings attribute.
When this attribute changes, the device SHOULD make the user aware of any limits of this feature. For example, if the feature does not control content within apps, then the device should make this clear to the user when the attribute changes.
    */
    public String scheduledContentRatingThreshold; // 4 string R V
    /**
    * Indicates the amount of time (in seconds) which the User is allowed to spend watching TV within one day when the Content Control feature is activated.
    */
    public Integer screenDailyTime; // 5 elapsed-s R V
    /**
    * Indicates the remaining screen time (in seconds) which the User is allowed to spend watching TV for the current day when the Content Control feature is activated. When this value equals 0, the media device shall terminate the playback of content.
This attribute shall be updated when the AddBonusTime command is received and processed successfully (with the correct PIN).
    */
    public Integer remainingScreenTime; // 6 elapsed-s R V
    /**
    * Indicates whether the playback of unrated content is allowed when the Content Control feature is activated. If this attribute equals FALSE, then playback of unrated content
shall be permitted. Otherwise, the media device shall prevent the playback of unrated content.
When this attribute changes, the device SHOULD make the user aware of any limits of this feature. For example, if the feature does not control content within apps, then the device should make this clear to the user when the attribute changes.
    */
    public Boolean blockUnrated; // 7 bool R V
    /**
    * Indicates a set of channels that shall be blocked when the Content Control feature is activated.
    */
    public List<BlockChannelStruct> blockChannelList; // 8 list R V
    /**
    * Indicates a set of applications that shall be blocked when the Content Control feature is activated.
    */
    public List<AppInfoStruct> blockApplicationList; // 9 list R V
    /**
    * Indicates a set of periods during which the playback of content on media device shall be blocked when the Content Control feature is activated. The media device shall reject any request to play content during one period of this attribute. If it is entering any one period of this attribute, the media device shall block content which is playing and generate an event EnteringBlockContentTimeWindow. There shall not be multiple entries in this attribute list for the same day of week.
    */
    public List<TimeWindowStruct> blockContentTimeWindow; // 10 list R V
    //Structs
     public class RatingNameStruct {
        /**
        * This field shall indicate the name of the rating level of the applied rating system. The applied rating system is dependent upon the region or country where the Node has been provisioned, and may vary from one country to another.
        */
        public String ratingName; // string
        /**
        * This field shall specify a human readable (displayable) description for RatingName.
        */
        public String ratingNameDesc; // string
        public RatingNameStruct(String ratingName, String ratingNameDesc) {
            this.ratingName = ratingName;
            this.ratingNameDesc = ratingNameDesc;
        }
     }
    /**
    * [options&#x3D;&quot;header&quot;,valign&#x3D;&quot;middle&quot;]b
    */
     public class BlockChannelStruct {
        /**
        * This field shall indicate a unique index value for a blocked channel. This value may be used to indicate one selected channel which will be removed from BlockChannelList attribute.
        */
        public Integer blockChannelIndex; // uint16
        /**
        * This field shall indicate the channel major number value (for example, using ATSC format). When the channel number is expressed as a string, such as &quot;13.1&quot; or &quot;256&quot;, the major number would be 13 or 256, respectively. This field is required but shall be set to 0 for channels such as over-the-top channels that are not represented by a major or minor number.
        */
        public Integer majorNumber; // uint16
        /**
        * This field shall indicate the channel minor number value (for example, using ATSC format). When the channel number is expressed as a string, such as &quot;13.1&quot; or &quot;256&quot;, the minor number would be 1 or 0, respectively. This field is required but shall be set to 0 for channels such as over-the-top channels that are not represented by a major or minor number.
        */
        public Integer minorNumber; // uint16
        /**
        * This field shall indicate the unique identifier for a specific channel. This field is optional, but SHOULD be provided when MajorNumber and MinorNumber are not available.
        */
        public String identifier; // string
        public BlockChannelStruct(Integer blockChannelIndex, Integer majorNumber, Integer minorNumber, String identifier) {
            this.blockChannelIndex = blockChannelIndex;
            this.majorNumber = majorNumber;
            this.minorNumber = minorNumber;
            this.identifier = identifier;
        }
     }
     public class AppInfoStruct {
        /**
        * This field shall indicate the CSA-issued vendor ID for the catalog. The DIAL registry shall use value 0x0000.
Content App Platform providers will have their own catalog vendor ID (set to their own Vendor ID) and will assign an ApplicationID to each Content App.
        */
        public Integer catalogVendorId; // uint16
        /**
        * This field shall indicate the application identifier, expressed as a string, such as &quot;PruneVideo&quot; or &quot;Company X&quot;. This field shall be unique within a catalog.
        */
        public String applicationId; // string
        public AppInfoStruct(Integer catalogVendorId, String applicationId) {
            this.catalogVendorId = catalogVendorId;
            this.applicationId = applicationId;
        }
     }
     public class TimeWindowStruct {
        /**
        * This field shall indicate a unique index of a specific time window. This value may be used to indicate a selected time window which will be removed from the BlockContentTimeWindow attribute.
        */
        public Integer timeWindowIndex; // uint16
        /**
        * This field shall indicate a day of week.
        */
        public DayOfWeekBitmap dayOfWeek; // DayOfWeekBitmap
        /**
        * This field shall indicate one or more discrete time periods.
        */
        public List<TimePeriodStruct> timePeriod; // list
        public TimeWindowStruct(Integer timeWindowIndex, DayOfWeekBitmap dayOfWeek, List<TimePeriodStruct> timePeriod) {
            this.timeWindowIndex = timeWindowIndex;
            this.dayOfWeek = dayOfWeek;
            this.timePeriod = timePeriod;
        }
     }
     public class TimePeriodStruct {
        /**
        * This field shall indicate the starting hour.
        */
        public Integer startHour; // uint8
        /**
        * This field shall indicate the starting minute.
        */
        public Integer startMinute; // uint8
        /**
        * This field shall indicate the ending hour. EndHour shall be equal to or greater than StartHour
        */
        public Integer endHour; // uint8
        /**
        * This field shall indicate the ending minute. If EndHour is equal to StartHour then EndMinute shall be greater than StartMinute. If the EndHour is equal to 23 and the EndMinute is equal to 59, all contents shall be blocked until 23:59:59.
        */
        public Integer endMinute; // uint8
        public TimePeriodStruct(Integer startHour, Integer startMinute, Integer endHour, Integer endMinute) {
            this.startHour = startHour;
            this.startMinute = startMinute;
            this.endHour = endHour;
            this.endMinute = endMinute;
        }
     }


    //Enums
    public enum DayOfWeekBitmap {
        SUNDAY(0, "Sunday"),
        MONDAY(1, "Monday"),
        TUESDAY(2, "Tuesday"),
        WEDNESDAY(3, "Wednesday"),
        THURSDAY(4, "Thursday"),
        FRIDAY(5, "Friday"),
        SATURDAY(6, "Saturday");
        public final Integer value;
        public final String label;
        private DayOfWeekBitmap(Integer value, String label){
            this.value = value;
            this.label = label;
        }
    }
    public enum StatusCodeEnum {
        INVALID_PIN_CODE(2, "InvalidPinCode"),
        INVALID_RATING(3, "InvalidRating"),
        INVALID_CHANNEL(4, "InvalidChannel"),
        CHANNEL_ALREADY_EXIST(5, "ChannelAlreadyExist"),
        CHANNEL_NOT_EXIST(6, "ChannelNotExist"),
        UNIDENTIFIABLE_APPLICATION(7, "UnidentifiableApplication"),
        APPLICATION_ALREADY_EXIST(8, "ApplicationAlreadyExist"),
        APPLICATION_NOT_EXIST(9, "ApplicationNotExist"),
        TIME_WINDOW_ALREADY_EXIST(10, "TimeWindowAlreadyExist"),
        TIME_WINDOW_NOT_EXIST(11, "TimeWindowNotExist");
        public final Integer value;
        public final String label;
        private StatusCodeEnum(Integer value, String label){
            this.value = value;
            this.label = label;
        }
    }

    // Bitmaps
    public static class FeatureMap {
        /**
        * Supports managing screen time limits.
        */
        public boolean sT;
        /**
        * Supports managing a PIN code which is used for restricting access to configuration of this feature.
        */
        public boolean pM;
        /**
        * Supports managing content controls for unrated content.
        */
        public boolean bU;
        /**
        * Supports managing content controls based upon rating threshold for on demand content.
        */
        public boolean oCR;
        /**
        * Supports managing content controls based upon rating threshold for scheduled content.
        */
        public boolean sCR;
        /**
        * Supports managing a set of channels that are prohibited.
        */
        public boolean bC;
        /**
        * Supports managing a set of applications that are prohibited.
        */
        public boolean bA;
        /**
        * Supports managing content controls based upon setting time window in which all contents and applications SHALL be blocked.
        */
        public boolean bTW;
        public FeatureMap(boolean sT, boolean pM, boolean bU, boolean oCR, boolean sCR, boolean bC, boolean bA, boolean bTW){
            this.sT = sT;
            this.pM = pM;
            this.bU = bU;
            this.oCR = oCR;
            this.sCR = sCR;
            this.bC = bC;
            this.bA = bA;
            this.bTW = bTW;
        }
    }

    public ContentControlCluster(BigInteger nodeId, int endpointId) {
        super(nodeId, endpointId, 1295, "ContentControl");
    }

    
    //commands
    /**
    * The purpose of this command is to update the PIN used for protecting configuration of the content control settings. Upon success, the old PIN shall no longer work.
The PIN is used to ensure that only the Node (or User) with the PIN code can make changes to the Content Control settings, for example, turn off Content Controls or modify the ScreenDailyTime. The PIN is composed of a numeric string of up to 6 human readable characters (displayable) .
Upon receipt of this command, the media device shall check if the OldPIN field of this command is the same as the current PIN. If the PINs are the same, then the PIN code shall be set to NewPIN. Otherwise a response with InvalidPINCode error status shall be returned.
The media device may provide a default PIN to the User via an out of band mechanism. For security reasons, it is recommended that a client encourage the user to update the PIN from its default value when performing configuration of the Content Control settings exposed by this cluster. The ResetPIN command can also be used to obtain the default PIN.
    */
    public static ClusterCommand updatePin(String oldPin, String newPin) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("oldPin", oldPin);
        map.put("newPin", newPin);

        return new ClusterCommand("updatePin", map);
    }
    /**
    * The purpose of this command is to reset the PIN.
If this command is executed successfully, a ResetPINResponse command with a new PIN shall be returned.
    */
    public static ClusterCommand resetPin() {
        Map<String, Object> map = new LinkedHashMap<>();

        return new ClusterCommand("resetPin");
    }
    /**
    * The purpose of this command is to turn on the Content Control feature on a media device.
Upon receipt of the Enable command, the media device shall set the Enabled attribute to TRUE.
    */
    public static ClusterCommand enable() {
        Map<String, Object> map = new LinkedHashMap<>();

        return new ClusterCommand("enable");
    }
    /**
    * The purpose of this command is to turn off the Content Control feature on a media device.
On receipt of the Disable command, the media device shall set the Enabled attribute to FALSE.
    */
    public static ClusterCommand disable() {
        Map<String, Object> map = new LinkedHashMap<>();

        return new ClusterCommand("disable");
    }
    /**
    * The purpose of this command is to add the extra screen time for the user.
If a client with Operate privilege invokes this command, the media device shall check whether
the PINCode passed in the command matches the current PINCode value. If these match, then the RemainingScreenTime attribute shall be increased by the specified BonusTime value.
If the PINs do not match, then a response with InvalidPINCode error status shall be returned, and no changes shall be made to RemainingScreenTime.
If a client with Manage privilege or greater invokes this command, the media device shall ignore the PINCode field and directly increase the RemainingScreenTime attribute by the specified BonusTime value.
A server that does not support the PM feature shall respond with InvalidPINCode to clients that only have Operate privilege unless:
  • It has been provided with the PIN value to expect via an out of band mechanism, and
  • The client has provided a PINCode that matches the expected PIN value.
    */
    public static ClusterCommand addBonusTime(String pinCode, Integer bonusTime) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("pinCode", pinCode);
        map.put("bonusTime", bonusTime);

        return new ClusterCommand("addBonusTime", map);
    }
    /**
    * The purpose of this command is to set the ScreenDailyTime attribute.
Upon receipt of the SetScreenDailyTime command, the media device shall set the ScreenDailyTime attribute to the ScreenTime value.
    */
    public static ClusterCommand setScreenDailyTime(Integer screenTime) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("screenTime", screenTime);

        return new ClusterCommand("setScreenDailyTime", map);
    }
    /**
    * The purpose of this command is to specify whether programs with no Content rating must be blocked by this media device.
Upon receipt of the BlockUnratedContent command, the media device shall set the BlockUnrated attribute to TRUE.
    */
    public static ClusterCommand blockUnratedContent() {
        Map<String, Object> map = new LinkedHashMap<>();

        return new ClusterCommand("blockUnratedContent");
    }
    /**
    * The purpose of this command is to specify whether programs with no Content rating must be blocked by this media device.
Upon receipt of the UnblockUnratedContent command, the media device shall set the BlockUnrated attribute to FALSE.
    */
    public static ClusterCommand unblockUnratedContent() {
        Map<String, Object> map = new LinkedHashMap<>();

        return new ClusterCommand("unblockUnratedContent");
    }
    /**
    * The purpose of this command is to set the OnDemandRatingThreshold attribute.
Upon receipt of the SetOnDemandRatingThreshold command, the media device shall check if the Rating field is one of values present in the OnDemandRatings attribute. If not, then a response with InvalidRating error status shall be returned.
    */
    public static ClusterCommand setOnDemandRatingThreshold(String rating) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("rating", rating);

        return new ClusterCommand("setOnDemandRatingThreshold", map);
    }
    /**
    * The purpose of this command is to set ScheduledContentRatingThreshold attribute.
Upon receipt of the SetScheduledContentRatingThreshold command, the media device shall check if the Rating field is one of values present in the ScheduledContentRatings attribute. If not, then a response with InvalidRating error status shall be returned.
    */
    public static ClusterCommand setScheduledContentRatingThreshold(String rating) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("rating", rating);

        return new ClusterCommand("setScheduledContentRatingThreshold", map);
    }
    /**
    * The purpose of this command is to set BlockChannelList attribute.
Upon receipt of the AddBlockChannels command, the media device shall check if the channels passed in this command are valid. If the channel is invalid, then a response with InvalidChannel error Status shall be returned.
If there is at least one channel in Channels field which is not in the BlockChannelList attribute, the media device shall process the request by adding these new channels into the BlockChannelList attribute and return a successful Status Response. During this process, the media device shall assign one unique index to BlockChannelIndex field for every channel passed in this command.
If all channels in Channel field already exist in the BlockChannelList attribute, then a response with ChannelAlreadyExist error Status shall be returned.
    */
    public static ClusterCommand addBlockChannels(List<BlockChannelStruct> channels) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("channels", channels);

        return new ClusterCommand("addBlockChannels", map);
    }
    /**
    * The purpose of this command is to remove channels from the BlockChannelList attribute.
Upon receipt of the RemoveBlockChannels command, the media device shall check if the channels indicated by ChannelIndexes passed in this command are present in BlockChannelList attribute. If one or more channels indicated by ChannelIndexes passed in this command field are not present in the BlockChannelList attribute, then a response with ChannelNotExist error Status shall be returned.
    */
    public static ClusterCommand removeBlockChannels(List<Integer> channelIndexes) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("channelIndexes", channelIndexes);

        return new ClusterCommand("removeBlockChannels", map);
    }
    /**
    * The purpose of this command is to set applications to the BlockApplicationList attribute.
Upon receipt of the AddBlockApplications command, the media device shall check if the Applications passed in this command are installed. If there is an application in Applications field which is not identified by media device, then a response with UnidentifiableApplication error Status may be returned.
If there is one or more applications which are not present in BlockApplicationList attribute, the media device shall process the request by adding the new application to the BlockApplicationList attribute and return a successful Status Response.
If all applications in Applications field are already present in BlockApplicationList attribute, then a response with ApplicationAlreadyExist error Status shall be returned.
    */
    public static ClusterCommand addBlockApplications(List<AppInfoStruct> applications) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("applications", applications);

        return new ClusterCommand("addBlockApplications", map);
    }
    /**
    * The purpose of this command is to remove applications from the BlockApplicationList attribute.
Upon receipt of the RemoveBlockApplications command, the media device shall check if the applications passed in this command present in the BlockApplicationList attribute. If one or more applications in Applications field which are not present in the BlockApplicationList attribute, then a response with ApplicationNotExist error Status shall be returned.
    */
    public static ClusterCommand removeBlockApplications(List<AppInfoStruct> applications) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("applications", applications);

        return new ClusterCommand("removeBlockApplications", map);
    }
    /**
    * The purpose of this command is to set the BlockContentTimeWindow attribute.
Upon receipt of the SetBlockContentTimeWindow command, the media device shall check if the
TimeWindowIndex field passed in this command is NULL. If the TimeWindowIndex field is NULL, the media device shall check if there is an entry in the BlockContentTimeWindow attribute which matches with the TimePeriod and DayOfWeek fields passed in this command. * If Yes, then a response with TimeWindowAlreadyExist error status shall be returned. * If No, then the media device shall assign one unique index for this time window and add it into the BlockContentTimeWindow list attribute.
If the TimeWindowIndex field is not NULL and presents in the BlockContentTimeWindow attribute, the media device shall replace the original time window with the new time window passed in this command.
    */
    public static ClusterCommand setBlockContentTimeWindow(TimeWindowStruct timeWindow) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("timeWindow", timeWindow);

        return new ClusterCommand("setBlockContentTimeWindow", map);
    }
    /**
    * The purpose of this command is to remove the selected time windows from the BlockContentTimeWindow attribute.
Upon receipt of the RemoveBlockContentTimeWindow command, the media device shall check if the time window index passed in this command presents in the BlockContentTimeWindow attribute.
If one or more time window indexes passed in this command are not present in BlockContentTimeWindow attribute, then a response with TimeWindowNotExist error status shall be returned.
    */
    public static ClusterCommand removeBlockContentTimeWindow(List<Integer> timeWindowIndexes) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("timeWindowIndexes", timeWindowIndexes);

        return new ClusterCommand("removeBlockContentTimeWindow", map);
    }

    public String toString() {
        String str = "";
        str += "clusterRevision : " + clusterRevision + "\n";
        str += "featureMap : " + featureMap + "\n";
        str += "enabled : " + enabled + "\n";
        str += "onDemandRatings : " + onDemandRatings + "\n";
        str += "onDemandRatingThreshold : " + onDemandRatingThreshold + "\n";
        str += "scheduledContentRatings : " + scheduledContentRatings + "\n";
        str += "scheduledContentRatingThreshold : " + scheduledContentRatingThreshold + "\n";
        str += "screenDailyTime : " + screenDailyTime + "\n";
        str += "remainingScreenTime : " + remainingScreenTime + "\n";
        str += "blockUnrated : " + blockUnrated + "\n";
        str += "blockChannelList : " + blockChannelList + "\n";
        str += "blockApplicationList : " + blockApplicationList + "\n";
        str += "blockContentTimeWindow : " + blockContentTimeWindow + "\n";
        return str;
    }
}
