
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

import org.openhab.core.thing.type.ChannelTypeUID;

/**
 *
 * ClusterThingTypes
 * 
 * @author Dan Cunningham - Initial contribution
 */
public class ClusterConstants {

    // Identify Cluster

    public static final String CHANNEL_NAME_IDENTIFY_IDENTIFYTIME = "IdentifyTime";
    public static final String CHANNEL_LABEL_IDENTIFY_IDENTIFYTIME = "identifyTime";
    public static final String CHANNEL_ID_IDENTIFY_IDENTIFYTIME = "identify_identifytime";
    public static final ChannelTypeUID CHANNEL_IDENTIFY_IDENTIFYTIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_IDENTIFY_IDENTIFYTIME);

    public static final String CHANNEL_NAME_IDENTIFY_IDENTIFYTYPE = "IdentifyType";
    public static final String CHANNEL_LABEL_IDENTIFY_IDENTIFYTYPE = "identifyType";
    public static final String CHANNEL_ID_IDENTIFY_IDENTIFYTYPE = "identify_identifytype";
    public static final ChannelTypeUID CHANNEL_IDENTIFY_IDENTIFYTYPE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_IDENTIFY_IDENTIFYTYPE);

    // Groups Cluster

    public static final String CHANNEL_NAME_GROUPS_NAMESUPPORT = "NameSupport";
    public static final String CHANNEL_LABEL_GROUPS_NAMESUPPORT = "nameSupport";
    public static final String CHANNEL_ID_GROUPS_NAMESUPPORT = "groups_namesupport";
    public static final ChannelTypeUID CHANNEL_GROUPS_NAMESUPPORT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_GROUPS_NAMESUPPORT);

    // ScenesManagement Cluster

    public static final String CHANNEL_NAME_SCENESMANAGEMENT_LASTCONFIGUREDBY = "LastConfiguredBy";
    public static final String CHANNEL_LABEL_SCENESMANAGEMENT_LASTCONFIGUREDBY = "lastConfiguredBy";
    public static final String CHANNEL_ID_SCENESMANAGEMENT_LASTCONFIGUREDBY = "scenesmanagement_lastconfiguredby";
    public static final ChannelTypeUID CHANNEL_SCENESMANAGEMENT_LASTCONFIGUREDBY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SCENESMANAGEMENT_LASTCONFIGUREDBY);

    public static final String CHANNEL_NAME_SCENESMANAGEMENT_SCENETABLESIZE = "SceneTableSize";
    public static final String CHANNEL_LABEL_SCENESMANAGEMENT_SCENETABLESIZE = "sceneTableSize";
    public static final String CHANNEL_ID_SCENESMANAGEMENT_SCENETABLESIZE = "scenesmanagement_scenetablesize";
    public static final ChannelTypeUID CHANNEL_SCENESMANAGEMENT_SCENETABLESIZE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SCENESMANAGEMENT_SCENETABLESIZE);

    public static final String CHANNEL_NAME_SCENESMANAGEMENT_FABRICSCENEINFO = "FabricSceneInfo";
    public static final String CHANNEL_LABEL_SCENESMANAGEMENT_FABRICSCENEINFO = "fabricSceneInfo";
    public static final String CHANNEL_ID_SCENESMANAGEMENT_FABRICSCENEINFO = "scenesmanagement_fabricsceneinfo";
    public static final ChannelTypeUID CHANNEL_SCENESMANAGEMENT_FABRICSCENEINFO = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SCENESMANAGEMENT_FABRICSCENEINFO);

    // OnOff Cluster

    public static final String CHANNEL_NAME_ONOFF_ONOFF = "OnOff";
    public static final String CHANNEL_LABEL_ONOFF_ONOFF = "onOff";
    public static final String CHANNEL_ID_ONOFF_ONOFF = "onoff_onoff";
    public static final ChannelTypeUID CHANNEL_ONOFF_ONOFF = new ChannelTypeUID("matter:" + CHANNEL_ID_ONOFF_ONOFF);

    public static final String CHANNEL_NAME_ONOFF_GLOBALSCENECONTROL = "GlobalSceneControl";
    public static final String CHANNEL_LABEL_ONOFF_GLOBALSCENECONTROL = "globalSceneControl";
    public static final String CHANNEL_ID_ONOFF_GLOBALSCENECONTROL = "onoff_globalscenecontrol";
    public static final ChannelTypeUID CHANNEL_ONOFF_GLOBALSCENECONTROL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ONOFF_GLOBALSCENECONTROL);

    public static final String CHANNEL_NAME_ONOFF_ONTIME = "OnTime";
    public static final String CHANNEL_LABEL_ONOFF_ONTIME = "onTime";
    public static final String CHANNEL_ID_ONOFF_ONTIME = "onoff_ontime";
    public static final ChannelTypeUID CHANNEL_ONOFF_ONTIME = new ChannelTypeUID("matter:" + CHANNEL_ID_ONOFF_ONTIME);

    public static final String CHANNEL_NAME_ONOFF_OFFWAITTIME = "OffWaitTime";
    public static final String CHANNEL_LABEL_ONOFF_OFFWAITTIME = "offWaitTime";
    public static final String CHANNEL_ID_ONOFF_OFFWAITTIME = "onoff_offwaittime";
    public static final ChannelTypeUID CHANNEL_ONOFF_OFFWAITTIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ONOFF_OFFWAITTIME);

    public static final String CHANNEL_NAME_ONOFF_STARTUPONOFF = "StartUpOnOff";
    public static final String CHANNEL_LABEL_ONOFF_STARTUPONOFF = "startUpOnOff";
    public static final String CHANNEL_ID_ONOFF_STARTUPONOFF = "onoff_startuponoff";
    public static final ChannelTypeUID CHANNEL_ONOFF_STARTUPONOFF = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ONOFF_STARTUPONOFF);

    // LevelControl Cluster

    public static final String CHANNEL_NAME_LEVELCONTROL_CURRENTLEVEL = "CurrentLevel";
    public static final String CHANNEL_LABEL_LEVELCONTROL_CURRENTLEVEL = "currentLevel";
    public static final String CHANNEL_ID_LEVELCONTROL_CURRENTLEVEL = "levelcontrol_currentlevel";
    public static final ChannelTypeUID CHANNEL_LEVELCONTROL_CURRENTLEVEL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_LEVELCONTROL_CURRENTLEVEL);

    public static final String CHANNEL_NAME_LEVELCONTROL_REMAININGTIME = "RemainingTime";
    public static final String CHANNEL_LABEL_LEVELCONTROL_REMAININGTIME = "remainingTime";
    public static final String CHANNEL_ID_LEVELCONTROL_REMAININGTIME = "levelcontrol_remainingtime";
    public static final ChannelTypeUID CHANNEL_LEVELCONTROL_REMAININGTIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_LEVELCONTROL_REMAININGTIME);

    public static final String CHANNEL_NAME_LEVELCONTROL_MINLEVEL = "MinLevel";
    public static final String CHANNEL_LABEL_LEVELCONTROL_MINLEVEL = "minLevel";
    public static final String CHANNEL_ID_LEVELCONTROL_MINLEVEL = "levelcontrol_minlevel";
    public static final ChannelTypeUID CHANNEL_LEVELCONTROL_MINLEVEL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_LEVELCONTROL_MINLEVEL);

    public static final String CHANNEL_NAME_LEVELCONTROL_MAXLEVEL = "MaxLevel";
    public static final String CHANNEL_LABEL_LEVELCONTROL_MAXLEVEL = "maxLevel";
    public static final String CHANNEL_ID_LEVELCONTROL_MAXLEVEL = "levelcontrol_maxlevel";
    public static final ChannelTypeUID CHANNEL_LEVELCONTROL_MAXLEVEL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_LEVELCONTROL_MAXLEVEL);

    public static final String CHANNEL_NAME_LEVELCONTROL_CURRENTFREQUENCY = "CurrentFrequency";
    public static final String CHANNEL_LABEL_LEVELCONTROL_CURRENTFREQUENCY = "currentFrequency";
    public static final String CHANNEL_ID_LEVELCONTROL_CURRENTFREQUENCY = "levelcontrol_currentfrequency";
    public static final ChannelTypeUID CHANNEL_LEVELCONTROL_CURRENTFREQUENCY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_LEVELCONTROL_CURRENTFREQUENCY);

    public static final String CHANNEL_NAME_LEVELCONTROL_MINFREQUENCY = "MinFrequency";
    public static final String CHANNEL_LABEL_LEVELCONTROL_MINFREQUENCY = "minFrequency";
    public static final String CHANNEL_ID_LEVELCONTROL_MINFREQUENCY = "levelcontrol_minfrequency";
    public static final ChannelTypeUID CHANNEL_LEVELCONTROL_MINFREQUENCY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_LEVELCONTROL_MINFREQUENCY);

    public static final String CHANNEL_NAME_LEVELCONTROL_MAXFREQUENCY = "MaxFrequency";
    public static final String CHANNEL_LABEL_LEVELCONTROL_MAXFREQUENCY = "maxFrequency";
    public static final String CHANNEL_ID_LEVELCONTROL_MAXFREQUENCY = "levelcontrol_maxfrequency";
    public static final ChannelTypeUID CHANNEL_LEVELCONTROL_MAXFREQUENCY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_LEVELCONTROL_MAXFREQUENCY);

    public static final String CHANNEL_NAME_LEVELCONTROL_ONOFFTRANSITIONTIME = "OnOffTransitionTime";
    public static final String CHANNEL_LABEL_LEVELCONTROL_ONOFFTRANSITIONTIME = "onOffTransitionTime";
    public static final String CHANNEL_ID_LEVELCONTROL_ONOFFTRANSITIONTIME = "levelcontrol_onofftransitiontime";
    public static final ChannelTypeUID CHANNEL_LEVELCONTROL_ONOFFTRANSITIONTIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_LEVELCONTROL_ONOFFTRANSITIONTIME);

    public static final String CHANNEL_NAME_LEVELCONTROL_ONLEVEL = "OnLevel";
    public static final String CHANNEL_LABEL_LEVELCONTROL_ONLEVEL = "onLevel";
    public static final String CHANNEL_ID_LEVELCONTROL_ONLEVEL = "levelcontrol_onlevel";
    public static final ChannelTypeUID CHANNEL_LEVELCONTROL_ONLEVEL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_LEVELCONTROL_ONLEVEL);

    public static final String CHANNEL_NAME_LEVELCONTROL_ONTRANSITIONTIME = "OnTransitionTime";
    public static final String CHANNEL_LABEL_LEVELCONTROL_ONTRANSITIONTIME = "onTransitionTime";
    public static final String CHANNEL_ID_LEVELCONTROL_ONTRANSITIONTIME = "levelcontrol_ontransitiontime";
    public static final ChannelTypeUID CHANNEL_LEVELCONTROL_ONTRANSITIONTIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_LEVELCONTROL_ONTRANSITIONTIME);

    public static final String CHANNEL_NAME_LEVELCONTROL_OFFTRANSITIONTIME = "OffTransitionTime";
    public static final String CHANNEL_LABEL_LEVELCONTROL_OFFTRANSITIONTIME = "offTransitionTime";
    public static final String CHANNEL_ID_LEVELCONTROL_OFFTRANSITIONTIME = "levelcontrol_offtransitiontime";
    public static final ChannelTypeUID CHANNEL_LEVELCONTROL_OFFTRANSITIONTIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_LEVELCONTROL_OFFTRANSITIONTIME);

    public static final String CHANNEL_NAME_LEVELCONTROL_DEFAULTMOVERATE = "DefaultMoveRate";
    public static final String CHANNEL_LABEL_LEVELCONTROL_DEFAULTMOVERATE = "defaultMoveRate";
    public static final String CHANNEL_ID_LEVELCONTROL_DEFAULTMOVERATE = "levelcontrol_defaultmoverate";
    public static final ChannelTypeUID CHANNEL_LEVELCONTROL_DEFAULTMOVERATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_LEVELCONTROL_DEFAULTMOVERATE);

    public static final String CHANNEL_NAME_LEVELCONTROL_OPTIONS = "Options";
    public static final String CHANNEL_LABEL_LEVELCONTROL_OPTIONS = "options";
    public static final String CHANNEL_ID_LEVELCONTROL_OPTIONS = "levelcontrol_options";
    public static final ChannelTypeUID CHANNEL_LEVELCONTROL_OPTIONS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_LEVELCONTROL_OPTIONS);

    public static final String CHANNEL_NAME_LEVELCONTROL_STARTUPCURRENTLEVEL = "StartUpCurrentLevel";
    public static final String CHANNEL_LABEL_LEVELCONTROL_STARTUPCURRENTLEVEL = "startUpCurrentLevel";
    public static final String CHANNEL_ID_LEVELCONTROL_STARTUPCURRENTLEVEL = "levelcontrol_startupcurrentlevel";
    public static final ChannelTypeUID CHANNEL_LEVELCONTROL_STARTUPCURRENTLEVEL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_LEVELCONTROL_STARTUPCURRENTLEVEL);

    // PulseWidthModulation Cluster

    // BooleanState Cluster

    public static final String CHANNEL_NAME_BOOLEANSTATE_STATEVALUE = "StateValue";
    public static final String CHANNEL_LABEL_BOOLEANSTATE_STATEVALUE = "stateValue";
    public static final String CHANNEL_ID_BOOLEANSTATE_STATEVALUE = "booleanstate_statevalue";
    public static final ChannelTypeUID CHANNEL_BOOLEANSTATE_STATEVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BOOLEANSTATE_STATEVALUE);

    // BooleanStateConfiguration Cluster

    public static final String CHANNEL_NAME_BOOLEANSTATECONFIGURATION_CURRENTSENSITIVITYLEVEL = "CurrentSensitivityLevel";
    public static final String CHANNEL_LABEL_BOOLEANSTATECONFIGURATION_CURRENTSENSITIVITYLEVEL = "currentSensitivityLevel";
    public static final String CHANNEL_ID_BOOLEANSTATECONFIGURATION_CURRENTSENSITIVITYLEVEL = "booleanstateconfiguration_currentsensitivitylevel";
    public static final ChannelTypeUID CHANNEL_BOOLEANSTATECONFIGURATION_CURRENTSENSITIVITYLEVEL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BOOLEANSTATECONFIGURATION_CURRENTSENSITIVITYLEVEL);

    public static final String CHANNEL_NAME_BOOLEANSTATECONFIGURATION_SUPPORTEDSENSITIVITYLEVELS = "SupportedSensitivityLevels";
    public static final String CHANNEL_LABEL_BOOLEANSTATECONFIGURATION_SUPPORTEDSENSITIVITYLEVELS = "supportedSensitivityLevels";
    public static final String CHANNEL_ID_BOOLEANSTATECONFIGURATION_SUPPORTEDSENSITIVITYLEVELS = "booleanstateconfiguration_supportedsensitivitylevels";
    public static final ChannelTypeUID CHANNEL_BOOLEANSTATECONFIGURATION_SUPPORTEDSENSITIVITYLEVELS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BOOLEANSTATECONFIGURATION_SUPPORTEDSENSITIVITYLEVELS);

    public static final String CHANNEL_NAME_BOOLEANSTATECONFIGURATION_DEFAULTSENSITIVITYLEVEL = "DefaultSensitivityLevel";
    public static final String CHANNEL_LABEL_BOOLEANSTATECONFIGURATION_DEFAULTSENSITIVITYLEVEL = "defaultSensitivityLevel";
    public static final String CHANNEL_ID_BOOLEANSTATECONFIGURATION_DEFAULTSENSITIVITYLEVEL = "booleanstateconfiguration_defaultsensitivitylevel";
    public static final ChannelTypeUID CHANNEL_BOOLEANSTATECONFIGURATION_DEFAULTSENSITIVITYLEVEL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BOOLEANSTATECONFIGURATION_DEFAULTSENSITIVITYLEVEL);

    public static final String CHANNEL_NAME_BOOLEANSTATECONFIGURATION_ALARMSACTIVE = "AlarmsActive";
    public static final String CHANNEL_LABEL_BOOLEANSTATECONFIGURATION_ALARMSACTIVE = "alarmsActive";
    public static final String CHANNEL_ID_BOOLEANSTATECONFIGURATION_ALARMSACTIVE = "booleanstateconfiguration_alarmsactive";
    public static final ChannelTypeUID CHANNEL_BOOLEANSTATECONFIGURATION_ALARMSACTIVE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BOOLEANSTATECONFIGURATION_ALARMSACTIVE);

    public static final String CHANNEL_NAME_BOOLEANSTATECONFIGURATION_ALARMSSUPPRESSED = "AlarmsSuppressed";
    public static final String CHANNEL_LABEL_BOOLEANSTATECONFIGURATION_ALARMSSUPPRESSED = "alarmsSuppressed";
    public static final String CHANNEL_ID_BOOLEANSTATECONFIGURATION_ALARMSSUPPRESSED = "booleanstateconfiguration_alarmssuppressed";
    public static final ChannelTypeUID CHANNEL_BOOLEANSTATECONFIGURATION_ALARMSSUPPRESSED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BOOLEANSTATECONFIGURATION_ALARMSSUPPRESSED);

    public static final String CHANNEL_NAME_BOOLEANSTATECONFIGURATION_ALARMSENABLED = "AlarmsEnabled";
    public static final String CHANNEL_LABEL_BOOLEANSTATECONFIGURATION_ALARMSENABLED = "alarmsEnabled";
    public static final String CHANNEL_ID_BOOLEANSTATECONFIGURATION_ALARMSENABLED = "booleanstateconfiguration_alarmsenabled";
    public static final ChannelTypeUID CHANNEL_BOOLEANSTATECONFIGURATION_ALARMSENABLED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BOOLEANSTATECONFIGURATION_ALARMSENABLED);

    public static final String CHANNEL_NAME_BOOLEANSTATECONFIGURATION_ALARMSSUPPORTED = "AlarmsSupported";
    public static final String CHANNEL_LABEL_BOOLEANSTATECONFIGURATION_ALARMSSUPPORTED = "alarmsSupported";
    public static final String CHANNEL_ID_BOOLEANSTATECONFIGURATION_ALARMSSUPPORTED = "booleanstateconfiguration_alarmssupported";
    public static final ChannelTypeUID CHANNEL_BOOLEANSTATECONFIGURATION_ALARMSSUPPORTED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BOOLEANSTATECONFIGURATION_ALARMSSUPPORTED);

    public static final String CHANNEL_NAME_BOOLEANSTATECONFIGURATION_SENSORFAULT = "SensorFault";
    public static final String CHANNEL_LABEL_BOOLEANSTATECONFIGURATION_SENSORFAULT = "sensorFault";
    public static final String CHANNEL_ID_BOOLEANSTATECONFIGURATION_SENSORFAULT = "booleanstateconfiguration_sensorfault";
    public static final ChannelTypeUID CHANNEL_BOOLEANSTATECONFIGURATION_SENSORFAULT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BOOLEANSTATECONFIGURATION_SENSORFAULT);

    // ModeSelect Cluster

    public static final String CHANNEL_NAME_MODESELECT_DESCRIPTION = "Description";
    public static final String CHANNEL_LABEL_MODESELECT_DESCRIPTION = "description";
    public static final String CHANNEL_ID_MODESELECT_DESCRIPTION = "modeselect_description";
    public static final ChannelTypeUID CHANNEL_MODESELECT_DESCRIPTION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MODESELECT_DESCRIPTION);

    public static final String CHANNEL_NAME_MODESELECT_STANDARDNAMESPACE = "StandardNamespace";
    public static final String CHANNEL_LABEL_MODESELECT_STANDARDNAMESPACE = "standardNamespace";
    public static final String CHANNEL_ID_MODESELECT_STANDARDNAMESPACE = "modeselect_standardnamespace";
    public static final ChannelTypeUID CHANNEL_MODESELECT_STANDARDNAMESPACE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MODESELECT_STANDARDNAMESPACE);

    public static final String CHANNEL_NAME_MODESELECT_SUPPORTEDMODES = "SupportedModes";
    public static final String CHANNEL_LABEL_MODESELECT_SUPPORTEDMODES = "supportedModes";
    public static final String CHANNEL_ID_MODESELECT_SUPPORTEDMODES = "modeselect_supportedmodes";
    public static final ChannelTypeUID CHANNEL_MODESELECT_SUPPORTEDMODES = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MODESELECT_SUPPORTEDMODES);

    public static final String CHANNEL_NAME_MODESELECT_CURRENTMODE = "CurrentMode";
    public static final String CHANNEL_LABEL_MODESELECT_CURRENTMODE = "currentMode";
    public static final String CHANNEL_ID_MODESELECT_CURRENTMODE = "modeselect_currentmode";
    public static final ChannelTypeUID CHANNEL_MODESELECT_CURRENTMODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MODESELECT_CURRENTMODE);

    public static final String CHANNEL_NAME_MODESELECT_STARTUPMODE = "StartUpMode";
    public static final String CHANNEL_LABEL_MODESELECT_STARTUPMODE = "startUpMode";
    public static final String CHANNEL_ID_MODESELECT_STARTUPMODE = "modeselect_startupmode";
    public static final ChannelTypeUID CHANNEL_MODESELECT_STARTUPMODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MODESELECT_STARTUPMODE);

    public static final String CHANNEL_NAME_MODESELECT_ONMODE = "OnMode";
    public static final String CHANNEL_LABEL_MODESELECT_ONMODE = "onMode";
    public static final String CHANNEL_ID_MODESELECT_ONMODE = "modeselect_onmode";
    public static final ChannelTypeUID CHANNEL_MODESELECT_ONMODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MODESELECT_ONMODE);

    // ModeBase Cluster

    public static final String CHANNEL_NAME_MODEBASE_SUPPORTEDMODES = "SupportedModes";
    public static final String CHANNEL_LABEL_MODEBASE_SUPPORTEDMODES = "supportedModes";
    public static final String CHANNEL_ID_MODEBASE_SUPPORTEDMODES = "modebase_supportedmodes";
    public static final ChannelTypeUID CHANNEL_MODEBASE_SUPPORTEDMODES = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MODEBASE_SUPPORTEDMODES);

    public static final String CHANNEL_NAME_MODEBASE_CURRENTMODE = "CurrentMode";
    public static final String CHANNEL_LABEL_MODEBASE_CURRENTMODE = "currentMode";
    public static final String CHANNEL_ID_MODEBASE_CURRENTMODE = "modebase_currentmode";
    public static final ChannelTypeUID CHANNEL_MODEBASE_CURRENTMODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MODEBASE_CURRENTMODE);

    public static final String CHANNEL_NAME_MODEBASE_STARTUPMODE = "StartUpMode";
    public static final String CHANNEL_LABEL_MODEBASE_STARTUPMODE = "startUpMode";
    public static final String CHANNEL_ID_MODEBASE_STARTUPMODE = "modebase_startupmode";
    public static final ChannelTypeUID CHANNEL_MODEBASE_STARTUPMODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MODEBASE_STARTUPMODE);

    public static final String CHANNEL_NAME_MODEBASE_ONMODE = "OnMode";
    public static final String CHANNEL_LABEL_MODEBASE_ONMODE = "onMode";
    public static final String CHANNEL_ID_MODEBASE_ONMODE = "modebase_onmode";
    public static final ChannelTypeUID CHANNEL_MODEBASE_ONMODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MODEBASE_ONMODE);

    // LowPower Cluster

    // WakeOnLan Cluster

    public static final String CHANNEL_NAME_WAKEONLAN_MACADDRESS = "MacAddress";
    public static final String CHANNEL_LABEL_WAKEONLAN_MACADDRESS = "macAddress";
    public static final String CHANNEL_ID_WAKEONLAN_MACADDRESS = "wakeonlan_macaddress";
    public static final ChannelTypeUID CHANNEL_WAKEONLAN_MACADDRESS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WAKEONLAN_MACADDRESS);

    public static final String CHANNEL_NAME_WAKEONLAN_LINKLOCALADDRESS = "LinkLocalAddress";
    public static final String CHANNEL_LABEL_WAKEONLAN_LINKLOCALADDRESS = "linkLocalAddress";
    public static final String CHANNEL_ID_WAKEONLAN_LINKLOCALADDRESS = "wakeonlan_linklocaladdress";
    public static final ChannelTypeUID CHANNEL_WAKEONLAN_LINKLOCALADDRESS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WAKEONLAN_LINKLOCALADDRESS);

    // Switch Cluster

    public static final String CHANNEL_NAME_SWITCH_NUMBEROFPOSITIONS = "NumberOfPositions";
    public static final String CHANNEL_LABEL_SWITCH_NUMBEROFPOSITIONS = "numberOfPositions";
    public static final String CHANNEL_ID_SWITCH_NUMBEROFPOSITIONS = "switch_numberofpositions";
    public static final ChannelTypeUID CHANNEL_SWITCH_NUMBEROFPOSITIONS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SWITCH_NUMBEROFPOSITIONS);

    public static final String CHANNEL_NAME_SWITCH_CURRENTPOSITION = "CurrentPosition";
    public static final String CHANNEL_LABEL_SWITCH_CURRENTPOSITION = "currentPosition";
    public static final String CHANNEL_ID_SWITCH_CURRENTPOSITION = "switch_currentposition";
    public static final ChannelTypeUID CHANNEL_SWITCH_CURRENTPOSITION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SWITCH_CURRENTPOSITION);

    public static final String CHANNEL_NAME_SWITCH_MULTIPRESSMAX = "MultiPressMax";
    public static final String CHANNEL_LABEL_SWITCH_MULTIPRESSMAX = "multiPressMax";
    public static final String CHANNEL_ID_SWITCH_MULTIPRESSMAX = "switch_multipressmax";
    public static final ChannelTypeUID CHANNEL_SWITCH_MULTIPRESSMAX = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SWITCH_MULTIPRESSMAX);

    // OperationalState Cluster

    public static final String CHANNEL_NAME_OPERATIONALSTATE_PHASELIST = "PhaseList";
    public static final String CHANNEL_LABEL_OPERATIONALSTATE_PHASELIST = "phaseList";
    public static final String CHANNEL_ID_OPERATIONALSTATE_PHASELIST = "operationalstate_phaselist";
    public static final ChannelTypeUID CHANNEL_OPERATIONALSTATE_PHASELIST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OPERATIONALSTATE_PHASELIST);

    public static final String CHANNEL_NAME_OPERATIONALSTATE_CURRENTPHASE = "CurrentPhase";
    public static final String CHANNEL_LABEL_OPERATIONALSTATE_CURRENTPHASE = "currentPhase";
    public static final String CHANNEL_ID_OPERATIONALSTATE_CURRENTPHASE = "operationalstate_currentphase";
    public static final ChannelTypeUID CHANNEL_OPERATIONALSTATE_CURRENTPHASE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OPERATIONALSTATE_CURRENTPHASE);

    public static final String CHANNEL_NAME_OPERATIONALSTATE_COUNTDOWNTIME = "CountdownTime";
    public static final String CHANNEL_LABEL_OPERATIONALSTATE_COUNTDOWNTIME = "countdownTime";
    public static final String CHANNEL_ID_OPERATIONALSTATE_COUNTDOWNTIME = "operationalstate_countdowntime";
    public static final ChannelTypeUID CHANNEL_OPERATIONALSTATE_COUNTDOWNTIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OPERATIONALSTATE_COUNTDOWNTIME);

    public static final String CHANNEL_NAME_OPERATIONALSTATE_OPERATIONALSTATELIST = "OperationalStateList";
    public static final String CHANNEL_LABEL_OPERATIONALSTATE_OPERATIONALSTATELIST = "operationalStateList";
    public static final String CHANNEL_ID_OPERATIONALSTATE_OPERATIONALSTATELIST = "operationalstate_operationalstatelist";
    public static final ChannelTypeUID CHANNEL_OPERATIONALSTATE_OPERATIONALSTATELIST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OPERATIONALSTATE_OPERATIONALSTATELIST);

    public static final String CHANNEL_NAME_OPERATIONALSTATE_OPERATIONALSTATE = "OperationalState";
    public static final String CHANNEL_LABEL_OPERATIONALSTATE_OPERATIONALSTATE = "operationalState";
    public static final String CHANNEL_ID_OPERATIONALSTATE_OPERATIONALSTATE = "operationalstate_operationalstate";
    public static final ChannelTypeUID CHANNEL_OPERATIONALSTATE_OPERATIONALSTATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OPERATIONALSTATE_OPERATIONALSTATE);

    public static final String CHANNEL_NAME_OPERATIONALSTATE_OPERATIONALERROR = "OperationalError";
    public static final String CHANNEL_LABEL_OPERATIONALSTATE_OPERATIONALERROR = "operationalError";
    public static final String CHANNEL_ID_OPERATIONALSTATE_OPERATIONALERROR = "operationalstate_operationalerror";
    public static final ChannelTypeUID CHANNEL_OPERATIONALSTATE_OPERATIONALERROR = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OPERATIONALSTATE_OPERATIONALERROR);

    // AlarmBase Cluster

    public static final String CHANNEL_NAME_ALARMBASE_MASK = "Mask";
    public static final String CHANNEL_LABEL_ALARMBASE_MASK = "mask";
    public static final String CHANNEL_ID_ALARMBASE_MASK = "alarmbase_mask";
    public static final ChannelTypeUID CHANNEL_ALARMBASE_MASK = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ALARMBASE_MASK);

    public static final String CHANNEL_NAME_ALARMBASE_LATCH = "Latch";
    public static final String CHANNEL_LABEL_ALARMBASE_LATCH = "latch";
    public static final String CHANNEL_ID_ALARMBASE_LATCH = "alarmbase_latch";
    public static final ChannelTypeUID CHANNEL_ALARMBASE_LATCH = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ALARMBASE_LATCH);

    public static final String CHANNEL_NAME_ALARMBASE_STATE = "State";
    public static final String CHANNEL_LABEL_ALARMBASE_STATE = "state";
    public static final String CHANNEL_ID_ALARMBASE_STATE = "alarmbase_state";
    public static final ChannelTypeUID CHANNEL_ALARMBASE_STATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ALARMBASE_STATE);

    public static final String CHANNEL_NAME_ALARMBASE_SUPPORTED = "Supported";
    public static final String CHANNEL_LABEL_ALARMBASE_SUPPORTED = "supported";
    public static final String CHANNEL_ID_ALARMBASE_SUPPORTED = "alarmbase_supported";
    public static final ChannelTypeUID CHANNEL_ALARMBASE_SUPPORTED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ALARMBASE_SUPPORTED);

    // IlluminanceMeasurement Cluster

    public static final String CHANNEL_NAME_ILLUMINANCEMEASUREMENT_MEASUREDVALUE = "MeasuredValue";
    public static final String CHANNEL_LABEL_ILLUMINANCEMEASUREMENT_MEASUREDVALUE = "measuredValue";
    public static final String CHANNEL_ID_ILLUMINANCEMEASUREMENT_MEASUREDVALUE = "illuminancemeasurement_measuredvalue";
    public static final ChannelTypeUID CHANNEL_ILLUMINANCEMEASUREMENT_MEASUREDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ILLUMINANCEMEASUREMENT_MEASUREDVALUE);

    public static final String CHANNEL_NAME_ILLUMINANCEMEASUREMENT_MINMEASUREDVALUE = "MinMeasuredValue";
    public static final String CHANNEL_LABEL_ILLUMINANCEMEASUREMENT_MINMEASUREDVALUE = "minMeasuredValue";
    public static final String CHANNEL_ID_ILLUMINANCEMEASUREMENT_MINMEASUREDVALUE = "illuminancemeasurement_minmeasuredvalue";
    public static final ChannelTypeUID CHANNEL_ILLUMINANCEMEASUREMENT_MINMEASUREDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ILLUMINANCEMEASUREMENT_MINMEASUREDVALUE);

    public static final String CHANNEL_NAME_ILLUMINANCEMEASUREMENT_MAXMEASUREDVALUE = "MaxMeasuredValue";
    public static final String CHANNEL_LABEL_ILLUMINANCEMEASUREMENT_MAXMEASUREDVALUE = "maxMeasuredValue";
    public static final String CHANNEL_ID_ILLUMINANCEMEASUREMENT_MAXMEASUREDVALUE = "illuminancemeasurement_maxmeasuredvalue";
    public static final ChannelTypeUID CHANNEL_ILLUMINANCEMEASUREMENT_MAXMEASUREDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ILLUMINANCEMEASUREMENT_MAXMEASUREDVALUE);

    public static final String CHANNEL_NAME_ILLUMINANCEMEASUREMENT_TOLERANCE = "Tolerance";
    public static final String CHANNEL_LABEL_ILLUMINANCEMEASUREMENT_TOLERANCE = "tolerance";
    public static final String CHANNEL_ID_ILLUMINANCEMEASUREMENT_TOLERANCE = "illuminancemeasurement_tolerance";
    public static final ChannelTypeUID CHANNEL_ILLUMINANCEMEASUREMENT_TOLERANCE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ILLUMINANCEMEASUREMENT_TOLERANCE);

    public static final String CHANNEL_NAME_ILLUMINANCEMEASUREMENT_LIGHTSENSORTYPE = "LightSensorType";
    public static final String CHANNEL_LABEL_ILLUMINANCEMEASUREMENT_LIGHTSENSORTYPE = "lightSensorType";
    public static final String CHANNEL_ID_ILLUMINANCEMEASUREMENT_LIGHTSENSORTYPE = "illuminancemeasurement_lightsensortype";
    public static final ChannelTypeUID CHANNEL_ILLUMINANCEMEASUREMENT_LIGHTSENSORTYPE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ILLUMINANCEMEASUREMENT_LIGHTSENSORTYPE);

    // TemperatureMeasurement Cluster

    public static final String CHANNEL_NAME_TEMPERATUREMEASUREMENT_MEASUREDVALUE = "MeasuredValue";
    public static final String CHANNEL_LABEL_TEMPERATUREMEASUREMENT_MEASUREDVALUE = "measuredValue";
    public static final String CHANNEL_ID_TEMPERATUREMEASUREMENT_MEASUREDVALUE = "temperaturemeasurement_measuredvalue";
    public static final ChannelTypeUID CHANNEL_TEMPERATUREMEASUREMENT_MEASUREDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TEMPERATUREMEASUREMENT_MEASUREDVALUE);

    public static final String CHANNEL_NAME_TEMPERATUREMEASUREMENT_MINMEASUREDVALUE = "MinMeasuredValue";
    public static final String CHANNEL_LABEL_TEMPERATUREMEASUREMENT_MINMEASUREDVALUE = "minMeasuredValue";
    public static final String CHANNEL_ID_TEMPERATUREMEASUREMENT_MINMEASUREDVALUE = "temperaturemeasurement_minmeasuredvalue";
    public static final ChannelTypeUID CHANNEL_TEMPERATUREMEASUREMENT_MINMEASUREDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TEMPERATUREMEASUREMENT_MINMEASUREDVALUE);

    public static final String CHANNEL_NAME_TEMPERATUREMEASUREMENT_MAXMEASUREDVALUE = "MaxMeasuredValue";
    public static final String CHANNEL_LABEL_TEMPERATUREMEASUREMENT_MAXMEASUREDVALUE = "maxMeasuredValue";
    public static final String CHANNEL_ID_TEMPERATUREMEASUREMENT_MAXMEASUREDVALUE = "temperaturemeasurement_maxmeasuredvalue";
    public static final ChannelTypeUID CHANNEL_TEMPERATUREMEASUREMENT_MAXMEASUREDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TEMPERATUREMEASUREMENT_MAXMEASUREDVALUE);

    public static final String CHANNEL_NAME_TEMPERATUREMEASUREMENT_TOLERANCE = "Tolerance";
    public static final String CHANNEL_LABEL_TEMPERATUREMEASUREMENT_TOLERANCE = "tolerance";
    public static final String CHANNEL_ID_TEMPERATUREMEASUREMENT_TOLERANCE = "temperaturemeasurement_tolerance";
    public static final ChannelTypeUID CHANNEL_TEMPERATUREMEASUREMENT_TOLERANCE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TEMPERATUREMEASUREMENT_TOLERANCE);

    // PressureMeasurement Cluster

    public static final String CHANNEL_NAME_PRESSUREMEASUREMENT_MEASUREDVALUE = "MeasuredValue";
    public static final String CHANNEL_LABEL_PRESSUREMEASUREMENT_MEASUREDVALUE = "measuredValue";
    public static final String CHANNEL_ID_PRESSUREMEASUREMENT_MEASUREDVALUE = "pressuremeasurement_measuredvalue";
    public static final ChannelTypeUID CHANNEL_PRESSUREMEASUREMENT_MEASUREDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PRESSUREMEASUREMENT_MEASUREDVALUE);

    public static final String CHANNEL_NAME_PRESSUREMEASUREMENT_MINMEASUREDVALUE = "MinMeasuredValue";
    public static final String CHANNEL_LABEL_PRESSUREMEASUREMENT_MINMEASUREDVALUE = "minMeasuredValue";
    public static final String CHANNEL_ID_PRESSUREMEASUREMENT_MINMEASUREDVALUE = "pressuremeasurement_minmeasuredvalue";
    public static final ChannelTypeUID CHANNEL_PRESSUREMEASUREMENT_MINMEASUREDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PRESSUREMEASUREMENT_MINMEASUREDVALUE);

    public static final String CHANNEL_NAME_PRESSUREMEASUREMENT_MAXMEASUREDVALUE = "MaxMeasuredValue";
    public static final String CHANNEL_LABEL_PRESSUREMEASUREMENT_MAXMEASUREDVALUE = "maxMeasuredValue";
    public static final String CHANNEL_ID_PRESSUREMEASUREMENT_MAXMEASUREDVALUE = "pressuremeasurement_maxmeasuredvalue";
    public static final ChannelTypeUID CHANNEL_PRESSUREMEASUREMENT_MAXMEASUREDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PRESSUREMEASUREMENT_MAXMEASUREDVALUE);

    public static final String CHANNEL_NAME_PRESSUREMEASUREMENT_TOLERANCE = "Tolerance";
    public static final String CHANNEL_LABEL_PRESSUREMEASUREMENT_TOLERANCE = "tolerance";
    public static final String CHANNEL_ID_PRESSUREMEASUREMENT_TOLERANCE = "pressuremeasurement_tolerance";
    public static final ChannelTypeUID CHANNEL_PRESSUREMEASUREMENT_TOLERANCE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PRESSUREMEASUREMENT_TOLERANCE);

    public static final String CHANNEL_NAME_PRESSUREMEASUREMENT_SCALEDVALUE = "ScaledValue";
    public static final String CHANNEL_LABEL_PRESSUREMEASUREMENT_SCALEDVALUE = "scaledValue";
    public static final String CHANNEL_ID_PRESSUREMEASUREMENT_SCALEDVALUE = "pressuremeasurement_scaledvalue";
    public static final ChannelTypeUID CHANNEL_PRESSUREMEASUREMENT_SCALEDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PRESSUREMEASUREMENT_SCALEDVALUE);

    public static final String CHANNEL_NAME_PRESSUREMEASUREMENT_MINSCALEDVALUE = "MinScaledValue";
    public static final String CHANNEL_LABEL_PRESSUREMEASUREMENT_MINSCALEDVALUE = "minScaledValue";
    public static final String CHANNEL_ID_PRESSUREMEASUREMENT_MINSCALEDVALUE = "pressuremeasurement_minscaledvalue";
    public static final ChannelTypeUID CHANNEL_PRESSUREMEASUREMENT_MINSCALEDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PRESSUREMEASUREMENT_MINSCALEDVALUE);

    public static final String CHANNEL_NAME_PRESSUREMEASUREMENT_MAXSCALEDVALUE = "MaxScaledValue";
    public static final String CHANNEL_LABEL_PRESSUREMEASUREMENT_MAXSCALEDVALUE = "maxScaledValue";
    public static final String CHANNEL_ID_PRESSUREMEASUREMENT_MAXSCALEDVALUE = "pressuremeasurement_maxscaledvalue";
    public static final ChannelTypeUID CHANNEL_PRESSUREMEASUREMENT_MAXSCALEDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PRESSUREMEASUREMENT_MAXSCALEDVALUE);

    public static final String CHANNEL_NAME_PRESSUREMEASUREMENT_SCALEDTOLERANCE = "ScaledTolerance";
    public static final String CHANNEL_LABEL_PRESSUREMEASUREMENT_SCALEDTOLERANCE = "scaledTolerance";
    public static final String CHANNEL_ID_PRESSUREMEASUREMENT_SCALEDTOLERANCE = "pressuremeasurement_scaledtolerance";
    public static final ChannelTypeUID CHANNEL_PRESSUREMEASUREMENT_SCALEDTOLERANCE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PRESSUREMEASUREMENT_SCALEDTOLERANCE);

    public static final String CHANNEL_NAME_PRESSUREMEASUREMENT_SCALE = "Scale";
    public static final String CHANNEL_LABEL_PRESSUREMEASUREMENT_SCALE = "scale";
    public static final String CHANNEL_ID_PRESSUREMEASUREMENT_SCALE = "pressuremeasurement_scale";
    public static final ChannelTypeUID CHANNEL_PRESSUREMEASUREMENT_SCALE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PRESSUREMEASUREMENT_SCALE);

    // FlowMeasurement Cluster

    public static final String CHANNEL_NAME_FLOWMEASUREMENT_MEASUREDVALUE = "MeasuredValue";
    public static final String CHANNEL_LABEL_FLOWMEASUREMENT_MEASUREDVALUE = "measuredValue";
    public static final String CHANNEL_ID_FLOWMEASUREMENT_MEASUREDVALUE = "flowmeasurement_measuredvalue";
    public static final ChannelTypeUID CHANNEL_FLOWMEASUREMENT_MEASUREDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_FLOWMEASUREMENT_MEASUREDVALUE);

    public static final String CHANNEL_NAME_FLOWMEASUREMENT_MINMEASUREDVALUE = "MinMeasuredValue";
    public static final String CHANNEL_LABEL_FLOWMEASUREMENT_MINMEASUREDVALUE = "minMeasuredValue";
    public static final String CHANNEL_ID_FLOWMEASUREMENT_MINMEASUREDVALUE = "flowmeasurement_minmeasuredvalue";
    public static final ChannelTypeUID CHANNEL_FLOWMEASUREMENT_MINMEASUREDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_FLOWMEASUREMENT_MINMEASUREDVALUE);

    public static final String CHANNEL_NAME_FLOWMEASUREMENT_MAXMEASUREDVALUE = "MaxMeasuredValue";
    public static final String CHANNEL_LABEL_FLOWMEASUREMENT_MAXMEASUREDVALUE = "maxMeasuredValue";
    public static final String CHANNEL_ID_FLOWMEASUREMENT_MAXMEASUREDVALUE = "flowmeasurement_maxmeasuredvalue";
    public static final ChannelTypeUID CHANNEL_FLOWMEASUREMENT_MAXMEASUREDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_FLOWMEASUREMENT_MAXMEASUREDVALUE);

    public static final String CHANNEL_NAME_FLOWMEASUREMENT_TOLERANCE = "Tolerance";
    public static final String CHANNEL_LABEL_FLOWMEASUREMENT_TOLERANCE = "tolerance";
    public static final String CHANNEL_ID_FLOWMEASUREMENT_TOLERANCE = "flowmeasurement_tolerance";
    public static final ChannelTypeUID CHANNEL_FLOWMEASUREMENT_TOLERANCE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_FLOWMEASUREMENT_TOLERANCE);

    // RelativeHumidityMeasurement Cluster

    public static final String CHANNEL_NAME_RELATIVEHUMIDITYMEASUREMENT_MEASUREDVALUE = "MeasuredValue";
    public static final String CHANNEL_LABEL_RELATIVEHUMIDITYMEASUREMENT_MEASUREDVALUE = "measuredValue";
    public static final String CHANNEL_ID_RELATIVEHUMIDITYMEASUREMENT_MEASUREDVALUE = "relativehumiditymeasurement_measuredvalue";
    public static final ChannelTypeUID CHANNEL_RELATIVEHUMIDITYMEASUREMENT_MEASUREDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_RELATIVEHUMIDITYMEASUREMENT_MEASUREDVALUE);

    public static final String CHANNEL_NAME_RELATIVEHUMIDITYMEASUREMENT_MINMEASUREDVALUE = "MinMeasuredValue";
    public static final String CHANNEL_LABEL_RELATIVEHUMIDITYMEASUREMENT_MINMEASUREDVALUE = "minMeasuredValue";
    public static final String CHANNEL_ID_RELATIVEHUMIDITYMEASUREMENT_MINMEASUREDVALUE = "relativehumiditymeasurement_minmeasuredvalue";
    public static final ChannelTypeUID CHANNEL_RELATIVEHUMIDITYMEASUREMENT_MINMEASUREDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_RELATIVEHUMIDITYMEASUREMENT_MINMEASUREDVALUE);

    public static final String CHANNEL_NAME_RELATIVEHUMIDITYMEASUREMENT_MAXMEASUREDVALUE = "MaxMeasuredValue";
    public static final String CHANNEL_LABEL_RELATIVEHUMIDITYMEASUREMENT_MAXMEASUREDVALUE = "maxMeasuredValue";
    public static final String CHANNEL_ID_RELATIVEHUMIDITYMEASUREMENT_MAXMEASUREDVALUE = "relativehumiditymeasurement_maxmeasuredvalue";
    public static final ChannelTypeUID CHANNEL_RELATIVEHUMIDITYMEASUREMENT_MAXMEASUREDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_RELATIVEHUMIDITYMEASUREMENT_MAXMEASUREDVALUE);

    public static final String CHANNEL_NAME_RELATIVEHUMIDITYMEASUREMENT_TOLERANCE = "Tolerance";
    public static final String CHANNEL_LABEL_RELATIVEHUMIDITYMEASUREMENT_TOLERANCE = "tolerance";
    public static final String CHANNEL_ID_RELATIVEHUMIDITYMEASUREMENT_TOLERANCE = "relativehumiditymeasurement_tolerance";
    public static final ChannelTypeUID CHANNEL_RELATIVEHUMIDITYMEASUREMENT_TOLERANCE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_RELATIVEHUMIDITYMEASUREMENT_TOLERANCE);

    // OccupancySensing Cluster

    public static final String CHANNEL_NAME_OCCUPANCYSENSING_OCCUPANCY = "Occupancy";
    public static final String CHANNEL_LABEL_OCCUPANCYSENSING_OCCUPANCY = "occupancy";
    public static final String CHANNEL_ID_OCCUPANCYSENSING_OCCUPANCY = "occupancysensing_occupancy";
    public static final ChannelTypeUID CHANNEL_OCCUPANCYSENSING_OCCUPANCY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OCCUPANCYSENSING_OCCUPANCY);

    public static final String CHANNEL_NAME_OCCUPANCYSENSING_OCCUPANCYSENSORTYPE = "OccupancySensorType";
    public static final String CHANNEL_LABEL_OCCUPANCYSENSING_OCCUPANCYSENSORTYPE = "occupancySensorType";
    public static final String CHANNEL_ID_OCCUPANCYSENSING_OCCUPANCYSENSORTYPE = "occupancysensing_occupancysensortype";
    public static final ChannelTypeUID CHANNEL_OCCUPANCYSENSING_OCCUPANCYSENSORTYPE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OCCUPANCYSENSING_OCCUPANCYSENSORTYPE);

    public static final String CHANNEL_NAME_OCCUPANCYSENSING_OCCUPANCYSENSORTYPEBITMAP = "OccupancySensorTypeBitmap";
    public static final String CHANNEL_LABEL_OCCUPANCYSENSING_OCCUPANCYSENSORTYPEBITMAP = "occupancySensorTypeBitmap";
    public static final String CHANNEL_ID_OCCUPANCYSENSING_OCCUPANCYSENSORTYPEBITMAP = "occupancysensing_occupancysensortypebitmap";
    public static final ChannelTypeUID CHANNEL_OCCUPANCYSENSING_OCCUPANCYSENSORTYPEBITMAP = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OCCUPANCYSENSING_OCCUPANCYSENSORTYPEBITMAP);

    public static final String CHANNEL_NAME_OCCUPANCYSENSING_PIROCCUPIEDTOUNOCCUPIEDDELAY = "PirOccupiedToUnoccupiedDelay";
    public static final String CHANNEL_LABEL_OCCUPANCYSENSING_PIROCCUPIEDTOUNOCCUPIEDDELAY = "pirOccupiedToUnoccupiedDelay";
    public static final String CHANNEL_ID_OCCUPANCYSENSING_PIROCCUPIEDTOUNOCCUPIEDDELAY = "occupancysensing_piroccupiedtounoccupieddelay";
    public static final ChannelTypeUID CHANNEL_OCCUPANCYSENSING_PIROCCUPIEDTOUNOCCUPIEDDELAY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OCCUPANCYSENSING_PIROCCUPIEDTOUNOCCUPIEDDELAY);

    public static final String CHANNEL_NAME_OCCUPANCYSENSING_PIRUNOCCUPIEDTOOCCUPIEDDELAY = "PirUnoccupiedToOccupiedDelay";
    public static final String CHANNEL_LABEL_OCCUPANCYSENSING_PIRUNOCCUPIEDTOOCCUPIEDDELAY = "pirUnoccupiedToOccupiedDelay";
    public static final String CHANNEL_ID_OCCUPANCYSENSING_PIRUNOCCUPIEDTOOCCUPIEDDELAY = "occupancysensing_pirunoccupiedtooccupieddelay";
    public static final ChannelTypeUID CHANNEL_OCCUPANCYSENSING_PIRUNOCCUPIEDTOOCCUPIEDDELAY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OCCUPANCYSENSING_PIRUNOCCUPIEDTOOCCUPIEDDELAY);

    public static final String CHANNEL_NAME_OCCUPANCYSENSING_PIRUNOCCUPIEDTOOCCUPIEDTHRESHOLD = "PirUnoccupiedToOccupiedThreshold";
    public static final String CHANNEL_LABEL_OCCUPANCYSENSING_PIRUNOCCUPIEDTOOCCUPIEDTHRESHOLD = "pirUnoccupiedToOccupiedThreshold";
    public static final String CHANNEL_ID_OCCUPANCYSENSING_PIRUNOCCUPIEDTOOCCUPIEDTHRESHOLD = "occupancysensing_pirunoccupiedtooccupiedthreshold";
    public static final ChannelTypeUID CHANNEL_OCCUPANCYSENSING_PIRUNOCCUPIEDTOOCCUPIEDTHRESHOLD = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OCCUPANCYSENSING_PIRUNOCCUPIEDTOOCCUPIEDTHRESHOLD);

    public static final String CHANNEL_NAME_OCCUPANCYSENSING_ULTRASONICOCCUPIEDTOUNOCCUPIEDDELAY = "UltrasonicOccupiedToUnoccupiedDelay";
    public static final String CHANNEL_LABEL_OCCUPANCYSENSING_ULTRASONICOCCUPIEDTOUNOCCUPIEDDELAY = "ultrasonicOccupiedToUnoccupiedDelay";
    public static final String CHANNEL_ID_OCCUPANCYSENSING_ULTRASONICOCCUPIEDTOUNOCCUPIEDDELAY = "occupancysensing_ultrasonicoccupiedtounoccupieddelay";
    public static final ChannelTypeUID CHANNEL_OCCUPANCYSENSING_ULTRASONICOCCUPIEDTOUNOCCUPIEDDELAY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OCCUPANCYSENSING_ULTRASONICOCCUPIEDTOUNOCCUPIEDDELAY);

    public static final String CHANNEL_NAME_OCCUPANCYSENSING_ULTRASONICUNOCCUPIEDTOOCCUPIEDDELAY = "UltrasonicUnoccupiedToOccupiedDelay";
    public static final String CHANNEL_LABEL_OCCUPANCYSENSING_ULTRASONICUNOCCUPIEDTOOCCUPIEDDELAY = "ultrasonicUnoccupiedToOccupiedDelay";
    public static final String CHANNEL_ID_OCCUPANCYSENSING_ULTRASONICUNOCCUPIEDTOOCCUPIEDDELAY = "occupancysensing_ultrasonicunoccupiedtooccupieddelay";
    public static final ChannelTypeUID CHANNEL_OCCUPANCYSENSING_ULTRASONICUNOCCUPIEDTOOCCUPIEDDELAY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OCCUPANCYSENSING_ULTRASONICUNOCCUPIEDTOOCCUPIEDDELAY);

    public static final String CHANNEL_NAME_OCCUPANCYSENSING_ULTRASONICUNOCCUPIEDTOOCCUPIEDTHRESHOLD = "UltrasonicUnoccupiedToOccupiedThreshold";
    public static final String CHANNEL_LABEL_OCCUPANCYSENSING_ULTRASONICUNOCCUPIEDTOOCCUPIEDTHRESHOLD = "ultrasonicUnoccupiedToOccupiedThreshold";
    public static final String CHANNEL_ID_OCCUPANCYSENSING_ULTRASONICUNOCCUPIEDTOOCCUPIEDTHRESHOLD = "occupancysensing_ultrasonicunoccupiedtooccupiedthreshold";
    public static final ChannelTypeUID CHANNEL_OCCUPANCYSENSING_ULTRASONICUNOCCUPIEDTOOCCUPIEDTHRESHOLD = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OCCUPANCYSENSING_ULTRASONICUNOCCUPIEDTOOCCUPIEDTHRESHOLD);

    public static final String CHANNEL_NAME_OCCUPANCYSENSING_PHYSICALCONTACTOCCUPIEDTOUNOCCUPIEDDELAY = "PhysicalContactOccupiedToUnoccupiedDelay";
    public static final String CHANNEL_LABEL_OCCUPANCYSENSING_PHYSICALCONTACTOCCUPIEDTOUNOCCUPIEDDELAY = "physicalContactOccupiedToUnoccupiedDelay";
    public static final String CHANNEL_ID_OCCUPANCYSENSING_PHYSICALCONTACTOCCUPIEDTOUNOCCUPIEDDELAY = "occupancysensing_physicalcontactoccupiedtounoccupieddelay";
    public static final ChannelTypeUID CHANNEL_OCCUPANCYSENSING_PHYSICALCONTACTOCCUPIEDTOUNOCCUPIEDDELAY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OCCUPANCYSENSING_PHYSICALCONTACTOCCUPIEDTOUNOCCUPIEDDELAY);

    public static final String CHANNEL_NAME_OCCUPANCYSENSING_PHYSICALCONTACTUNOCCUPIEDTOOCCUPIEDDELAY = "PhysicalContactUnoccupiedToOccupiedDelay";
    public static final String CHANNEL_LABEL_OCCUPANCYSENSING_PHYSICALCONTACTUNOCCUPIEDTOOCCUPIEDDELAY = "physicalContactUnoccupiedToOccupiedDelay";
    public static final String CHANNEL_ID_OCCUPANCYSENSING_PHYSICALCONTACTUNOCCUPIEDTOOCCUPIEDDELAY = "occupancysensing_physicalcontactunoccupiedtooccupieddelay";
    public static final ChannelTypeUID CHANNEL_OCCUPANCYSENSING_PHYSICALCONTACTUNOCCUPIEDTOOCCUPIEDDELAY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OCCUPANCYSENSING_PHYSICALCONTACTUNOCCUPIEDTOOCCUPIEDDELAY);

    public static final String CHANNEL_NAME_OCCUPANCYSENSING_PHYSICALCONTACTUNOCCUPIEDTOOCCUPIEDTHRESHOLD = "PhysicalContactUnoccupiedToOccupiedThreshold";
    public static final String CHANNEL_LABEL_OCCUPANCYSENSING_PHYSICALCONTACTUNOCCUPIEDTOOCCUPIEDTHRESHOLD = "physicalContactUnoccupiedToOccupiedThreshold";
    public static final String CHANNEL_ID_OCCUPANCYSENSING_PHYSICALCONTACTUNOCCUPIEDTOOCCUPIEDTHRESHOLD = "occupancysensing_physicalcontactunoccupiedtooccupiedthreshold";
    public static final ChannelTypeUID CHANNEL_OCCUPANCYSENSING_PHYSICALCONTACTUNOCCUPIEDTOOCCUPIEDTHRESHOLD = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OCCUPANCYSENSING_PHYSICALCONTACTUNOCCUPIEDTOOCCUPIEDTHRESHOLD);

    // ResourceMonitoring Cluster

    public static final String CHANNEL_NAME_RESOURCEMONITORING_CONDITION = "Condition";
    public static final String CHANNEL_LABEL_RESOURCEMONITORING_CONDITION = "condition";
    public static final String CHANNEL_ID_RESOURCEMONITORING_CONDITION = "resourcemonitoring_condition";
    public static final ChannelTypeUID CHANNEL_RESOURCEMONITORING_CONDITION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_RESOURCEMONITORING_CONDITION);

    public static final String CHANNEL_NAME_RESOURCEMONITORING_DEGRADATIONDIRECTION = "DegradationDirection";
    public static final String CHANNEL_LABEL_RESOURCEMONITORING_DEGRADATIONDIRECTION = "degradationDirection";
    public static final String CHANNEL_ID_RESOURCEMONITORING_DEGRADATIONDIRECTION = "resourcemonitoring_degradationdirection";
    public static final ChannelTypeUID CHANNEL_RESOURCEMONITORING_DEGRADATIONDIRECTION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_RESOURCEMONITORING_DEGRADATIONDIRECTION);

    public static final String CHANNEL_NAME_RESOURCEMONITORING_CHANGEINDICATION = "ChangeIndication";
    public static final String CHANNEL_LABEL_RESOURCEMONITORING_CHANGEINDICATION = "changeIndication";
    public static final String CHANNEL_ID_RESOURCEMONITORING_CHANGEINDICATION = "resourcemonitoring_changeindication";
    public static final ChannelTypeUID CHANNEL_RESOURCEMONITORING_CHANGEINDICATION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_RESOURCEMONITORING_CHANGEINDICATION);

    public static final String CHANNEL_NAME_RESOURCEMONITORING_INPLACEINDICATOR = "InPlaceIndicator";
    public static final String CHANNEL_LABEL_RESOURCEMONITORING_INPLACEINDICATOR = "inPlaceIndicator";
    public static final String CHANNEL_ID_RESOURCEMONITORING_INPLACEINDICATOR = "resourcemonitoring_inplaceindicator";
    public static final ChannelTypeUID CHANNEL_RESOURCEMONITORING_INPLACEINDICATOR = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_RESOURCEMONITORING_INPLACEINDICATOR);

    public static final String CHANNEL_NAME_RESOURCEMONITORING_LASTCHANGEDTIME = "LastChangedTime";
    public static final String CHANNEL_LABEL_RESOURCEMONITORING_LASTCHANGEDTIME = "lastChangedTime";
    public static final String CHANNEL_ID_RESOURCEMONITORING_LASTCHANGEDTIME = "resourcemonitoring_lastchangedtime";
    public static final ChannelTypeUID CHANNEL_RESOURCEMONITORING_LASTCHANGEDTIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_RESOURCEMONITORING_LASTCHANGEDTIME);

    public static final String CHANNEL_NAME_RESOURCEMONITORING_REPLACEMENTPRODUCTLIST = "ReplacementProductList";
    public static final String CHANNEL_LABEL_RESOURCEMONITORING_REPLACEMENTPRODUCTLIST = "replacementProductList";
    public static final String CHANNEL_ID_RESOURCEMONITORING_REPLACEMENTPRODUCTLIST = "resourcemonitoring_replacementproductlist";
    public static final ChannelTypeUID CHANNEL_RESOURCEMONITORING_REPLACEMENTPRODUCTLIST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_RESOURCEMONITORING_REPLACEMENTPRODUCTLIST);

    // HepaFilterMonitoring Cluster

    // ActivatedCarbonFilterMonitoring Cluster

    // AirQuality Cluster

    public static final String CHANNEL_NAME_AIRQUALITY_AIRQUALITY = "AirQuality";
    public static final String CHANNEL_LABEL_AIRQUALITY_AIRQUALITY = "airQuality";
    public static final String CHANNEL_ID_AIRQUALITY_AIRQUALITY = "airquality_airquality";
    public static final ChannelTypeUID CHANNEL_AIRQUALITY_AIRQUALITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_AIRQUALITY_AIRQUALITY);

    // ConcentrationMeasurement Cluster

    public static final String CHANNEL_NAME_CONCENTRATIONMEASUREMENT_MEASUREDVALUE = "MeasuredValue";
    public static final String CHANNEL_LABEL_CONCENTRATIONMEASUREMENT_MEASUREDVALUE = "measuredValue";
    public static final String CHANNEL_ID_CONCENTRATIONMEASUREMENT_MEASUREDVALUE = "concentrationmeasurement_measuredvalue";
    public static final ChannelTypeUID CHANNEL_CONCENTRATIONMEASUREMENT_MEASUREDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_CONCENTRATIONMEASUREMENT_MEASUREDVALUE);

    public static final String CHANNEL_NAME_CONCENTRATIONMEASUREMENT_MINMEASUREDVALUE = "MinMeasuredValue";
    public static final String CHANNEL_LABEL_CONCENTRATIONMEASUREMENT_MINMEASUREDVALUE = "minMeasuredValue";
    public static final String CHANNEL_ID_CONCENTRATIONMEASUREMENT_MINMEASUREDVALUE = "concentrationmeasurement_minmeasuredvalue";
    public static final ChannelTypeUID CHANNEL_CONCENTRATIONMEASUREMENT_MINMEASUREDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_CONCENTRATIONMEASUREMENT_MINMEASUREDVALUE);

    public static final String CHANNEL_NAME_CONCENTRATIONMEASUREMENT_MAXMEASUREDVALUE = "MaxMeasuredValue";
    public static final String CHANNEL_LABEL_CONCENTRATIONMEASUREMENT_MAXMEASUREDVALUE = "maxMeasuredValue";
    public static final String CHANNEL_ID_CONCENTRATIONMEASUREMENT_MAXMEASUREDVALUE = "concentrationmeasurement_maxmeasuredvalue";
    public static final ChannelTypeUID CHANNEL_CONCENTRATIONMEASUREMENT_MAXMEASUREDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_CONCENTRATIONMEASUREMENT_MAXMEASUREDVALUE);

    public static final String CHANNEL_NAME_CONCENTRATIONMEASUREMENT_PEAKMEASUREDVALUE = "PeakMeasuredValue";
    public static final String CHANNEL_LABEL_CONCENTRATIONMEASUREMENT_PEAKMEASUREDVALUE = "peakMeasuredValue";
    public static final String CHANNEL_ID_CONCENTRATIONMEASUREMENT_PEAKMEASUREDVALUE = "concentrationmeasurement_peakmeasuredvalue";
    public static final ChannelTypeUID CHANNEL_CONCENTRATIONMEASUREMENT_PEAKMEASUREDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_CONCENTRATIONMEASUREMENT_PEAKMEASUREDVALUE);

    public static final String CHANNEL_NAME_CONCENTRATIONMEASUREMENT_PEAKMEASUREDVALUEWINDOW = "PeakMeasuredValueWindow";
    public static final String CHANNEL_LABEL_CONCENTRATIONMEASUREMENT_PEAKMEASUREDVALUEWINDOW = "peakMeasuredValueWindow";
    public static final String CHANNEL_ID_CONCENTRATIONMEASUREMENT_PEAKMEASUREDVALUEWINDOW = "concentrationmeasurement_peakmeasuredvaluewindow";
    public static final ChannelTypeUID CHANNEL_CONCENTRATIONMEASUREMENT_PEAKMEASUREDVALUEWINDOW = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_CONCENTRATIONMEASUREMENT_PEAKMEASUREDVALUEWINDOW);

    public static final String CHANNEL_NAME_CONCENTRATIONMEASUREMENT_AVERAGEMEASUREDVALUE = "AverageMeasuredValue";
    public static final String CHANNEL_LABEL_CONCENTRATIONMEASUREMENT_AVERAGEMEASUREDVALUE = "averageMeasuredValue";
    public static final String CHANNEL_ID_CONCENTRATIONMEASUREMENT_AVERAGEMEASUREDVALUE = "concentrationmeasurement_averagemeasuredvalue";
    public static final ChannelTypeUID CHANNEL_CONCENTRATIONMEASUREMENT_AVERAGEMEASUREDVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_CONCENTRATIONMEASUREMENT_AVERAGEMEASUREDVALUE);

    public static final String CHANNEL_NAME_CONCENTRATIONMEASUREMENT_AVERAGEMEASUREDVALUEWINDOW = "AverageMeasuredValueWindow";
    public static final String CHANNEL_LABEL_CONCENTRATIONMEASUREMENT_AVERAGEMEASUREDVALUEWINDOW = "averageMeasuredValueWindow";
    public static final String CHANNEL_ID_CONCENTRATIONMEASUREMENT_AVERAGEMEASUREDVALUEWINDOW = "concentrationmeasurement_averagemeasuredvaluewindow";
    public static final ChannelTypeUID CHANNEL_CONCENTRATIONMEASUREMENT_AVERAGEMEASUREDVALUEWINDOW = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_CONCENTRATIONMEASUREMENT_AVERAGEMEASUREDVALUEWINDOW);

    public static final String CHANNEL_NAME_CONCENTRATIONMEASUREMENT_UNCERTAINTY = "Uncertainty";
    public static final String CHANNEL_LABEL_CONCENTRATIONMEASUREMENT_UNCERTAINTY = "uncertainty";
    public static final String CHANNEL_ID_CONCENTRATIONMEASUREMENT_UNCERTAINTY = "concentrationmeasurement_uncertainty";
    public static final ChannelTypeUID CHANNEL_CONCENTRATIONMEASUREMENT_UNCERTAINTY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_CONCENTRATIONMEASUREMENT_UNCERTAINTY);

    public static final String CHANNEL_NAME_CONCENTRATIONMEASUREMENT_MEASUREMENTUNIT = "MeasurementUnit";
    public static final String CHANNEL_LABEL_CONCENTRATIONMEASUREMENT_MEASUREMENTUNIT = "measurementUnit";
    public static final String CHANNEL_ID_CONCENTRATIONMEASUREMENT_MEASUREMENTUNIT = "concentrationmeasurement_measurementunit";
    public static final ChannelTypeUID CHANNEL_CONCENTRATIONMEASUREMENT_MEASUREMENTUNIT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_CONCENTRATIONMEASUREMENT_MEASUREMENTUNIT);

    public static final String CHANNEL_NAME_CONCENTRATIONMEASUREMENT_MEASUREMENTMEDIUM = "MeasurementMedium";
    public static final String CHANNEL_LABEL_CONCENTRATIONMEASUREMENT_MEASUREMENTMEDIUM = "measurementMedium";
    public static final String CHANNEL_ID_CONCENTRATIONMEASUREMENT_MEASUREMENTMEDIUM = "concentrationmeasurement_measurementmedium";
    public static final ChannelTypeUID CHANNEL_CONCENTRATIONMEASUREMENT_MEASUREMENTMEDIUM = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_CONCENTRATIONMEASUREMENT_MEASUREMENTMEDIUM);

    public static final String CHANNEL_NAME_CONCENTRATIONMEASUREMENT_LEVELVALUE = "LevelValue";
    public static final String CHANNEL_LABEL_CONCENTRATIONMEASUREMENT_LEVELVALUE = "levelValue";
    public static final String CHANNEL_ID_CONCENTRATIONMEASUREMENT_LEVELVALUE = "concentrationmeasurement_levelvalue";
    public static final ChannelTypeUID CHANNEL_CONCENTRATIONMEASUREMENT_LEVELVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_CONCENTRATIONMEASUREMENT_LEVELVALUE);

    // CarbonMonoxideConcentrationMeasurement Cluster

    // CarbonDioxideConcentrationMeasurement Cluster

    // NitrogenDioxideConcentrationMeasurement Cluster

    // OzoneConcentrationMeasurement Cluster

    // Pm2 Cluster

    // FormaldehydeConcentrationMeasurement Cluster

    // Pm1ConcentrationMeasurement Cluster

    // Pm10ConcentrationMeasurement Cluster

    // TotalVolatileOrganicCompoundsConcentrationMeasurement Cluster

    // RadonConcentrationMeasurement Cluster

    // SmokeCoAlarm Cluster

    public static final String CHANNEL_NAME_SMOKECOALARM_EXPRESSEDSTATE = "ExpressedState";
    public static final String CHANNEL_LABEL_SMOKECOALARM_EXPRESSEDSTATE = "expressedState";
    public static final String CHANNEL_ID_SMOKECOALARM_EXPRESSEDSTATE = "smokecoalarm_expressedstate";
    public static final ChannelTypeUID CHANNEL_SMOKECOALARM_EXPRESSEDSTATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SMOKECOALARM_EXPRESSEDSTATE);

    public static final String CHANNEL_NAME_SMOKECOALARM_SMOKESTATE = "SmokeState";
    public static final String CHANNEL_LABEL_SMOKECOALARM_SMOKESTATE = "smokeState";
    public static final String CHANNEL_ID_SMOKECOALARM_SMOKESTATE = "smokecoalarm_smokestate";
    public static final ChannelTypeUID CHANNEL_SMOKECOALARM_SMOKESTATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SMOKECOALARM_SMOKESTATE);

    public static final String CHANNEL_NAME_SMOKECOALARM_COSTATE = "CoState";
    public static final String CHANNEL_LABEL_SMOKECOALARM_COSTATE = "coState";
    public static final String CHANNEL_ID_SMOKECOALARM_COSTATE = "smokecoalarm_costate";
    public static final ChannelTypeUID CHANNEL_SMOKECOALARM_COSTATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SMOKECOALARM_COSTATE);

    public static final String CHANNEL_NAME_SMOKECOALARM_BATTERYALERT = "BatteryAlert";
    public static final String CHANNEL_LABEL_SMOKECOALARM_BATTERYALERT = "batteryAlert";
    public static final String CHANNEL_ID_SMOKECOALARM_BATTERYALERT = "smokecoalarm_batteryalert";
    public static final ChannelTypeUID CHANNEL_SMOKECOALARM_BATTERYALERT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SMOKECOALARM_BATTERYALERT);

    public static final String CHANNEL_NAME_SMOKECOALARM_DEVICEMUTED = "DeviceMuted";
    public static final String CHANNEL_LABEL_SMOKECOALARM_DEVICEMUTED = "deviceMuted";
    public static final String CHANNEL_ID_SMOKECOALARM_DEVICEMUTED = "smokecoalarm_devicemuted";
    public static final ChannelTypeUID CHANNEL_SMOKECOALARM_DEVICEMUTED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SMOKECOALARM_DEVICEMUTED);

    public static final String CHANNEL_NAME_SMOKECOALARM_TESTINPROGRESS = "TestInProgress";
    public static final String CHANNEL_LABEL_SMOKECOALARM_TESTINPROGRESS = "testInProgress";
    public static final String CHANNEL_ID_SMOKECOALARM_TESTINPROGRESS = "smokecoalarm_testinprogress";
    public static final ChannelTypeUID CHANNEL_SMOKECOALARM_TESTINPROGRESS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SMOKECOALARM_TESTINPROGRESS);

    public static final String CHANNEL_NAME_SMOKECOALARM_HARDWAREFAULTALERT = "HardwareFaultAlert";
    public static final String CHANNEL_LABEL_SMOKECOALARM_HARDWAREFAULTALERT = "hardwareFaultAlert";
    public static final String CHANNEL_ID_SMOKECOALARM_HARDWAREFAULTALERT = "smokecoalarm_hardwarefaultalert";
    public static final ChannelTypeUID CHANNEL_SMOKECOALARM_HARDWAREFAULTALERT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SMOKECOALARM_HARDWAREFAULTALERT);

    public static final String CHANNEL_NAME_SMOKECOALARM_ENDOFSERVICEALERT = "EndOfServiceAlert";
    public static final String CHANNEL_LABEL_SMOKECOALARM_ENDOFSERVICEALERT = "endOfServiceAlert";
    public static final String CHANNEL_ID_SMOKECOALARM_ENDOFSERVICEALERT = "smokecoalarm_endofservicealert";
    public static final ChannelTypeUID CHANNEL_SMOKECOALARM_ENDOFSERVICEALERT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SMOKECOALARM_ENDOFSERVICEALERT);

    public static final String CHANNEL_NAME_SMOKECOALARM_INTERCONNECTSMOKEALARM = "InterconnectSmokeAlarm";
    public static final String CHANNEL_LABEL_SMOKECOALARM_INTERCONNECTSMOKEALARM = "interconnectSmokeAlarm";
    public static final String CHANNEL_ID_SMOKECOALARM_INTERCONNECTSMOKEALARM = "smokecoalarm_interconnectsmokealarm";
    public static final ChannelTypeUID CHANNEL_SMOKECOALARM_INTERCONNECTSMOKEALARM = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SMOKECOALARM_INTERCONNECTSMOKEALARM);

    public static final String CHANNEL_NAME_SMOKECOALARM_INTERCONNECTCOALARM = "InterconnectCoAlarm";
    public static final String CHANNEL_LABEL_SMOKECOALARM_INTERCONNECTCOALARM = "interconnectCoAlarm";
    public static final String CHANNEL_ID_SMOKECOALARM_INTERCONNECTCOALARM = "smokecoalarm_interconnectcoalarm";
    public static final ChannelTypeUID CHANNEL_SMOKECOALARM_INTERCONNECTCOALARM = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SMOKECOALARM_INTERCONNECTCOALARM);

    public static final String CHANNEL_NAME_SMOKECOALARM_CONTAMINATIONSTATE = "ContaminationState";
    public static final String CHANNEL_LABEL_SMOKECOALARM_CONTAMINATIONSTATE = "contaminationState";
    public static final String CHANNEL_ID_SMOKECOALARM_CONTAMINATIONSTATE = "smokecoalarm_contaminationstate";
    public static final ChannelTypeUID CHANNEL_SMOKECOALARM_CONTAMINATIONSTATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SMOKECOALARM_CONTAMINATIONSTATE);

    public static final String CHANNEL_NAME_SMOKECOALARM_SMOKESENSITIVITYLEVEL = "SmokeSensitivityLevel";
    public static final String CHANNEL_LABEL_SMOKECOALARM_SMOKESENSITIVITYLEVEL = "smokeSensitivityLevel";
    public static final String CHANNEL_ID_SMOKECOALARM_SMOKESENSITIVITYLEVEL = "smokecoalarm_smokesensitivitylevel";
    public static final ChannelTypeUID CHANNEL_SMOKECOALARM_SMOKESENSITIVITYLEVEL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SMOKECOALARM_SMOKESENSITIVITYLEVEL);

    public static final String CHANNEL_NAME_SMOKECOALARM_EXPIRYDATE = "ExpiryDate";
    public static final String CHANNEL_LABEL_SMOKECOALARM_EXPIRYDATE = "expiryDate";
    public static final String CHANNEL_ID_SMOKECOALARM_EXPIRYDATE = "smokecoalarm_expirydate";
    public static final ChannelTypeUID CHANNEL_SMOKECOALARM_EXPIRYDATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SMOKECOALARM_EXPIRYDATE);

    // ElectricalEnergyMeasurement Cluster

    public static final String CHANNEL_NAME_ELECTRICALENERGYMEASUREMENT_ACCURACY = "Accuracy";
    public static final String CHANNEL_LABEL_ELECTRICALENERGYMEASUREMENT_ACCURACY = "accuracy";
    public static final String CHANNEL_ID_ELECTRICALENERGYMEASUREMENT_ACCURACY = "electricalenergymeasurement_accuracy";
    public static final ChannelTypeUID CHANNEL_ELECTRICALENERGYMEASUREMENT_ACCURACY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALENERGYMEASUREMENT_ACCURACY);

    public static final String CHANNEL_NAME_ELECTRICALENERGYMEASUREMENT_CUMULATIVEENERGYIMPORTED = "CumulativeEnergyImported";
    public static final String CHANNEL_LABEL_ELECTRICALENERGYMEASUREMENT_CUMULATIVEENERGYIMPORTED = "cumulativeEnergyImported";
    public static final String CHANNEL_ID_ELECTRICALENERGYMEASUREMENT_CUMULATIVEENERGYIMPORTED = "electricalenergymeasurement_cumulativeenergyimported";
    public static final ChannelTypeUID CHANNEL_ELECTRICALENERGYMEASUREMENT_CUMULATIVEENERGYIMPORTED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALENERGYMEASUREMENT_CUMULATIVEENERGYIMPORTED);

    public static final String CHANNEL_NAME_ELECTRICALENERGYMEASUREMENT_CUMULATIVEENERGYEXPORTED = "CumulativeEnergyExported";
    public static final String CHANNEL_LABEL_ELECTRICALENERGYMEASUREMENT_CUMULATIVEENERGYEXPORTED = "cumulativeEnergyExported";
    public static final String CHANNEL_ID_ELECTRICALENERGYMEASUREMENT_CUMULATIVEENERGYEXPORTED = "electricalenergymeasurement_cumulativeenergyexported";
    public static final ChannelTypeUID CHANNEL_ELECTRICALENERGYMEASUREMENT_CUMULATIVEENERGYEXPORTED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALENERGYMEASUREMENT_CUMULATIVEENERGYEXPORTED);

    public static final String CHANNEL_NAME_ELECTRICALENERGYMEASUREMENT_PERIODICENERGYIMPORTED = "PeriodicEnergyImported";
    public static final String CHANNEL_LABEL_ELECTRICALENERGYMEASUREMENT_PERIODICENERGYIMPORTED = "periodicEnergyImported";
    public static final String CHANNEL_ID_ELECTRICALENERGYMEASUREMENT_PERIODICENERGYIMPORTED = "electricalenergymeasurement_periodicenergyimported";
    public static final ChannelTypeUID CHANNEL_ELECTRICALENERGYMEASUREMENT_PERIODICENERGYIMPORTED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALENERGYMEASUREMENT_PERIODICENERGYIMPORTED);

    public static final String CHANNEL_NAME_ELECTRICALENERGYMEASUREMENT_PERIODICENERGYEXPORTED = "PeriodicEnergyExported";
    public static final String CHANNEL_LABEL_ELECTRICALENERGYMEASUREMENT_PERIODICENERGYEXPORTED = "periodicEnergyExported";
    public static final String CHANNEL_ID_ELECTRICALENERGYMEASUREMENT_PERIODICENERGYEXPORTED = "electricalenergymeasurement_periodicenergyexported";
    public static final ChannelTypeUID CHANNEL_ELECTRICALENERGYMEASUREMENT_PERIODICENERGYEXPORTED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALENERGYMEASUREMENT_PERIODICENERGYEXPORTED);

    public static final String CHANNEL_NAME_ELECTRICALENERGYMEASUREMENT_CUMULATIVEENERGYRESET = "CumulativeEnergyReset";
    public static final String CHANNEL_LABEL_ELECTRICALENERGYMEASUREMENT_CUMULATIVEENERGYRESET = "cumulativeEnergyReset";
    public static final String CHANNEL_ID_ELECTRICALENERGYMEASUREMENT_CUMULATIVEENERGYRESET = "electricalenergymeasurement_cumulativeenergyreset";
    public static final ChannelTypeUID CHANNEL_ELECTRICALENERGYMEASUREMENT_CUMULATIVEENERGYRESET = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALENERGYMEASUREMENT_CUMULATIVEENERGYRESET);

    // ElectricalPowerMeasurement Cluster

    public static final String CHANNEL_NAME_ELECTRICALPOWERMEASUREMENT_POWERMODE = "PowerMode";
    public static final String CHANNEL_LABEL_ELECTRICALPOWERMEASUREMENT_POWERMODE = "powerMode";
    public static final String CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_POWERMODE = "electricalpowermeasurement_powermode";
    public static final ChannelTypeUID CHANNEL_ELECTRICALPOWERMEASUREMENT_POWERMODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_POWERMODE);

    public static final String CHANNEL_NAME_ELECTRICALPOWERMEASUREMENT_NUMBEROFMEASUREMENTTYPES = "NumberOfMeasurementTypes";
    public static final String CHANNEL_LABEL_ELECTRICALPOWERMEASUREMENT_NUMBEROFMEASUREMENTTYPES = "numberOfMeasurementTypes";
    public static final String CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_NUMBEROFMEASUREMENTTYPES = "electricalpowermeasurement_numberofmeasurementtypes";
    public static final ChannelTypeUID CHANNEL_ELECTRICALPOWERMEASUREMENT_NUMBEROFMEASUREMENTTYPES = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_NUMBEROFMEASUREMENTTYPES);

    public static final String CHANNEL_NAME_ELECTRICALPOWERMEASUREMENT_ACCURACY = "Accuracy";
    public static final String CHANNEL_LABEL_ELECTRICALPOWERMEASUREMENT_ACCURACY = "accuracy";
    public static final String CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_ACCURACY = "electricalpowermeasurement_accuracy";
    public static final ChannelTypeUID CHANNEL_ELECTRICALPOWERMEASUREMENT_ACCURACY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_ACCURACY);

    public static final String CHANNEL_NAME_ELECTRICALPOWERMEASUREMENT_RANGES = "Ranges";
    public static final String CHANNEL_LABEL_ELECTRICALPOWERMEASUREMENT_RANGES = "ranges";
    public static final String CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_RANGES = "electricalpowermeasurement_ranges";
    public static final ChannelTypeUID CHANNEL_ELECTRICALPOWERMEASUREMENT_RANGES = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_RANGES);

    public static final String CHANNEL_NAME_ELECTRICALPOWERMEASUREMENT_VOLTAGE = "Voltage";
    public static final String CHANNEL_LABEL_ELECTRICALPOWERMEASUREMENT_VOLTAGE = "voltage";
    public static final String CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_VOLTAGE = "electricalpowermeasurement_voltage";
    public static final ChannelTypeUID CHANNEL_ELECTRICALPOWERMEASUREMENT_VOLTAGE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_VOLTAGE);

    public static final String CHANNEL_NAME_ELECTRICALPOWERMEASUREMENT_ACTIVECURRENT = "ActiveCurrent";
    public static final String CHANNEL_LABEL_ELECTRICALPOWERMEASUREMENT_ACTIVECURRENT = "activeCurrent";
    public static final String CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_ACTIVECURRENT = "electricalpowermeasurement_activecurrent";
    public static final ChannelTypeUID CHANNEL_ELECTRICALPOWERMEASUREMENT_ACTIVECURRENT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_ACTIVECURRENT);

    public static final String CHANNEL_NAME_ELECTRICALPOWERMEASUREMENT_REACTIVECURRENT = "ReactiveCurrent";
    public static final String CHANNEL_LABEL_ELECTRICALPOWERMEASUREMENT_REACTIVECURRENT = "reactiveCurrent";
    public static final String CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_REACTIVECURRENT = "electricalpowermeasurement_reactivecurrent";
    public static final ChannelTypeUID CHANNEL_ELECTRICALPOWERMEASUREMENT_REACTIVECURRENT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_REACTIVECURRENT);

    public static final String CHANNEL_NAME_ELECTRICALPOWERMEASUREMENT_APPARENTCURRENT = "ApparentCurrent";
    public static final String CHANNEL_LABEL_ELECTRICALPOWERMEASUREMENT_APPARENTCURRENT = "apparentCurrent";
    public static final String CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_APPARENTCURRENT = "electricalpowermeasurement_apparentcurrent";
    public static final ChannelTypeUID CHANNEL_ELECTRICALPOWERMEASUREMENT_APPARENTCURRENT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_APPARENTCURRENT);

    public static final String CHANNEL_NAME_ELECTRICALPOWERMEASUREMENT_ACTIVEPOWER = "ActivePower";
    public static final String CHANNEL_LABEL_ELECTRICALPOWERMEASUREMENT_ACTIVEPOWER = "activePower";
    public static final String CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_ACTIVEPOWER = "electricalpowermeasurement_activepower";
    public static final ChannelTypeUID CHANNEL_ELECTRICALPOWERMEASUREMENT_ACTIVEPOWER = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_ACTIVEPOWER);

    public static final String CHANNEL_NAME_ELECTRICALPOWERMEASUREMENT_REACTIVEPOWER = "ReactivePower";
    public static final String CHANNEL_LABEL_ELECTRICALPOWERMEASUREMENT_REACTIVEPOWER = "reactivePower";
    public static final String CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_REACTIVEPOWER = "electricalpowermeasurement_reactivepower";
    public static final ChannelTypeUID CHANNEL_ELECTRICALPOWERMEASUREMENT_REACTIVEPOWER = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_REACTIVEPOWER);

    public static final String CHANNEL_NAME_ELECTRICALPOWERMEASUREMENT_APPARENTPOWER = "ApparentPower";
    public static final String CHANNEL_LABEL_ELECTRICALPOWERMEASUREMENT_APPARENTPOWER = "apparentPower";
    public static final String CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_APPARENTPOWER = "electricalpowermeasurement_apparentpower";
    public static final ChannelTypeUID CHANNEL_ELECTRICALPOWERMEASUREMENT_APPARENTPOWER = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_APPARENTPOWER);

    public static final String CHANNEL_NAME_ELECTRICALPOWERMEASUREMENT_RMSVOLTAGE = "RmsVoltage";
    public static final String CHANNEL_LABEL_ELECTRICALPOWERMEASUREMENT_RMSVOLTAGE = "rmsVoltage";
    public static final String CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_RMSVOLTAGE = "electricalpowermeasurement_rmsvoltage";
    public static final ChannelTypeUID CHANNEL_ELECTRICALPOWERMEASUREMENT_RMSVOLTAGE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_RMSVOLTAGE);

    public static final String CHANNEL_NAME_ELECTRICALPOWERMEASUREMENT_RMSCURRENT = "RmsCurrent";
    public static final String CHANNEL_LABEL_ELECTRICALPOWERMEASUREMENT_RMSCURRENT = "rmsCurrent";
    public static final String CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_RMSCURRENT = "electricalpowermeasurement_rmscurrent";
    public static final ChannelTypeUID CHANNEL_ELECTRICALPOWERMEASUREMENT_RMSCURRENT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_RMSCURRENT);

    public static final String CHANNEL_NAME_ELECTRICALPOWERMEASUREMENT_RMSPOWER = "RmsPower";
    public static final String CHANNEL_LABEL_ELECTRICALPOWERMEASUREMENT_RMSPOWER = "rmsPower";
    public static final String CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_RMSPOWER = "electricalpowermeasurement_rmspower";
    public static final ChannelTypeUID CHANNEL_ELECTRICALPOWERMEASUREMENT_RMSPOWER = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_RMSPOWER);

    public static final String CHANNEL_NAME_ELECTRICALPOWERMEASUREMENT_FREQUENCY = "Frequency";
    public static final String CHANNEL_LABEL_ELECTRICALPOWERMEASUREMENT_FREQUENCY = "frequency";
    public static final String CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_FREQUENCY = "electricalpowermeasurement_frequency";
    public static final ChannelTypeUID CHANNEL_ELECTRICALPOWERMEASUREMENT_FREQUENCY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_FREQUENCY);

    public static final String CHANNEL_NAME_ELECTRICALPOWERMEASUREMENT_HARMONICCURRENTS = "HarmonicCurrents";
    public static final String CHANNEL_LABEL_ELECTRICALPOWERMEASUREMENT_HARMONICCURRENTS = "harmonicCurrents";
    public static final String CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_HARMONICCURRENTS = "electricalpowermeasurement_harmoniccurrents";
    public static final ChannelTypeUID CHANNEL_ELECTRICALPOWERMEASUREMENT_HARMONICCURRENTS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_HARMONICCURRENTS);

    public static final String CHANNEL_NAME_ELECTRICALPOWERMEASUREMENT_HARMONICPHASES = "HarmonicPhases";
    public static final String CHANNEL_LABEL_ELECTRICALPOWERMEASUREMENT_HARMONICPHASES = "harmonicPhases";
    public static final String CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_HARMONICPHASES = "electricalpowermeasurement_harmonicphases";
    public static final ChannelTypeUID CHANNEL_ELECTRICALPOWERMEASUREMENT_HARMONICPHASES = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_HARMONICPHASES);

    public static final String CHANNEL_NAME_ELECTRICALPOWERMEASUREMENT_POWERFACTOR = "PowerFactor";
    public static final String CHANNEL_LABEL_ELECTRICALPOWERMEASUREMENT_POWERFACTOR = "powerFactor";
    public static final String CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_POWERFACTOR = "electricalpowermeasurement_powerfactor";
    public static final ChannelTypeUID CHANNEL_ELECTRICALPOWERMEASUREMENT_POWERFACTOR = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_POWERFACTOR);

    public static final String CHANNEL_NAME_ELECTRICALPOWERMEASUREMENT_NEUTRALCURRENT = "NeutralCurrent";
    public static final String CHANNEL_LABEL_ELECTRICALPOWERMEASUREMENT_NEUTRALCURRENT = "neutralCurrent";
    public static final String CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_NEUTRALCURRENT = "electricalpowermeasurement_neutralcurrent";
    public static final ChannelTypeUID CHANNEL_ELECTRICALPOWERMEASUREMENT_NEUTRALCURRENT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ELECTRICALPOWERMEASUREMENT_NEUTRALCURRENT);

    // ColorControl Cluster

    public static final String CHANNEL_NAME_COLORCONTROL_CURRENTHUE = "CurrentHue";
    public static final String CHANNEL_LABEL_COLORCONTROL_CURRENTHUE = "currentHue";
    public static final String CHANNEL_ID_COLORCONTROL_CURRENTHUE = "colorcontrol_currenthue";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_CURRENTHUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_CURRENTHUE);

    public static final String CHANNEL_NAME_COLORCONTROL_CURRENTSATURATION = "CurrentSaturation";
    public static final String CHANNEL_LABEL_COLORCONTROL_CURRENTSATURATION = "currentSaturation";
    public static final String CHANNEL_ID_COLORCONTROL_CURRENTSATURATION = "colorcontrol_currentsaturation";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_CURRENTSATURATION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_CURRENTSATURATION);

    public static final String CHANNEL_NAME_COLORCONTROL_REMAININGTIME = "RemainingTime";
    public static final String CHANNEL_LABEL_COLORCONTROL_REMAININGTIME = "remainingTime";
    public static final String CHANNEL_ID_COLORCONTROL_REMAININGTIME = "colorcontrol_remainingtime";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_REMAININGTIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_REMAININGTIME);

    public static final String CHANNEL_NAME_COLORCONTROL_CURRENTX = "CurrentX";
    public static final String CHANNEL_LABEL_COLORCONTROL_CURRENTX = "currentX";
    public static final String CHANNEL_ID_COLORCONTROL_CURRENTX = "colorcontrol_currentx";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_CURRENTX = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_CURRENTX);

    public static final String CHANNEL_NAME_COLORCONTROL_CURRENTY = "CurrentY";
    public static final String CHANNEL_LABEL_COLORCONTROL_CURRENTY = "currentY";
    public static final String CHANNEL_ID_COLORCONTROL_CURRENTY = "colorcontrol_currenty";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_CURRENTY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_CURRENTY);

    public static final String CHANNEL_NAME_COLORCONTROL_DRIFTCOMPENSATION = "DriftCompensation";
    public static final String CHANNEL_LABEL_COLORCONTROL_DRIFTCOMPENSATION = "driftCompensation";
    public static final String CHANNEL_ID_COLORCONTROL_DRIFTCOMPENSATION = "colorcontrol_driftcompensation";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_DRIFTCOMPENSATION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_DRIFTCOMPENSATION);

    public static final String CHANNEL_NAME_COLORCONTROL_COMPENSATIONTEXT = "CompensationText";
    public static final String CHANNEL_LABEL_COLORCONTROL_COMPENSATIONTEXT = "compensationText";
    public static final String CHANNEL_ID_COLORCONTROL_COMPENSATIONTEXT = "colorcontrol_compensationtext";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_COMPENSATIONTEXT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_COMPENSATIONTEXT);

    public static final String CHANNEL_NAME_COLORCONTROL_COLORTEMPERATUREMIREDS = "ColorTemperatureMireds";
    public static final String CHANNEL_LABEL_COLORCONTROL_COLORTEMPERATUREMIREDS = "colorTemperatureMireds";
    public static final String CHANNEL_ID_COLORCONTROL_COLORTEMPERATUREMIREDS = "colorcontrol_colortemperaturemireds";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_COLORTEMPERATUREMIREDS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_COLORTEMPERATUREMIREDS);

    public static final String CHANNEL_NAME_COLORCONTROL_COLORMODE = "ColorMode";
    public static final String CHANNEL_LABEL_COLORCONTROL_COLORMODE = "colorMode";
    public static final String CHANNEL_ID_COLORCONTROL_COLORMODE = "colorcontrol_colormode";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_COLORMODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_COLORMODE);

    public static final String CHANNEL_NAME_COLORCONTROL_OPTIONS = "Options";
    public static final String CHANNEL_LABEL_COLORCONTROL_OPTIONS = "options";
    public static final String CHANNEL_ID_COLORCONTROL_OPTIONS = "colorcontrol_options";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_OPTIONS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_OPTIONS);

    public static final String CHANNEL_NAME_COLORCONTROL_ENHANCEDCURRENTHUE = "EnhancedCurrentHue";
    public static final String CHANNEL_LABEL_COLORCONTROL_ENHANCEDCURRENTHUE = "enhancedCurrentHue";
    public static final String CHANNEL_ID_COLORCONTROL_ENHANCEDCURRENTHUE = "colorcontrol_enhancedcurrenthue";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_ENHANCEDCURRENTHUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_ENHANCEDCURRENTHUE);

    public static final String CHANNEL_NAME_COLORCONTROL_ENHANCEDCOLORMODE = "EnhancedColorMode";
    public static final String CHANNEL_LABEL_COLORCONTROL_ENHANCEDCOLORMODE = "enhancedColorMode";
    public static final String CHANNEL_ID_COLORCONTROL_ENHANCEDCOLORMODE = "colorcontrol_enhancedcolormode";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_ENHANCEDCOLORMODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_ENHANCEDCOLORMODE);

    public static final String CHANNEL_NAME_COLORCONTROL_COLORLOOPACTIVE = "ColorLoopActive";
    public static final String CHANNEL_LABEL_COLORCONTROL_COLORLOOPACTIVE = "colorLoopActive";
    public static final String CHANNEL_ID_COLORCONTROL_COLORLOOPACTIVE = "colorcontrol_colorloopactive";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_COLORLOOPACTIVE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_COLORLOOPACTIVE);

    public static final String CHANNEL_NAME_COLORCONTROL_COLORLOOPDIRECTION = "ColorLoopDirection";
    public static final String CHANNEL_LABEL_COLORCONTROL_COLORLOOPDIRECTION = "colorLoopDirection";
    public static final String CHANNEL_ID_COLORCONTROL_COLORLOOPDIRECTION = "colorcontrol_colorloopdirection";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_COLORLOOPDIRECTION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_COLORLOOPDIRECTION);

    public static final String CHANNEL_NAME_COLORCONTROL_COLORLOOPTIME = "ColorLoopTime";
    public static final String CHANNEL_LABEL_COLORCONTROL_COLORLOOPTIME = "colorLoopTime";
    public static final String CHANNEL_ID_COLORCONTROL_COLORLOOPTIME = "colorcontrol_colorlooptime";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_COLORLOOPTIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_COLORLOOPTIME);

    public static final String CHANNEL_NAME_COLORCONTROL_COLORLOOPSTARTENHANCEDHUE = "ColorLoopStartEnhancedHue";
    public static final String CHANNEL_LABEL_COLORCONTROL_COLORLOOPSTARTENHANCEDHUE = "colorLoopStartEnhancedHue";
    public static final String CHANNEL_ID_COLORCONTROL_COLORLOOPSTARTENHANCEDHUE = "colorcontrol_colorloopstartenhancedhue";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_COLORLOOPSTARTENHANCEDHUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_COLORLOOPSTARTENHANCEDHUE);

    public static final String CHANNEL_NAME_COLORCONTROL_COLORLOOPSTOREDENHANCEDHUE = "ColorLoopStoredEnhancedHue";
    public static final String CHANNEL_LABEL_COLORCONTROL_COLORLOOPSTOREDENHANCEDHUE = "colorLoopStoredEnhancedHue";
    public static final String CHANNEL_ID_COLORCONTROL_COLORLOOPSTOREDENHANCEDHUE = "colorcontrol_colorloopstoredenhancedhue";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_COLORLOOPSTOREDENHANCEDHUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_COLORLOOPSTOREDENHANCEDHUE);

    public static final String CHANNEL_NAME_COLORCONTROL_COLORCAPABILITIES = "ColorCapabilities";
    public static final String CHANNEL_LABEL_COLORCONTROL_COLORCAPABILITIES = "colorCapabilities";
    public static final String CHANNEL_ID_COLORCONTROL_COLORCAPABILITIES = "colorcontrol_colorcapabilities";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_COLORCAPABILITIES = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_COLORCAPABILITIES);

    public static final String CHANNEL_NAME_COLORCONTROL_COLORTEMPPHYSICALMINMIREDS = "ColorTempPhysicalMinMireds";
    public static final String CHANNEL_LABEL_COLORCONTROL_COLORTEMPPHYSICALMINMIREDS = "colorTempPhysicalMinMireds";
    public static final String CHANNEL_ID_COLORCONTROL_COLORTEMPPHYSICALMINMIREDS = "colorcontrol_colortempphysicalminmireds";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_COLORTEMPPHYSICALMINMIREDS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_COLORTEMPPHYSICALMINMIREDS);

    public static final String CHANNEL_NAME_COLORCONTROL_COLORTEMPPHYSICALMAXMIREDS = "ColorTempPhysicalMaxMireds";
    public static final String CHANNEL_LABEL_COLORCONTROL_COLORTEMPPHYSICALMAXMIREDS = "colorTempPhysicalMaxMireds";
    public static final String CHANNEL_ID_COLORCONTROL_COLORTEMPPHYSICALMAXMIREDS = "colorcontrol_colortempphysicalmaxmireds";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_COLORTEMPPHYSICALMAXMIREDS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_COLORTEMPPHYSICALMAXMIREDS);

    public static final String CHANNEL_NAME_COLORCONTROL_COUPLECOLORTEMPTOLEVELMINMIREDS = "CoupleColorTempToLevelMinMireds";
    public static final String CHANNEL_LABEL_COLORCONTROL_COUPLECOLORTEMPTOLEVELMINMIREDS = "coupleColorTempToLevelMinMireds";
    public static final String CHANNEL_ID_COLORCONTROL_COUPLECOLORTEMPTOLEVELMINMIREDS = "colorcontrol_couplecolortemptolevelminmireds";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_COUPLECOLORTEMPTOLEVELMINMIREDS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_COUPLECOLORTEMPTOLEVELMINMIREDS);

    public static final String CHANNEL_NAME_COLORCONTROL_STARTUPCOLORTEMPERATUREMIREDS = "StartUpColorTemperatureMireds";
    public static final String CHANNEL_LABEL_COLORCONTROL_STARTUPCOLORTEMPERATUREMIREDS = "startUpColorTemperatureMireds";
    public static final String CHANNEL_ID_COLORCONTROL_STARTUPCOLORTEMPERATUREMIREDS = "colorcontrol_startupcolortemperaturemireds";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_STARTUPCOLORTEMPERATUREMIREDS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_STARTUPCOLORTEMPERATUREMIREDS);

    public static final String CHANNEL_NAME_COLORCONTROL_NUMBEROFPRIMARIES = "NumberOfPrimaries";
    public static final String CHANNEL_LABEL_COLORCONTROL_NUMBEROFPRIMARIES = "numberOfPrimaries";
    public static final String CHANNEL_ID_COLORCONTROL_NUMBEROFPRIMARIES = "colorcontrol_numberofprimaries";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_NUMBEROFPRIMARIES = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_NUMBEROFPRIMARIES);

    public static final String CHANNEL_NAME_COLORCONTROL_PRIMARY1X = "Primary1X";
    public static final String CHANNEL_LABEL_COLORCONTROL_PRIMARY1X = "primary1X";
    public static final String CHANNEL_ID_COLORCONTROL_PRIMARY1X = "colorcontrol_primary1x";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_PRIMARY1X = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_PRIMARY1X);

    public static final String CHANNEL_NAME_COLORCONTROL_PRIMARY1Y = "Primary1Y";
    public static final String CHANNEL_LABEL_COLORCONTROL_PRIMARY1Y = "primary1Y";
    public static final String CHANNEL_ID_COLORCONTROL_PRIMARY1Y = "colorcontrol_primary1y";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_PRIMARY1Y = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_PRIMARY1Y);

    public static final String CHANNEL_NAME_COLORCONTROL_PRIMARY1INTENSITY = "Primary1Intensity";
    public static final String CHANNEL_LABEL_COLORCONTROL_PRIMARY1INTENSITY = "primary1Intensity";
    public static final String CHANNEL_ID_COLORCONTROL_PRIMARY1INTENSITY = "colorcontrol_primary1intensity";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_PRIMARY1INTENSITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_PRIMARY1INTENSITY);

    public static final String CHANNEL_NAME_COLORCONTROL_PRIMARY2X = "Primary2X";
    public static final String CHANNEL_LABEL_COLORCONTROL_PRIMARY2X = "primary2X";
    public static final String CHANNEL_ID_COLORCONTROL_PRIMARY2X = "colorcontrol_primary2x";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_PRIMARY2X = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_PRIMARY2X);

    public static final String CHANNEL_NAME_COLORCONTROL_PRIMARY2Y = "Primary2Y";
    public static final String CHANNEL_LABEL_COLORCONTROL_PRIMARY2Y = "primary2Y";
    public static final String CHANNEL_ID_COLORCONTROL_PRIMARY2Y = "colorcontrol_primary2y";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_PRIMARY2Y = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_PRIMARY2Y);

    public static final String CHANNEL_NAME_COLORCONTROL_PRIMARY2INTENSITY = "Primary2Intensity";
    public static final String CHANNEL_LABEL_COLORCONTROL_PRIMARY2INTENSITY = "primary2Intensity";
    public static final String CHANNEL_ID_COLORCONTROL_PRIMARY2INTENSITY = "colorcontrol_primary2intensity";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_PRIMARY2INTENSITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_PRIMARY2INTENSITY);

    public static final String CHANNEL_NAME_COLORCONTROL_PRIMARY3X = "Primary3X";
    public static final String CHANNEL_LABEL_COLORCONTROL_PRIMARY3X = "primary3X";
    public static final String CHANNEL_ID_COLORCONTROL_PRIMARY3X = "colorcontrol_primary3x";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_PRIMARY3X = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_PRIMARY3X);

    public static final String CHANNEL_NAME_COLORCONTROL_PRIMARY3Y = "Primary3Y";
    public static final String CHANNEL_LABEL_COLORCONTROL_PRIMARY3Y = "primary3Y";
    public static final String CHANNEL_ID_COLORCONTROL_PRIMARY3Y = "colorcontrol_primary3y";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_PRIMARY3Y = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_PRIMARY3Y);

    public static final String CHANNEL_NAME_COLORCONTROL_PRIMARY3INTENSITY = "Primary3Intensity";
    public static final String CHANNEL_LABEL_COLORCONTROL_PRIMARY3INTENSITY = "primary3Intensity";
    public static final String CHANNEL_ID_COLORCONTROL_PRIMARY3INTENSITY = "colorcontrol_primary3intensity";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_PRIMARY3INTENSITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_PRIMARY3INTENSITY);

    public static final String CHANNEL_NAME_COLORCONTROL_PRIMARY4X = "Primary4X";
    public static final String CHANNEL_LABEL_COLORCONTROL_PRIMARY4X = "primary4X";
    public static final String CHANNEL_ID_COLORCONTROL_PRIMARY4X = "colorcontrol_primary4x";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_PRIMARY4X = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_PRIMARY4X);

    public static final String CHANNEL_NAME_COLORCONTROL_PRIMARY4Y = "Primary4Y";
    public static final String CHANNEL_LABEL_COLORCONTROL_PRIMARY4Y = "primary4Y";
    public static final String CHANNEL_ID_COLORCONTROL_PRIMARY4Y = "colorcontrol_primary4y";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_PRIMARY4Y = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_PRIMARY4Y);

    public static final String CHANNEL_NAME_COLORCONTROL_PRIMARY4INTENSITY = "Primary4Intensity";
    public static final String CHANNEL_LABEL_COLORCONTROL_PRIMARY4INTENSITY = "primary4Intensity";
    public static final String CHANNEL_ID_COLORCONTROL_PRIMARY4INTENSITY = "colorcontrol_primary4intensity";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_PRIMARY4INTENSITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_PRIMARY4INTENSITY);

    public static final String CHANNEL_NAME_COLORCONTROL_PRIMARY5X = "Primary5X";
    public static final String CHANNEL_LABEL_COLORCONTROL_PRIMARY5X = "primary5X";
    public static final String CHANNEL_ID_COLORCONTROL_PRIMARY5X = "colorcontrol_primary5x";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_PRIMARY5X = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_PRIMARY5X);

    public static final String CHANNEL_NAME_COLORCONTROL_PRIMARY5Y = "Primary5Y";
    public static final String CHANNEL_LABEL_COLORCONTROL_PRIMARY5Y = "primary5Y";
    public static final String CHANNEL_ID_COLORCONTROL_PRIMARY5Y = "colorcontrol_primary5y";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_PRIMARY5Y = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_PRIMARY5Y);

    public static final String CHANNEL_NAME_COLORCONTROL_PRIMARY5INTENSITY = "Primary5Intensity";
    public static final String CHANNEL_LABEL_COLORCONTROL_PRIMARY5INTENSITY = "primary5Intensity";
    public static final String CHANNEL_ID_COLORCONTROL_PRIMARY5INTENSITY = "colorcontrol_primary5intensity";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_PRIMARY5INTENSITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_PRIMARY5INTENSITY);

    public static final String CHANNEL_NAME_COLORCONTROL_PRIMARY6X = "Primary6X";
    public static final String CHANNEL_LABEL_COLORCONTROL_PRIMARY6X = "primary6X";
    public static final String CHANNEL_ID_COLORCONTROL_PRIMARY6X = "colorcontrol_primary6x";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_PRIMARY6X = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_PRIMARY6X);

    public static final String CHANNEL_NAME_COLORCONTROL_PRIMARY6Y = "Primary6Y";
    public static final String CHANNEL_LABEL_COLORCONTROL_PRIMARY6Y = "primary6Y";
    public static final String CHANNEL_ID_COLORCONTROL_PRIMARY6Y = "colorcontrol_primary6y";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_PRIMARY6Y = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_PRIMARY6Y);

    public static final String CHANNEL_NAME_COLORCONTROL_PRIMARY6INTENSITY = "Primary6Intensity";
    public static final String CHANNEL_LABEL_COLORCONTROL_PRIMARY6INTENSITY = "primary6Intensity";
    public static final String CHANNEL_ID_COLORCONTROL_PRIMARY6INTENSITY = "colorcontrol_primary6intensity";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_PRIMARY6INTENSITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_PRIMARY6INTENSITY);

    public static final String CHANNEL_NAME_COLORCONTROL_WHITEPOINTX = "WhitePointX";
    public static final String CHANNEL_LABEL_COLORCONTROL_WHITEPOINTX = "whitePointX";
    public static final String CHANNEL_ID_COLORCONTROL_WHITEPOINTX = "colorcontrol_whitepointx";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_WHITEPOINTX = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_WHITEPOINTX);

    public static final String CHANNEL_NAME_COLORCONTROL_WHITEPOINTY = "WhitePointY";
    public static final String CHANNEL_LABEL_COLORCONTROL_WHITEPOINTY = "whitePointY";
    public static final String CHANNEL_ID_COLORCONTROL_WHITEPOINTY = "colorcontrol_whitepointy";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_WHITEPOINTY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_WHITEPOINTY);

    public static final String CHANNEL_NAME_COLORCONTROL_COLORPOINTRX = "ColorPointRx";
    public static final String CHANNEL_LABEL_COLORCONTROL_COLORPOINTRX = "colorPointRx";
    public static final String CHANNEL_ID_COLORCONTROL_COLORPOINTRX = "colorcontrol_colorpointrx";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_COLORPOINTRX = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_COLORPOINTRX);

    public static final String CHANNEL_NAME_COLORCONTROL_COLORPOINTRY = "ColorPointRy";
    public static final String CHANNEL_LABEL_COLORCONTROL_COLORPOINTRY = "colorPointRy";
    public static final String CHANNEL_ID_COLORCONTROL_COLORPOINTRY = "colorcontrol_colorpointry";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_COLORPOINTRY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_COLORPOINTRY);

    public static final String CHANNEL_NAME_COLORCONTROL_COLORPOINTRINTENSITY = "ColorPointRIntensity";
    public static final String CHANNEL_LABEL_COLORCONTROL_COLORPOINTRINTENSITY = "colorPointRIntensity";
    public static final String CHANNEL_ID_COLORCONTROL_COLORPOINTRINTENSITY = "colorcontrol_colorpointrintensity";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_COLORPOINTRINTENSITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_COLORPOINTRINTENSITY);

    public static final String CHANNEL_NAME_COLORCONTROL_COLORPOINTGX = "ColorPointGx";
    public static final String CHANNEL_LABEL_COLORCONTROL_COLORPOINTGX = "colorPointGx";
    public static final String CHANNEL_ID_COLORCONTROL_COLORPOINTGX = "colorcontrol_colorpointgx";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_COLORPOINTGX = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_COLORPOINTGX);

    public static final String CHANNEL_NAME_COLORCONTROL_COLORPOINTGY = "ColorPointGy";
    public static final String CHANNEL_LABEL_COLORCONTROL_COLORPOINTGY = "colorPointGy";
    public static final String CHANNEL_ID_COLORCONTROL_COLORPOINTGY = "colorcontrol_colorpointgy";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_COLORPOINTGY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_COLORPOINTGY);

    public static final String CHANNEL_NAME_COLORCONTROL_COLORPOINTGINTENSITY = "ColorPointGIntensity";
    public static final String CHANNEL_LABEL_COLORCONTROL_COLORPOINTGINTENSITY = "colorPointGIntensity";
    public static final String CHANNEL_ID_COLORCONTROL_COLORPOINTGINTENSITY = "colorcontrol_colorpointgintensity";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_COLORPOINTGINTENSITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_COLORPOINTGINTENSITY);

    public static final String CHANNEL_NAME_COLORCONTROL_COLORPOINTBX = "ColorPointBx";
    public static final String CHANNEL_LABEL_COLORCONTROL_COLORPOINTBX = "colorPointBx";
    public static final String CHANNEL_ID_COLORCONTROL_COLORPOINTBX = "colorcontrol_colorpointbx";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_COLORPOINTBX = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_COLORPOINTBX);

    public static final String CHANNEL_NAME_COLORCONTROL_COLORPOINTBY = "ColorPointBy";
    public static final String CHANNEL_LABEL_COLORCONTROL_COLORPOINTBY = "colorPointBy";
    public static final String CHANNEL_ID_COLORCONTROL_COLORPOINTBY = "colorcontrol_colorpointby";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_COLORPOINTBY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_COLORPOINTBY);

    public static final String CHANNEL_NAME_COLORCONTROL_COLORPOINTBINTENSITY = "ColorPointBIntensity";
    public static final String CHANNEL_LABEL_COLORCONTROL_COLORPOINTBINTENSITY = "colorPointBIntensity";
    public static final String CHANNEL_ID_COLORCONTROL_COLORPOINTBINTENSITY = "colorcontrol_colorpointbintensity";
    public static final ChannelTypeUID CHANNEL_COLORCONTROL_COLORPOINTBINTENSITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_COLORCONTROL_COLORPOINTBINTENSITY);

    // BallastConfiguration Cluster

    public static final String CHANNEL_NAME_BALLASTCONFIGURATION_PHYSICALMINLEVEL = "PhysicalMinLevel";
    public static final String CHANNEL_LABEL_BALLASTCONFIGURATION_PHYSICALMINLEVEL = "physicalMinLevel";
    public static final String CHANNEL_ID_BALLASTCONFIGURATION_PHYSICALMINLEVEL = "ballastconfiguration_physicalminlevel";
    public static final ChannelTypeUID CHANNEL_BALLASTCONFIGURATION_PHYSICALMINLEVEL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BALLASTCONFIGURATION_PHYSICALMINLEVEL);

    public static final String CHANNEL_NAME_BALLASTCONFIGURATION_PHYSICALMAXLEVEL = "PhysicalMaxLevel";
    public static final String CHANNEL_LABEL_BALLASTCONFIGURATION_PHYSICALMAXLEVEL = "physicalMaxLevel";
    public static final String CHANNEL_ID_BALLASTCONFIGURATION_PHYSICALMAXLEVEL = "ballastconfiguration_physicalmaxlevel";
    public static final ChannelTypeUID CHANNEL_BALLASTCONFIGURATION_PHYSICALMAXLEVEL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BALLASTCONFIGURATION_PHYSICALMAXLEVEL);

    public static final String CHANNEL_NAME_BALLASTCONFIGURATION_BALLASTSTATUS = "BallastStatus";
    public static final String CHANNEL_LABEL_BALLASTCONFIGURATION_BALLASTSTATUS = "ballastStatus";
    public static final String CHANNEL_ID_BALLASTCONFIGURATION_BALLASTSTATUS = "ballastconfiguration_ballaststatus";
    public static final ChannelTypeUID CHANNEL_BALLASTCONFIGURATION_BALLASTSTATUS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BALLASTCONFIGURATION_BALLASTSTATUS);

    public static final String CHANNEL_NAME_BALLASTCONFIGURATION_MINLEVEL = "MinLevel";
    public static final String CHANNEL_LABEL_BALLASTCONFIGURATION_MINLEVEL = "minLevel";
    public static final String CHANNEL_ID_BALLASTCONFIGURATION_MINLEVEL = "ballastconfiguration_minlevel";
    public static final ChannelTypeUID CHANNEL_BALLASTCONFIGURATION_MINLEVEL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BALLASTCONFIGURATION_MINLEVEL);

    public static final String CHANNEL_NAME_BALLASTCONFIGURATION_MAXLEVEL = "MaxLevel";
    public static final String CHANNEL_LABEL_BALLASTCONFIGURATION_MAXLEVEL = "maxLevel";
    public static final String CHANNEL_ID_BALLASTCONFIGURATION_MAXLEVEL = "ballastconfiguration_maxlevel";
    public static final ChannelTypeUID CHANNEL_BALLASTCONFIGURATION_MAXLEVEL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BALLASTCONFIGURATION_MAXLEVEL);

    public static final String CHANNEL_NAME_BALLASTCONFIGURATION_INTRINSICBALLASTFACTOR = "IntrinsicBallastFactor";
    public static final String CHANNEL_LABEL_BALLASTCONFIGURATION_INTRINSICBALLASTFACTOR = "intrinsicBallastFactor";
    public static final String CHANNEL_ID_BALLASTCONFIGURATION_INTRINSICBALLASTFACTOR = "ballastconfiguration_intrinsicballastfactor";
    public static final ChannelTypeUID CHANNEL_BALLASTCONFIGURATION_INTRINSICBALLASTFACTOR = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BALLASTCONFIGURATION_INTRINSICBALLASTFACTOR);

    public static final String CHANNEL_NAME_BALLASTCONFIGURATION_BALLASTFACTORADJUSTMENT = "BallastFactorAdjustment";
    public static final String CHANNEL_LABEL_BALLASTCONFIGURATION_BALLASTFACTORADJUSTMENT = "ballastFactorAdjustment";
    public static final String CHANNEL_ID_BALLASTCONFIGURATION_BALLASTFACTORADJUSTMENT = "ballastconfiguration_ballastfactoradjustment";
    public static final ChannelTypeUID CHANNEL_BALLASTCONFIGURATION_BALLASTFACTORADJUSTMENT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BALLASTCONFIGURATION_BALLASTFACTORADJUSTMENT);

    public static final String CHANNEL_NAME_BALLASTCONFIGURATION_LAMPQUANTITY = "LampQuantity";
    public static final String CHANNEL_LABEL_BALLASTCONFIGURATION_LAMPQUANTITY = "lampQuantity";
    public static final String CHANNEL_ID_BALLASTCONFIGURATION_LAMPQUANTITY = "ballastconfiguration_lampquantity";
    public static final ChannelTypeUID CHANNEL_BALLASTCONFIGURATION_LAMPQUANTITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BALLASTCONFIGURATION_LAMPQUANTITY);

    public static final String CHANNEL_NAME_BALLASTCONFIGURATION_LAMPTYPE = "LampType";
    public static final String CHANNEL_LABEL_BALLASTCONFIGURATION_LAMPTYPE = "lampType";
    public static final String CHANNEL_ID_BALLASTCONFIGURATION_LAMPTYPE = "ballastconfiguration_lamptype";
    public static final ChannelTypeUID CHANNEL_BALLASTCONFIGURATION_LAMPTYPE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BALLASTCONFIGURATION_LAMPTYPE);

    public static final String CHANNEL_NAME_BALLASTCONFIGURATION_LAMPMANUFACTURER = "LampManufacturer";
    public static final String CHANNEL_LABEL_BALLASTCONFIGURATION_LAMPMANUFACTURER = "lampManufacturer";
    public static final String CHANNEL_ID_BALLASTCONFIGURATION_LAMPMANUFACTURER = "ballastconfiguration_lampmanufacturer";
    public static final ChannelTypeUID CHANNEL_BALLASTCONFIGURATION_LAMPMANUFACTURER = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BALLASTCONFIGURATION_LAMPMANUFACTURER);

    public static final String CHANNEL_NAME_BALLASTCONFIGURATION_LAMPRATEDHOURS = "LampRatedHours";
    public static final String CHANNEL_LABEL_BALLASTCONFIGURATION_LAMPRATEDHOURS = "lampRatedHours";
    public static final String CHANNEL_ID_BALLASTCONFIGURATION_LAMPRATEDHOURS = "ballastconfiguration_lampratedhours";
    public static final ChannelTypeUID CHANNEL_BALLASTCONFIGURATION_LAMPRATEDHOURS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BALLASTCONFIGURATION_LAMPRATEDHOURS);

    public static final String CHANNEL_NAME_BALLASTCONFIGURATION_LAMPBURNHOURS = "LampBurnHours";
    public static final String CHANNEL_LABEL_BALLASTCONFIGURATION_LAMPBURNHOURS = "lampBurnHours";
    public static final String CHANNEL_ID_BALLASTCONFIGURATION_LAMPBURNHOURS = "ballastconfiguration_lampburnhours";
    public static final ChannelTypeUID CHANNEL_BALLASTCONFIGURATION_LAMPBURNHOURS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BALLASTCONFIGURATION_LAMPBURNHOURS);

    public static final String CHANNEL_NAME_BALLASTCONFIGURATION_LAMPALARMMODE = "LampAlarmMode";
    public static final String CHANNEL_LABEL_BALLASTCONFIGURATION_LAMPALARMMODE = "lampAlarmMode";
    public static final String CHANNEL_ID_BALLASTCONFIGURATION_LAMPALARMMODE = "ballastconfiguration_lampalarmmode";
    public static final ChannelTypeUID CHANNEL_BALLASTCONFIGURATION_LAMPALARMMODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BALLASTCONFIGURATION_LAMPALARMMODE);

    public static final String CHANNEL_NAME_BALLASTCONFIGURATION_LAMPBURNHOURSTRIPPOINT = "LampBurnHoursTripPoint";
    public static final String CHANNEL_LABEL_BALLASTCONFIGURATION_LAMPBURNHOURSTRIPPOINT = "lampBurnHoursTripPoint";
    public static final String CHANNEL_ID_BALLASTCONFIGURATION_LAMPBURNHOURSTRIPPOINT = "ballastconfiguration_lampburnhourstrippoint";
    public static final ChannelTypeUID CHANNEL_BALLASTCONFIGURATION_LAMPBURNHOURSTRIPPOINT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BALLASTCONFIGURATION_LAMPBURNHOURSTRIPPOINT);

    // PumpConfigurationAndControl Cluster

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_MAXPRESSURE = "MaxPressure";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_MAXPRESSURE = "maxPressure";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MAXPRESSURE = "pumpconfigurationandcontrol_maxpressure";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_MAXPRESSURE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MAXPRESSURE);

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_MAXSPEED = "MaxSpeed";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_MAXSPEED = "maxSpeed";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MAXSPEED = "pumpconfigurationandcontrol_maxspeed";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_MAXSPEED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MAXSPEED);

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_MAXFLOW = "MaxFlow";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_MAXFLOW = "maxFlow";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MAXFLOW = "pumpconfigurationandcontrol_maxflow";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_MAXFLOW = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MAXFLOW);

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_MINCONSTPRESSURE = "MinConstPressure";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_MINCONSTPRESSURE = "minConstPressure";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MINCONSTPRESSURE = "pumpconfigurationandcontrol_minconstpressure";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_MINCONSTPRESSURE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MINCONSTPRESSURE);

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_MAXCONSTPRESSURE = "MaxConstPressure";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_MAXCONSTPRESSURE = "maxConstPressure";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MAXCONSTPRESSURE = "pumpconfigurationandcontrol_maxconstpressure";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_MAXCONSTPRESSURE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MAXCONSTPRESSURE);

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_MINCOMPPRESSURE = "MinCompPressure";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_MINCOMPPRESSURE = "minCompPressure";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MINCOMPPRESSURE = "pumpconfigurationandcontrol_mincomppressure";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_MINCOMPPRESSURE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MINCOMPPRESSURE);

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_MAXCOMPPRESSURE = "MaxCompPressure";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_MAXCOMPPRESSURE = "maxCompPressure";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MAXCOMPPRESSURE = "pumpconfigurationandcontrol_maxcomppressure";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_MAXCOMPPRESSURE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MAXCOMPPRESSURE);

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_MINCONSTSPEED = "MinConstSpeed";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_MINCONSTSPEED = "minConstSpeed";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MINCONSTSPEED = "pumpconfigurationandcontrol_minconstspeed";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_MINCONSTSPEED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MINCONSTSPEED);

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_MAXCONSTSPEED = "MaxConstSpeed";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_MAXCONSTSPEED = "maxConstSpeed";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MAXCONSTSPEED = "pumpconfigurationandcontrol_maxconstspeed";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_MAXCONSTSPEED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MAXCONSTSPEED);

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_MINCONSTFLOW = "MinConstFlow";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_MINCONSTFLOW = "minConstFlow";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MINCONSTFLOW = "pumpconfigurationandcontrol_minconstflow";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_MINCONSTFLOW = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MINCONSTFLOW);

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_MAXCONSTFLOW = "MaxConstFlow";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_MAXCONSTFLOW = "maxConstFlow";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MAXCONSTFLOW = "pumpconfigurationandcontrol_maxconstflow";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_MAXCONSTFLOW = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MAXCONSTFLOW);

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_MINCONSTTEMP = "MinConstTemp";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_MINCONSTTEMP = "minConstTemp";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MINCONSTTEMP = "pumpconfigurationandcontrol_minconsttemp";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_MINCONSTTEMP = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MINCONSTTEMP);

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_MAXCONSTTEMP = "MaxConstTemp";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_MAXCONSTTEMP = "maxConstTemp";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MAXCONSTTEMP = "pumpconfigurationandcontrol_maxconsttemp";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_MAXCONSTTEMP = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_MAXCONSTTEMP);

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_PUMPSTATUS = "PumpStatus";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_PUMPSTATUS = "pumpStatus";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_PUMPSTATUS = "pumpconfigurationandcontrol_pumpstatus";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_PUMPSTATUS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_PUMPSTATUS);

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_EFFECTIVEOPERATIONMODE = "EffectiveOperationMode";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_EFFECTIVEOPERATIONMODE = "effectiveOperationMode";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_EFFECTIVEOPERATIONMODE = "pumpconfigurationandcontrol_effectiveoperationmode";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_EFFECTIVEOPERATIONMODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_EFFECTIVEOPERATIONMODE);

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_EFFECTIVECONTROLMODE = "EffectiveControlMode";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_EFFECTIVECONTROLMODE = "effectiveControlMode";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_EFFECTIVECONTROLMODE = "pumpconfigurationandcontrol_effectivecontrolmode";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_EFFECTIVECONTROLMODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_EFFECTIVECONTROLMODE);

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_CAPACITY = "Capacity";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_CAPACITY = "capacity";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_CAPACITY = "pumpconfigurationandcontrol_capacity";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_CAPACITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_CAPACITY);

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_SPEED = "Speed";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_SPEED = "speed";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_SPEED = "pumpconfigurationandcontrol_speed";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_SPEED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_SPEED);

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_LIFETIMERUNNINGHOURS = "LifetimeRunningHours";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_LIFETIMERUNNINGHOURS = "lifetimeRunningHours";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_LIFETIMERUNNINGHOURS = "pumpconfigurationandcontrol_lifetimerunninghours";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_LIFETIMERUNNINGHOURS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_LIFETIMERUNNINGHOURS);

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_POWER = "Power";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_POWER = "power";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_POWER = "pumpconfigurationandcontrol_power";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_POWER = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_POWER);

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_LIFETIMEENERGYCONSUMED = "LifetimeEnergyConsumed";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_LIFETIMEENERGYCONSUMED = "lifetimeEnergyConsumed";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_LIFETIMEENERGYCONSUMED = "pumpconfigurationandcontrol_lifetimeenergyconsumed";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_LIFETIMEENERGYCONSUMED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_LIFETIMEENERGYCONSUMED);

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_OPERATIONMODE = "OperationMode";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_OPERATIONMODE = "operationMode";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_OPERATIONMODE = "pumpconfigurationandcontrol_operationmode";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_OPERATIONMODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_OPERATIONMODE);

    public static final String CHANNEL_NAME_PUMPCONFIGURATIONANDCONTROL_CONTROLMODE = "ControlMode";
    public static final String CHANNEL_LABEL_PUMPCONFIGURATIONANDCONTROL_CONTROLMODE = "controlMode";
    public static final String CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_CONTROLMODE = "pumpconfigurationandcontrol_controlmode";
    public static final ChannelTypeUID CHANNEL_PUMPCONFIGURATIONANDCONTROL_CONTROLMODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PUMPCONFIGURATIONANDCONTROL_CONTROLMODE);

    // Thermostat Cluster

    public static final String CHANNEL_NAME_THERMOSTAT_LOCALTEMPERATURE = "LocalTemperature";
    public static final String CHANNEL_LABEL_THERMOSTAT_LOCALTEMPERATURE = "localTemperature";
    public static final String CHANNEL_ID_THERMOSTAT_LOCALTEMPERATURE = "thermostat_localtemperature";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_LOCALTEMPERATURE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_LOCALTEMPERATURE);

    public static final String CHANNEL_NAME_THERMOSTAT_OUTDOORTEMPERATURE = "OutdoorTemperature";
    public static final String CHANNEL_LABEL_THERMOSTAT_OUTDOORTEMPERATURE = "outdoorTemperature";
    public static final String CHANNEL_ID_THERMOSTAT_OUTDOORTEMPERATURE = "thermostat_outdoortemperature";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_OUTDOORTEMPERATURE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_OUTDOORTEMPERATURE);

    public static final String CHANNEL_NAME_THERMOSTAT_OCCUPANCY = "Occupancy";
    public static final String CHANNEL_LABEL_THERMOSTAT_OCCUPANCY = "occupancy";
    public static final String CHANNEL_ID_THERMOSTAT_OCCUPANCY = "thermostat_occupancy";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_OCCUPANCY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_OCCUPANCY);

    public static final String CHANNEL_NAME_THERMOSTAT_ABSMINHEATSETPOINTLIMIT = "AbsMinHeatSetpointLimit";
    public static final String CHANNEL_LABEL_THERMOSTAT_ABSMINHEATSETPOINTLIMIT = "absMinHeatSetpointLimit";
    public static final String CHANNEL_ID_THERMOSTAT_ABSMINHEATSETPOINTLIMIT = "thermostat_absminheatsetpointlimit";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_ABSMINHEATSETPOINTLIMIT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_ABSMINHEATSETPOINTLIMIT);

    public static final String CHANNEL_NAME_THERMOSTAT_ABSMAXHEATSETPOINTLIMIT = "AbsMaxHeatSetpointLimit";
    public static final String CHANNEL_LABEL_THERMOSTAT_ABSMAXHEATSETPOINTLIMIT = "absMaxHeatSetpointLimit";
    public static final String CHANNEL_ID_THERMOSTAT_ABSMAXHEATSETPOINTLIMIT = "thermostat_absmaxheatsetpointlimit";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_ABSMAXHEATSETPOINTLIMIT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_ABSMAXHEATSETPOINTLIMIT);

    public static final String CHANNEL_NAME_THERMOSTAT_ABSMINCOOLSETPOINTLIMIT = "AbsMinCoolSetpointLimit";
    public static final String CHANNEL_LABEL_THERMOSTAT_ABSMINCOOLSETPOINTLIMIT = "absMinCoolSetpointLimit";
    public static final String CHANNEL_ID_THERMOSTAT_ABSMINCOOLSETPOINTLIMIT = "thermostat_absmincoolsetpointlimit";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_ABSMINCOOLSETPOINTLIMIT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_ABSMINCOOLSETPOINTLIMIT);

    public static final String CHANNEL_NAME_THERMOSTAT_ABSMAXCOOLSETPOINTLIMIT = "AbsMaxCoolSetpointLimit";
    public static final String CHANNEL_LABEL_THERMOSTAT_ABSMAXCOOLSETPOINTLIMIT = "absMaxCoolSetpointLimit";
    public static final String CHANNEL_ID_THERMOSTAT_ABSMAXCOOLSETPOINTLIMIT = "thermostat_absmaxcoolsetpointlimit";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_ABSMAXCOOLSETPOINTLIMIT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_ABSMAXCOOLSETPOINTLIMIT);

    public static final String CHANNEL_NAME_THERMOSTAT_PICOOLINGDEMAND = "PiCoolingDemand";
    public static final String CHANNEL_LABEL_THERMOSTAT_PICOOLINGDEMAND = "piCoolingDemand";
    public static final String CHANNEL_ID_THERMOSTAT_PICOOLINGDEMAND = "thermostat_picoolingdemand";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_PICOOLINGDEMAND = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_PICOOLINGDEMAND);

    public static final String CHANNEL_NAME_THERMOSTAT_PIHEATINGDEMAND = "PiHeatingDemand";
    public static final String CHANNEL_LABEL_THERMOSTAT_PIHEATINGDEMAND = "piHeatingDemand";
    public static final String CHANNEL_ID_THERMOSTAT_PIHEATINGDEMAND = "thermostat_piheatingdemand";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_PIHEATINGDEMAND = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_PIHEATINGDEMAND);

    public static final String CHANNEL_NAME_THERMOSTAT_LOCALTEMPERATURECALIBRATION = "LocalTemperatureCalibration";
    public static final String CHANNEL_LABEL_THERMOSTAT_LOCALTEMPERATURECALIBRATION = "localTemperatureCalibration";
    public static final String CHANNEL_ID_THERMOSTAT_LOCALTEMPERATURECALIBRATION = "thermostat_localtemperaturecalibration";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_LOCALTEMPERATURECALIBRATION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_LOCALTEMPERATURECALIBRATION);

    public static final String CHANNEL_NAME_THERMOSTAT_OCCUPIEDCOOLINGSETPOINT = "OccupiedCoolingSetpoint";
    public static final String CHANNEL_LABEL_THERMOSTAT_OCCUPIEDCOOLINGSETPOINT = "occupiedCoolingSetpoint";
    public static final String CHANNEL_ID_THERMOSTAT_OCCUPIEDCOOLINGSETPOINT = "thermostat_occupiedcoolingsetpoint";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_OCCUPIEDCOOLINGSETPOINT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_OCCUPIEDCOOLINGSETPOINT);

    public static final String CHANNEL_NAME_THERMOSTAT_OCCUPIEDHEATINGSETPOINT = "OccupiedHeatingSetpoint";
    public static final String CHANNEL_LABEL_THERMOSTAT_OCCUPIEDHEATINGSETPOINT = "occupiedHeatingSetpoint";
    public static final String CHANNEL_ID_THERMOSTAT_OCCUPIEDHEATINGSETPOINT = "thermostat_occupiedheatingsetpoint";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_OCCUPIEDHEATINGSETPOINT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_OCCUPIEDHEATINGSETPOINT);

    public static final String CHANNEL_NAME_THERMOSTAT_UNOCCUPIEDCOOLINGSETPOINT = "UnoccupiedCoolingSetpoint";
    public static final String CHANNEL_LABEL_THERMOSTAT_UNOCCUPIEDCOOLINGSETPOINT = "unoccupiedCoolingSetpoint";
    public static final String CHANNEL_ID_THERMOSTAT_UNOCCUPIEDCOOLINGSETPOINT = "thermostat_unoccupiedcoolingsetpoint";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_UNOCCUPIEDCOOLINGSETPOINT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_UNOCCUPIEDCOOLINGSETPOINT);

    public static final String CHANNEL_NAME_THERMOSTAT_UNOCCUPIEDHEATINGSETPOINT = "UnoccupiedHeatingSetpoint";
    public static final String CHANNEL_LABEL_THERMOSTAT_UNOCCUPIEDHEATINGSETPOINT = "unoccupiedHeatingSetpoint";
    public static final String CHANNEL_ID_THERMOSTAT_UNOCCUPIEDHEATINGSETPOINT = "thermostat_unoccupiedheatingsetpoint";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_UNOCCUPIEDHEATINGSETPOINT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_UNOCCUPIEDHEATINGSETPOINT);

    public static final String CHANNEL_NAME_THERMOSTAT_MINHEATSETPOINTLIMIT = "MinHeatSetpointLimit";
    public static final String CHANNEL_LABEL_THERMOSTAT_MINHEATSETPOINTLIMIT = "minHeatSetpointLimit";
    public static final String CHANNEL_ID_THERMOSTAT_MINHEATSETPOINTLIMIT = "thermostat_minheatsetpointlimit";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_MINHEATSETPOINTLIMIT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_MINHEATSETPOINTLIMIT);

    public static final String CHANNEL_NAME_THERMOSTAT_MAXHEATSETPOINTLIMIT = "MaxHeatSetpointLimit";
    public static final String CHANNEL_LABEL_THERMOSTAT_MAXHEATSETPOINTLIMIT = "maxHeatSetpointLimit";
    public static final String CHANNEL_ID_THERMOSTAT_MAXHEATSETPOINTLIMIT = "thermostat_maxheatsetpointlimit";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_MAXHEATSETPOINTLIMIT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_MAXHEATSETPOINTLIMIT);

    public static final String CHANNEL_NAME_THERMOSTAT_MINCOOLSETPOINTLIMIT = "MinCoolSetpointLimit";
    public static final String CHANNEL_LABEL_THERMOSTAT_MINCOOLSETPOINTLIMIT = "minCoolSetpointLimit";
    public static final String CHANNEL_ID_THERMOSTAT_MINCOOLSETPOINTLIMIT = "thermostat_mincoolsetpointlimit";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_MINCOOLSETPOINTLIMIT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_MINCOOLSETPOINTLIMIT);

    public static final String CHANNEL_NAME_THERMOSTAT_MAXCOOLSETPOINTLIMIT = "MaxCoolSetpointLimit";
    public static final String CHANNEL_LABEL_THERMOSTAT_MAXCOOLSETPOINTLIMIT = "maxCoolSetpointLimit";
    public static final String CHANNEL_ID_THERMOSTAT_MAXCOOLSETPOINTLIMIT = "thermostat_maxcoolsetpointlimit";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_MAXCOOLSETPOINTLIMIT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_MAXCOOLSETPOINTLIMIT);

    public static final String CHANNEL_NAME_THERMOSTAT_MINSETPOINTDEADBAND = "MinSetpointDeadBand";
    public static final String CHANNEL_LABEL_THERMOSTAT_MINSETPOINTDEADBAND = "minSetpointDeadBand";
    public static final String CHANNEL_ID_THERMOSTAT_MINSETPOINTDEADBAND = "thermostat_minsetpointdeadband";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_MINSETPOINTDEADBAND = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_MINSETPOINTDEADBAND);

    public static final String CHANNEL_NAME_THERMOSTAT_REMOTESENSING = "RemoteSensing";
    public static final String CHANNEL_LABEL_THERMOSTAT_REMOTESENSING = "remoteSensing";
    public static final String CHANNEL_ID_THERMOSTAT_REMOTESENSING = "thermostat_remotesensing";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_REMOTESENSING = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_REMOTESENSING);

    public static final String CHANNEL_NAME_THERMOSTAT_CONTROLSEQUENCEOFOPERATION = "ControlSequenceOfOperation";
    public static final String CHANNEL_LABEL_THERMOSTAT_CONTROLSEQUENCEOFOPERATION = "controlSequenceOfOperation";
    public static final String CHANNEL_ID_THERMOSTAT_CONTROLSEQUENCEOFOPERATION = "thermostat_controlsequenceofoperation";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_CONTROLSEQUENCEOFOPERATION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_CONTROLSEQUENCEOFOPERATION);

    public static final String CHANNEL_NAME_THERMOSTAT_SYSTEMMODE = "SystemMode";
    public static final String CHANNEL_LABEL_THERMOSTAT_SYSTEMMODE = "systemMode";
    public static final String CHANNEL_ID_THERMOSTAT_SYSTEMMODE = "thermostat_systemmode";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_SYSTEMMODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_SYSTEMMODE);

    public static final String CHANNEL_NAME_THERMOSTAT_THERMOSTATRUNNINGMODE = "ThermostatRunningMode";
    public static final String CHANNEL_LABEL_THERMOSTAT_THERMOSTATRUNNINGMODE = "thermostatRunningMode";
    public static final String CHANNEL_ID_THERMOSTAT_THERMOSTATRUNNINGMODE = "thermostat_thermostatrunningmode";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_THERMOSTATRUNNINGMODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_THERMOSTATRUNNINGMODE);

    public static final String CHANNEL_NAME_THERMOSTAT_STARTOFWEEK = "StartOfWeek";
    public static final String CHANNEL_LABEL_THERMOSTAT_STARTOFWEEK = "startOfWeek";
    public static final String CHANNEL_ID_THERMOSTAT_STARTOFWEEK = "thermostat_startofweek";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_STARTOFWEEK = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_STARTOFWEEK);

    public static final String CHANNEL_NAME_THERMOSTAT_NUMBEROFWEEKLYTRANSITIONS = "NumberOfWeeklyTransitions";
    public static final String CHANNEL_LABEL_THERMOSTAT_NUMBEROFWEEKLYTRANSITIONS = "numberOfWeeklyTransitions";
    public static final String CHANNEL_ID_THERMOSTAT_NUMBEROFWEEKLYTRANSITIONS = "thermostat_numberofweeklytransitions";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_NUMBEROFWEEKLYTRANSITIONS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_NUMBEROFWEEKLYTRANSITIONS);

    public static final String CHANNEL_NAME_THERMOSTAT_NUMBEROFDAILYTRANSITIONS = "NumberOfDailyTransitions";
    public static final String CHANNEL_LABEL_THERMOSTAT_NUMBEROFDAILYTRANSITIONS = "numberOfDailyTransitions";
    public static final String CHANNEL_ID_THERMOSTAT_NUMBEROFDAILYTRANSITIONS = "thermostat_numberofdailytransitions";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_NUMBEROFDAILYTRANSITIONS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_NUMBEROFDAILYTRANSITIONS);

    public static final String CHANNEL_NAME_THERMOSTAT_TEMPERATURESETPOINTHOLD = "TemperatureSetpointHold";
    public static final String CHANNEL_LABEL_THERMOSTAT_TEMPERATURESETPOINTHOLD = "temperatureSetpointHold";
    public static final String CHANNEL_ID_THERMOSTAT_TEMPERATURESETPOINTHOLD = "thermostat_temperaturesetpointhold";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_TEMPERATURESETPOINTHOLD = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_TEMPERATURESETPOINTHOLD);

    public static final String CHANNEL_NAME_THERMOSTAT_TEMPERATURESETPOINTHOLDDURATION = "TemperatureSetpointHoldDuration";
    public static final String CHANNEL_LABEL_THERMOSTAT_TEMPERATURESETPOINTHOLDDURATION = "temperatureSetpointHoldDuration";
    public static final String CHANNEL_ID_THERMOSTAT_TEMPERATURESETPOINTHOLDDURATION = "thermostat_temperaturesetpointholdduration";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_TEMPERATURESETPOINTHOLDDURATION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_TEMPERATURESETPOINTHOLDDURATION);

    public static final String CHANNEL_NAME_THERMOSTAT_THERMOSTATPROGRAMMINGOPERATIONMODE = "ThermostatProgrammingOperationMode";
    public static final String CHANNEL_LABEL_THERMOSTAT_THERMOSTATPROGRAMMINGOPERATIONMODE = "thermostatProgrammingOperationMode";
    public static final String CHANNEL_ID_THERMOSTAT_THERMOSTATPROGRAMMINGOPERATIONMODE = "thermostat_thermostatprogrammingoperationmode";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_THERMOSTATPROGRAMMINGOPERATIONMODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_THERMOSTATPROGRAMMINGOPERATIONMODE);

    public static final String CHANNEL_NAME_THERMOSTAT_THERMOSTATRUNNINGSTATE = "ThermostatRunningState";
    public static final String CHANNEL_LABEL_THERMOSTAT_THERMOSTATRUNNINGSTATE = "thermostatRunningState";
    public static final String CHANNEL_ID_THERMOSTAT_THERMOSTATRUNNINGSTATE = "thermostat_thermostatrunningstate";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_THERMOSTATRUNNINGSTATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_THERMOSTATRUNNINGSTATE);

    public static final String CHANNEL_NAME_THERMOSTAT_SETPOINTCHANGESOURCE = "SetpointChangeSource";
    public static final String CHANNEL_LABEL_THERMOSTAT_SETPOINTCHANGESOURCE = "setpointChangeSource";
    public static final String CHANNEL_ID_THERMOSTAT_SETPOINTCHANGESOURCE = "thermostat_setpointchangesource";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_SETPOINTCHANGESOURCE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_SETPOINTCHANGESOURCE);

    public static final String CHANNEL_NAME_THERMOSTAT_SETPOINTCHANGEAMOUNT = "SetpointChangeAmount";
    public static final String CHANNEL_LABEL_THERMOSTAT_SETPOINTCHANGEAMOUNT = "setpointChangeAmount";
    public static final String CHANNEL_ID_THERMOSTAT_SETPOINTCHANGEAMOUNT = "thermostat_setpointchangeamount";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_SETPOINTCHANGEAMOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_SETPOINTCHANGEAMOUNT);

    public static final String CHANNEL_NAME_THERMOSTAT_SETPOINTCHANGESOURCETIMESTAMP = "SetpointChangeSourceTimestamp";
    public static final String CHANNEL_LABEL_THERMOSTAT_SETPOINTCHANGESOURCETIMESTAMP = "setpointChangeSourceTimestamp";
    public static final String CHANNEL_ID_THERMOSTAT_SETPOINTCHANGESOURCETIMESTAMP = "thermostat_setpointchangesourcetimestamp";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_SETPOINTCHANGESOURCETIMESTAMP = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_SETPOINTCHANGESOURCETIMESTAMP);

    public static final String CHANNEL_NAME_THERMOSTAT_OCCUPIEDSETBACK = "OccupiedSetback";
    public static final String CHANNEL_LABEL_THERMOSTAT_OCCUPIEDSETBACK = "occupiedSetback";
    public static final String CHANNEL_ID_THERMOSTAT_OCCUPIEDSETBACK = "thermostat_occupiedsetback";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_OCCUPIEDSETBACK = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_OCCUPIEDSETBACK);

    public static final String CHANNEL_NAME_THERMOSTAT_OCCUPIEDSETBACKMIN = "OccupiedSetbackMin";
    public static final String CHANNEL_LABEL_THERMOSTAT_OCCUPIEDSETBACKMIN = "occupiedSetbackMin";
    public static final String CHANNEL_ID_THERMOSTAT_OCCUPIEDSETBACKMIN = "thermostat_occupiedsetbackmin";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_OCCUPIEDSETBACKMIN = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_OCCUPIEDSETBACKMIN);

    public static final String CHANNEL_NAME_THERMOSTAT_OCCUPIEDSETBACKMAX = "OccupiedSetbackMax";
    public static final String CHANNEL_LABEL_THERMOSTAT_OCCUPIEDSETBACKMAX = "occupiedSetbackMax";
    public static final String CHANNEL_ID_THERMOSTAT_OCCUPIEDSETBACKMAX = "thermostat_occupiedsetbackmax";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_OCCUPIEDSETBACKMAX = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_OCCUPIEDSETBACKMAX);

    public static final String CHANNEL_NAME_THERMOSTAT_UNOCCUPIEDSETBACK = "UnoccupiedSetback";
    public static final String CHANNEL_LABEL_THERMOSTAT_UNOCCUPIEDSETBACK = "unoccupiedSetback";
    public static final String CHANNEL_ID_THERMOSTAT_UNOCCUPIEDSETBACK = "thermostat_unoccupiedsetback";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_UNOCCUPIEDSETBACK = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_UNOCCUPIEDSETBACK);

    public static final String CHANNEL_NAME_THERMOSTAT_UNOCCUPIEDSETBACKMIN = "UnoccupiedSetbackMin";
    public static final String CHANNEL_LABEL_THERMOSTAT_UNOCCUPIEDSETBACKMIN = "unoccupiedSetbackMin";
    public static final String CHANNEL_ID_THERMOSTAT_UNOCCUPIEDSETBACKMIN = "thermostat_unoccupiedsetbackmin";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_UNOCCUPIEDSETBACKMIN = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_UNOCCUPIEDSETBACKMIN);

    public static final String CHANNEL_NAME_THERMOSTAT_UNOCCUPIEDSETBACKMAX = "UnoccupiedSetbackMax";
    public static final String CHANNEL_LABEL_THERMOSTAT_UNOCCUPIEDSETBACKMAX = "unoccupiedSetbackMax";
    public static final String CHANNEL_ID_THERMOSTAT_UNOCCUPIEDSETBACKMAX = "thermostat_unoccupiedsetbackmax";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_UNOCCUPIEDSETBACKMAX = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_UNOCCUPIEDSETBACKMAX);

    public static final String CHANNEL_NAME_THERMOSTAT_EMERGENCYHEATDELTA = "EmergencyHeatDelta";
    public static final String CHANNEL_LABEL_THERMOSTAT_EMERGENCYHEATDELTA = "emergencyHeatDelta";
    public static final String CHANNEL_ID_THERMOSTAT_EMERGENCYHEATDELTA = "thermostat_emergencyheatdelta";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_EMERGENCYHEATDELTA = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_EMERGENCYHEATDELTA);

    public static final String CHANNEL_NAME_THERMOSTAT_ACTYPE = "AcType";
    public static final String CHANNEL_LABEL_THERMOSTAT_ACTYPE = "acType";
    public static final String CHANNEL_ID_THERMOSTAT_ACTYPE = "thermostat_actype";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_ACTYPE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_ACTYPE);

    public static final String CHANNEL_NAME_THERMOSTAT_ACCAPACITY = "AcCapacity";
    public static final String CHANNEL_LABEL_THERMOSTAT_ACCAPACITY = "acCapacity";
    public static final String CHANNEL_ID_THERMOSTAT_ACCAPACITY = "thermostat_accapacity";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_ACCAPACITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_ACCAPACITY);

    public static final String CHANNEL_NAME_THERMOSTAT_ACREFRIGERANTTYPE = "AcRefrigerantType";
    public static final String CHANNEL_LABEL_THERMOSTAT_ACREFRIGERANTTYPE = "acRefrigerantType";
    public static final String CHANNEL_ID_THERMOSTAT_ACREFRIGERANTTYPE = "thermostat_acrefrigeranttype";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_ACREFRIGERANTTYPE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_ACREFRIGERANTTYPE);

    public static final String CHANNEL_NAME_THERMOSTAT_ACCOMPRESSORTYPE = "AcCompressorType";
    public static final String CHANNEL_LABEL_THERMOSTAT_ACCOMPRESSORTYPE = "acCompressorType";
    public static final String CHANNEL_ID_THERMOSTAT_ACCOMPRESSORTYPE = "thermostat_accompressortype";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_ACCOMPRESSORTYPE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_ACCOMPRESSORTYPE);

    public static final String CHANNEL_NAME_THERMOSTAT_ACERRORCODE = "AcErrorCode";
    public static final String CHANNEL_LABEL_THERMOSTAT_ACERRORCODE = "acErrorCode";
    public static final String CHANNEL_ID_THERMOSTAT_ACERRORCODE = "thermostat_acerrorcode";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_ACERRORCODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_ACERRORCODE);

    public static final String CHANNEL_NAME_THERMOSTAT_ACLOUVERPOSITION = "AcLouverPosition";
    public static final String CHANNEL_LABEL_THERMOSTAT_ACLOUVERPOSITION = "acLouverPosition";
    public static final String CHANNEL_ID_THERMOSTAT_ACLOUVERPOSITION = "thermostat_aclouverposition";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_ACLOUVERPOSITION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_ACLOUVERPOSITION);

    public static final String CHANNEL_NAME_THERMOSTAT_ACCOILTEMPERATURE = "AcCoilTemperature";
    public static final String CHANNEL_LABEL_THERMOSTAT_ACCOILTEMPERATURE = "acCoilTemperature";
    public static final String CHANNEL_ID_THERMOSTAT_ACCOILTEMPERATURE = "thermostat_accoiltemperature";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_ACCOILTEMPERATURE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_ACCOILTEMPERATURE);

    public static final String CHANNEL_NAME_THERMOSTAT_ACCAPACITYFORMAT = "AcCapacityFormat";
    public static final String CHANNEL_LABEL_THERMOSTAT_ACCAPACITYFORMAT = "acCapacityFormat";
    public static final String CHANNEL_ID_THERMOSTAT_ACCAPACITYFORMAT = "thermostat_accapacityformat";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_ACCAPACITYFORMAT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTAT_ACCAPACITYFORMAT);

    // FanControl Cluster

    public static final String CHANNEL_NAME_FANCONTROL_FANMODE = "FanMode";
    public static final String CHANNEL_LABEL_FANCONTROL_FANMODE = "fanMode";
    public static final String CHANNEL_ID_FANCONTROL_FANMODE = "fancontrol_fanmode";
    public static final ChannelTypeUID CHANNEL_FANCONTROL_FANMODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_FANCONTROL_FANMODE);

    public static final String CHANNEL_NAME_FANCONTROL_FANMODESEQUENCE = "FanModeSequence";
    public static final String CHANNEL_LABEL_FANCONTROL_FANMODESEQUENCE = "fanModeSequence";
    public static final String CHANNEL_ID_FANCONTROL_FANMODESEQUENCE = "fancontrol_fanmodesequence";
    public static final ChannelTypeUID CHANNEL_FANCONTROL_FANMODESEQUENCE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_FANCONTROL_FANMODESEQUENCE);

    public static final String CHANNEL_NAME_FANCONTROL_PERCENTSETTING = "PercentSetting";
    public static final String CHANNEL_LABEL_FANCONTROL_PERCENTSETTING = "percentSetting";
    public static final String CHANNEL_ID_FANCONTROL_PERCENTSETTING = "fancontrol_percentsetting";
    public static final ChannelTypeUID CHANNEL_FANCONTROL_PERCENTSETTING = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_FANCONTROL_PERCENTSETTING);

    public static final String CHANNEL_NAME_FANCONTROL_PERCENTCURRENT = "PercentCurrent";
    public static final String CHANNEL_LABEL_FANCONTROL_PERCENTCURRENT = "percentCurrent";
    public static final String CHANNEL_ID_FANCONTROL_PERCENTCURRENT = "fancontrol_percentcurrent";
    public static final ChannelTypeUID CHANNEL_FANCONTROL_PERCENTCURRENT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_FANCONTROL_PERCENTCURRENT);

    public static final String CHANNEL_NAME_FANCONTROL_SPEEDMAX = "SpeedMax";
    public static final String CHANNEL_LABEL_FANCONTROL_SPEEDMAX = "speedMax";
    public static final String CHANNEL_ID_FANCONTROL_SPEEDMAX = "fancontrol_speedmax";
    public static final ChannelTypeUID CHANNEL_FANCONTROL_SPEEDMAX = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_FANCONTROL_SPEEDMAX);

    public static final String CHANNEL_NAME_FANCONTROL_SPEEDSETTING = "SpeedSetting";
    public static final String CHANNEL_LABEL_FANCONTROL_SPEEDSETTING = "speedSetting";
    public static final String CHANNEL_ID_FANCONTROL_SPEEDSETTING = "fancontrol_speedsetting";
    public static final ChannelTypeUID CHANNEL_FANCONTROL_SPEEDSETTING = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_FANCONTROL_SPEEDSETTING);

    public static final String CHANNEL_NAME_FANCONTROL_SPEEDCURRENT = "SpeedCurrent";
    public static final String CHANNEL_LABEL_FANCONTROL_SPEEDCURRENT = "speedCurrent";
    public static final String CHANNEL_ID_FANCONTROL_SPEEDCURRENT = "fancontrol_speedcurrent";
    public static final ChannelTypeUID CHANNEL_FANCONTROL_SPEEDCURRENT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_FANCONTROL_SPEEDCURRENT);

    public static final String CHANNEL_NAME_FANCONTROL_ROCKSUPPORT = "RockSupport";
    public static final String CHANNEL_LABEL_FANCONTROL_ROCKSUPPORT = "rockSupport";
    public static final String CHANNEL_ID_FANCONTROL_ROCKSUPPORT = "fancontrol_rocksupport";
    public static final ChannelTypeUID CHANNEL_FANCONTROL_ROCKSUPPORT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_FANCONTROL_ROCKSUPPORT);

    public static final String CHANNEL_NAME_FANCONTROL_ROCKSETTING = "RockSetting";
    public static final String CHANNEL_LABEL_FANCONTROL_ROCKSETTING = "rockSetting";
    public static final String CHANNEL_ID_FANCONTROL_ROCKSETTING = "fancontrol_rocksetting";
    public static final ChannelTypeUID CHANNEL_FANCONTROL_ROCKSETTING = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_FANCONTROL_ROCKSETTING);

    public static final String CHANNEL_NAME_FANCONTROL_WINDSUPPORT = "WindSupport";
    public static final String CHANNEL_LABEL_FANCONTROL_WINDSUPPORT = "windSupport";
    public static final String CHANNEL_ID_FANCONTROL_WINDSUPPORT = "fancontrol_windsupport";
    public static final ChannelTypeUID CHANNEL_FANCONTROL_WINDSUPPORT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_FANCONTROL_WINDSUPPORT);

    public static final String CHANNEL_NAME_FANCONTROL_WINDSETTING = "WindSetting";
    public static final String CHANNEL_LABEL_FANCONTROL_WINDSETTING = "windSetting";
    public static final String CHANNEL_ID_FANCONTROL_WINDSETTING = "fancontrol_windsetting";
    public static final ChannelTypeUID CHANNEL_FANCONTROL_WINDSETTING = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_FANCONTROL_WINDSETTING);

    public static final String CHANNEL_NAME_FANCONTROL_AIRFLOWDIRECTION = "AirflowDirection";
    public static final String CHANNEL_LABEL_FANCONTROL_AIRFLOWDIRECTION = "airflowDirection";
    public static final String CHANNEL_ID_FANCONTROL_AIRFLOWDIRECTION = "fancontrol_airflowdirection";
    public static final ChannelTypeUID CHANNEL_FANCONTROL_AIRFLOWDIRECTION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_FANCONTROL_AIRFLOWDIRECTION);

    // ThermostatUserInterfaceConfiguration Cluster

    public static final String CHANNEL_NAME_THERMOSTATUSERINTERFACECONFIGURATION_TEMPERATUREDISPLAYMODE = "TemperatureDisplayMode";
    public static final String CHANNEL_LABEL_THERMOSTATUSERINTERFACECONFIGURATION_TEMPERATUREDISPLAYMODE = "temperatureDisplayMode";
    public static final String CHANNEL_ID_THERMOSTATUSERINTERFACECONFIGURATION_TEMPERATUREDISPLAYMODE = "thermostatuserinterfaceconfiguration_temperaturedisplaymode";
    public static final ChannelTypeUID CHANNEL_THERMOSTATUSERINTERFACECONFIGURATION_TEMPERATUREDISPLAYMODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTATUSERINTERFACECONFIGURATION_TEMPERATUREDISPLAYMODE);

    public static final String CHANNEL_NAME_THERMOSTATUSERINTERFACECONFIGURATION_KEYPADLOCKOUT = "KeypadLockout";
    public static final String CHANNEL_LABEL_THERMOSTATUSERINTERFACECONFIGURATION_KEYPADLOCKOUT = "keypadLockout";
    public static final String CHANNEL_ID_THERMOSTATUSERINTERFACECONFIGURATION_KEYPADLOCKOUT = "thermostatuserinterfaceconfiguration_keypadlockout";
    public static final ChannelTypeUID CHANNEL_THERMOSTATUSERINTERFACECONFIGURATION_KEYPADLOCKOUT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTATUSERINTERFACECONFIGURATION_KEYPADLOCKOUT);

    public static final String CHANNEL_NAME_THERMOSTATUSERINTERFACECONFIGURATION_SCHEDULEPROGRAMMINGVISIBILITY = "ScheduleProgrammingVisibility";
    public static final String CHANNEL_LABEL_THERMOSTATUSERINTERFACECONFIGURATION_SCHEDULEPROGRAMMINGVISIBILITY = "scheduleProgrammingVisibility";
    public static final String CHANNEL_ID_THERMOSTATUSERINTERFACECONFIGURATION_SCHEDULEPROGRAMMINGVISIBILITY = "thermostatuserinterfaceconfiguration_scheduleprogrammingvisibility";
    public static final ChannelTypeUID CHANNEL_THERMOSTATUSERINTERFACECONFIGURATION_SCHEDULEPROGRAMMINGVISIBILITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THERMOSTATUSERINTERFACECONFIGURATION_SCHEDULEPROGRAMMINGVISIBILITY);

    // ValveConfigurationAndControl Cluster

    public static final String CHANNEL_NAME_VALVECONFIGURATIONANDCONTROL_OPENDURATION = "OpenDuration";
    public static final String CHANNEL_LABEL_VALVECONFIGURATIONANDCONTROL_OPENDURATION = "openDuration";
    public static final String CHANNEL_ID_VALVECONFIGURATIONANDCONTROL_OPENDURATION = "valveconfigurationandcontrol_openduration";
    public static final ChannelTypeUID CHANNEL_VALVECONFIGURATIONANDCONTROL_OPENDURATION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_VALVECONFIGURATIONANDCONTROL_OPENDURATION);

    public static final String CHANNEL_NAME_VALVECONFIGURATIONANDCONTROL_DEFAULTOPENDURATION = "DefaultOpenDuration";
    public static final String CHANNEL_LABEL_VALVECONFIGURATIONANDCONTROL_DEFAULTOPENDURATION = "defaultOpenDuration";
    public static final String CHANNEL_ID_VALVECONFIGURATIONANDCONTROL_DEFAULTOPENDURATION = "valveconfigurationandcontrol_defaultopenduration";
    public static final ChannelTypeUID CHANNEL_VALVECONFIGURATIONANDCONTROL_DEFAULTOPENDURATION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_VALVECONFIGURATIONANDCONTROL_DEFAULTOPENDURATION);

    public static final String CHANNEL_NAME_VALVECONFIGURATIONANDCONTROL_AUTOCLOSETIME = "AutoCloseTime";
    public static final String CHANNEL_LABEL_VALVECONFIGURATIONANDCONTROL_AUTOCLOSETIME = "autoCloseTime";
    public static final String CHANNEL_ID_VALVECONFIGURATIONANDCONTROL_AUTOCLOSETIME = "valveconfigurationandcontrol_autoclosetime";
    public static final ChannelTypeUID CHANNEL_VALVECONFIGURATIONANDCONTROL_AUTOCLOSETIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_VALVECONFIGURATIONANDCONTROL_AUTOCLOSETIME);

    public static final String CHANNEL_NAME_VALVECONFIGURATIONANDCONTROL_REMAININGDURATION = "RemainingDuration";
    public static final String CHANNEL_LABEL_VALVECONFIGURATIONANDCONTROL_REMAININGDURATION = "remainingDuration";
    public static final String CHANNEL_ID_VALVECONFIGURATIONANDCONTROL_REMAININGDURATION = "valveconfigurationandcontrol_remainingduration";
    public static final ChannelTypeUID CHANNEL_VALVECONFIGURATIONANDCONTROL_REMAININGDURATION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_VALVECONFIGURATIONANDCONTROL_REMAININGDURATION);

    public static final String CHANNEL_NAME_VALVECONFIGURATIONANDCONTROL_CURRENTSTATE = "CurrentState";
    public static final String CHANNEL_LABEL_VALVECONFIGURATIONANDCONTROL_CURRENTSTATE = "currentState";
    public static final String CHANNEL_ID_VALVECONFIGURATIONANDCONTROL_CURRENTSTATE = "valveconfigurationandcontrol_currentstate";
    public static final ChannelTypeUID CHANNEL_VALVECONFIGURATIONANDCONTROL_CURRENTSTATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_VALVECONFIGURATIONANDCONTROL_CURRENTSTATE);

    public static final String CHANNEL_NAME_VALVECONFIGURATIONANDCONTROL_TARGETSTATE = "TargetState";
    public static final String CHANNEL_LABEL_VALVECONFIGURATIONANDCONTROL_TARGETSTATE = "targetState";
    public static final String CHANNEL_ID_VALVECONFIGURATIONANDCONTROL_TARGETSTATE = "valveconfigurationandcontrol_targetstate";
    public static final ChannelTypeUID CHANNEL_VALVECONFIGURATIONANDCONTROL_TARGETSTATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_VALVECONFIGURATIONANDCONTROL_TARGETSTATE);

    public static final String CHANNEL_NAME_VALVECONFIGURATIONANDCONTROL_CURRENTLEVEL = "CurrentLevel";
    public static final String CHANNEL_LABEL_VALVECONFIGURATIONANDCONTROL_CURRENTLEVEL = "currentLevel";
    public static final String CHANNEL_ID_VALVECONFIGURATIONANDCONTROL_CURRENTLEVEL = "valveconfigurationandcontrol_currentlevel";
    public static final ChannelTypeUID CHANNEL_VALVECONFIGURATIONANDCONTROL_CURRENTLEVEL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_VALVECONFIGURATIONANDCONTROL_CURRENTLEVEL);

    public static final String CHANNEL_NAME_VALVECONFIGURATIONANDCONTROL_TARGETLEVEL = "TargetLevel";
    public static final String CHANNEL_LABEL_VALVECONFIGURATIONANDCONTROL_TARGETLEVEL = "targetLevel";
    public static final String CHANNEL_ID_VALVECONFIGURATIONANDCONTROL_TARGETLEVEL = "valveconfigurationandcontrol_targetlevel";
    public static final ChannelTypeUID CHANNEL_VALVECONFIGURATIONANDCONTROL_TARGETLEVEL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_VALVECONFIGURATIONANDCONTROL_TARGETLEVEL);

    public static final String CHANNEL_NAME_VALVECONFIGURATIONANDCONTROL_DEFAULTOPENLEVEL = "DefaultOpenLevel";
    public static final String CHANNEL_LABEL_VALVECONFIGURATIONANDCONTROL_DEFAULTOPENLEVEL = "defaultOpenLevel";
    public static final String CHANNEL_ID_VALVECONFIGURATIONANDCONTROL_DEFAULTOPENLEVEL = "valveconfigurationandcontrol_defaultopenlevel";
    public static final ChannelTypeUID CHANNEL_VALVECONFIGURATIONANDCONTROL_DEFAULTOPENLEVEL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_VALVECONFIGURATIONANDCONTROL_DEFAULTOPENLEVEL);

    public static final String CHANNEL_NAME_VALVECONFIGURATIONANDCONTROL_VALVEFAULT = "ValveFault";
    public static final String CHANNEL_LABEL_VALVECONFIGURATIONANDCONTROL_VALVEFAULT = "valveFault";
    public static final String CHANNEL_ID_VALVECONFIGURATIONANDCONTROL_VALVEFAULT = "valveconfigurationandcontrol_valvefault";
    public static final ChannelTypeUID CHANNEL_VALVECONFIGURATIONANDCONTROL_VALVEFAULT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_VALVECONFIGURATIONANDCONTROL_VALVEFAULT);

    public static final String CHANNEL_NAME_VALVECONFIGURATIONANDCONTROL_LEVELSTEP = "LevelStep";
    public static final String CHANNEL_LABEL_VALVECONFIGURATIONANDCONTROL_LEVELSTEP = "levelStep";
    public static final String CHANNEL_ID_VALVECONFIGURATIONANDCONTROL_LEVELSTEP = "valveconfigurationandcontrol_levelstep";
    public static final ChannelTypeUID CHANNEL_VALVECONFIGURATIONANDCONTROL_LEVELSTEP = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_VALVECONFIGURATIONANDCONTROL_LEVELSTEP);

    // DoorLock Cluster

    public static final String CHANNEL_NAME_DOORLOCK_LOCKSTATE = "LockState";
    public static final String CHANNEL_LABEL_DOORLOCK_LOCKSTATE = "lockState";
    public static final String CHANNEL_ID_DOORLOCK_LOCKSTATE = "doorlock_lockstate";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_LOCKSTATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_LOCKSTATE);

    public static final String CHANNEL_NAME_DOORLOCK_LOCKTYPE = "LockType";
    public static final String CHANNEL_LABEL_DOORLOCK_LOCKTYPE = "lockType";
    public static final String CHANNEL_ID_DOORLOCK_LOCKTYPE = "doorlock_locktype";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_LOCKTYPE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_LOCKTYPE);

    public static final String CHANNEL_NAME_DOORLOCK_ACTUATORENABLED = "ActuatorEnabled";
    public static final String CHANNEL_LABEL_DOORLOCK_ACTUATORENABLED = "actuatorEnabled";
    public static final String CHANNEL_ID_DOORLOCK_ACTUATORENABLED = "doorlock_actuatorenabled";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_ACTUATORENABLED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_ACTUATORENABLED);

    public static final String CHANNEL_NAME_DOORLOCK_DOORSTATE = "DoorState";
    public static final String CHANNEL_LABEL_DOORLOCK_DOORSTATE = "doorState";
    public static final String CHANNEL_ID_DOORLOCK_DOORSTATE = "doorlock_doorstate";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_DOORSTATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_DOORSTATE);

    public static final String CHANNEL_NAME_DOORLOCK_DOOROPENEVENTS = "DoorOpenEvents";
    public static final String CHANNEL_LABEL_DOORLOCK_DOOROPENEVENTS = "doorOpenEvents";
    public static final String CHANNEL_ID_DOORLOCK_DOOROPENEVENTS = "doorlock_dooropenevents";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_DOOROPENEVENTS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_DOOROPENEVENTS);

    public static final String CHANNEL_NAME_DOORLOCK_DOORCLOSEDEVENTS = "DoorClosedEvents";
    public static final String CHANNEL_LABEL_DOORLOCK_DOORCLOSEDEVENTS = "doorClosedEvents";
    public static final String CHANNEL_ID_DOORLOCK_DOORCLOSEDEVENTS = "doorlock_doorclosedevents";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_DOORCLOSEDEVENTS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_DOORCLOSEDEVENTS);

    public static final String CHANNEL_NAME_DOORLOCK_OPENPERIOD = "OpenPeriod";
    public static final String CHANNEL_LABEL_DOORLOCK_OPENPERIOD = "openPeriod";
    public static final String CHANNEL_ID_DOORLOCK_OPENPERIOD = "doorlock_openperiod";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_OPENPERIOD = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_OPENPERIOD);

    public static final String CHANNEL_NAME_DOORLOCK_NUMBEROFLOGRECORDSSUPPORTED = "NumberOfLogRecordsSupported";
    public static final String CHANNEL_LABEL_DOORLOCK_NUMBEROFLOGRECORDSSUPPORTED = "numberOfLogRecordsSupported";
    public static final String CHANNEL_ID_DOORLOCK_NUMBEROFLOGRECORDSSUPPORTED = "doorlock_numberoflogrecordssupported";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_NUMBEROFLOGRECORDSSUPPORTED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_NUMBEROFLOGRECORDSSUPPORTED);

    public static final String CHANNEL_NAME_DOORLOCK_NUMBEROFTOTALUSERSSUPPORTED = "NumberOfTotalUsersSupported";
    public static final String CHANNEL_LABEL_DOORLOCK_NUMBEROFTOTALUSERSSUPPORTED = "numberOfTotalUsersSupported";
    public static final String CHANNEL_ID_DOORLOCK_NUMBEROFTOTALUSERSSUPPORTED = "doorlock_numberoftotaluserssupported";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_NUMBEROFTOTALUSERSSUPPORTED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_NUMBEROFTOTALUSERSSUPPORTED);

    public static final String CHANNEL_NAME_DOORLOCK_NUMBEROFPINUSERSSUPPORTED = "NumberOfPinUsersSupported";
    public static final String CHANNEL_LABEL_DOORLOCK_NUMBEROFPINUSERSSUPPORTED = "numberOfPinUsersSupported";
    public static final String CHANNEL_ID_DOORLOCK_NUMBEROFPINUSERSSUPPORTED = "doorlock_numberofpinuserssupported";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_NUMBEROFPINUSERSSUPPORTED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_NUMBEROFPINUSERSSUPPORTED);

    public static final String CHANNEL_NAME_DOORLOCK_NUMBEROFRFIDUSERSSUPPORTED = "NumberOfRfidUsersSupported";
    public static final String CHANNEL_LABEL_DOORLOCK_NUMBEROFRFIDUSERSSUPPORTED = "numberOfRfidUsersSupported";
    public static final String CHANNEL_ID_DOORLOCK_NUMBEROFRFIDUSERSSUPPORTED = "doorlock_numberofrfiduserssupported";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_NUMBEROFRFIDUSERSSUPPORTED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_NUMBEROFRFIDUSERSSUPPORTED);

    public static final String CHANNEL_NAME_DOORLOCK_NUMBEROFWEEKDAYSCHEDULESSUPPORTEDPERUSER = "NumberOfWeekDaySchedulesSupportedPerUser";
    public static final String CHANNEL_LABEL_DOORLOCK_NUMBEROFWEEKDAYSCHEDULESSUPPORTEDPERUSER = "numberOfWeekDaySchedulesSupportedPerUser";
    public static final String CHANNEL_ID_DOORLOCK_NUMBEROFWEEKDAYSCHEDULESSUPPORTEDPERUSER = "doorlock_numberofweekdayschedulessupportedperuser";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_NUMBEROFWEEKDAYSCHEDULESSUPPORTEDPERUSER = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_NUMBEROFWEEKDAYSCHEDULESSUPPORTEDPERUSER);

    public static final String CHANNEL_NAME_DOORLOCK_NUMBEROFYEARDAYSCHEDULESSUPPORTEDPERUSER = "NumberOfYearDaySchedulesSupportedPerUser";
    public static final String CHANNEL_LABEL_DOORLOCK_NUMBEROFYEARDAYSCHEDULESSUPPORTEDPERUSER = "numberOfYearDaySchedulesSupportedPerUser";
    public static final String CHANNEL_ID_DOORLOCK_NUMBEROFYEARDAYSCHEDULESSUPPORTEDPERUSER = "doorlock_numberofyeardayschedulessupportedperuser";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_NUMBEROFYEARDAYSCHEDULESSUPPORTEDPERUSER = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_NUMBEROFYEARDAYSCHEDULESSUPPORTEDPERUSER);

    public static final String CHANNEL_NAME_DOORLOCK_NUMBEROFHOLIDAYSCHEDULESSUPPORTED = "NumberOfHolidaySchedulesSupported";
    public static final String CHANNEL_LABEL_DOORLOCK_NUMBEROFHOLIDAYSCHEDULESSUPPORTED = "numberOfHolidaySchedulesSupported";
    public static final String CHANNEL_ID_DOORLOCK_NUMBEROFHOLIDAYSCHEDULESSUPPORTED = "doorlock_numberofholidayschedulessupported";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_NUMBEROFHOLIDAYSCHEDULESSUPPORTED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_NUMBEROFHOLIDAYSCHEDULESSUPPORTED);

    public static final String CHANNEL_NAME_DOORLOCK_MAXPINCODELENGTH = "MaxPinCodeLength";
    public static final String CHANNEL_LABEL_DOORLOCK_MAXPINCODELENGTH = "maxPinCodeLength";
    public static final String CHANNEL_ID_DOORLOCK_MAXPINCODELENGTH = "doorlock_maxpincodelength";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_MAXPINCODELENGTH = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_MAXPINCODELENGTH);

    public static final String CHANNEL_NAME_DOORLOCK_MINPINCODELENGTH = "MinPinCodeLength";
    public static final String CHANNEL_LABEL_DOORLOCK_MINPINCODELENGTH = "minPinCodeLength";
    public static final String CHANNEL_ID_DOORLOCK_MINPINCODELENGTH = "doorlock_minpincodelength";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_MINPINCODELENGTH = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_MINPINCODELENGTH);

    public static final String CHANNEL_NAME_DOORLOCK_MAXRFIDCODELENGTH = "MaxRfidCodeLength";
    public static final String CHANNEL_LABEL_DOORLOCK_MAXRFIDCODELENGTH = "maxRfidCodeLength";
    public static final String CHANNEL_ID_DOORLOCK_MAXRFIDCODELENGTH = "doorlock_maxrfidcodelength";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_MAXRFIDCODELENGTH = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_MAXRFIDCODELENGTH);

    public static final String CHANNEL_NAME_DOORLOCK_MINRFIDCODELENGTH = "MinRfidCodeLength";
    public static final String CHANNEL_LABEL_DOORLOCK_MINRFIDCODELENGTH = "minRfidCodeLength";
    public static final String CHANNEL_ID_DOORLOCK_MINRFIDCODELENGTH = "doorlock_minrfidcodelength";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_MINRFIDCODELENGTH = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_MINRFIDCODELENGTH);

    public static final String CHANNEL_NAME_DOORLOCK_CREDENTIALRULESSUPPORT = "CredentialRulesSupport";
    public static final String CHANNEL_LABEL_DOORLOCK_CREDENTIALRULESSUPPORT = "credentialRulesSupport";
    public static final String CHANNEL_ID_DOORLOCK_CREDENTIALRULESSUPPORT = "doorlock_credentialrulessupport";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_CREDENTIALRULESSUPPORT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_CREDENTIALRULESSUPPORT);

    public static final String CHANNEL_NAME_DOORLOCK_NUMBEROFCREDENTIALSSUPPORTEDPERUSER = "NumberOfCredentialsSupportedPerUser";
    public static final String CHANNEL_LABEL_DOORLOCK_NUMBEROFCREDENTIALSSUPPORTEDPERUSER = "numberOfCredentialsSupportedPerUser";
    public static final String CHANNEL_ID_DOORLOCK_NUMBEROFCREDENTIALSSUPPORTEDPERUSER = "doorlock_numberofcredentialssupportedperuser";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_NUMBEROFCREDENTIALSSUPPORTEDPERUSER = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_NUMBEROFCREDENTIALSSUPPORTEDPERUSER);

    public static final String CHANNEL_NAME_DOORLOCK_ENABLELOGGING = "EnableLogging";
    public static final String CHANNEL_LABEL_DOORLOCK_ENABLELOGGING = "enableLogging";
    public static final String CHANNEL_ID_DOORLOCK_ENABLELOGGING = "doorlock_enablelogging";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_ENABLELOGGING = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_ENABLELOGGING);

    public static final String CHANNEL_NAME_DOORLOCK_LANGUAGE = "Language";
    public static final String CHANNEL_LABEL_DOORLOCK_LANGUAGE = "language";
    public static final String CHANNEL_ID_DOORLOCK_LANGUAGE = "doorlock_language";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_LANGUAGE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_LANGUAGE);

    public static final String CHANNEL_NAME_DOORLOCK_LEDSETTINGS = "LedSettings";
    public static final String CHANNEL_LABEL_DOORLOCK_LEDSETTINGS = "ledSettings";
    public static final String CHANNEL_ID_DOORLOCK_LEDSETTINGS = "doorlock_ledsettings";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_LEDSETTINGS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_LEDSETTINGS);

    public static final String CHANNEL_NAME_DOORLOCK_AUTORELOCKTIME = "AutoRelockTime";
    public static final String CHANNEL_LABEL_DOORLOCK_AUTORELOCKTIME = "autoRelockTime";
    public static final String CHANNEL_ID_DOORLOCK_AUTORELOCKTIME = "doorlock_autorelocktime";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_AUTORELOCKTIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_AUTORELOCKTIME);

    public static final String CHANNEL_NAME_DOORLOCK_SOUNDVOLUME = "SoundVolume";
    public static final String CHANNEL_LABEL_DOORLOCK_SOUNDVOLUME = "soundVolume";
    public static final String CHANNEL_ID_DOORLOCK_SOUNDVOLUME = "doorlock_soundvolume";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_SOUNDVOLUME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_SOUNDVOLUME);

    public static final String CHANNEL_NAME_DOORLOCK_OPERATINGMODE = "OperatingMode";
    public static final String CHANNEL_LABEL_DOORLOCK_OPERATINGMODE = "operatingMode";
    public static final String CHANNEL_ID_DOORLOCK_OPERATINGMODE = "doorlock_operatingmode";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_OPERATINGMODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_OPERATINGMODE);

    public static final String CHANNEL_NAME_DOORLOCK_SUPPORTEDOPERATINGMODES = "SupportedOperatingModes";
    public static final String CHANNEL_LABEL_DOORLOCK_SUPPORTEDOPERATINGMODES = "supportedOperatingModes";
    public static final String CHANNEL_ID_DOORLOCK_SUPPORTEDOPERATINGMODES = "doorlock_supportedoperatingmodes";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_SUPPORTEDOPERATINGMODES = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_SUPPORTEDOPERATINGMODES);

    public static final String CHANNEL_NAME_DOORLOCK_DEFAULTCONFIGURATIONREGISTER = "DefaultConfigurationRegister";
    public static final String CHANNEL_LABEL_DOORLOCK_DEFAULTCONFIGURATIONREGISTER = "defaultConfigurationRegister";
    public static final String CHANNEL_ID_DOORLOCK_DEFAULTCONFIGURATIONREGISTER = "doorlock_defaultconfigurationregister";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_DEFAULTCONFIGURATIONREGISTER = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_DEFAULTCONFIGURATIONREGISTER);

    public static final String CHANNEL_NAME_DOORLOCK_ENABLELOCALPROGRAMMING = "EnableLocalProgramming";
    public static final String CHANNEL_LABEL_DOORLOCK_ENABLELOCALPROGRAMMING = "enableLocalProgramming";
    public static final String CHANNEL_ID_DOORLOCK_ENABLELOCALPROGRAMMING = "doorlock_enablelocalprogramming";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_ENABLELOCALPROGRAMMING = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_ENABLELOCALPROGRAMMING);

    public static final String CHANNEL_NAME_DOORLOCK_ENABLEONETOUCHLOCKING = "EnableOneTouchLocking";
    public static final String CHANNEL_LABEL_DOORLOCK_ENABLEONETOUCHLOCKING = "enableOneTouchLocking";
    public static final String CHANNEL_ID_DOORLOCK_ENABLEONETOUCHLOCKING = "doorlock_enableonetouchlocking";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_ENABLEONETOUCHLOCKING = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_ENABLEONETOUCHLOCKING);

    public static final String CHANNEL_NAME_DOORLOCK_ENABLEINSIDESTATUSLED = "EnableInsideStatusLed";
    public static final String CHANNEL_LABEL_DOORLOCK_ENABLEINSIDESTATUSLED = "enableInsideStatusLed";
    public static final String CHANNEL_ID_DOORLOCK_ENABLEINSIDESTATUSLED = "doorlock_enableinsidestatusled";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_ENABLEINSIDESTATUSLED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_ENABLEINSIDESTATUSLED);

    public static final String CHANNEL_NAME_DOORLOCK_ENABLEPRIVACYMODEBUTTON = "EnablePrivacyModeButton";
    public static final String CHANNEL_LABEL_DOORLOCK_ENABLEPRIVACYMODEBUTTON = "enablePrivacyModeButton";
    public static final String CHANNEL_ID_DOORLOCK_ENABLEPRIVACYMODEBUTTON = "doorlock_enableprivacymodebutton";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_ENABLEPRIVACYMODEBUTTON = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_ENABLEPRIVACYMODEBUTTON);

    public static final String CHANNEL_NAME_DOORLOCK_LOCALPROGRAMMINGFEATURES = "LocalProgrammingFeatures";
    public static final String CHANNEL_LABEL_DOORLOCK_LOCALPROGRAMMINGFEATURES = "localProgrammingFeatures";
    public static final String CHANNEL_ID_DOORLOCK_LOCALPROGRAMMINGFEATURES = "doorlock_localprogrammingfeatures";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_LOCALPROGRAMMINGFEATURES = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_LOCALPROGRAMMINGFEATURES);

    public static final String CHANNEL_NAME_DOORLOCK_WRONGCODEENTRYLIMIT = "WrongCodeEntryLimit";
    public static final String CHANNEL_LABEL_DOORLOCK_WRONGCODEENTRYLIMIT = "wrongCodeEntryLimit";
    public static final String CHANNEL_ID_DOORLOCK_WRONGCODEENTRYLIMIT = "doorlock_wrongcodeentrylimit";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_WRONGCODEENTRYLIMIT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_WRONGCODEENTRYLIMIT);

    public static final String CHANNEL_NAME_DOORLOCK_USERCODETEMPORARYDISABLETIME = "UserCodeTemporaryDisableTime";
    public static final String CHANNEL_LABEL_DOORLOCK_USERCODETEMPORARYDISABLETIME = "userCodeTemporaryDisableTime";
    public static final String CHANNEL_ID_DOORLOCK_USERCODETEMPORARYDISABLETIME = "doorlock_usercodetemporarydisabletime";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_USERCODETEMPORARYDISABLETIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_USERCODETEMPORARYDISABLETIME);

    public static final String CHANNEL_NAME_DOORLOCK_SENDPINOVERTHEAIR = "SendPinOverTheAir";
    public static final String CHANNEL_LABEL_DOORLOCK_SENDPINOVERTHEAIR = "sendPinOverTheAir";
    public static final String CHANNEL_ID_DOORLOCK_SENDPINOVERTHEAIR = "doorlock_sendpinovertheair";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_SENDPINOVERTHEAIR = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_SENDPINOVERTHEAIR);

    public static final String CHANNEL_NAME_DOORLOCK_REQUIREPINFORREMOTEOPERATION = "RequirePinForRemoteOperation";
    public static final String CHANNEL_LABEL_DOORLOCK_REQUIREPINFORREMOTEOPERATION = "requirePinForRemoteOperation";
    public static final String CHANNEL_ID_DOORLOCK_REQUIREPINFORREMOTEOPERATION = "doorlock_requirepinforremoteoperation";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_REQUIREPINFORREMOTEOPERATION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_REQUIREPINFORREMOTEOPERATION);

    public static final String CHANNEL_NAME_DOORLOCK_EXPIRINGUSERTIMEOUT = "ExpiringUserTimeout";
    public static final String CHANNEL_LABEL_DOORLOCK_EXPIRINGUSERTIMEOUT = "expiringUserTimeout";
    public static final String CHANNEL_ID_DOORLOCK_EXPIRINGUSERTIMEOUT = "doorlock_expiringusertimeout";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_EXPIRINGUSERTIMEOUT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_EXPIRINGUSERTIMEOUT);

    public static final String CHANNEL_NAME_DOORLOCK_ALARMMASK = "AlarmMask";
    public static final String CHANNEL_LABEL_DOORLOCK_ALARMMASK = "alarmMask";
    public static final String CHANNEL_ID_DOORLOCK_ALARMMASK = "doorlock_alarmmask";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_ALARMMASK = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_ALARMMASK);

    public static final String CHANNEL_NAME_DOORLOCK_KEYPADOPERATIONEVENTMASK = "KeypadOperationEventMask";
    public static final String CHANNEL_LABEL_DOORLOCK_KEYPADOPERATIONEVENTMASK = "keypadOperationEventMask";
    public static final String CHANNEL_ID_DOORLOCK_KEYPADOPERATIONEVENTMASK = "doorlock_keypadoperationeventmask";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_KEYPADOPERATIONEVENTMASK = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_KEYPADOPERATIONEVENTMASK);

    public static final String CHANNEL_NAME_DOORLOCK_REMOTEOPERATIONEVENTMASK = "RemoteOperationEventMask";
    public static final String CHANNEL_LABEL_DOORLOCK_REMOTEOPERATIONEVENTMASK = "remoteOperationEventMask";
    public static final String CHANNEL_ID_DOORLOCK_REMOTEOPERATIONEVENTMASK = "doorlock_remoteoperationeventmask";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_REMOTEOPERATIONEVENTMASK = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_REMOTEOPERATIONEVENTMASK);

    public static final String CHANNEL_NAME_DOORLOCK_MANUALOPERATIONEVENTMASK = "ManualOperationEventMask";
    public static final String CHANNEL_LABEL_DOORLOCK_MANUALOPERATIONEVENTMASK = "manualOperationEventMask";
    public static final String CHANNEL_ID_DOORLOCK_MANUALOPERATIONEVENTMASK = "doorlock_manualoperationeventmask";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_MANUALOPERATIONEVENTMASK = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_MANUALOPERATIONEVENTMASK);

    public static final String CHANNEL_NAME_DOORLOCK_RFIDOPERATIONEVENTMASK = "RfidOperationEventMask";
    public static final String CHANNEL_LABEL_DOORLOCK_RFIDOPERATIONEVENTMASK = "rfidOperationEventMask";
    public static final String CHANNEL_ID_DOORLOCK_RFIDOPERATIONEVENTMASK = "doorlock_rfidoperationeventmask";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_RFIDOPERATIONEVENTMASK = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_RFIDOPERATIONEVENTMASK);

    public static final String CHANNEL_NAME_DOORLOCK_KEYPADPROGRAMMINGEVENTMASK = "KeypadProgrammingEventMask";
    public static final String CHANNEL_LABEL_DOORLOCK_KEYPADPROGRAMMINGEVENTMASK = "keypadProgrammingEventMask";
    public static final String CHANNEL_ID_DOORLOCK_KEYPADPROGRAMMINGEVENTMASK = "doorlock_keypadprogrammingeventmask";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_KEYPADPROGRAMMINGEVENTMASK = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_KEYPADPROGRAMMINGEVENTMASK);

    public static final String CHANNEL_NAME_DOORLOCK_REMOTEPROGRAMMINGEVENTMASK = "RemoteProgrammingEventMask";
    public static final String CHANNEL_LABEL_DOORLOCK_REMOTEPROGRAMMINGEVENTMASK = "remoteProgrammingEventMask";
    public static final String CHANNEL_ID_DOORLOCK_REMOTEPROGRAMMINGEVENTMASK = "doorlock_remoteprogrammingeventmask";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_REMOTEPROGRAMMINGEVENTMASK = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_REMOTEPROGRAMMINGEVENTMASK);

    public static final String CHANNEL_NAME_DOORLOCK_RFIDPROGRAMMINGEVENTMASK = "RfidProgrammingEventMask";
    public static final String CHANNEL_LABEL_DOORLOCK_RFIDPROGRAMMINGEVENTMASK = "rfidProgrammingEventMask";
    public static final String CHANNEL_ID_DOORLOCK_RFIDPROGRAMMINGEVENTMASK = "doorlock_rfidprogrammingeventmask";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_RFIDPROGRAMMINGEVENTMASK = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DOORLOCK_RFIDPROGRAMMINGEVENTMASK);

    // WindowCovering Cluster

    public static final String CHANNEL_NAME_WINDOWCOVERING_TYPE = "Type";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_TYPE = "type";
    public static final String CHANNEL_ID_WINDOWCOVERING_TYPE = "windowcovering_type";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_TYPE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WINDOWCOVERING_TYPE);

    public static final String CHANNEL_NAME_WINDOWCOVERING_PHYSICALCLOSEDLIMITLIFT = "PhysicalClosedLimitLift";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_PHYSICALCLOSEDLIMITLIFT = "physicalClosedLimitLift";
    public static final String CHANNEL_ID_WINDOWCOVERING_PHYSICALCLOSEDLIMITLIFT = "windowcovering_physicalclosedlimitlift";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_PHYSICALCLOSEDLIMITLIFT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WINDOWCOVERING_PHYSICALCLOSEDLIMITLIFT);

    public static final String CHANNEL_NAME_WINDOWCOVERING_PHYSICALCLOSEDLIMITTILT = "PhysicalClosedLimitTilt";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_PHYSICALCLOSEDLIMITTILT = "physicalClosedLimitTilt";
    public static final String CHANNEL_ID_WINDOWCOVERING_PHYSICALCLOSEDLIMITTILT = "windowcovering_physicalclosedlimittilt";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_PHYSICALCLOSEDLIMITTILT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WINDOWCOVERING_PHYSICALCLOSEDLIMITTILT);

    public static final String CHANNEL_NAME_WINDOWCOVERING_CURRENTPOSITIONLIFT = "CurrentPositionLift";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_CURRENTPOSITIONLIFT = "currentPositionLift";
    public static final String CHANNEL_ID_WINDOWCOVERING_CURRENTPOSITIONLIFT = "windowcovering_currentpositionlift";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_CURRENTPOSITIONLIFT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WINDOWCOVERING_CURRENTPOSITIONLIFT);

    public static final String CHANNEL_NAME_WINDOWCOVERING_CURRENTPOSITIONTILT = "CurrentPositionTilt";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_CURRENTPOSITIONTILT = "currentPositionTilt";
    public static final String CHANNEL_ID_WINDOWCOVERING_CURRENTPOSITIONTILT = "windowcovering_currentpositiontilt";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_CURRENTPOSITIONTILT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WINDOWCOVERING_CURRENTPOSITIONTILT);

    public static final String CHANNEL_NAME_WINDOWCOVERING_NUMBEROFACTUATIONSLIFT = "NumberOfActuationsLift";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_NUMBEROFACTUATIONSLIFT = "numberOfActuationsLift";
    public static final String CHANNEL_ID_WINDOWCOVERING_NUMBEROFACTUATIONSLIFT = "windowcovering_numberofactuationslift";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_NUMBEROFACTUATIONSLIFT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WINDOWCOVERING_NUMBEROFACTUATIONSLIFT);

    public static final String CHANNEL_NAME_WINDOWCOVERING_NUMBEROFACTUATIONSTILT = "NumberOfActuationsTilt";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_NUMBEROFACTUATIONSTILT = "numberOfActuationsTilt";
    public static final String CHANNEL_ID_WINDOWCOVERING_NUMBEROFACTUATIONSTILT = "windowcovering_numberofactuationstilt";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_NUMBEROFACTUATIONSTILT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WINDOWCOVERING_NUMBEROFACTUATIONSTILT);

    public static final String CHANNEL_NAME_WINDOWCOVERING_CONFIGSTATUS = "ConfigStatus";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_CONFIGSTATUS = "configStatus";
    public static final String CHANNEL_ID_WINDOWCOVERING_CONFIGSTATUS = "windowcovering_configstatus";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_CONFIGSTATUS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WINDOWCOVERING_CONFIGSTATUS);

    public static final String CHANNEL_NAME_WINDOWCOVERING_CURRENTPOSITIONLIFTPERCENTAGE = "CurrentPositionLiftPercentage";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_CURRENTPOSITIONLIFTPERCENTAGE = "currentPositionLiftPercentage";
    public static final String CHANNEL_ID_WINDOWCOVERING_CURRENTPOSITIONLIFTPERCENTAGE = "windowcovering_currentpositionliftpercentage";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_CURRENTPOSITIONLIFTPERCENTAGE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WINDOWCOVERING_CURRENTPOSITIONLIFTPERCENTAGE);

    public static final String CHANNEL_NAME_WINDOWCOVERING_CURRENTPOSITIONTILTPERCENTAGE = "CurrentPositionTiltPercentage";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_CURRENTPOSITIONTILTPERCENTAGE = "currentPositionTiltPercentage";
    public static final String CHANNEL_ID_WINDOWCOVERING_CURRENTPOSITIONTILTPERCENTAGE = "windowcovering_currentpositiontiltpercentage";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_CURRENTPOSITIONTILTPERCENTAGE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WINDOWCOVERING_CURRENTPOSITIONTILTPERCENTAGE);

    public static final String CHANNEL_NAME_WINDOWCOVERING_OPERATIONALSTATUS = "OperationalStatus";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_OPERATIONALSTATUS = "operationalStatus";
    public static final String CHANNEL_ID_WINDOWCOVERING_OPERATIONALSTATUS = "windowcovering_operationalstatus";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_OPERATIONALSTATUS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WINDOWCOVERING_OPERATIONALSTATUS);

    public static final String CHANNEL_NAME_WINDOWCOVERING_TARGETPOSITIONLIFTPERCENT100THS = "TargetPositionLiftPercent100ths";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_TARGETPOSITIONLIFTPERCENT100THS = "targetPositionLiftPercent100ths";
    public static final String CHANNEL_ID_WINDOWCOVERING_TARGETPOSITIONLIFTPERCENT100THS = "windowcovering_targetpositionliftpercent100ths";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_TARGETPOSITIONLIFTPERCENT100THS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WINDOWCOVERING_TARGETPOSITIONLIFTPERCENT100THS);

    public static final String CHANNEL_NAME_WINDOWCOVERING_TARGETPOSITIONTILTPERCENT100THS = "TargetPositionTiltPercent100ths";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_TARGETPOSITIONTILTPERCENT100THS = "targetPositionTiltPercent100ths";
    public static final String CHANNEL_ID_WINDOWCOVERING_TARGETPOSITIONTILTPERCENT100THS = "windowcovering_targetpositiontiltpercent100ths";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_TARGETPOSITIONTILTPERCENT100THS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WINDOWCOVERING_TARGETPOSITIONTILTPERCENT100THS);

    public static final String CHANNEL_NAME_WINDOWCOVERING_ENDPRODUCTTYPE = "EndProductType";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_ENDPRODUCTTYPE = "endProductType";
    public static final String CHANNEL_ID_WINDOWCOVERING_ENDPRODUCTTYPE = "windowcovering_endproducttype";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_ENDPRODUCTTYPE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WINDOWCOVERING_ENDPRODUCTTYPE);

    public static final String CHANNEL_NAME_WINDOWCOVERING_CURRENTPOSITIONLIFTPERCENT100THS = "CurrentPositionLiftPercent100ths";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_CURRENTPOSITIONLIFTPERCENT100THS = "currentPositionLiftPercent100ths";
    public static final String CHANNEL_ID_WINDOWCOVERING_CURRENTPOSITIONLIFTPERCENT100THS = "windowcovering_currentpositionliftpercent100ths";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_CURRENTPOSITIONLIFTPERCENT100THS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WINDOWCOVERING_CURRENTPOSITIONLIFTPERCENT100THS);

    public static final String CHANNEL_NAME_WINDOWCOVERING_CURRENTPOSITIONTILTPERCENT100THS = "CurrentPositionTiltPercent100ths";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_CURRENTPOSITIONTILTPERCENT100THS = "currentPositionTiltPercent100ths";
    public static final String CHANNEL_ID_WINDOWCOVERING_CURRENTPOSITIONTILTPERCENT100THS = "windowcovering_currentpositiontiltpercent100ths";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_CURRENTPOSITIONTILTPERCENT100THS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WINDOWCOVERING_CURRENTPOSITIONTILTPERCENT100THS);

    public static final String CHANNEL_NAME_WINDOWCOVERING_INSTALLEDOPENLIMITLIFT = "InstalledOpenLimitLift";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_INSTALLEDOPENLIMITLIFT = "installedOpenLimitLift";
    public static final String CHANNEL_ID_WINDOWCOVERING_INSTALLEDOPENLIMITLIFT = "windowcovering_installedopenlimitlift";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_INSTALLEDOPENLIMITLIFT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WINDOWCOVERING_INSTALLEDOPENLIMITLIFT);

    public static final String CHANNEL_NAME_WINDOWCOVERING_INSTALLEDCLOSEDLIMITLIFT = "InstalledClosedLimitLift";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_INSTALLEDCLOSEDLIMITLIFT = "installedClosedLimitLift";
    public static final String CHANNEL_ID_WINDOWCOVERING_INSTALLEDCLOSEDLIMITLIFT = "windowcovering_installedclosedlimitlift";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_INSTALLEDCLOSEDLIMITLIFT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WINDOWCOVERING_INSTALLEDCLOSEDLIMITLIFT);

    public static final String CHANNEL_NAME_WINDOWCOVERING_INSTALLEDOPENLIMITTILT = "InstalledOpenLimitTilt";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_INSTALLEDOPENLIMITTILT = "installedOpenLimitTilt";
    public static final String CHANNEL_ID_WINDOWCOVERING_INSTALLEDOPENLIMITTILT = "windowcovering_installedopenlimittilt";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_INSTALLEDOPENLIMITTILT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WINDOWCOVERING_INSTALLEDOPENLIMITTILT);

    public static final String CHANNEL_NAME_WINDOWCOVERING_INSTALLEDCLOSEDLIMITTILT = "InstalledClosedLimitTilt";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_INSTALLEDCLOSEDLIMITTILT = "installedClosedLimitTilt";
    public static final String CHANNEL_ID_WINDOWCOVERING_INSTALLEDCLOSEDLIMITTILT = "windowcovering_installedclosedlimittilt";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_INSTALLEDCLOSEDLIMITTILT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WINDOWCOVERING_INSTALLEDCLOSEDLIMITTILT);

    public static final String CHANNEL_NAME_WINDOWCOVERING_MODE = "Mode";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_MODE = "mode";
    public static final String CHANNEL_ID_WINDOWCOVERING_MODE = "windowcovering_mode";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_MODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WINDOWCOVERING_MODE);

    public static final String CHANNEL_NAME_WINDOWCOVERING_SAFETYSTATUS = "SafetyStatus";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_SAFETYSTATUS = "safetyStatus";
    public static final String CHANNEL_ID_WINDOWCOVERING_SAFETYSTATUS = "windowcovering_safetystatus";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_SAFETYSTATUS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WINDOWCOVERING_SAFETYSTATUS);

    // AccountLogin Cluster

    // ApplicationBasic Cluster

    public static final String CHANNEL_NAME_APPLICATIONBASIC_VENDORNAME = "VendorName";
    public static final String CHANNEL_LABEL_APPLICATIONBASIC_VENDORNAME = "vendorName";
    public static final String CHANNEL_ID_APPLICATIONBASIC_VENDORNAME = "applicationbasic_vendorname";
    public static final ChannelTypeUID CHANNEL_APPLICATIONBASIC_VENDORNAME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_APPLICATIONBASIC_VENDORNAME);

    public static final String CHANNEL_NAME_APPLICATIONBASIC_VENDORID = "VendorId";
    public static final String CHANNEL_LABEL_APPLICATIONBASIC_VENDORID = "vendorId";
    public static final String CHANNEL_ID_APPLICATIONBASIC_VENDORID = "applicationbasic_vendorid";
    public static final ChannelTypeUID CHANNEL_APPLICATIONBASIC_VENDORID = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_APPLICATIONBASIC_VENDORID);

    public static final String CHANNEL_NAME_APPLICATIONBASIC_APPLICATIONNAME = "ApplicationName";
    public static final String CHANNEL_LABEL_APPLICATIONBASIC_APPLICATIONNAME = "applicationName";
    public static final String CHANNEL_ID_APPLICATIONBASIC_APPLICATIONNAME = "applicationbasic_applicationname";
    public static final ChannelTypeUID CHANNEL_APPLICATIONBASIC_APPLICATIONNAME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_APPLICATIONBASIC_APPLICATIONNAME);

    public static final String CHANNEL_NAME_APPLICATIONBASIC_PRODUCTID = "ProductId";
    public static final String CHANNEL_LABEL_APPLICATIONBASIC_PRODUCTID = "productId";
    public static final String CHANNEL_ID_APPLICATIONBASIC_PRODUCTID = "applicationbasic_productid";
    public static final ChannelTypeUID CHANNEL_APPLICATIONBASIC_PRODUCTID = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_APPLICATIONBASIC_PRODUCTID);

    public static final String CHANNEL_NAME_APPLICATIONBASIC_APPLICATION = "Application";
    public static final String CHANNEL_LABEL_APPLICATIONBASIC_APPLICATION = "application";
    public static final String CHANNEL_ID_APPLICATIONBASIC_APPLICATION = "applicationbasic_application";
    public static final ChannelTypeUID CHANNEL_APPLICATIONBASIC_APPLICATION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_APPLICATIONBASIC_APPLICATION);

    public static final String CHANNEL_NAME_APPLICATIONBASIC_STATUS = "Status";
    public static final String CHANNEL_LABEL_APPLICATIONBASIC_STATUS = "status";
    public static final String CHANNEL_ID_APPLICATIONBASIC_STATUS = "applicationbasic_status";
    public static final ChannelTypeUID CHANNEL_APPLICATIONBASIC_STATUS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_APPLICATIONBASIC_STATUS);

    public static final String CHANNEL_NAME_APPLICATIONBASIC_APPLICATIONVERSION = "ApplicationVersion";
    public static final String CHANNEL_LABEL_APPLICATIONBASIC_APPLICATIONVERSION = "applicationVersion";
    public static final String CHANNEL_ID_APPLICATIONBASIC_APPLICATIONVERSION = "applicationbasic_applicationversion";
    public static final ChannelTypeUID CHANNEL_APPLICATIONBASIC_APPLICATIONVERSION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_APPLICATIONBASIC_APPLICATIONVERSION);

    public static final String CHANNEL_NAME_APPLICATIONBASIC_ALLOWEDVENDORLIST = "AllowedVendorList";
    public static final String CHANNEL_LABEL_APPLICATIONBASIC_ALLOWEDVENDORLIST = "allowedVendorList";
    public static final String CHANNEL_ID_APPLICATIONBASIC_ALLOWEDVENDORLIST = "applicationbasic_allowedvendorlist";
    public static final ChannelTypeUID CHANNEL_APPLICATIONBASIC_ALLOWEDVENDORLIST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_APPLICATIONBASIC_ALLOWEDVENDORLIST);

    // ApplicationLauncher Cluster

    public static final String CHANNEL_NAME_APPLICATIONLAUNCHER_CATALOGLIST = "CatalogList";
    public static final String CHANNEL_LABEL_APPLICATIONLAUNCHER_CATALOGLIST = "catalogList";
    public static final String CHANNEL_ID_APPLICATIONLAUNCHER_CATALOGLIST = "applicationlauncher_cataloglist";
    public static final ChannelTypeUID CHANNEL_APPLICATIONLAUNCHER_CATALOGLIST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_APPLICATIONLAUNCHER_CATALOGLIST);

    public static final String CHANNEL_NAME_APPLICATIONLAUNCHER_CURRENTAPP = "CurrentApp";
    public static final String CHANNEL_LABEL_APPLICATIONLAUNCHER_CURRENTAPP = "currentApp";
    public static final String CHANNEL_ID_APPLICATIONLAUNCHER_CURRENTAPP = "applicationlauncher_currentapp";
    public static final ChannelTypeUID CHANNEL_APPLICATIONLAUNCHER_CURRENTAPP = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_APPLICATIONLAUNCHER_CURRENTAPP);

    // AudioOutput Cluster

    public static final String CHANNEL_NAME_AUDIOOUTPUT_OUTPUTLIST = "OutputList";
    public static final String CHANNEL_LABEL_AUDIOOUTPUT_OUTPUTLIST = "outputList";
    public static final String CHANNEL_ID_AUDIOOUTPUT_OUTPUTLIST = "audiooutput_outputlist";
    public static final ChannelTypeUID CHANNEL_AUDIOOUTPUT_OUTPUTLIST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_AUDIOOUTPUT_OUTPUTLIST);

    public static final String CHANNEL_NAME_AUDIOOUTPUT_CURRENTOUTPUT = "CurrentOutput";
    public static final String CHANNEL_LABEL_AUDIOOUTPUT_CURRENTOUTPUT = "currentOutput";
    public static final String CHANNEL_ID_AUDIOOUTPUT_CURRENTOUTPUT = "audiooutput_currentoutput";
    public static final ChannelTypeUID CHANNEL_AUDIOOUTPUT_CURRENTOUTPUT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_AUDIOOUTPUT_CURRENTOUTPUT);

    // KeypadInput Cluster

    // MediaInput Cluster

    public static final String CHANNEL_NAME_MEDIAINPUT_INPUTLIST = "InputList";
    public static final String CHANNEL_LABEL_MEDIAINPUT_INPUTLIST = "inputList";
    public static final String CHANNEL_ID_MEDIAINPUT_INPUTLIST = "mediainput_inputlist";
    public static final ChannelTypeUID CHANNEL_MEDIAINPUT_INPUTLIST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MEDIAINPUT_INPUTLIST);

    public static final String CHANNEL_NAME_MEDIAINPUT_CURRENTINPUT = "CurrentInput";
    public static final String CHANNEL_LABEL_MEDIAINPUT_CURRENTINPUT = "currentInput";
    public static final String CHANNEL_ID_MEDIAINPUT_CURRENTINPUT = "mediainput_currentinput";
    public static final ChannelTypeUID CHANNEL_MEDIAINPUT_CURRENTINPUT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MEDIAINPUT_CURRENTINPUT);

    // MediaPlayback Cluster

    public static final String CHANNEL_NAME_MEDIAPLAYBACK_CURRENTSTATE = "CurrentState";
    public static final String CHANNEL_LABEL_MEDIAPLAYBACK_CURRENTSTATE = "currentState";
    public static final String CHANNEL_ID_MEDIAPLAYBACK_CURRENTSTATE = "mediaplayback_currentstate";
    public static final ChannelTypeUID CHANNEL_MEDIAPLAYBACK_CURRENTSTATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MEDIAPLAYBACK_CURRENTSTATE);

    public static final String CHANNEL_NAME_MEDIAPLAYBACK_STARTTIME = "StartTime";
    public static final String CHANNEL_LABEL_MEDIAPLAYBACK_STARTTIME = "startTime";
    public static final String CHANNEL_ID_MEDIAPLAYBACK_STARTTIME = "mediaplayback_starttime";
    public static final ChannelTypeUID CHANNEL_MEDIAPLAYBACK_STARTTIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MEDIAPLAYBACK_STARTTIME);

    public static final String CHANNEL_NAME_MEDIAPLAYBACK_DURATION = "Duration";
    public static final String CHANNEL_LABEL_MEDIAPLAYBACK_DURATION = "duration";
    public static final String CHANNEL_ID_MEDIAPLAYBACK_DURATION = "mediaplayback_duration";
    public static final ChannelTypeUID CHANNEL_MEDIAPLAYBACK_DURATION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MEDIAPLAYBACK_DURATION);

    public static final String CHANNEL_NAME_MEDIAPLAYBACK_SAMPLEDPOSITION = "SampledPosition";
    public static final String CHANNEL_LABEL_MEDIAPLAYBACK_SAMPLEDPOSITION = "sampledPosition";
    public static final String CHANNEL_ID_MEDIAPLAYBACK_SAMPLEDPOSITION = "mediaplayback_sampledposition";
    public static final ChannelTypeUID CHANNEL_MEDIAPLAYBACK_SAMPLEDPOSITION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MEDIAPLAYBACK_SAMPLEDPOSITION);

    public static final String CHANNEL_NAME_MEDIAPLAYBACK_PLAYBACKSPEED = "PlaybackSpeed";
    public static final String CHANNEL_LABEL_MEDIAPLAYBACK_PLAYBACKSPEED = "playbackSpeed";
    public static final String CHANNEL_ID_MEDIAPLAYBACK_PLAYBACKSPEED = "mediaplayback_playbackspeed";
    public static final ChannelTypeUID CHANNEL_MEDIAPLAYBACK_PLAYBACKSPEED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MEDIAPLAYBACK_PLAYBACKSPEED);

    public static final String CHANNEL_NAME_MEDIAPLAYBACK_SEEKRANGEEND = "SeekRangeEnd";
    public static final String CHANNEL_LABEL_MEDIAPLAYBACK_SEEKRANGEEND = "seekRangeEnd";
    public static final String CHANNEL_ID_MEDIAPLAYBACK_SEEKRANGEEND = "mediaplayback_seekrangeend";
    public static final ChannelTypeUID CHANNEL_MEDIAPLAYBACK_SEEKRANGEEND = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MEDIAPLAYBACK_SEEKRANGEEND);

    public static final String CHANNEL_NAME_MEDIAPLAYBACK_SEEKRANGESTART = "SeekRangeStart";
    public static final String CHANNEL_LABEL_MEDIAPLAYBACK_SEEKRANGESTART = "seekRangeStart";
    public static final String CHANNEL_ID_MEDIAPLAYBACK_SEEKRANGESTART = "mediaplayback_seekrangestart";
    public static final ChannelTypeUID CHANNEL_MEDIAPLAYBACK_SEEKRANGESTART = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MEDIAPLAYBACK_SEEKRANGESTART);

    public static final String CHANNEL_NAME_MEDIAPLAYBACK_ACTIVEAUDIOTRACK = "ActiveAudioTrack";
    public static final String CHANNEL_LABEL_MEDIAPLAYBACK_ACTIVEAUDIOTRACK = "activeAudioTrack";
    public static final String CHANNEL_ID_MEDIAPLAYBACK_ACTIVEAUDIOTRACK = "mediaplayback_activeaudiotrack";
    public static final ChannelTypeUID CHANNEL_MEDIAPLAYBACK_ACTIVEAUDIOTRACK = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MEDIAPLAYBACK_ACTIVEAUDIOTRACK);

    public static final String CHANNEL_NAME_MEDIAPLAYBACK_AVAILABLEAUDIOTRACKS = "AvailableAudioTracks";
    public static final String CHANNEL_LABEL_MEDIAPLAYBACK_AVAILABLEAUDIOTRACKS = "availableAudioTracks";
    public static final String CHANNEL_ID_MEDIAPLAYBACK_AVAILABLEAUDIOTRACKS = "mediaplayback_availableaudiotracks";
    public static final ChannelTypeUID CHANNEL_MEDIAPLAYBACK_AVAILABLEAUDIOTRACKS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MEDIAPLAYBACK_AVAILABLEAUDIOTRACKS);

    public static final String CHANNEL_NAME_MEDIAPLAYBACK_ACTIVETEXTTRACK = "ActiveTextTrack";
    public static final String CHANNEL_LABEL_MEDIAPLAYBACK_ACTIVETEXTTRACK = "activeTextTrack";
    public static final String CHANNEL_ID_MEDIAPLAYBACK_ACTIVETEXTTRACK = "mediaplayback_activetexttrack";
    public static final ChannelTypeUID CHANNEL_MEDIAPLAYBACK_ACTIVETEXTTRACK = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MEDIAPLAYBACK_ACTIVETEXTTRACK);

    public static final String CHANNEL_NAME_MEDIAPLAYBACK_AVAILABLETEXTTRACKS = "AvailableTextTracks";
    public static final String CHANNEL_LABEL_MEDIAPLAYBACK_AVAILABLETEXTTRACKS = "availableTextTracks";
    public static final String CHANNEL_ID_MEDIAPLAYBACK_AVAILABLETEXTTRACKS = "mediaplayback_availabletexttracks";
    public static final ChannelTypeUID CHANNEL_MEDIAPLAYBACK_AVAILABLETEXTTRACKS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MEDIAPLAYBACK_AVAILABLETEXTTRACKS);

    // TargetNavigator Cluster

    public static final String CHANNEL_NAME_TARGETNAVIGATOR_TARGETLIST = "TargetList";
    public static final String CHANNEL_LABEL_TARGETNAVIGATOR_TARGETLIST = "targetList";
    public static final String CHANNEL_ID_TARGETNAVIGATOR_TARGETLIST = "targetnavigator_targetlist";
    public static final ChannelTypeUID CHANNEL_TARGETNAVIGATOR_TARGETLIST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TARGETNAVIGATOR_TARGETLIST);

    public static final String CHANNEL_NAME_TARGETNAVIGATOR_CURRENTTARGET = "CurrentTarget";
    public static final String CHANNEL_LABEL_TARGETNAVIGATOR_CURRENTTARGET = "currentTarget";
    public static final String CHANNEL_ID_TARGETNAVIGATOR_CURRENTTARGET = "targetnavigator_currenttarget";
    public static final ChannelTypeUID CHANNEL_TARGETNAVIGATOR_CURRENTTARGET = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TARGETNAVIGATOR_CURRENTTARGET);

    // ContentAppObserver Cluster

    // ContentControl Cluster

    public static final String CHANNEL_NAME_CONTENTCONTROL_ENABLED = "Enabled";
    public static final String CHANNEL_LABEL_CONTENTCONTROL_ENABLED = "enabled";
    public static final String CHANNEL_ID_CONTENTCONTROL_ENABLED = "contentcontrol_enabled";
    public static final ChannelTypeUID CHANNEL_CONTENTCONTROL_ENABLED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_CONTENTCONTROL_ENABLED);

    public static final String CHANNEL_NAME_CONTENTCONTROL_ONDEMANDRATINGS = "OnDemandRatings";
    public static final String CHANNEL_LABEL_CONTENTCONTROL_ONDEMANDRATINGS = "onDemandRatings";
    public static final String CHANNEL_ID_CONTENTCONTROL_ONDEMANDRATINGS = "contentcontrol_ondemandratings";
    public static final ChannelTypeUID CHANNEL_CONTENTCONTROL_ONDEMANDRATINGS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_CONTENTCONTROL_ONDEMANDRATINGS);

    public static final String CHANNEL_NAME_CONTENTCONTROL_ONDEMANDRATINGTHRESHOLD = "OnDemandRatingThreshold";
    public static final String CHANNEL_LABEL_CONTENTCONTROL_ONDEMANDRATINGTHRESHOLD = "onDemandRatingThreshold";
    public static final String CHANNEL_ID_CONTENTCONTROL_ONDEMANDRATINGTHRESHOLD = "contentcontrol_ondemandratingthreshold";
    public static final ChannelTypeUID CHANNEL_CONTENTCONTROL_ONDEMANDRATINGTHRESHOLD = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_CONTENTCONTROL_ONDEMANDRATINGTHRESHOLD);

    public static final String CHANNEL_NAME_CONTENTCONTROL_SCHEDULEDCONTENTRATINGS = "ScheduledContentRatings";
    public static final String CHANNEL_LABEL_CONTENTCONTROL_SCHEDULEDCONTENTRATINGS = "scheduledContentRatings";
    public static final String CHANNEL_ID_CONTENTCONTROL_SCHEDULEDCONTENTRATINGS = "contentcontrol_scheduledcontentratings";
    public static final ChannelTypeUID CHANNEL_CONTENTCONTROL_SCHEDULEDCONTENTRATINGS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_CONTENTCONTROL_SCHEDULEDCONTENTRATINGS);

    public static final String CHANNEL_NAME_CONTENTCONTROL_SCHEDULEDCONTENTRATINGTHRESHOLD = "ScheduledContentRatingThreshold";
    public static final String CHANNEL_LABEL_CONTENTCONTROL_SCHEDULEDCONTENTRATINGTHRESHOLD = "scheduledContentRatingThreshold";
    public static final String CHANNEL_ID_CONTENTCONTROL_SCHEDULEDCONTENTRATINGTHRESHOLD = "contentcontrol_scheduledcontentratingthreshold";
    public static final ChannelTypeUID CHANNEL_CONTENTCONTROL_SCHEDULEDCONTENTRATINGTHRESHOLD = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_CONTENTCONTROL_SCHEDULEDCONTENTRATINGTHRESHOLD);

    public static final String CHANNEL_NAME_CONTENTCONTROL_SCREENDAILYTIME = "ScreenDailyTime";
    public static final String CHANNEL_LABEL_CONTENTCONTROL_SCREENDAILYTIME = "screenDailyTime";
    public static final String CHANNEL_ID_CONTENTCONTROL_SCREENDAILYTIME = "contentcontrol_screendailytime";
    public static final ChannelTypeUID CHANNEL_CONTENTCONTROL_SCREENDAILYTIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_CONTENTCONTROL_SCREENDAILYTIME);

    public static final String CHANNEL_NAME_CONTENTCONTROL_REMAININGSCREENTIME = "RemainingScreenTime";
    public static final String CHANNEL_LABEL_CONTENTCONTROL_REMAININGSCREENTIME = "remainingScreenTime";
    public static final String CHANNEL_ID_CONTENTCONTROL_REMAININGSCREENTIME = "contentcontrol_remainingscreentime";
    public static final ChannelTypeUID CHANNEL_CONTENTCONTROL_REMAININGSCREENTIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_CONTENTCONTROL_REMAININGSCREENTIME);

    public static final String CHANNEL_NAME_CONTENTCONTROL_BLOCKUNRATED = "BlockUnrated";
    public static final String CHANNEL_LABEL_CONTENTCONTROL_BLOCKUNRATED = "blockUnrated";
    public static final String CHANNEL_ID_CONTENTCONTROL_BLOCKUNRATED = "contentcontrol_blockunrated";
    public static final ChannelTypeUID CHANNEL_CONTENTCONTROL_BLOCKUNRATED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_CONTENTCONTROL_BLOCKUNRATED);

    public static final String CHANNEL_NAME_CONTENTCONTROL_BLOCKCHANNELLIST = "BlockChannelList";
    public static final String CHANNEL_LABEL_CONTENTCONTROL_BLOCKCHANNELLIST = "blockChannelList";
    public static final String CHANNEL_ID_CONTENTCONTROL_BLOCKCHANNELLIST = "contentcontrol_blockchannellist";
    public static final ChannelTypeUID CHANNEL_CONTENTCONTROL_BLOCKCHANNELLIST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_CONTENTCONTROL_BLOCKCHANNELLIST);

    public static final String CHANNEL_NAME_CONTENTCONTROL_BLOCKAPPLICATIONLIST = "BlockApplicationList";
    public static final String CHANNEL_LABEL_CONTENTCONTROL_BLOCKAPPLICATIONLIST = "blockApplicationList";
    public static final String CHANNEL_ID_CONTENTCONTROL_BLOCKAPPLICATIONLIST = "contentcontrol_blockapplicationlist";
    public static final ChannelTypeUID CHANNEL_CONTENTCONTROL_BLOCKAPPLICATIONLIST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_CONTENTCONTROL_BLOCKAPPLICATIONLIST);

    public static final String CHANNEL_NAME_CONTENTCONTROL_BLOCKCONTENTTIMEWINDOW = "BlockContentTimeWindow";
    public static final String CHANNEL_LABEL_CONTENTCONTROL_BLOCKCONTENTTIMEWINDOW = "blockContentTimeWindow";
    public static final String CHANNEL_ID_CONTENTCONTROL_BLOCKCONTENTTIMEWINDOW = "contentcontrol_blockcontenttimewindow";
    public static final ChannelTypeUID CHANNEL_CONTENTCONTROL_BLOCKCONTENTTIMEWINDOW = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_CONTENTCONTROL_BLOCKCONTENTTIMEWINDOW);

    // RvcRunMode Cluster

    // RvcCleanMode Cluster

    // RvcOperationalState Cluster

    // TemperatureControl Cluster

    public static final String CHANNEL_NAME_TEMPERATURECONTROL_TEMPERATURESETPOINT = "TemperatureSetpoint";
    public static final String CHANNEL_LABEL_TEMPERATURECONTROL_TEMPERATURESETPOINT = "temperatureSetpoint";
    public static final String CHANNEL_ID_TEMPERATURECONTROL_TEMPERATURESETPOINT = "temperaturecontrol_temperaturesetpoint";
    public static final ChannelTypeUID CHANNEL_TEMPERATURECONTROL_TEMPERATURESETPOINT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TEMPERATURECONTROL_TEMPERATURESETPOINT);

    public static final String CHANNEL_NAME_TEMPERATURECONTROL_MINTEMPERATURE = "MinTemperature";
    public static final String CHANNEL_LABEL_TEMPERATURECONTROL_MINTEMPERATURE = "minTemperature";
    public static final String CHANNEL_ID_TEMPERATURECONTROL_MINTEMPERATURE = "temperaturecontrol_mintemperature";
    public static final ChannelTypeUID CHANNEL_TEMPERATURECONTROL_MINTEMPERATURE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TEMPERATURECONTROL_MINTEMPERATURE);

    public static final String CHANNEL_NAME_TEMPERATURECONTROL_MAXTEMPERATURE = "MaxTemperature";
    public static final String CHANNEL_LABEL_TEMPERATURECONTROL_MAXTEMPERATURE = "maxTemperature";
    public static final String CHANNEL_ID_TEMPERATURECONTROL_MAXTEMPERATURE = "temperaturecontrol_maxtemperature";
    public static final ChannelTypeUID CHANNEL_TEMPERATURECONTROL_MAXTEMPERATURE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TEMPERATURECONTROL_MAXTEMPERATURE);

    public static final String CHANNEL_NAME_TEMPERATURECONTROL_STEP = "Step";
    public static final String CHANNEL_LABEL_TEMPERATURECONTROL_STEP = "step";
    public static final String CHANNEL_ID_TEMPERATURECONTROL_STEP = "temperaturecontrol_step";
    public static final ChannelTypeUID CHANNEL_TEMPERATURECONTROL_STEP = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TEMPERATURECONTROL_STEP);

    public static final String CHANNEL_NAME_TEMPERATURECONTROL_SELECTEDTEMPERATURELEVEL = "SelectedTemperatureLevel";
    public static final String CHANNEL_LABEL_TEMPERATURECONTROL_SELECTEDTEMPERATURELEVEL = "selectedTemperatureLevel";
    public static final String CHANNEL_ID_TEMPERATURECONTROL_SELECTEDTEMPERATURELEVEL = "temperaturecontrol_selectedtemperaturelevel";
    public static final ChannelTypeUID CHANNEL_TEMPERATURECONTROL_SELECTEDTEMPERATURELEVEL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TEMPERATURECONTROL_SELECTEDTEMPERATURELEVEL);

    public static final String CHANNEL_NAME_TEMPERATURECONTROL_SUPPORTEDTEMPERATURELEVELS = "SupportedTemperatureLevels";
    public static final String CHANNEL_LABEL_TEMPERATURECONTROL_SUPPORTEDTEMPERATURELEVELS = "supportedTemperatureLevels";
    public static final String CHANNEL_ID_TEMPERATURECONTROL_SUPPORTEDTEMPERATURELEVELS = "temperaturecontrol_supportedtemperaturelevels";
    public static final ChannelTypeUID CHANNEL_TEMPERATURECONTROL_SUPPORTEDTEMPERATURELEVELS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TEMPERATURECONTROL_SUPPORTEDTEMPERATURELEVELS);

    // DishwasherMode Cluster

    // DishwasherAlarm Cluster

    // LaundryWasherMode Cluster

    // LaundryWasherControls Cluster

    public static final String CHANNEL_NAME_LAUNDRYWASHERCONTROLS_SPINSPEEDS = "SpinSpeeds";
    public static final String CHANNEL_LABEL_LAUNDRYWASHERCONTROLS_SPINSPEEDS = "spinSpeeds";
    public static final String CHANNEL_ID_LAUNDRYWASHERCONTROLS_SPINSPEEDS = "laundrywashercontrols_spinspeeds";
    public static final ChannelTypeUID CHANNEL_LAUNDRYWASHERCONTROLS_SPINSPEEDS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_LAUNDRYWASHERCONTROLS_SPINSPEEDS);

    public static final String CHANNEL_NAME_LAUNDRYWASHERCONTROLS_SPINSPEEDCURRENT = "SpinSpeedCurrent";
    public static final String CHANNEL_LABEL_LAUNDRYWASHERCONTROLS_SPINSPEEDCURRENT = "spinSpeedCurrent";
    public static final String CHANNEL_ID_LAUNDRYWASHERCONTROLS_SPINSPEEDCURRENT = "laundrywashercontrols_spinspeedcurrent";
    public static final ChannelTypeUID CHANNEL_LAUNDRYWASHERCONTROLS_SPINSPEEDCURRENT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_LAUNDRYWASHERCONTROLS_SPINSPEEDCURRENT);

    public static final String CHANNEL_NAME_LAUNDRYWASHERCONTROLS_NUMBEROFRINSES = "NumberOfRinses";
    public static final String CHANNEL_LABEL_LAUNDRYWASHERCONTROLS_NUMBEROFRINSES = "numberOfRinses";
    public static final String CHANNEL_ID_LAUNDRYWASHERCONTROLS_NUMBEROFRINSES = "laundrywashercontrols_numberofrinses";
    public static final ChannelTypeUID CHANNEL_LAUNDRYWASHERCONTROLS_NUMBEROFRINSES = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_LAUNDRYWASHERCONTROLS_NUMBEROFRINSES);

    public static final String CHANNEL_NAME_LAUNDRYWASHERCONTROLS_SUPPORTEDRINSES = "SupportedRinses";
    public static final String CHANNEL_LABEL_LAUNDRYWASHERCONTROLS_SUPPORTEDRINSES = "supportedRinses";
    public static final String CHANNEL_ID_LAUNDRYWASHERCONTROLS_SUPPORTEDRINSES = "laundrywashercontrols_supportedrinses";
    public static final ChannelTypeUID CHANNEL_LAUNDRYWASHERCONTROLS_SUPPORTEDRINSES = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_LAUNDRYWASHERCONTROLS_SUPPORTEDRINSES);

    // RefrigeratorAndTemperatureControlledCabinetMode Cluster

    // RefrigeratorAlarm Cluster

    // LaundryDryerControls Cluster

    public static final String CHANNEL_NAME_LAUNDRYDRYERCONTROLS_SELECTEDDRYNESSLEVEL = "SelectedDrynessLevel";
    public static final String CHANNEL_LABEL_LAUNDRYDRYERCONTROLS_SELECTEDDRYNESSLEVEL = "selectedDrynessLevel";
    public static final String CHANNEL_ID_LAUNDRYDRYERCONTROLS_SELECTEDDRYNESSLEVEL = "laundrydryercontrols_selecteddrynesslevel";
    public static final ChannelTypeUID CHANNEL_LAUNDRYDRYERCONTROLS_SELECTEDDRYNESSLEVEL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_LAUNDRYDRYERCONTROLS_SELECTEDDRYNESSLEVEL);

    // OvenCavityOperationalState Cluster

    // OvenMode Cluster

    // MicrowaveOvenMode Cluster

    // MicrowaveOvenControl Cluster

    public static final String CHANNEL_NAME_MICROWAVEOVENCONTROL_COOKTIME = "CookTime";
    public static final String CHANNEL_LABEL_MICROWAVEOVENCONTROL_COOKTIME = "cookTime";
    public static final String CHANNEL_ID_MICROWAVEOVENCONTROL_COOKTIME = "microwaveovencontrol_cooktime";
    public static final ChannelTypeUID CHANNEL_MICROWAVEOVENCONTROL_COOKTIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MICROWAVEOVENCONTROL_COOKTIME);

    public static final String CHANNEL_NAME_MICROWAVEOVENCONTROL_MAXCOOKTIME = "MaxCookTime";
    public static final String CHANNEL_LABEL_MICROWAVEOVENCONTROL_MAXCOOKTIME = "maxCookTime";
    public static final String CHANNEL_ID_MICROWAVEOVENCONTROL_MAXCOOKTIME = "microwaveovencontrol_maxcooktime";
    public static final ChannelTypeUID CHANNEL_MICROWAVEOVENCONTROL_MAXCOOKTIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MICROWAVEOVENCONTROL_MAXCOOKTIME);

    public static final String CHANNEL_NAME_MICROWAVEOVENCONTROL_POWERSETTING = "PowerSetting";
    public static final String CHANNEL_LABEL_MICROWAVEOVENCONTROL_POWERSETTING = "powerSetting";
    public static final String CHANNEL_ID_MICROWAVEOVENCONTROL_POWERSETTING = "microwaveovencontrol_powersetting";
    public static final ChannelTypeUID CHANNEL_MICROWAVEOVENCONTROL_POWERSETTING = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MICROWAVEOVENCONTROL_POWERSETTING);

    public static final String CHANNEL_NAME_MICROWAVEOVENCONTROL_MINPOWER = "MinPower";
    public static final String CHANNEL_LABEL_MICROWAVEOVENCONTROL_MINPOWER = "minPower";
    public static final String CHANNEL_ID_MICROWAVEOVENCONTROL_MINPOWER = "microwaveovencontrol_minpower";
    public static final ChannelTypeUID CHANNEL_MICROWAVEOVENCONTROL_MINPOWER = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MICROWAVEOVENCONTROL_MINPOWER);

    public static final String CHANNEL_NAME_MICROWAVEOVENCONTROL_MAXPOWER = "MaxPower";
    public static final String CHANNEL_LABEL_MICROWAVEOVENCONTROL_MAXPOWER = "maxPower";
    public static final String CHANNEL_ID_MICROWAVEOVENCONTROL_MAXPOWER = "microwaveovencontrol_maxpower";
    public static final ChannelTypeUID CHANNEL_MICROWAVEOVENCONTROL_MAXPOWER = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MICROWAVEOVENCONTROL_MAXPOWER);

    public static final String CHANNEL_NAME_MICROWAVEOVENCONTROL_POWERSTEP = "PowerStep";
    public static final String CHANNEL_LABEL_MICROWAVEOVENCONTROL_POWERSTEP = "powerStep";
    public static final String CHANNEL_ID_MICROWAVEOVENCONTROL_POWERSTEP = "microwaveovencontrol_powerstep";
    public static final ChannelTypeUID CHANNEL_MICROWAVEOVENCONTROL_POWERSTEP = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MICROWAVEOVENCONTROL_POWERSTEP);

    public static final String CHANNEL_NAME_MICROWAVEOVENCONTROL_SUPPORTEDWATTS = "SupportedWatts";
    public static final String CHANNEL_LABEL_MICROWAVEOVENCONTROL_SUPPORTEDWATTS = "supportedWatts";
    public static final String CHANNEL_ID_MICROWAVEOVENCONTROL_SUPPORTEDWATTS = "microwaveovencontrol_supportedwatts";
    public static final ChannelTypeUID CHANNEL_MICROWAVEOVENCONTROL_SUPPORTEDWATTS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MICROWAVEOVENCONTROL_SUPPORTEDWATTS);

    public static final String CHANNEL_NAME_MICROWAVEOVENCONTROL_SELECTEDWATTINDEX = "SelectedWattIndex";
    public static final String CHANNEL_LABEL_MICROWAVEOVENCONTROL_SELECTEDWATTINDEX = "selectedWattIndex";
    public static final String CHANNEL_ID_MICROWAVEOVENCONTROL_SELECTEDWATTINDEX = "microwaveovencontrol_selectedwattindex";
    public static final ChannelTypeUID CHANNEL_MICROWAVEOVENCONTROL_SELECTEDWATTINDEX = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MICROWAVEOVENCONTROL_SELECTEDWATTINDEX);

    public static final String CHANNEL_NAME_MICROWAVEOVENCONTROL_WATTRATING = "WattRating";
    public static final String CHANNEL_LABEL_MICROWAVEOVENCONTROL_WATTRATING = "wattRating";
    public static final String CHANNEL_ID_MICROWAVEOVENCONTROL_WATTRATING = "microwaveovencontrol_wattrating";
    public static final ChannelTypeUID CHANNEL_MICROWAVEOVENCONTROL_WATTRATING = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_MICROWAVEOVENCONTROL_WATTRATING);

    // DeviceEnergyManagement Cluster

    public static final String CHANNEL_NAME_DEVICEENERGYMANAGEMENT_ESATYPE = "EsaType";
    public static final String CHANNEL_LABEL_DEVICEENERGYMANAGEMENT_ESATYPE = "esaType";
    public static final String CHANNEL_ID_DEVICEENERGYMANAGEMENT_ESATYPE = "deviceenergymanagement_esatype";
    public static final ChannelTypeUID CHANNEL_DEVICEENERGYMANAGEMENT_ESATYPE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DEVICEENERGYMANAGEMENT_ESATYPE);

    public static final String CHANNEL_NAME_DEVICEENERGYMANAGEMENT_ESACANGENERATE = "EsaCanGenerate";
    public static final String CHANNEL_LABEL_DEVICEENERGYMANAGEMENT_ESACANGENERATE = "esaCanGenerate";
    public static final String CHANNEL_ID_DEVICEENERGYMANAGEMENT_ESACANGENERATE = "deviceenergymanagement_esacangenerate";
    public static final ChannelTypeUID CHANNEL_DEVICEENERGYMANAGEMENT_ESACANGENERATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DEVICEENERGYMANAGEMENT_ESACANGENERATE);

    public static final String CHANNEL_NAME_DEVICEENERGYMANAGEMENT_ESASTATE = "EsaState";
    public static final String CHANNEL_LABEL_DEVICEENERGYMANAGEMENT_ESASTATE = "esaState";
    public static final String CHANNEL_ID_DEVICEENERGYMANAGEMENT_ESASTATE = "deviceenergymanagement_esastate";
    public static final ChannelTypeUID CHANNEL_DEVICEENERGYMANAGEMENT_ESASTATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DEVICEENERGYMANAGEMENT_ESASTATE);

    public static final String CHANNEL_NAME_DEVICEENERGYMANAGEMENT_ABSMINPOWER = "AbsMinPower";
    public static final String CHANNEL_LABEL_DEVICEENERGYMANAGEMENT_ABSMINPOWER = "absMinPower";
    public static final String CHANNEL_ID_DEVICEENERGYMANAGEMENT_ABSMINPOWER = "deviceenergymanagement_absminpower";
    public static final ChannelTypeUID CHANNEL_DEVICEENERGYMANAGEMENT_ABSMINPOWER = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DEVICEENERGYMANAGEMENT_ABSMINPOWER);

    public static final String CHANNEL_NAME_DEVICEENERGYMANAGEMENT_ABSMAXPOWER = "AbsMaxPower";
    public static final String CHANNEL_LABEL_DEVICEENERGYMANAGEMENT_ABSMAXPOWER = "absMaxPower";
    public static final String CHANNEL_ID_DEVICEENERGYMANAGEMENT_ABSMAXPOWER = "deviceenergymanagement_absmaxpower";
    public static final ChannelTypeUID CHANNEL_DEVICEENERGYMANAGEMENT_ABSMAXPOWER = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DEVICEENERGYMANAGEMENT_ABSMAXPOWER);

    public static final String CHANNEL_NAME_DEVICEENERGYMANAGEMENT_POWERADJUSTMENTCAPABILITY = "PowerAdjustmentCapability";
    public static final String CHANNEL_LABEL_DEVICEENERGYMANAGEMENT_POWERADJUSTMENTCAPABILITY = "powerAdjustmentCapability";
    public static final String CHANNEL_ID_DEVICEENERGYMANAGEMENT_POWERADJUSTMENTCAPABILITY = "deviceenergymanagement_poweradjustmentcapability";
    public static final ChannelTypeUID CHANNEL_DEVICEENERGYMANAGEMENT_POWERADJUSTMENTCAPABILITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DEVICEENERGYMANAGEMENT_POWERADJUSTMENTCAPABILITY);

    public static final String CHANNEL_NAME_DEVICEENERGYMANAGEMENT_FORECAST = "Forecast";
    public static final String CHANNEL_LABEL_DEVICEENERGYMANAGEMENT_FORECAST = "forecast";
    public static final String CHANNEL_ID_DEVICEENERGYMANAGEMENT_FORECAST = "deviceenergymanagement_forecast";
    public static final ChannelTypeUID CHANNEL_DEVICEENERGYMANAGEMENT_FORECAST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DEVICEENERGYMANAGEMENT_FORECAST);

    public static final String CHANNEL_NAME_DEVICEENERGYMANAGEMENT_OPTOUTSTATE = "OptOutState";
    public static final String CHANNEL_LABEL_DEVICEENERGYMANAGEMENT_OPTOUTSTATE = "optOutState";
    public static final String CHANNEL_ID_DEVICEENERGYMANAGEMENT_OPTOUTSTATE = "deviceenergymanagement_optoutstate";
    public static final ChannelTypeUID CHANNEL_DEVICEENERGYMANAGEMENT_OPTOUTSTATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DEVICEENERGYMANAGEMENT_OPTOUTSTATE);

    // EnergyEvse Cluster

    public static final String CHANNEL_NAME_ENERGYEVSE_STATE = "State";
    public static final String CHANNEL_LABEL_ENERGYEVSE_STATE = "state";
    public static final String CHANNEL_ID_ENERGYEVSE_STATE = "energyevse_state";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_STATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_STATE);

    public static final String CHANNEL_NAME_ENERGYEVSE_SUPPLYSTATE = "SupplyState";
    public static final String CHANNEL_LABEL_ENERGYEVSE_SUPPLYSTATE = "supplyState";
    public static final String CHANNEL_ID_ENERGYEVSE_SUPPLYSTATE = "energyevse_supplystate";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_SUPPLYSTATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_SUPPLYSTATE);

    public static final String CHANNEL_NAME_ENERGYEVSE_FAULTSTATE = "FaultState";
    public static final String CHANNEL_LABEL_ENERGYEVSE_FAULTSTATE = "faultState";
    public static final String CHANNEL_ID_ENERGYEVSE_FAULTSTATE = "energyevse_faultstate";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_FAULTSTATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_FAULTSTATE);

    public static final String CHANNEL_NAME_ENERGYEVSE_CHARGINGENABLEDUNTIL = "ChargingEnabledUntil";
    public static final String CHANNEL_LABEL_ENERGYEVSE_CHARGINGENABLEDUNTIL = "chargingEnabledUntil";
    public static final String CHANNEL_ID_ENERGYEVSE_CHARGINGENABLEDUNTIL = "energyevse_chargingenableduntil";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_CHARGINGENABLEDUNTIL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_CHARGINGENABLEDUNTIL);

    public static final String CHANNEL_NAME_ENERGYEVSE_DISCHARGINGENABLEDUNTIL = "DischargingEnabledUntil";
    public static final String CHANNEL_LABEL_ENERGYEVSE_DISCHARGINGENABLEDUNTIL = "dischargingEnabledUntil";
    public static final String CHANNEL_ID_ENERGYEVSE_DISCHARGINGENABLEDUNTIL = "energyevse_dischargingenableduntil";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_DISCHARGINGENABLEDUNTIL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_DISCHARGINGENABLEDUNTIL);

    public static final String CHANNEL_NAME_ENERGYEVSE_CIRCUITCAPACITY = "CircuitCapacity";
    public static final String CHANNEL_LABEL_ENERGYEVSE_CIRCUITCAPACITY = "circuitCapacity";
    public static final String CHANNEL_ID_ENERGYEVSE_CIRCUITCAPACITY = "energyevse_circuitcapacity";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_CIRCUITCAPACITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_CIRCUITCAPACITY);

    public static final String CHANNEL_NAME_ENERGYEVSE_MINIMUMCHARGECURRENT = "MinimumChargeCurrent";
    public static final String CHANNEL_LABEL_ENERGYEVSE_MINIMUMCHARGECURRENT = "minimumChargeCurrent";
    public static final String CHANNEL_ID_ENERGYEVSE_MINIMUMCHARGECURRENT = "energyevse_minimumchargecurrent";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_MINIMUMCHARGECURRENT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_MINIMUMCHARGECURRENT);

    public static final String CHANNEL_NAME_ENERGYEVSE_MAXIMUMCHARGECURRENT = "MaximumChargeCurrent";
    public static final String CHANNEL_LABEL_ENERGYEVSE_MAXIMUMCHARGECURRENT = "maximumChargeCurrent";
    public static final String CHANNEL_ID_ENERGYEVSE_MAXIMUMCHARGECURRENT = "energyevse_maximumchargecurrent";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_MAXIMUMCHARGECURRENT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_MAXIMUMCHARGECURRENT);

    public static final String CHANNEL_NAME_ENERGYEVSE_MAXIMUMDISCHARGECURRENT = "MaximumDischargeCurrent";
    public static final String CHANNEL_LABEL_ENERGYEVSE_MAXIMUMDISCHARGECURRENT = "maximumDischargeCurrent";
    public static final String CHANNEL_ID_ENERGYEVSE_MAXIMUMDISCHARGECURRENT = "energyevse_maximumdischargecurrent";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_MAXIMUMDISCHARGECURRENT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_MAXIMUMDISCHARGECURRENT);

    public static final String CHANNEL_NAME_ENERGYEVSE_USERMAXIMUMCHARGECURRENT = "UserMaximumChargeCurrent";
    public static final String CHANNEL_LABEL_ENERGYEVSE_USERMAXIMUMCHARGECURRENT = "userMaximumChargeCurrent";
    public static final String CHANNEL_ID_ENERGYEVSE_USERMAXIMUMCHARGECURRENT = "energyevse_usermaximumchargecurrent";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_USERMAXIMUMCHARGECURRENT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_USERMAXIMUMCHARGECURRENT);

    public static final String CHANNEL_NAME_ENERGYEVSE_RANDOMIZATIONDELAYWINDOW = "RandomizationDelayWindow";
    public static final String CHANNEL_LABEL_ENERGYEVSE_RANDOMIZATIONDELAYWINDOW = "randomizationDelayWindow";
    public static final String CHANNEL_ID_ENERGYEVSE_RANDOMIZATIONDELAYWINDOW = "energyevse_randomizationdelaywindow";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_RANDOMIZATIONDELAYWINDOW = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_RANDOMIZATIONDELAYWINDOW);

    public static final String CHANNEL_NAME_ENERGYEVSE_NEXTCHARGESTARTTIME = "NextChargeStartTime";
    public static final String CHANNEL_LABEL_ENERGYEVSE_NEXTCHARGESTARTTIME = "nextChargeStartTime";
    public static final String CHANNEL_ID_ENERGYEVSE_NEXTCHARGESTARTTIME = "energyevse_nextchargestarttime";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_NEXTCHARGESTARTTIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_NEXTCHARGESTARTTIME);

    public static final String CHANNEL_NAME_ENERGYEVSE_NEXTCHARGETARGETTIME = "NextChargeTargetTime";
    public static final String CHANNEL_LABEL_ENERGYEVSE_NEXTCHARGETARGETTIME = "nextChargeTargetTime";
    public static final String CHANNEL_ID_ENERGYEVSE_NEXTCHARGETARGETTIME = "energyevse_nextchargetargettime";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_NEXTCHARGETARGETTIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_NEXTCHARGETARGETTIME);

    public static final String CHANNEL_NAME_ENERGYEVSE_NEXTCHARGEREQUIREDENERGY = "NextChargeRequiredEnergy";
    public static final String CHANNEL_LABEL_ENERGYEVSE_NEXTCHARGEREQUIREDENERGY = "nextChargeRequiredEnergy";
    public static final String CHANNEL_ID_ENERGYEVSE_NEXTCHARGEREQUIREDENERGY = "energyevse_nextchargerequiredenergy";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_NEXTCHARGEREQUIREDENERGY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_NEXTCHARGEREQUIREDENERGY);

    public static final String CHANNEL_NAME_ENERGYEVSE_NEXTCHARGETARGETSOC = "NextChargeTargetSoC";
    public static final String CHANNEL_LABEL_ENERGYEVSE_NEXTCHARGETARGETSOC = "nextChargeTargetSoC";
    public static final String CHANNEL_ID_ENERGYEVSE_NEXTCHARGETARGETSOC = "energyevse_nextchargetargetsoc";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_NEXTCHARGETARGETSOC = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_NEXTCHARGETARGETSOC);

    public static final String CHANNEL_NAME_ENERGYEVSE_APPROXIMATEEVEFFICIENCY = "ApproximateEvEfficiency";
    public static final String CHANNEL_LABEL_ENERGYEVSE_APPROXIMATEEVEFFICIENCY = "approximateEvEfficiency";
    public static final String CHANNEL_ID_ENERGYEVSE_APPROXIMATEEVEFFICIENCY = "energyevse_approximateevefficiency";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_APPROXIMATEEVEFFICIENCY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_APPROXIMATEEVEFFICIENCY);

    public static final String CHANNEL_NAME_ENERGYEVSE_STATEOFCHARGE = "StateOfCharge";
    public static final String CHANNEL_LABEL_ENERGYEVSE_STATEOFCHARGE = "stateOfCharge";
    public static final String CHANNEL_ID_ENERGYEVSE_STATEOFCHARGE = "energyevse_stateofcharge";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_STATEOFCHARGE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_STATEOFCHARGE);

    public static final String CHANNEL_NAME_ENERGYEVSE_BATTERYCAPACITY = "BatteryCapacity";
    public static final String CHANNEL_LABEL_ENERGYEVSE_BATTERYCAPACITY = "batteryCapacity";
    public static final String CHANNEL_ID_ENERGYEVSE_BATTERYCAPACITY = "energyevse_batterycapacity";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_BATTERYCAPACITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_BATTERYCAPACITY);

    public static final String CHANNEL_NAME_ENERGYEVSE_VEHICLEID = "VehicleId";
    public static final String CHANNEL_LABEL_ENERGYEVSE_VEHICLEID = "vehicleId";
    public static final String CHANNEL_ID_ENERGYEVSE_VEHICLEID = "energyevse_vehicleid";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_VEHICLEID = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_VEHICLEID);

    public static final String CHANNEL_NAME_ENERGYEVSE_SESSIONID = "SessionId";
    public static final String CHANNEL_LABEL_ENERGYEVSE_SESSIONID = "sessionId";
    public static final String CHANNEL_ID_ENERGYEVSE_SESSIONID = "energyevse_sessionid";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_SESSIONID = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_SESSIONID);

    public static final String CHANNEL_NAME_ENERGYEVSE_SESSIONDURATION = "SessionDuration";
    public static final String CHANNEL_LABEL_ENERGYEVSE_SESSIONDURATION = "sessionDuration";
    public static final String CHANNEL_ID_ENERGYEVSE_SESSIONDURATION = "energyevse_sessionduration";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_SESSIONDURATION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_SESSIONDURATION);

    public static final String CHANNEL_NAME_ENERGYEVSE_SESSIONENERGYCHARGED = "SessionEnergyCharged";
    public static final String CHANNEL_LABEL_ENERGYEVSE_SESSIONENERGYCHARGED = "sessionEnergyCharged";
    public static final String CHANNEL_ID_ENERGYEVSE_SESSIONENERGYCHARGED = "energyevse_sessionenergycharged";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_SESSIONENERGYCHARGED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_SESSIONENERGYCHARGED);

    public static final String CHANNEL_NAME_ENERGYEVSE_SESSIONENERGYDISCHARGED = "SessionEnergyDischarged";
    public static final String CHANNEL_LABEL_ENERGYEVSE_SESSIONENERGYDISCHARGED = "sessionEnergyDischarged";
    public static final String CHANNEL_ID_ENERGYEVSE_SESSIONENERGYDISCHARGED = "energyevse_sessionenergydischarged";
    public static final ChannelTypeUID CHANNEL_ENERGYEVSE_SESSIONENERGYDISCHARGED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYEVSE_SESSIONENERGYDISCHARGED);

    // EnergyEvseMode Cluster

    // EnergyPreference Cluster

    public static final String CHANNEL_NAME_ENERGYPREFERENCE_ENERGYBALANCES = "EnergyBalances";
    public static final String CHANNEL_LABEL_ENERGYPREFERENCE_ENERGYBALANCES = "energyBalances";
    public static final String CHANNEL_ID_ENERGYPREFERENCE_ENERGYBALANCES = "energypreference_energybalances";
    public static final ChannelTypeUID CHANNEL_ENERGYPREFERENCE_ENERGYBALANCES = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYPREFERENCE_ENERGYBALANCES);

    public static final String CHANNEL_NAME_ENERGYPREFERENCE_CURRENTENERGYBALANCE = "CurrentEnergyBalance";
    public static final String CHANNEL_LABEL_ENERGYPREFERENCE_CURRENTENERGYBALANCE = "currentEnergyBalance";
    public static final String CHANNEL_ID_ENERGYPREFERENCE_CURRENTENERGYBALANCE = "energypreference_currentenergybalance";
    public static final ChannelTypeUID CHANNEL_ENERGYPREFERENCE_CURRENTENERGYBALANCE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYPREFERENCE_CURRENTENERGYBALANCE);

    public static final String CHANNEL_NAME_ENERGYPREFERENCE_ENERGYPRIORITIES = "EnergyPriorities";
    public static final String CHANNEL_LABEL_ENERGYPREFERENCE_ENERGYPRIORITIES = "energyPriorities";
    public static final String CHANNEL_ID_ENERGYPREFERENCE_ENERGYPRIORITIES = "energypreference_energypriorities";
    public static final ChannelTypeUID CHANNEL_ENERGYPREFERENCE_ENERGYPRIORITIES = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYPREFERENCE_ENERGYPRIORITIES);

    public static final String CHANNEL_NAME_ENERGYPREFERENCE_LOWPOWERMODESENSITIVITIES = "LowPowerModeSensitivities";
    public static final String CHANNEL_LABEL_ENERGYPREFERENCE_LOWPOWERMODESENSITIVITIES = "lowPowerModeSensitivities";
    public static final String CHANNEL_ID_ENERGYPREFERENCE_LOWPOWERMODESENSITIVITIES = "energypreference_lowpowermodesensitivities";
    public static final ChannelTypeUID CHANNEL_ENERGYPREFERENCE_LOWPOWERMODESENSITIVITIES = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYPREFERENCE_LOWPOWERMODESENSITIVITIES);

    public static final String CHANNEL_NAME_ENERGYPREFERENCE_CURRENTLOWPOWERMODESENSITIVITY = "CurrentLowPowerModeSensitivity";
    public static final String CHANNEL_LABEL_ENERGYPREFERENCE_CURRENTLOWPOWERMODESENSITIVITY = "currentLowPowerModeSensitivity";
    public static final String CHANNEL_ID_ENERGYPREFERENCE_CURRENTLOWPOWERMODESENSITIVITY = "energypreference_currentlowpowermodesensitivity";
    public static final ChannelTypeUID CHANNEL_ENERGYPREFERENCE_CURRENTLOWPOWERMODESENSITIVITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ENERGYPREFERENCE_CURRENTLOWPOWERMODESENSITIVITY);

    // DeviceEnergyManagementMode Cluster

    // Descriptor Cluster

    public static final String CHANNEL_NAME_DESCRIPTOR_DEVICETYPELIST = "DeviceTypeList";
    public static final String CHANNEL_LABEL_DESCRIPTOR_DEVICETYPELIST = "deviceTypeList";
    public static final String CHANNEL_ID_DESCRIPTOR_DEVICETYPELIST = "descriptor_devicetypelist";
    public static final ChannelTypeUID CHANNEL_DESCRIPTOR_DEVICETYPELIST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DESCRIPTOR_DEVICETYPELIST);

    public static final String CHANNEL_NAME_DESCRIPTOR_SERVERLIST = "ServerList";
    public static final String CHANNEL_LABEL_DESCRIPTOR_SERVERLIST = "serverList";
    public static final String CHANNEL_ID_DESCRIPTOR_SERVERLIST = "descriptor_serverlist";
    public static final ChannelTypeUID CHANNEL_DESCRIPTOR_SERVERLIST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DESCRIPTOR_SERVERLIST);

    public static final String CHANNEL_NAME_DESCRIPTOR_CLIENTLIST = "ClientList";
    public static final String CHANNEL_LABEL_DESCRIPTOR_CLIENTLIST = "clientList";
    public static final String CHANNEL_ID_DESCRIPTOR_CLIENTLIST = "descriptor_clientlist";
    public static final ChannelTypeUID CHANNEL_DESCRIPTOR_CLIENTLIST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DESCRIPTOR_CLIENTLIST);

    public static final String CHANNEL_NAME_DESCRIPTOR_PARTSLIST = "PartsList";
    public static final String CHANNEL_LABEL_DESCRIPTOR_PARTSLIST = "partsList";
    public static final String CHANNEL_ID_DESCRIPTOR_PARTSLIST = "descriptor_partslist";
    public static final ChannelTypeUID CHANNEL_DESCRIPTOR_PARTSLIST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DESCRIPTOR_PARTSLIST);

    public static final String CHANNEL_NAME_DESCRIPTOR_TAGLIST = "TagList";
    public static final String CHANNEL_LABEL_DESCRIPTOR_TAGLIST = "tagList";
    public static final String CHANNEL_ID_DESCRIPTOR_TAGLIST = "descriptor_taglist";
    public static final ChannelTypeUID CHANNEL_DESCRIPTOR_TAGLIST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_DESCRIPTOR_TAGLIST);

    // Binding Cluster

    public static final String CHANNEL_NAME_BINDING_BINDING = "Binding";
    public static final String CHANNEL_LABEL_BINDING_BINDING = "binding";
    public static final String CHANNEL_ID_BINDING_BINDING = "binding_binding";
    public static final ChannelTypeUID CHANNEL_BINDING_BINDING = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BINDING_BINDING);

    // Label Cluster

    // FixedLabel Cluster

    public static final String CHANNEL_NAME_FIXEDLABEL_LABELLIST = "LabelList";
    public static final String CHANNEL_LABEL_FIXEDLABEL_LABELLIST = "labelList";
    public static final String CHANNEL_ID_FIXEDLABEL_LABELLIST = "fixedlabel_labellist";
    public static final ChannelTypeUID CHANNEL_FIXEDLABEL_LABELLIST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_FIXEDLABEL_LABELLIST);

    // UserLabel Cluster

    public static final String CHANNEL_NAME_USERLABEL_LABELLIST = "LabelList";
    public static final String CHANNEL_LABEL_USERLABEL_LABELLIST = "labelList";
    public static final String CHANNEL_ID_USERLABEL_LABELLIST = "userlabel_labellist";
    public static final ChannelTypeUID CHANNEL_USERLABEL_LABELLIST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_USERLABEL_LABELLIST);

    // AccessControl Cluster

    public static final String CHANNEL_NAME_ACCESSCONTROL_ACL = "Acl";
    public static final String CHANNEL_LABEL_ACCESSCONTROL_ACL = "acl";
    public static final String CHANNEL_ID_ACCESSCONTROL_ACL = "accesscontrol_acl";
    public static final ChannelTypeUID CHANNEL_ACCESSCONTROL_ACL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ACCESSCONTROL_ACL);

    public static final String CHANNEL_NAME_ACCESSCONTROL_EXTENSION = "Extension";
    public static final String CHANNEL_LABEL_ACCESSCONTROL_EXTENSION = "extension";
    public static final String CHANNEL_ID_ACCESSCONTROL_EXTENSION = "accesscontrol_extension";
    public static final ChannelTypeUID CHANNEL_ACCESSCONTROL_EXTENSION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ACCESSCONTROL_EXTENSION);

    public static final String CHANNEL_NAME_ACCESSCONTROL_SUBJECTSPERACCESSCONTROLENTRY = "SubjectsPerAccessControlEntry";
    public static final String CHANNEL_LABEL_ACCESSCONTROL_SUBJECTSPERACCESSCONTROLENTRY = "subjectsPerAccessControlEntry";
    public static final String CHANNEL_ID_ACCESSCONTROL_SUBJECTSPERACCESSCONTROLENTRY = "accesscontrol_subjectsperaccesscontrolentry";
    public static final ChannelTypeUID CHANNEL_ACCESSCONTROL_SUBJECTSPERACCESSCONTROLENTRY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ACCESSCONTROL_SUBJECTSPERACCESSCONTROLENTRY);

    public static final String CHANNEL_NAME_ACCESSCONTROL_TARGETSPERACCESSCONTROLENTRY = "TargetsPerAccessControlEntry";
    public static final String CHANNEL_LABEL_ACCESSCONTROL_TARGETSPERACCESSCONTROLENTRY = "targetsPerAccessControlEntry";
    public static final String CHANNEL_ID_ACCESSCONTROL_TARGETSPERACCESSCONTROLENTRY = "accesscontrol_targetsperaccesscontrolentry";
    public static final ChannelTypeUID CHANNEL_ACCESSCONTROL_TARGETSPERACCESSCONTROLENTRY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ACCESSCONTROL_TARGETSPERACCESSCONTROLENTRY);

    public static final String CHANNEL_NAME_ACCESSCONTROL_ACCESSCONTROLENTRIESPERFABRIC = "AccessControlEntriesPerFabric";
    public static final String CHANNEL_LABEL_ACCESSCONTROL_ACCESSCONTROLENTRIESPERFABRIC = "accessControlEntriesPerFabric";
    public static final String CHANNEL_ID_ACCESSCONTROL_ACCESSCONTROLENTRIESPERFABRIC = "accesscontrol_accesscontrolentriesperfabric";
    public static final ChannelTypeUID CHANNEL_ACCESSCONTROL_ACCESSCONTROLENTRIESPERFABRIC = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ACCESSCONTROL_ACCESSCONTROLENTRIESPERFABRIC);

    // BridgedDeviceBasicInformation Cluster

    // Actions Cluster

    public static final String CHANNEL_NAME_ACTIONS_ACTIONLIST = "ActionList";
    public static final String CHANNEL_LABEL_ACTIONS_ACTIONLIST = "actionList";
    public static final String CHANNEL_ID_ACTIONS_ACTIONLIST = "actions_actionlist";
    public static final ChannelTypeUID CHANNEL_ACTIONS_ACTIONLIST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ACTIONS_ACTIONLIST);

    public static final String CHANNEL_NAME_ACTIONS_ENDPOINTLISTS = "EndpointLists";
    public static final String CHANNEL_LABEL_ACTIONS_ENDPOINTLISTS = "endpointLists";
    public static final String CHANNEL_ID_ACTIONS_ENDPOINTLISTS = "actions_endpointlists";
    public static final ChannelTypeUID CHANNEL_ACTIONS_ENDPOINTLISTS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ACTIONS_ENDPOINTLISTS);

    public static final String CHANNEL_NAME_ACTIONS_SETUPURL = "SetupUrl";
    public static final String CHANNEL_LABEL_ACTIONS_SETUPURL = "setupUrl";
    public static final String CHANNEL_ID_ACTIONS_SETUPURL = "actions_setupurl";
    public static final ChannelTypeUID CHANNEL_ACTIONS_SETUPURL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ACTIONS_SETUPURL);

    // ProxyDiscovery Cluster

    // ProxyConfiguration Cluster

    public static final String CHANNEL_NAME_PROXYCONFIGURATION_CONFIGURATIONLIST = "ConfigurationList";
    public static final String CHANNEL_LABEL_PROXYCONFIGURATION_CONFIGURATIONLIST = "configurationList";
    public static final String CHANNEL_ID_PROXYCONFIGURATION_CONFIGURATIONLIST = "proxyconfiguration_configurationlist";
    public static final ChannelTypeUID CHANNEL_PROXYCONFIGURATION_CONFIGURATIONLIST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_PROXYCONFIGURATION_CONFIGURATIONLIST);

    // ValidProxies Cluster

    public static final String CHANNEL_NAME_VALIDPROXIES_VALIDPROXYLIST = "ValidProxyList";
    public static final String CHANNEL_LABEL_VALIDPROXIES_VALIDPROXYLIST = "validProxyList";
    public static final String CHANNEL_ID_VALIDPROXIES_VALIDPROXYLIST = "validproxies_validproxylist";
    public static final ChannelTypeUID CHANNEL_VALIDPROXIES_VALIDPROXYLIST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_VALIDPROXIES_VALIDPROXYLIST);

    // IcdManagement Cluster

    public static final String CHANNEL_NAME_ICDMANAGEMENT_IDLEMODEDURATION = "IdleModeDuration";
    public static final String CHANNEL_LABEL_ICDMANAGEMENT_IDLEMODEDURATION = "idleModeDuration";
    public static final String CHANNEL_ID_ICDMANAGEMENT_IDLEMODEDURATION = "icdmanagement_idlemodeduration";
    public static final ChannelTypeUID CHANNEL_ICDMANAGEMENT_IDLEMODEDURATION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ICDMANAGEMENT_IDLEMODEDURATION);

    public static final String CHANNEL_NAME_ICDMANAGEMENT_ACTIVEMODEDURATION = "ActiveModeDuration";
    public static final String CHANNEL_LABEL_ICDMANAGEMENT_ACTIVEMODEDURATION = "activeModeDuration";
    public static final String CHANNEL_ID_ICDMANAGEMENT_ACTIVEMODEDURATION = "icdmanagement_activemodeduration";
    public static final ChannelTypeUID CHANNEL_ICDMANAGEMENT_ACTIVEMODEDURATION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ICDMANAGEMENT_ACTIVEMODEDURATION);

    public static final String CHANNEL_NAME_ICDMANAGEMENT_ACTIVEMODETHRESHOLD = "ActiveModeThreshold";
    public static final String CHANNEL_LABEL_ICDMANAGEMENT_ACTIVEMODETHRESHOLD = "activeModeThreshold";
    public static final String CHANNEL_ID_ICDMANAGEMENT_ACTIVEMODETHRESHOLD = "icdmanagement_activemodethreshold";
    public static final ChannelTypeUID CHANNEL_ICDMANAGEMENT_ACTIVEMODETHRESHOLD = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ICDMANAGEMENT_ACTIVEMODETHRESHOLD);

    public static final String CHANNEL_NAME_ICDMANAGEMENT_REGISTEREDCLIENTS = "RegisteredClients";
    public static final String CHANNEL_LABEL_ICDMANAGEMENT_REGISTEREDCLIENTS = "registeredClients";
    public static final String CHANNEL_ID_ICDMANAGEMENT_REGISTEREDCLIENTS = "icdmanagement_registeredclients";
    public static final ChannelTypeUID CHANNEL_ICDMANAGEMENT_REGISTEREDCLIENTS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ICDMANAGEMENT_REGISTEREDCLIENTS);

    public static final String CHANNEL_NAME_ICDMANAGEMENT_ICDCOUNTER = "IcdCounter";
    public static final String CHANNEL_LABEL_ICDMANAGEMENT_ICDCOUNTER = "icdCounter";
    public static final String CHANNEL_ID_ICDMANAGEMENT_ICDCOUNTER = "icdmanagement_icdcounter";
    public static final ChannelTypeUID CHANNEL_ICDMANAGEMENT_ICDCOUNTER = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ICDMANAGEMENT_ICDCOUNTER);

    public static final String CHANNEL_NAME_ICDMANAGEMENT_CLIENTSSUPPORTEDPERFABRIC = "ClientsSupportedPerFabric";
    public static final String CHANNEL_LABEL_ICDMANAGEMENT_CLIENTSSUPPORTEDPERFABRIC = "clientsSupportedPerFabric";
    public static final String CHANNEL_ID_ICDMANAGEMENT_CLIENTSSUPPORTEDPERFABRIC = "icdmanagement_clientssupportedperfabric";
    public static final ChannelTypeUID CHANNEL_ICDMANAGEMENT_CLIENTSSUPPORTEDPERFABRIC = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ICDMANAGEMENT_CLIENTSSUPPORTEDPERFABRIC);

    public static final String CHANNEL_NAME_ICDMANAGEMENT_USERACTIVEMODETRIGGERHINT = "UserActiveModeTriggerHint";
    public static final String CHANNEL_LABEL_ICDMANAGEMENT_USERACTIVEMODETRIGGERHINT = "userActiveModeTriggerHint";
    public static final String CHANNEL_ID_ICDMANAGEMENT_USERACTIVEMODETRIGGERHINT = "icdmanagement_useractivemodetriggerhint";
    public static final ChannelTypeUID CHANNEL_ICDMANAGEMENT_USERACTIVEMODETRIGGERHINT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ICDMANAGEMENT_USERACTIVEMODETRIGGERHINT);

    public static final String CHANNEL_NAME_ICDMANAGEMENT_USERACTIVEMODETRIGGERINSTRUCTION = "UserActiveModeTriggerInstruction";
    public static final String CHANNEL_LABEL_ICDMANAGEMENT_USERACTIVEMODETRIGGERINSTRUCTION = "userActiveModeTriggerInstruction";
    public static final String CHANNEL_ID_ICDMANAGEMENT_USERACTIVEMODETRIGGERINSTRUCTION = "icdmanagement_useractivemodetriggerinstruction";
    public static final ChannelTypeUID CHANNEL_ICDMANAGEMENT_USERACTIVEMODETRIGGERINSTRUCTION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ICDMANAGEMENT_USERACTIVEMODETRIGGERINSTRUCTION);

    public static final String CHANNEL_NAME_ICDMANAGEMENT_OPERATINGMODE = "OperatingMode";
    public static final String CHANNEL_LABEL_ICDMANAGEMENT_OPERATINGMODE = "operatingMode";
    public static final String CHANNEL_ID_ICDMANAGEMENT_OPERATINGMODE = "icdmanagement_operatingmode";
    public static final ChannelTypeUID CHANNEL_ICDMANAGEMENT_OPERATINGMODE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ICDMANAGEMENT_OPERATINGMODE);

    // BasicInformation Cluster

    public static final String CHANNEL_NAME_BASICINFORMATION_DATAMODELREVISION = "DataModelRevision";
    public static final String CHANNEL_LABEL_BASICINFORMATION_DATAMODELREVISION = "dataModelRevision";
    public static final String CHANNEL_ID_BASICINFORMATION_DATAMODELREVISION = "basicinformation_datamodelrevision";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_DATAMODELREVISION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_DATAMODELREVISION);

    public static final String CHANNEL_NAME_BASICINFORMATION_VENDORNAME = "VendorName";
    public static final String CHANNEL_LABEL_BASICINFORMATION_VENDORNAME = "vendorName";
    public static final String CHANNEL_ID_BASICINFORMATION_VENDORNAME = "basicinformation_vendorname";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_VENDORNAME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_VENDORNAME);

    public static final String CHANNEL_NAME_BASICINFORMATION_VENDORID = "VendorId";
    public static final String CHANNEL_LABEL_BASICINFORMATION_VENDORID = "vendorId";
    public static final String CHANNEL_ID_BASICINFORMATION_VENDORID = "basicinformation_vendorid";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_VENDORID = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_VENDORID);

    public static final String CHANNEL_NAME_BASICINFORMATION_PRODUCTNAME = "ProductName";
    public static final String CHANNEL_LABEL_BASICINFORMATION_PRODUCTNAME = "productName";
    public static final String CHANNEL_ID_BASICINFORMATION_PRODUCTNAME = "basicinformation_productname";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_PRODUCTNAME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_PRODUCTNAME);

    public static final String CHANNEL_NAME_BASICINFORMATION_PRODUCTID = "ProductId";
    public static final String CHANNEL_LABEL_BASICINFORMATION_PRODUCTID = "productId";
    public static final String CHANNEL_ID_BASICINFORMATION_PRODUCTID = "basicinformation_productid";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_PRODUCTID = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_PRODUCTID);

    public static final String CHANNEL_NAME_BASICINFORMATION_NODELABEL = "NodeLabel";
    public static final String CHANNEL_LABEL_BASICINFORMATION_NODELABEL = "nodeLabel";
    public static final String CHANNEL_ID_BASICINFORMATION_NODELABEL = "basicinformation_nodelabel";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_NODELABEL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_NODELABEL);

    public static final String CHANNEL_NAME_BASICINFORMATION_LOCATION = "Location";
    public static final String CHANNEL_LABEL_BASICINFORMATION_LOCATION = "location";
    public static final String CHANNEL_ID_BASICINFORMATION_LOCATION = "basicinformation_location";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_LOCATION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_LOCATION);

    public static final String CHANNEL_NAME_BASICINFORMATION_HARDWAREVERSION = "HardwareVersion";
    public static final String CHANNEL_LABEL_BASICINFORMATION_HARDWAREVERSION = "hardwareVersion";
    public static final String CHANNEL_ID_BASICINFORMATION_HARDWAREVERSION = "basicinformation_hardwareversion";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_HARDWAREVERSION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_HARDWAREVERSION);

    public static final String CHANNEL_NAME_BASICINFORMATION_HARDWAREVERSIONSTRING = "HardwareVersionString";
    public static final String CHANNEL_LABEL_BASICINFORMATION_HARDWAREVERSIONSTRING = "hardwareVersionString";
    public static final String CHANNEL_ID_BASICINFORMATION_HARDWAREVERSIONSTRING = "basicinformation_hardwareversionstring";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_HARDWAREVERSIONSTRING = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_HARDWAREVERSIONSTRING);

    public static final String CHANNEL_NAME_BASICINFORMATION_SOFTWAREVERSION = "SoftwareVersion";
    public static final String CHANNEL_LABEL_BASICINFORMATION_SOFTWAREVERSION = "softwareVersion";
    public static final String CHANNEL_ID_BASICINFORMATION_SOFTWAREVERSION = "basicinformation_softwareversion";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_SOFTWAREVERSION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_SOFTWAREVERSION);

    public static final String CHANNEL_NAME_BASICINFORMATION_SOFTWAREVERSIONSTRING = "SoftwareVersionString";
    public static final String CHANNEL_LABEL_BASICINFORMATION_SOFTWAREVERSIONSTRING = "softwareVersionString";
    public static final String CHANNEL_ID_BASICINFORMATION_SOFTWAREVERSIONSTRING = "basicinformation_softwareversionstring";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_SOFTWAREVERSIONSTRING = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_SOFTWAREVERSIONSTRING);

    public static final String CHANNEL_NAME_BASICINFORMATION_MANUFACTURINGDATE = "ManufacturingDate";
    public static final String CHANNEL_LABEL_BASICINFORMATION_MANUFACTURINGDATE = "manufacturingDate";
    public static final String CHANNEL_ID_BASICINFORMATION_MANUFACTURINGDATE = "basicinformation_manufacturingdate";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_MANUFACTURINGDATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_MANUFACTURINGDATE);

    public static final String CHANNEL_NAME_BASICINFORMATION_PARTNUMBER = "PartNumber";
    public static final String CHANNEL_LABEL_BASICINFORMATION_PARTNUMBER = "partNumber";
    public static final String CHANNEL_ID_BASICINFORMATION_PARTNUMBER = "basicinformation_partnumber";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_PARTNUMBER = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_PARTNUMBER);

    public static final String CHANNEL_NAME_BASICINFORMATION_PRODUCTURL = "ProductUrl";
    public static final String CHANNEL_LABEL_BASICINFORMATION_PRODUCTURL = "productUrl";
    public static final String CHANNEL_ID_BASICINFORMATION_PRODUCTURL = "basicinformation_producturl";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_PRODUCTURL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_PRODUCTURL);

    public static final String CHANNEL_NAME_BASICINFORMATION_PRODUCTLABEL = "ProductLabel";
    public static final String CHANNEL_LABEL_BASICINFORMATION_PRODUCTLABEL = "productLabel";
    public static final String CHANNEL_ID_BASICINFORMATION_PRODUCTLABEL = "basicinformation_productlabel";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_PRODUCTLABEL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_PRODUCTLABEL);

    public static final String CHANNEL_NAME_BASICINFORMATION_SERIALNUMBER = "SerialNumber";
    public static final String CHANNEL_LABEL_BASICINFORMATION_SERIALNUMBER = "serialNumber";
    public static final String CHANNEL_ID_BASICINFORMATION_SERIALNUMBER = "basicinformation_serialnumber";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_SERIALNUMBER = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_SERIALNUMBER);

    public static final String CHANNEL_NAME_BASICINFORMATION_LOCALCONFIGDISABLED = "LocalConfigDisabled";
    public static final String CHANNEL_LABEL_BASICINFORMATION_LOCALCONFIGDISABLED = "localConfigDisabled";
    public static final String CHANNEL_ID_BASICINFORMATION_LOCALCONFIGDISABLED = "basicinformation_localconfigdisabled";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_LOCALCONFIGDISABLED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_LOCALCONFIGDISABLED);

    public static final String CHANNEL_NAME_BASICINFORMATION_REACHABLE = "Reachable";
    public static final String CHANNEL_LABEL_BASICINFORMATION_REACHABLE = "reachable";
    public static final String CHANNEL_ID_BASICINFORMATION_REACHABLE = "basicinformation_reachable";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_REACHABLE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_REACHABLE);

    public static final String CHANNEL_NAME_BASICINFORMATION_UNIQUEID = "UniqueId";
    public static final String CHANNEL_LABEL_BASICINFORMATION_UNIQUEID = "uniqueId";
    public static final String CHANNEL_ID_BASICINFORMATION_UNIQUEID = "basicinformation_uniqueid";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_UNIQUEID = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_UNIQUEID);

    public static final String CHANNEL_NAME_BASICINFORMATION_CAPABILITYMINIMA = "CapabilityMinima";
    public static final String CHANNEL_LABEL_BASICINFORMATION_CAPABILITYMINIMA = "capabilityMinima";
    public static final String CHANNEL_ID_BASICINFORMATION_CAPABILITYMINIMA = "basicinformation_capabilityminima";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_CAPABILITYMINIMA = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_CAPABILITYMINIMA);

    public static final String CHANNEL_NAME_BASICINFORMATION_PRODUCTAPPEARANCE = "ProductAppearance";
    public static final String CHANNEL_LABEL_BASICINFORMATION_PRODUCTAPPEARANCE = "productAppearance";
    public static final String CHANNEL_ID_BASICINFORMATION_PRODUCTAPPEARANCE = "basicinformation_productappearance";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_PRODUCTAPPEARANCE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_PRODUCTAPPEARANCE);

    public static final String CHANNEL_NAME_BASICINFORMATION_SPECIFICATIONVERSION = "SpecificationVersion";
    public static final String CHANNEL_LABEL_BASICINFORMATION_SPECIFICATIONVERSION = "specificationVersion";
    public static final String CHANNEL_ID_BASICINFORMATION_SPECIFICATIONVERSION = "basicinformation_specificationversion";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_SPECIFICATIONVERSION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_SPECIFICATIONVERSION);

    public static final String CHANNEL_NAME_BASICINFORMATION_MAXPATHSPERINVOKE = "MaxPathsPerInvoke";
    public static final String CHANNEL_LABEL_BASICINFORMATION_MAXPATHSPERINVOKE = "maxPathsPerInvoke";
    public static final String CHANNEL_ID_BASICINFORMATION_MAXPATHSPERINVOKE = "basicinformation_maxpathsperinvoke";
    public static final ChannelTypeUID CHANNEL_BASICINFORMATION_MAXPATHSPERINVOKE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_BASICINFORMATION_MAXPATHSPERINVOKE);

    // GroupKeyManagement Cluster

    public static final String CHANNEL_NAME_GROUPKEYMANAGEMENT_GROUPKEYMAP = "GroupKeyMap";
    public static final String CHANNEL_LABEL_GROUPKEYMANAGEMENT_GROUPKEYMAP = "groupKeyMap";
    public static final String CHANNEL_ID_GROUPKEYMANAGEMENT_GROUPKEYMAP = "groupkeymanagement_groupkeymap";
    public static final ChannelTypeUID CHANNEL_GROUPKEYMANAGEMENT_GROUPKEYMAP = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_GROUPKEYMANAGEMENT_GROUPKEYMAP);

    public static final String CHANNEL_NAME_GROUPKEYMANAGEMENT_GROUPTABLE = "GroupTable";
    public static final String CHANNEL_LABEL_GROUPKEYMANAGEMENT_GROUPTABLE = "groupTable";
    public static final String CHANNEL_ID_GROUPKEYMANAGEMENT_GROUPTABLE = "groupkeymanagement_grouptable";
    public static final ChannelTypeUID CHANNEL_GROUPKEYMANAGEMENT_GROUPTABLE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_GROUPKEYMANAGEMENT_GROUPTABLE);

    public static final String CHANNEL_NAME_GROUPKEYMANAGEMENT_MAXGROUPSPERFABRIC = "MaxGroupsPerFabric";
    public static final String CHANNEL_LABEL_GROUPKEYMANAGEMENT_MAXGROUPSPERFABRIC = "maxGroupsPerFabric";
    public static final String CHANNEL_ID_GROUPKEYMANAGEMENT_MAXGROUPSPERFABRIC = "groupkeymanagement_maxgroupsperfabric";
    public static final ChannelTypeUID CHANNEL_GROUPKEYMANAGEMENT_MAXGROUPSPERFABRIC = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_GROUPKEYMANAGEMENT_MAXGROUPSPERFABRIC);

    public static final String CHANNEL_NAME_GROUPKEYMANAGEMENT_MAXGROUPKEYSPERFABRIC = "MaxGroupKeysPerFabric";
    public static final String CHANNEL_LABEL_GROUPKEYMANAGEMENT_MAXGROUPKEYSPERFABRIC = "maxGroupKeysPerFabric";
    public static final String CHANNEL_ID_GROUPKEYMANAGEMENT_MAXGROUPKEYSPERFABRIC = "groupkeymanagement_maxgroupkeysperfabric";
    public static final ChannelTypeUID CHANNEL_GROUPKEYMANAGEMENT_MAXGROUPKEYSPERFABRIC = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_GROUPKEYMANAGEMENT_MAXGROUPKEYSPERFABRIC);

    // LocalizationConfiguration Cluster

    public static final String CHANNEL_NAME_LOCALIZATIONCONFIGURATION_ACTIVELOCALE = "ActiveLocale";
    public static final String CHANNEL_LABEL_LOCALIZATIONCONFIGURATION_ACTIVELOCALE = "activeLocale";
    public static final String CHANNEL_ID_LOCALIZATIONCONFIGURATION_ACTIVELOCALE = "localizationconfiguration_activelocale";
    public static final ChannelTypeUID CHANNEL_LOCALIZATIONCONFIGURATION_ACTIVELOCALE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_LOCALIZATIONCONFIGURATION_ACTIVELOCALE);

    public static final String CHANNEL_NAME_LOCALIZATIONCONFIGURATION_SUPPORTEDLOCALES = "SupportedLocales";
    public static final String CHANNEL_LABEL_LOCALIZATIONCONFIGURATION_SUPPORTEDLOCALES = "supportedLocales";
    public static final String CHANNEL_ID_LOCALIZATIONCONFIGURATION_SUPPORTEDLOCALES = "localizationconfiguration_supportedlocales";
    public static final ChannelTypeUID CHANNEL_LOCALIZATIONCONFIGURATION_SUPPORTEDLOCALES = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_LOCALIZATIONCONFIGURATION_SUPPORTEDLOCALES);

    // TimeFormatLocalization Cluster

    public static final String CHANNEL_NAME_TIMEFORMATLOCALIZATION_HOURFORMAT = "HourFormat";
    public static final String CHANNEL_LABEL_TIMEFORMATLOCALIZATION_HOURFORMAT = "hourFormat";
    public static final String CHANNEL_ID_TIMEFORMATLOCALIZATION_HOURFORMAT = "timeformatlocalization_hourformat";
    public static final ChannelTypeUID CHANNEL_TIMEFORMATLOCALIZATION_HOURFORMAT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TIMEFORMATLOCALIZATION_HOURFORMAT);

    public static final String CHANNEL_NAME_TIMEFORMATLOCALIZATION_ACTIVECALENDARTYPE = "ActiveCalendarType";
    public static final String CHANNEL_LABEL_TIMEFORMATLOCALIZATION_ACTIVECALENDARTYPE = "activeCalendarType";
    public static final String CHANNEL_ID_TIMEFORMATLOCALIZATION_ACTIVECALENDARTYPE = "timeformatlocalization_activecalendartype";
    public static final ChannelTypeUID CHANNEL_TIMEFORMATLOCALIZATION_ACTIVECALENDARTYPE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TIMEFORMATLOCALIZATION_ACTIVECALENDARTYPE);

    public static final String CHANNEL_NAME_TIMEFORMATLOCALIZATION_SUPPORTEDCALENDARTYPES = "SupportedCalendarTypes";
    public static final String CHANNEL_LABEL_TIMEFORMATLOCALIZATION_SUPPORTEDCALENDARTYPES = "supportedCalendarTypes";
    public static final String CHANNEL_ID_TIMEFORMATLOCALIZATION_SUPPORTEDCALENDARTYPES = "timeformatlocalization_supportedcalendartypes";
    public static final ChannelTypeUID CHANNEL_TIMEFORMATLOCALIZATION_SUPPORTEDCALENDARTYPES = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TIMEFORMATLOCALIZATION_SUPPORTEDCALENDARTYPES);

    // UnitLocalization Cluster

    public static final String CHANNEL_NAME_UNITLOCALIZATION_TEMPERATUREUNIT = "TemperatureUnit";
    public static final String CHANNEL_LABEL_UNITLOCALIZATION_TEMPERATUREUNIT = "temperatureUnit";
    public static final String CHANNEL_ID_UNITLOCALIZATION_TEMPERATUREUNIT = "unitlocalization_temperatureunit";
    public static final ChannelTypeUID CHANNEL_UNITLOCALIZATION_TEMPERATUREUNIT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_UNITLOCALIZATION_TEMPERATUREUNIT);

    // PowerSourceConfiguration Cluster

    public static final String CHANNEL_NAME_POWERSOURCECONFIGURATION_SOURCES = "Sources";
    public static final String CHANNEL_LABEL_POWERSOURCECONFIGURATION_SOURCES = "sources";
    public static final String CHANNEL_ID_POWERSOURCECONFIGURATION_SOURCES = "powersourceconfiguration_sources";
    public static final ChannelTypeUID CHANNEL_POWERSOURCECONFIGURATION_SOURCES = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCECONFIGURATION_SOURCES);

    // PowerSource Cluster

    public static final String CHANNEL_NAME_POWERSOURCE_STATUS = "Status";
    public static final String CHANNEL_LABEL_POWERSOURCE_STATUS = "status";
    public static final String CHANNEL_ID_POWERSOURCE_STATUS = "powersource_status";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_STATUS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_STATUS);

    public static final String CHANNEL_NAME_POWERSOURCE_ORDER = "Order";
    public static final String CHANNEL_LABEL_POWERSOURCE_ORDER = "order";
    public static final String CHANNEL_ID_POWERSOURCE_ORDER = "powersource_order";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_ORDER = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_ORDER);

    public static final String CHANNEL_NAME_POWERSOURCE_DESCRIPTION = "Description";
    public static final String CHANNEL_LABEL_POWERSOURCE_DESCRIPTION = "description";
    public static final String CHANNEL_ID_POWERSOURCE_DESCRIPTION = "powersource_description";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_DESCRIPTION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_DESCRIPTION);

    public static final String CHANNEL_NAME_POWERSOURCE_WIREDASSESSEDINPUTVOLTAGE = "WiredAssessedInputVoltage";
    public static final String CHANNEL_LABEL_POWERSOURCE_WIREDASSESSEDINPUTVOLTAGE = "wiredAssessedInputVoltage";
    public static final String CHANNEL_ID_POWERSOURCE_WIREDASSESSEDINPUTVOLTAGE = "powersource_wiredassessedinputvoltage";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_WIREDASSESSEDINPUTVOLTAGE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_WIREDASSESSEDINPUTVOLTAGE);

    public static final String CHANNEL_NAME_POWERSOURCE_WIREDASSESSEDINPUTFREQUENCY = "WiredAssessedInputFrequency";
    public static final String CHANNEL_LABEL_POWERSOURCE_WIREDASSESSEDINPUTFREQUENCY = "wiredAssessedInputFrequency";
    public static final String CHANNEL_ID_POWERSOURCE_WIREDASSESSEDINPUTFREQUENCY = "powersource_wiredassessedinputfrequency";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_WIREDASSESSEDINPUTFREQUENCY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_WIREDASSESSEDINPUTFREQUENCY);

    public static final String CHANNEL_NAME_POWERSOURCE_WIREDCURRENTTYPE = "WiredCurrentType";
    public static final String CHANNEL_LABEL_POWERSOURCE_WIREDCURRENTTYPE = "wiredCurrentType";
    public static final String CHANNEL_ID_POWERSOURCE_WIREDCURRENTTYPE = "powersource_wiredcurrenttype";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_WIREDCURRENTTYPE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_WIREDCURRENTTYPE);

    public static final String CHANNEL_NAME_POWERSOURCE_WIREDASSESSEDCURRENT = "WiredAssessedCurrent";
    public static final String CHANNEL_LABEL_POWERSOURCE_WIREDASSESSEDCURRENT = "wiredAssessedCurrent";
    public static final String CHANNEL_ID_POWERSOURCE_WIREDASSESSEDCURRENT = "powersource_wiredassessedcurrent";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_WIREDASSESSEDCURRENT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_WIREDASSESSEDCURRENT);

    public static final String CHANNEL_NAME_POWERSOURCE_WIREDNOMINALVOLTAGE = "WiredNominalVoltage";
    public static final String CHANNEL_LABEL_POWERSOURCE_WIREDNOMINALVOLTAGE = "wiredNominalVoltage";
    public static final String CHANNEL_ID_POWERSOURCE_WIREDNOMINALVOLTAGE = "powersource_wirednominalvoltage";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_WIREDNOMINALVOLTAGE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_WIREDNOMINALVOLTAGE);

    public static final String CHANNEL_NAME_POWERSOURCE_WIREDMAXIMUMCURRENT = "WiredMaximumCurrent";
    public static final String CHANNEL_LABEL_POWERSOURCE_WIREDMAXIMUMCURRENT = "wiredMaximumCurrent";
    public static final String CHANNEL_ID_POWERSOURCE_WIREDMAXIMUMCURRENT = "powersource_wiredmaximumcurrent";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_WIREDMAXIMUMCURRENT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_WIREDMAXIMUMCURRENT);

    public static final String CHANNEL_NAME_POWERSOURCE_WIREDPRESENT = "WiredPresent";
    public static final String CHANNEL_LABEL_POWERSOURCE_WIREDPRESENT = "wiredPresent";
    public static final String CHANNEL_ID_POWERSOURCE_WIREDPRESENT = "powersource_wiredpresent";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_WIREDPRESENT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_WIREDPRESENT);

    public static final String CHANNEL_NAME_POWERSOURCE_ACTIVEWIREDFAULTS = "ActiveWiredFaults";
    public static final String CHANNEL_LABEL_POWERSOURCE_ACTIVEWIREDFAULTS = "activeWiredFaults";
    public static final String CHANNEL_ID_POWERSOURCE_ACTIVEWIREDFAULTS = "powersource_activewiredfaults";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_ACTIVEWIREDFAULTS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_ACTIVEWIREDFAULTS);

    public static final String CHANNEL_NAME_POWERSOURCE_BATVOLTAGE = "BatVoltage";
    public static final String CHANNEL_LABEL_POWERSOURCE_BATVOLTAGE = "batVoltage";
    public static final String CHANNEL_ID_POWERSOURCE_BATVOLTAGE = "powersource_batvoltage";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_BATVOLTAGE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_BATVOLTAGE);

    public static final String CHANNEL_NAME_POWERSOURCE_BATPERCENTREMAINING = "BatPercentRemaining";
    public static final String CHANNEL_LABEL_POWERSOURCE_BATPERCENTREMAINING = "batPercentRemaining";
    public static final String CHANNEL_ID_POWERSOURCE_BATPERCENTREMAINING = "powersource_batpercentremaining";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_BATPERCENTREMAINING = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_BATPERCENTREMAINING);

    public static final String CHANNEL_NAME_POWERSOURCE_BATTIMEREMAINING = "BatTimeRemaining";
    public static final String CHANNEL_LABEL_POWERSOURCE_BATTIMEREMAINING = "batTimeRemaining";
    public static final String CHANNEL_ID_POWERSOURCE_BATTIMEREMAINING = "powersource_battimeremaining";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_BATTIMEREMAINING = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_BATTIMEREMAINING);

    public static final String CHANNEL_NAME_POWERSOURCE_BATCHARGELEVEL = "BatChargeLevel";
    public static final String CHANNEL_LABEL_POWERSOURCE_BATCHARGELEVEL = "batChargeLevel";
    public static final String CHANNEL_ID_POWERSOURCE_BATCHARGELEVEL = "powersource_batchargelevel";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_BATCHARGELEVEL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_BATCHARGELEVEL);

    public static final String CHANNEL_NAME_POWERSOURCE_BATREPLACEMENTNEEDED = "BatReplacementNeeded";
    public static final String CHANNEL_LABEL_POWERSOURCE_BATREPLACEMENTNEEDED = "batReplacementNeeded";
    public static final String CHANNEL_ID_POWERSOURCE_BATREPLACEMENTNEEDED = "powersource_batreplacementneeded";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_BATREPLACEMENTNEEDED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_BATREPLACEMENTNEEDED);

    public static final String CHANNEL_NAME_POWERSOURCE_BATREPLACEABILITY = "BatReplaceability";
    public static final String CHANNEL_LABEL_POWERSOURCE_BATREPLACEABILITY = "batReplaceability";
    public static final String CHANNEL_ID_POWERSOURCE_BATREPLACEABILITY = "powersource_batreplaceability";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_BATREPLACEABILITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_BATREPLACEABILITY);

    public static final String CHANNEL_NAME_POWERSOURCE_BATPRESENT = "BatPresent";
    public static final String CHANNEL_LABEL_POWERSOURCE_BATPRESENT = "batPresent";
    public static final String CHANNEL_ID_POWERSOURCE_BATPRESENT = "powersource_batpresent";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_BATPRESENT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_BATPRESENT);

    public static final String CHANNEL_NAME_POWERSOURCE_ACTIVEBATFAULTS = "ActiveBatFaults";
    public static final String CHANNEL_LABEL_POWERSOURCE_ACTIVEBATFAULTS = "activeBatFaults";
    public static final String CHANNEL_ID_POWERSOURCE_ACTIVEBATFAULTS = "powersource_activebatfaults";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_ACTIVEBATFAULTS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_ACTIVEBATFAULTS);

    public static final String CHANNEL_NAME_POWERSOURCE_BATREPLACEMENTDESCRIPTION = "BatReplacementDescription";
    public static final String CHANNEL_LABEL_POWERSOURCE_BATREPLACEMENTDESCRIPTION = "batReplacementDescription";
    public static final String CHANNEL_ID_POWERSOURCE_BATREPLACEMENTDESCRIPTION = "powersource_batreplacementdescription";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_BATREPLACEMENTDESCRIPTION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_BATREPLACEMENTDESCRIPTION);

    public static final String CHANNEL_NAME_POWERSOURCE_BATCOMMONDESIGNATION = "BatCommonDesignation";
    public static final String CHANNEL_LABEL_POWERSOURCE_BATCOMMONDESIGNATION = "batCommonDesignation";
    public static final String CHANNEL_ID_POWERSOURCE_BATCOMMONDESIGNATION = "powersource_batcommondesignation";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_BATCOMMONDESIGNATION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_BATCOMMONDESIGNATION);

    public static final String CHANNEL_NAME_POWERSOURCE_BATANSIDESIGNATION = "BatAnsiDesignation";
    public static final String CHANNEL_LABEL_POWERSOURCE_BATANSIDESIGNATION = "batAnsiDesignation";
    public static final String CHANNEL_ID_POWERSOURCE_BATANSIDESIGNATION = "powersource_batansidesignation";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_BATANSIDESIGNATION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_BATANSIDESIGNATION);

    public static final String CHANNEL_NAME_POWERSOURCE_BATIECDESIGNATION = "BatIecDesignation";
    public static final String CHANNEL_LABEL_POWERSOURCE_BATIECDESIGNATION = "batIecDesignation";
    public static final String CHANNEL_ID_POWERSOURCE_BATIECDESIGNATION = "powersource_batiecdesignation";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_BATIECDESIGNATION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_BATIECDESIGNATION);

    public static final String CHANNEL_NAME_POWERSOURCE_BATAPPROVEDCHEMISTRY = "BatApprovedChemistry";
    public static final String CHANNEL_LABEL_POWERSOURCE_BATAPPROVEDCHEMISTRY = "batApprovedChemistry";
    public static final String CHANNEL_ID_POWERSOURCE_BATAPPROVEDCHEMISTRY = "powersource_batapprovedchemistry";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_BATAPPROVEDCHEMISTRY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_BATAPPROVEDCHEMISTRY);

    public static final String CHANNEL_NAME_POWERSOURCE_BATCAPACITY = "BatCapacity";
    public static final String CHANNEL_LABEL_POWERSOURCE_BATCAPACITY = "batCapacity";
    public static final String CHANNEL_ID_POWERSOURCE_BATCAPACITY = "powersource_batcapacity";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_BATCAPACITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_BATCAPACITY);

    public static final String CHANNEL_NAME_POWERSOURCE_BATQUANTITY = "BatQuantity";
    public static final String CHANNEL_LABEL_POWERSOURCE_BATQUANTITY = "batQuantity";
    public static final String CHANNEL_ID_POWERSOURCE_BATQUANTITY = "powersource_batquantity";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_BATQUANTITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_BATQUANTITY);

    public static final String CHANNEL_NAME_POWERSOURCE_BATCHARGESTATE = "BatChargeState";
    public static final String CHANNEL_LABEL_POWERSOURCE_BATCHARGESTATE = "batChargeState";
    public static final String CHANNEL_ID_POWERSOURCE_BATCHARGESTATE = "powersource_batchargestate";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_BATCHARGESTATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_BATCHARGESTATE);

    public static final String CHANNEL_NAME_POWERSOURCE_BATTIMETOFULLCHARGE = "BatTimeToFullCharge";
    public static final String CHANNEL_LABEL_POWERSOURCE_BATTIMETOFULLCHARGE = "batTimeToFullCharge";
    public static final String CHANNEL_ID_POWERSOURCE_BATTIMETOFULLCHARGE = "powersource_battimetofullcharge";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_BATTIMETOFULLCHARGE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_BATTIMETOFULLCHARGE);

    public static final String CHANNEL_NAME_POWERSOURCE_BATFUNCTIONALWHILECHARGING = "BatFunctionalWhileCharging";
    public static final String CHANNEL_LABEL_POWERSOURCE_BATFUNCTIONALWHILECHARGING = "batFunctionalWhileCharging";
    public static final String CHANNEL_ID_POWERSOURCE_BATFUNCTIONALWHILECHARGING = "powersource_batfunctionalwhilecharging";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_BATFUNCTIONALWHILECHARGING = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_BATFUNCTIONALWHILECHARGING);

    public static final String CHANNEL_NAME_POWERSOURCE_BATCHARGINGCURRENT = "BatChargingCurrent";
    public static final String CHANNEL_LABEL_POWERSOURCE_BATCHARGINGCURRENT = "batChargingCurrent";
    public static final String CHANNEL_ID_POWERSOURCE_BATCHARGINGCURRENT = "powersource_batchargingcurrent";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_BATCHARGINGCURRENT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_BATCHARGINGCURRENT);

    public static final String CHANNEL_NAME_POWERSOURCE_ACTIVEBATCHARGEFAULTS = "ActiveBatChargeFaults";
    public static final String CHANNEL_LABEL_POWERSOURCE_ACTIVEBATCHARGEFAULTS = "activeBatChargeFaults";
    public static final String CHANNEL_ID_POWERSOURCE_ACTIVEBATCHARGEFAULTS = "powersource_activebatchargefaults";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_ACTIVEBATCHARGEFAULTS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_ACTIVEBATCHARGEFAULTS);

    public static final String CHANNEL_NAME_POWERSOURCE_ENDPOINTLIST = "EndpointList";
    public static final String CHANNEL_LABEL_POWERSOURCE_ENDPOINTLIST = "endpointList";
    public static final String CHANNEL_ID_POWERSOURCE_ENDPOINTLIST = "powersource_endpointlist";
    public static final ChannelTypeUID CHANNEL_POWERSOURCE_ENDPOINTLIST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERSOURCE_ENDPOINTLIST);

    // PowerTopology Cluster

    public static final String CHANNEL_NAME_POWERTOPOLOGY_AVAILABLEENDPOINTS = "AvailableEndpoints";
    public static final String CHANNEL_LABEL_POWERTOPOLOGY_AVAILABLEENDPOINTS = "availableEndpoints";
    public static final String CHANNEL_ID_POWERTOPOLOGY_AVAILABLEENDPOINTS = "powertopology_availableendpoints";
    public static final ChannelTypeUID CHANNEL_POWERTOPOLOGY_AVAILABLEENDPOINTS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERTOPOLOGY_AVAILABLEENDPOINTS);

    public static final String CHANNEL_NAME_POWERTOPOLOGY_ACTIVEENDPOINTS = "ActiveEndpoints";
    public static final String CHANNEL_LABEL_POWERTOPOLOGY_ACTIVEENDPOINTS = "activeEndpoints";
    public static final String CHANNEL_ID_POWERTOPOLOGY_ACTIVEENDPOINTS = "powertopology_activeendpoints";
    public static final ChannelTypeUID CHANNEL_POWERTOPOLOGY_ACTIVEENDPOINTS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_POWERTOPOLOGY_ACTIVEENDPOINTS);

    // NetworkCommissioning Cluster

    public static final String CHANNEL_NAME_NETWORKCOMMISSIONING_MAXNETWORKS = "MaxNetworks";
    public static final String CHANNEL_LABEL_NETWORKCOMMISSIONING_MAXNETWORKS = "maxNetworks";
    public static final String CHANNEL_ID_NETWORKCOMMISSIONING_MAXNETWORKS = "networkcommissioning_maxnetworks";
    public static final ChannelTypeUID CHANNEL_NETWORKCOMMISSIONING_MAXNETWORKS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_NETWORKCOMMISSIONING_MAXNETWORKS);

    public static final String CHANNEL_NAME_NETWORKCOMMISSIONING_NETWORKS = "Networks";
    public static final String CHANNEL_LABEL_NETWORKCOMMISSIONING_NETWORKS = "networks";
    public static final String CHANNEL_ID_NETWORKCOMMISSIONING_NETWORKS = "networkcommissioning_networks";
    public static final ChannelTypeUID CHANNEL_NETWORKCOMMISSIONING_NETWORKS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_NETWORKCOMMISSIONING_NETWORKS);

    public static final String CHANNEL_NAME_NETWORKCOMMISSIONING_SCANMAXTIMESECONDS = "ScanMaxTimeSeconds";
    public static final String CHANNEL_LABEL_NETWORKCOMMISSIONING_SCANMAXTIMESECONDS = "scanMaxTimeSeconds";
    public static final String CHANNEL_ID_NETWORKCOMMISSIONING_SCANMAXTIMESECONDS = "networkcommissioning_scanmaxtimeseconds";
    public static final ChannelTypeUID CHANNEL_NETWORKCOMMISSIONING_SCANMAXTIMESECONDS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_NETWORKCOMMISSIONING_SCANMAXTIMESECONDS);

    public static final String CHANNEL_NAME_NETWORKCOMMISSIONING_CONNECTMAXTIMESECONDS = "ConnectMaxTimeSeconds";
    public static final String CHANNEL_LABEL_NETWORKCOMMISSIONING_CONNECTMAXTIMESECONDS = "connectMaxTimeSeconds";
    public static final String CHANNEL_ID_NETWORKCOMMISSIONING_CONNECTMAXTIMESECONDS = "networkcommissioning_connectmaxtimeseconds";
    public static final ChannelTypeUID CHANNEL_NETWORKCOMMISSIONING_CONNECTMAXTIMESECONDS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_NETWORKCOMMISSIONING_CONNECTMAXTIMESECONDS);

    public static final String CHANNEL_NAME_NETWORKCOMMISSIONING_INTERFACEENABLED = "InterfaceEnabled";
    public static final String CHANNEL_LABEL_NETWORKCOMMISSIONING_INTERFACEENABLED = "interfaceEnabled";
    public static final String CHANNEL_ID_NETWORKCOMMISSIONING_INTERFACEENABLED = "networkcommissioning_interfaceenabled";
    public static final ChannelTypeUID CHANNEL_NETWORKCOMMISSIONING_INTERFACEENABLED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_NETWORKCOMMISSIONING_INTERFACEENABLED);

    public static final String CHANNEL_NAME_NETWORKCOMMISSIONING_LASTNETWORKINGSTATUS = "LastNetworkingStatus";
    public static final String CHANNEL_LABEL_NETWORKCOMMISSIONING_LASTNETWORKINGSTATUS = "lastNetworkingStatus";
    public static final String CHANNEL_ID_NETWORKCOMMISSIONING_LASTNETWORKINGSTATUS = "networkcommissioning_lastnetworkingstatus";
    public static final ChannelTypeUID CHANNEL_NETWORKCOMMISSIONING_LASTNETWORKINGSTATUS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_NETWORKCOMMISSIONING_LASTNETWORKINGSTATUS);

    public static final String CHANNEL_NAME_NETWORKCOMMISSIONING_LASTNETWORKID = "LastNetworkId";
    public static final String CHANNEL_LABEL_NETWORKCOMMISSIONING_LASTNETWORKID = "lastNetworkId";
    public static final String CHANNEL_ID_NETWORKCOMMISSIONING_LASTNETWORKID = "networkcommissioning_lastnetworkid";
    public static final ChannelTypeUID CHANNEL_NETWORKCOMMISSIONING_LASTNETWORKID = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_NETWORKCOMMISSIONING_LASTNETWORKID);

    public static final String CHANNEL_NAME_NETWORKCOMMISSIONING_LASTCONNECTERRORVALUE = "LastConnectErrorValue";
    public static final String CHANNEL_LABEL_NETWORKCOMMISSIONING_LASTCONNECTERRORVALUE = "lastConnectErrorValue";
    public static final String CHANNEL_ID_NETWORKCOMMISSIONING_LASTCONNECTERRORVALUE = "networkcommissioning_lastconnecterrorvalue";
    public static final ChannelTypeUID CHANNEL_NETWORKCOMMISSIONING_LASTCONNECTERRORVALUE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_NETWORKCOMMISSIONING_LASTCONNECTERRORVALUE);

    public static final String CHANNEL_NAME_NETWORKCOMMISSIONING_SUPPORTEDWIFIBANDS = "SupportedWiFiBands";
    public static final String CHANNEL_LABEL_NETWORKCOMMISSIONING_SUPPORTEDWIFIBANDS = "supportedWiFiBands";
    public static final String CHANNEL_ID_NETWORKCOMMISSIONING_SUPPORTEDWIFIBANDS = "networkcommissioning_supportedwifibands";
    public static final ChannelTypeUID CHANNEL_NETWORKCOMMISSIONING_SUPPORTEDWIFIBANDS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_NETWORKCOMMISSIONING_SUPPORTEDWIFIBANDS);

    public static final String CHANNEL_NAME_NETWORKCOMMISSIONING_SUPPORTEDTHREADFEATURES = "SupportedThreadFeatures";
    public static final String CHANNEL_LABEL_NETWORKCOMMISSIONING_SUPPORTEDTHREADFEATURES = "supportedThreadFeatures";
    public static final String CHANNEL_ID_NETWORKCOMMISSIONING_SUPPORTEDTHREADFEATURES = "networkcommissioning_supportedthreadfeatures";
    public static final ChannelTypeUID CHANNEL_NETWORKCOMMISSIONING_SUPPORTEDTHREADFEATURES = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_NETWORKCOMMISSIONING_SUPPORTEDTHREADFEATURES);

    public static final String CHANNEL_NAME_NETWORKCOMMISSIONING_THREADVERSION = "ThreadVersion";
    public static final String CHANNEL_LABEL_NETWORKCOMMISSIONING_THREADVERSION = "threadVersion";
    public static final String CHANNEL_ID_NETWORKCOMMISSIONING_THREADVERSION = "networkcommissioning_threadversion";
    public static final ChannelTypeUID CHANNEL_NETWORKCOMMISSIONING_THREADVERSION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_NETWORKCOMMISSIONING_THREADVERSION);

    // GeneralCommissioning Cluster

    public static final String CHANNEL_NAME_GENERALCOMMISSIONING_BREADCRUMB = "Breadcrumb";
    public static final String CHANNEL_LABEL_GENERALCOMMISSIONING_BREADCRUMB = "breadcrumb";
    public static final String CHANNEL_ID_GENERALCOMMISSIONING_BREADCRUMB = "generalcommissioning_breadcrumb";
    public static final ChannelTypeUID CHANNEL_GENERALCOMMISSIONING_BREADCRUMB = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_GENERALCOMMISSIONING_BREADCRUMB);

    public static final String CHANNEL_NAME_GENERALCOMMISSIONING_BASICCOMMISSIONINGINFO = "BasicCommissioningInfo";
    public static final String CHANNEL_LABEL_GENERALCOMMISSIONING_BASICCOMMISSIONINGINFO = "basicCommissioningInfo";
    public static final String CHANNEL_ID_GENERALCOMMISSIONING_BASICCOMMISSIONINGINFO = "generalcommissioning_basiccommissioninginfo";
    public static final ChannelTypeUID CHANNEL_GENERALCOMMISSIONING_BASICCOMMISSIONINGINFO = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_GENERALCOMMISSIONING_BASICCOMMISSIONINGINFO);

    public static final String CHANNEL_NAME_GENERALCOMMISSIONING_REGULATORYCONFIG = "RegulatoryConfig";
    public static final String CHANNEL_LABEL_GENERALCOMMISSIONING_REGULATORYCONFIG = "regulatoryConfig";
    public static final String CHANNEL_ID_GENERALCOMMISSIONING_REGULATORYCONFIG = "generalcommissioning_regulatoryconfig";
    public static final ChannelTypeUID CHANNEL_GENERALCOMMISSIONING_REGULATORYCONFIG = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_GENERALCOMMISSIONING_REGULATORYCONFIG);

    public static final String CHANNEL_NAME_GENERALCOMMISSIONING_LOCATIONCAPABILITY = "LocationCapability";
    public static final String CHANNEL_LABEL_GENERALCOMMISSIONING_LOCATIONCAPABILITY = "locationCapability";
    public static final String CHANNEL_ID_GENERALCOMMISSIONING_LOCATIONCAPABILITY = "generalcommissioning_locationcapability";
    public static final ChannelTypeUID CHANNEL_GENERALCOMMISSIONING_LOCATIONCAPABILITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_GENERALCOMMISSIONING_LOCATIONCAPABILITY);

    public static final String CHANNEL_NAME_GENERALCOMMISSIONING_SUPPORTSCONCURRENTCONNECTION = "SupportsConcurrentConnection";
    public static final String CHANNEL_LABEL_GENERALCOMMISSIONING_SUPPORTSCONCURRENTCONNECTION = "supportsConcurrentConnection";
    public static final String CHANNEL_ID_GENERALCOMMISSIONING_SUPPORTSCONCURRENTCONNECTION = "generalcommissioning_supportsconcurrentconnection";
    public static final ChannelTypeUID CHANNEL_GENERALCOMMISSIONING_SUPPORTSCONCURRENTCONNECTION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_GENERALCOMMISSIONING_SUPPORTSCONCURRENTCONNECTION);

    // DiagnosticLogs Cluster

    // GeneralDiagnostics Cluster

    public static final String CHANNEL_NAME_GENERALDIAGNOSTICS_NETWORKINTERFACES = "NetworkInterfaces";
    public static final String CHANNEL_LABEL_GENERALDIAGNOSTICS_NETWORKINTERFACES = "networkInterfaces";
    public static final String CHANNEL_ID_GENERALDIAGNOSTICS_NETWORKINTERFACES = "generaldiagnostics_networkinterfaces";
    public static final ChannelTypeUID CHANNEL_GENERALDIAGNOSTICS_NETWORKINTERFACES = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_GENERALDIAGNOSTICS_NETWORKINTERFACES);

    public static final String CHANNEL_NAME_GENERALDIAGNOSTICS_REBOOTCOUNT = "RebootCount";
    public static final String CHANNEL_LABEL_GENERALDIAGNOSTICS_REBOOTCOUNT = "rebootCount";
    public static final String CHANNEL_ID_GENERALDIAGNOSTICS_REBOOTCOUNT = "generaldiagnostics_rebootcount";
    public static final ChannelTypeUID CHANNEL_GENERALDIAGNOSTICS_REBOOTCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_GENERALDIAGNOSTICS_REBOOTCOUNT);

    public static final String CHANNEL_NAME_GENERALDIAGNOSTICS_UPTIME = "UpTime";
    public static final String CHANNEL_LABEL_GENERALDIAGNOSTICS_UPTIME = "upTime";
    public static final String CHANNEL_ID_GENERALDIAGNOSTICS_UPTIME = "generaldiagnostics_uptime";
    public static final ChannelTypeUID CHANNEL_GENERALDIAGNOSTICS_UPTIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_GENERALDIAGNOSTICS_UPTIME);

    public static final String CHANNEL_NAME_GENERALDIAGNOSTICS_TOTALOPERATIONALHOURS = "TotalOperationalHours";
    public static final String CHANNEL_LABEL_GENERALDIAGNOSTICS_TOTALOPERATIONALHOURS = "totalOperationalHours";
    public static final String CHANNEL_ID_GENERALDIAGNOSTICS_TOTALOPERATIONALHOURS = "generaldiagnostics_totaloperationalhours";
    public static final ChannelTypeUID CHANNEL_GENERALDIAGNOSTICS_TOTALOPERATIONALHOURS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_GENERALDIAGNOSTICS_TOTALOPERATIONALHOURS);

    public static final String CHANNEL_NAME_GENERALDIAGNOSTICS_BOOTREASON = "BootReason";
    public static final String CHANNEL_LABEL_GENERALDIAGNOSTICS_BOOTREASON = "bootReason";
    public static final String CHANNEL_ID_GENERALDIAGNOSTICS_BOOTREASON = "generaldiagnostics_bootreason";
    public static final ChannelTypeUID CHANNEL_GENERALDIAGNOSTICS_BOOTREASON = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_GENERALDIAGNOSTICS_BOOTREASON);

    public static final String CHANNEL_NAME_GENERALDIAGNOSTICS_ACTIVEHARDWAREFAULTS = "ActiveHardwareFaults";
    public static final String CHANNEL_LABEL_GENERALDIAGNOSTICS_ACTIVEHARDWAREFAULTS = "activeHardwareFaults";
    public static final String CHANNEL_ID_GENERALDIAGNOSTICS_ACTIVEHARDWAREFAULTS = "generaldiagnostics_activehardwarefaults";
    public static final ChannelTypeUID CHANNEL_GENERALDIAGNOSTICS_ACTIVEHARDWAREFAULTS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_GENERALDIAGNOSTICS_ACTIVEHARDWAREFAULTS);

    public static final String CHANNEL_NAME_GENERALDIAGNOSTICS_ACTIVERADIOFAULTS = "ActiveRadioFaults";
    public static final String CHANNEL_LABEL_GENERALDIAGNOSTICS_ACTIVERADIOFAULTS = "activeRadioFaults";
    public static final String CHANNEL_ID_GENERALDIAGNOSTICS_ACTIVERADIOFAULTS = "generaldiagnostics_activeradiofaults";
    public static final ChannelTypeUID CHANNEL_GENERALDIAGNOSTICS_ACTIVERADIOFAULTS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_GENERALDIAGNOSTICS_ACTIVERADIOFAULTS);

    public static final String CHANNEL_NAME_GENERALDIAGNOSTICS_ACTIVENETWORKFAULTS = "ActiveNetworkFaults";
    public static final String CHANNEL_LABEL_GENERALDIAGNOSTICS_ACTIVENETWORKFAULTS = "activeNetworkFaults";
    public static final String CHANNEL_ID_GENERALDIAGNOSTICS_ACTIVENETWORKFAULTS = "generaldiagnostics_activenetworkfaults";
    public static final ChannelTypeUID CHANNEL_GENERALDIAGNOSTICS_ACTIVENETWORKFAULTS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_GENERALDIAGNOSTICS_ACTIVENETWORKFAULTS);

    public static final String CHANNEL_NAME_GENERALDIAGNOSTICS_TESTEVENTTRIGGERSENABLED = "TestEventTriggersEnabled";
    public static final String CHANNEL_LABEL_GENERALDIAGNOSTICS_TESTEVENTTRIGGERSENABLED = "testEventTriggersEnabled";
    public static final String CHANNEL_ID_GENERALDIAGNOSTICS_TESTEVENTTRIGGERSENABLED = "generaldiagnostics_testeventtriggersenabled";
    public static final ChannelTypeUID CHANNEL_GENERALDIAGNOSTICS_TESTEVENTTRIGGERSENABLED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_GENERALDIAGNOSTICS_TESTEVENTTRIGGERSENABLED);

    // SoftwareDiagnostics Cluster

    public static final String CHANNEL_NAME_SOFTWAREDIAGNOSTICS_THREADMETRICS = "ThreadMetrics";
    public static final String CHANNEL_LABEL_SOFTWAREDIAGNOSTICS_THREADMETRICS = "threadMetrics";
    public static final String CHANNEL_ID_SOFTWAREDIAGNOSTICS_THREADMETRICS = "softwarediagnostics_threadmetrics";
    public static final ChannelTypeUID CHANNEL_SOFTWAREDIAGNOSTICS_THREADMETRICS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SOFTWAREDIAGNOSTICS_THREADMETRICS);

    public static final String CHANNEL_NAME_SOFTWAREDIAGNOSTICS_CURRENTHEAPFREE = "CurrentHeapFree";
    public static final String CHANNEL_LABEL_SOFTWAREDIAGNOSTICS_CURRENTHEAPFREE = "currentHeapFree";
    public static final String CHANNEL_ID_SOFTWAREDIAGNOSTICS_CURRENTHEAPFREE = "softwarediagnostics_currentheapfree";
    public static final ChannelTypeUID CHANNEL_SOFTWAREDIAGNOSTICS_CURRENTHEAPFREE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SOFTWAREDIAGNOSTICS_CURRENTHEAPFREE);

    public static final String CHANNEL_NAME_SOFTWAREDIAGNOSTICS_CURRENTHEAPUSED = "CurrentHeapUsed";
    public static final String CHANNEL_LABEL_SOFTWAREDIAGNOSTICS_CURRENTHEAPUSED = "currentHeapUsed";
    public static final String CHANNEL_ID_SOFTWAREDIAGNOSTICS_CURRENTHEAPUSED = "softwarediagnostics_currentheapused";
    public static final ChannelTypeUID CHANNEL_SOFTWAREDIAGNOSTICS_CURRENTHEAPUSED = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SOFTWAREDIAGNOSTICS_CURRENTHEAPUSED);

    public static final String CHANNEL_NAME_SOFTWAREDIAGNOSTICS_CURRENTHEAPHIGHWATERMARK = "CurrentHeapHighWatermark";
    public static final String CHANNEL_LABEL_SOFTWAREDIAGNOSTICS_CURRENTHEAPHIGHWATERMARK = "currentHeapHighWatermark";
    public static final String CHANNEL_ID_SOFTWAREDIAGNOSTICS_CURRENTHEAPHIGHWATERMARK = "softwarediagnostics_currentheaphighwatermark";
    public static final ChannelTypeUID CHANNEL_SOFTWAREDIAGNOSTICS_CURRENTHEAPHIGHWATERMARK = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_SOFTWAREDIAGNOSTICS_CURRENTHEAPHIGHWATERMARK);

    // ThreadNetworkDiagnostics Cluster

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_CHANNEL = "Channel";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_CHANNEL = "channel";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_CHANNEL = "threadnetworkdiagnostics_channel";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_CHANNEL = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_CHANNEL);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_ROUTINGROLE = "RoutingRole";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_ROUTINGROLE = "routingRole";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_ROUTINGROLE = "threadnetworkdiagnostics_routingrole";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_ROUTINGROLE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_ROUTINGROLE);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_NETWORKNAME = "NetworkName";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_NETWORKNAME = "networkName";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_NETWORKNAME = "threadnetworkdiagnostics_networkname";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_NETWORKNAME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_NETWORKNAME);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_PANID = "PanId";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_PANID = "panId";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_PANID = "threadnetworkdiagnostics_panid";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_PANID = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_PANID);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_EXTENDEDPANID = "ExtendedPanId";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_EXTENDEDPANID = "extendedPanId";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_EXTENDEDPANID = "threadnetworkdiagnostics_extendedpanid";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_EXTENDEDPANID = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_EXTENDEDPANID);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_MESHLOCALPREFIX = "MeshLocalPrefix";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_MESHLOCALPREFIX = "meshLocalPrefix";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_MESHLOCALPREFIX = "threadnetworkdiagnostics_meshlocalprefix";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_MESHLOCALPREFIX = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_MESHLOCALPREFIX);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_OVERRUNCOUNT = "OverrunCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_OVERRUNCOUNT = "overrunCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_OVERRUNCOUNT = "threadnetworkdiagnostics_overruncount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_OVERRUNCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_OVERRUNCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_NEIGHBORTABLE = "NeighborTable";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_NEIGHBORTABLE = "neighborTable";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_NEIGHBORTABLE = "threadnetworkdiagnostics_neighbortable";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_NEIGHBORTABLE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_NEIGHBORTABLE);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_ROUTETABLE = "RouteTable";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_ROUTETABLE = "routeTable";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_ROUTETABLE = "threadnetworkdiagnostics_routetable";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_ROUTETABLE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_ROUTETABLE);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_PARTITIONID = "PartitionId";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_PARTITIONID = "partitionId";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_PARTITIONID = "threadnetworkdiagnostics_partitionid";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_PARTITIONID = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_PARTITIONID);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_WEIGHTING = "Weighting";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_WEIGHTING = "weighting";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_WEIGHTING = "threadnetworkdiagnostics_weighting";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_WEIGHTING = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_WEIGHTING);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_DATAVERSION = "DataVersion";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_DATAVERSION = "dataVersion";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_DATAVERSION = "threadnetworkdiagnostics_dataversion";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_DATAVERSION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_DATAVERSION);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_STABLEDATAVERSION = "StableDataVersion";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_STABLEDATAVERSION = "stableDataVersion";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_STABLEDATAVERSION = "threadnetworkdiagnostics_stabledataversion";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_STABLEDATAVERSION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_STABLEDATAVERSION);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_LEADERROUTERID = "LeaderRouterId";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_LEADERROUTERID = "leaderRouterId";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_LEADERROUTERID = "threadnetworkdiagnostics_leaderrouterid";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_LEADERROUTERID = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_LEADERROUTERID);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_DETACHEDROLECOUNT = "DetachedRoleCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_DETACHEDROLECOUNT = "detachedRoleCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_DETACHEDROLECOUNT = "threadnetworkdiagnostics_detachedrolecount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_DETACHEDROLECOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_DETACHEDROLECOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_CHILDROLECOUNT = "ChildRoleCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_CHILDROLECOUNT = "childRoleCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_CHILDROLECOUNT = "threadnetworkdiagnostics_childrolecount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_CHILDROLECOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_CHILDROLECOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_ROUTERROLECOUNT = "RouterRoleCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_ROUTERROLECOUNT = "routerRoleCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_ROUTERROLECOUNT = "threadnetworkdiagnostics_routerrolecount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_ROUTERROLECOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_ROUTERROLECOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_LEADERROLECOUNT = "LeaderRoleCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_LEADERROLECOUNT = "leaderRoleCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_LEADERROLECOUNT = "threadnetworkdiagnostics_leaderrolecount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_LEADERROLECOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_LEADERROLECOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_ATTACHATTEMPTCOUNT = "AttachAttemptCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_ATTACHATTEMPTCOUNT = "attachAttemptCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_ATTACHATTEMPTCOUNT = "threadnetworkdiagnostics_attachattemptcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_ATTACHATTEMPTCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_ATTACHATTEMPTCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_PARTITIONIDCHANGECOUNT = "PartitionIdChangeCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_PARTITIONIDCHANGECOUNT = "partitionIdChangeCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_PARTITIONIDCHANGECOUNT = "threadnetworkdiagnostics_partitionidchangecount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_PARTITIONIDCHANGECOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_PARTITIONIDCHANGECOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_BETTERPARTITIONATTACHATTEMPTCOUNT = "BetterPartitionAttachAttemptCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_BETTERPARTITIONATTACHATTEMPTCOUNT = "betterPartitionAttachAttemptCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_BETTERPARTITIONATTACHATTEMPTCOUNT = "threadnetworkdiagnostics_betterpartitionattachattemptcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_BETTERPARTITIONATTACHATTEMPTCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_BETTERPARTITIONATTACHATTEMPTCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_PARENTCHANGECOUNT = "ParentChangeCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_PARENTCHANGECOUNT = "parentChangeCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_PARENTCHANGECOUNT = "threadnetworkdiagnostics_parentchangecount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_PARENTCHANGECOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_PARENTCHANGECOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_TXTOTALCOUNT = "TxTotalCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_TXTOTALCOUNT = "txTotalCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXTOTALCOUNT = "threadnetworkdiagnostics_txtotalcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_TXTOTALCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXTOTALCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_TXUNICASTCOUNT = "TxUnicastCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_TXUNICASTCOUNT = "txUnicastCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXUNICASTCOUNT = "threadnetworkdiagnostics_txunicastcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_TXUNICASTCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXUNICASTCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_TXBROADCASTCOUNT = "TxBroadcastCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_TXBROADCASTCOUNT = "txBroadcastCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXBROADCASTCOUNT = "threadnetworkdiagnostics_txbroadcastcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_TXBROADCASTCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXBROADCASTCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_TXACKREQUESTEDCOUNT = "TxAckRequestedCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_TXACKREQUESTEDCOUNT = "txAckRequestedCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXACKREQUESTEDCOUNT = "threadnetworkdiagnostics_txackrequestedcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_TXACKREQUESTEDCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXACKREQUESTEDCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_TXACKEDCOUNT = "TxAckedCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_TXACKEDCOUNT = "txAckedCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXACKEDCOUNT = "threadnetworkdiagnostics_txackedcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_TXACKEDCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXACKEDCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_TXNOACKREQUESTEDCOUNT = "TxNoAckRequestedCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_TXNOACKREQUESTEDCOUNT = "txNoAckRequestedCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXNOACKREQUESTEDCOUNT = "threadnetworkdiagnostics_txnoackrequestedcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_TXNOACKREQUESTEDCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXNOACKREQUESTEDCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_TXDATACOUNT = "TxDataCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_TXDATACOUNT = "txDataCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXDATACOUNT = "threadnetworkdiagnostics_txdatacount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_TXDATACOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXDATACOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_TXDATAPOLLCOUNT = "TxDataPollCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_TXDATAPOLLCOUNT = "txDataPollCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXDATAPOLLCOUNT = "threadnetworkdiagnostics_txdatapollcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_TXDATAPOLLCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXDATAPOLLCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_TXBEACONCOUNT = "TxBeaconCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_TXBEACONCOUNT = "txBeaconCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXBEACONCOUNT = "threadnetworkdiagnostics_txbeaconcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_TXBEACONCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXBEACONCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_TXBEACONREQUESTCOUNT = "TxBeaconRequestCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_TXBEACONREQUESTCOUNT = "txBeaconRequestCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXBEACONREQUESTCOUNT = "threadnetworkdiagnostics_txbeaconrequestcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_TXBEACONREQUESTCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXBEACONREQUESTCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_TXOTHERCOUNT = "TxOtherCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_TXOTHERCOUNT = "txOtherCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXOTHERCOUNT = "threadnetworkdiagnostics_txothercount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_TXOTHERCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXOTHERCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_TXRETRYCOUNT = "TxRetryCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_TXRETRYCOUNT = "txRetryCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXRETRYCOUNT = "threadnetworkdiagnostics_txretrycount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_TXRETRYCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXRETRYCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_TXDIRECTMAXRETRYEXPIRYCOUNT = "TxDirectMaxRetryExpiryCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_TXDIRECTMAXRETRYEXPIRYCOUNT = "txDirectMaxRetryExpiryCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXDIRECTMAXRETRYEXPIRYCOUNT = "threadnetworkdiagnostics_txdirectmaxretryexpirycount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_TXDIRECTMAXRETRYEXPIRYCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXDIRECTMAXRETRYEXPIRYCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_TXINDIRECTMAXRETRYEXPIRYCOUNT = "TxIndirectMaxRetryExpiryCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_TXINDIRECTMAXRETRYEXPIRYCOUNT = "txIndirectMaxRetryExpiryCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXINDIRECTMAXRETRYEXPIRYCOUNT = "threadnetworkdiagnostics_txindirectmaxretryexpirycount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_TXINDIRECTMAXRETRYEXPIRYCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXINDIRECTMAXRETRYEXPIRYCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_TXERRCCACOUNT = "TxErrCcaCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_TXERRCCACOUNT = "txErrCcaCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXERRCCACOUNT = "threadnetworkdiagnostics_txerrccacount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_TXERRCCACOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXERRCCACOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_TXERRABORTCOUNT = "TxErrAbortCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_TXERRABORTCOUNT = "txErrAbortCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXERRABORTCOUNT = "threadnetworkdiagnostics_txerrabortcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_TXERRABORTCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXERRABORTCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_TXERRBUSYCHANNELCOUNT = "TxErrBusyChannelCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_TXERRBUSYCHANNELCOUNT = "txErrBusyChannelCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXERRBUSYCHANNELCOUNT = "threadnetworkdiagnostics_txerrbusychannelcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_TXERRBUSYCHANNELCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_TXERRBUSYCHANNELCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_RXTOTALCOUNT = "RxTotalCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_RXTOTALCOUNT = "rxTotalCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXTOTALCOUNT = "threadnetworkdiagnostics_rxtotalcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_RXTOTALCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXTOTALCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_RXUNICASTCOUNT = "RxUnicastCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_RXUNICASTCOUNT = "rxUnicastCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXUNICASTCOUNT = "threadnetworkdiagnostics_rxunicastcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_RXUNICASTCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXUNICASTCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_RXBROADCASTCOUNT = "RxBroadcastCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_RXBROADCASTCOUNT = "rxBroadcastCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXBROADCASTCOUNT = "threadnetworkdiagnostics_rxbroadcastcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_RXBROADCASTCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXBROADCASTCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_RXDATACOUNT = "RxDataCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_RXDATACOUNT = "rxDataCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXDATACOUNT = "threadnetworkdiagnostics_rxdatacount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_RXDATACOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXDATACOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_RXDATAPOLLCOUNT = "RxDataPollCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_RXDATAPOLLCOUNT = "rxDataPollCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXDATAPOLLCOUNT = "threadnetworkdiagnostics_rxdatapollcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_RXDATAPOLLCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXDATAPOLLCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_RXBEACONCOUNT = "RxBeaconCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_RXBEACONCOUNT = "rxBeaconCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXBEACONCOUNT = "threadnetworkdiagnostics_rxbeaconcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_RXBEACONCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXBEACONCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_RXBEACONREQUESTCOUNT = "RxBeaconRequestCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_RXBEACONREQUESTCOUNT = "rxBeaconRequestCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXBEACONREQUESTCOUNT = "threadnetworkdiagnostics_rxbeaconrequestcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_RXBEACONREQUESTCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXBEACONREQUESTCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_RXOTHERCOUNT = "RxOtherCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_RXOTHERCOUNT = "rxOtherCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXOTHERCOUNT = "threadnetworkdiagnostics_rxothercount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_RXOTHERCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXOTHERCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_RXADDRESSFILTEREDCOUNT = "RxAddressFilteredCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_RXADDRESSFILTEREDCOUNT = "rxAddressFilteredCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXADDRESSFILTEREDCOUNT = "threadnetworkdiagnostics_rxaddressfilteredcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_RXADDRESSFILTEREDCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXADDRESSFILTEREDCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_RXDESTADDRFILTEREDCOUNT = "RxDestAddrFilteredCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_RXDESTADDRFILTEREDCOUNT = "rxDestAddrFilteredCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXDESTADDRFILTEREDCOUNT = "threadnetworkdiagnostics_rxdestaddrfilteredcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_RXDESTADDRFILTEREDCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXDESTADDRFILTEREDCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_RXDUPLICATEDCOUNT = "RxDuplicatedCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_RXDUPLICATEDCOUNT = "rxDuplicatedCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXDUPLICATEDCOUNT = "threadnetworkdiagnostics_rxduplicatedcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_RXDUPLICATEDCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXDUPLICATEDCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_RXERRNOFRAMECOUNT = "RxErrNoFrameCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_RXERRNOFRAMECOUNT = "rxErrNoFrameCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXERRNOFRAMECOUNT = "threadnetworkdiagnostics_rxerrnoframecount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_RXERRNOFRAMECOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXERRNOFRAMECOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_RXERRUNKNOWNNEIGHBORCOUNT = "RxErrUnknownNeighborCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_RXERRUNKNOWNNEIGHBORCOUNT = "rxErrUnknownNeighborCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXERRUNKNOWNNEIGHBORCOUNT = "threadnetworkdiagnostics_rxerrunknownneighborcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_RXERRUNKNOWNNEIGHBORCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXERRUNKNOWNNEIGHBORCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_RXERRINVALIDSRCADDRCOUNT = "RxErrInvalidSrcAddrCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_RXERRINVALIDSRCADDRCOUNT = "rxErrInvalidSrcAddrCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXERRINVALIDSRCADDRCOUNT = "threadnetworkdiagnostics_rxerrinvalidsrcaddrcount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_RXERRINVALIDSRCADDRCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXERRINVALIDSRCADDRCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_RXERRSECCOUNT = "RxErrSecCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_RXERRSECCOUNT = "rxErrSecCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXERRSECCOUNT = "threadnetworkdiagnostics_rxerrseccount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_RXERRSECCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXERRSECCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_RXERRFCSCOUNT = "RxErrFcsCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_RXERRFCSCOUNT = "rxErrFcsCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXERRFCSCOUNT = "threadnetworkdiagnostics_rxerrfcscount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_RXERRFCSCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXERRFCSCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_RXERROTHERCOUNT = "RxErrOtherCount";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_RXERROTHERCOUNT = "rxErrOtherCount";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXERROTHERCOUNT = "threadnetworkdiagnostics_rxerrothercount";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_RXERROTHERCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_RXERROTHERCOUNT);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_ACTIVETIMESTAMP = "ActiveTimestamp";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_ACTIVETIMESTAMP = "activeTimestamp";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_ACTIVETIMESTAMP = "threadnetworkdiagnostics_activetimestamp";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_ACTIVETIMESTAMP = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_ACTIVETIMESTAMP);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_PENDINGTIMESTAMP = "PendingTimestamp";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_PENDINGTIMESTAMP = "pendingTimestamp";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_PENDINGTIMESTAMP = "threadnetworkdiagnostics_pendingtimestamp";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_PENDINGTIMESTAMP = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_PENDINGTIMESTAMP);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_DELAY = "Delay";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_DELAY = "delay";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_DELAY = "threadnetworkdiagnostics_delay";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_DELAY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_DELAY);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_SECURITYPOLICY = "SecurityPolicy";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_SECURITYPOLICY = "securityPolicy";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_SECURITYPOLICY = "threadnetworkdiagnostics_securitypolicy";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_SECURITYPOLICY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_SECURITYPOLICY);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_CHANNELPAGE0MASK = "ChannelPage0Mask";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_CHANNELPAGE0MASK = "channelPage0Mask";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_CHANNELPAGE0MASK = "threadnetworkdiagnostics_channelpage0mask";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_CHANNELPAGE0MASK = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_CHANNELPAGE0MASK);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_OPERATIONALDATASETCOMPONENTS = "OperationalDatasetComponents";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_OPERATIONALDATASETCOMPONENTS = "operationalDatasetComponents";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_OPERATIONALDATASETCOMPONENTS = "threadnetworkdiagnostics_operationaldatasetcomponents";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_OPERATIONALDATASETCOMPONENTS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_OPERATIONALDATASETCOMPONENTS);

    public static final String CHANNEL_NAME_THREADNETWORKDIAGNOSTICS_ACTIVENETWORKFAULTSLIST = "ActiveNetworkFaultsList";
    public static final String CHANNEL_LABEL_THREADNETWORKDIAGNOSTICS_ACTIVENETWORKFAULTSLIST = "activeNetworkFaultsList";
    public static final String CHANNEL_ID_THREADNETWORKDIAGNOSTICS_ACTIVENETWORKFAULTSLIST = "threadnetworkdiagnostics_activenetworkfaultslist";
    public static final ChannelTypeUID CHANNEL_THREADNETWORKDIAGNOSTICS_ACTIVENETWORKFAULTSLIST = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_THREADNETWORKDIAGNOSTICS_ACTIVENETWORKFAULTSLIST);

    // WiFiNetworkDiagnostics Cluster

    public static final String CHANNEL_NAME_WIFINETWORKDIAGNOSTICS_BSSID = "Bssid";
    public static final String CHANNEL_LABEL_WIFINETWORKDIAGNOSTICS_BSSID = "bssid";
    public static final String CHANNEL_ID_WIFINETWORKDIAGNOSTICS_BSSID = "wifinetworkdiagnostics_bssid";
    public static final ChannelTypeUID CHANNEL_WIFINETWORKDIAGNOSTICS_BSSID = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WIFINETWORKDIAGNOSTICS_BSSID);

    public static final String CHANNEL_NAME_WIFINETWORKDIAGNOSTICS_SECURITYTYPE = "SecurityType";
    public static final String CHANNEL_LABEL_WIFINETWORKDIAGNOSTICS_SECURITYTYPE = "securityType";
    public static final String CHANNEL_ID_WIFINETWORKDIAGNOSTICS_SECURITYTYPE = "wifinetworkdiagnostics_securitytype";
    public static final ChannelTypeUID CHANNEL_WIFINETWORKDIAGNOSTICS_SECURITYTYPE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WIFINETWORKDIAGNOSTICS_SECURITYTYPE);

    public static final String CHANNEL_NAME_WIFINETWORKDIAGNOSTICS_WIFIVERSION = "WiFiVersion";
    public static final String CHANNEL_LABEL_WIFINETWORKDIAGNOSTICS_WIFIVERSION = "wiFiVersion";
    public static final String CHANNEL_ID_WIFINETWORKDIAGNOSTICS_WIFIVERSION = "wifinetworkdiagnostics_wifiversion";
    public static final ChannelTypeUID CHANNEL_WIFINETWORKDIAGNOSTICS_WIFIVERSION = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WIFINETWORKDIAGNOSTICS_WIFIVERSION);

    public static final String CHANNEL_NAME_WIFINETWORKDIAGNOSTICS_CHANNELNUMBER = "ChannelNumber";
    public static final String CHANNEL_LABEL_WIFINETWORKDIAGNOSTICS_CHANNELNUMBER = "channelNumber";
    public static final String CHANNEL_ID_WIFINETWORKDIAGNOSTICS_CHANNELNUMBER = "wifinetworkdiagnostics_channelnumber";
    public static final ChannelTypeUID CHANNEL_WIFINETWORKDIAGNOSTICS_CHANNELNUMBER = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WIFINETWORKDIAGNOSTICS_CHANNELNUMBER);

    public static final String CHANNEL_NAME_WIFINETWORKDIAGNOSTICS_RSSI = "Rssi";
    public static final String CHANNEL_LABEL_WIFINETWORKDIAGNOSTICS_RSSI = "rssi";
    public static final String CHANNEL_ID_WIFINETWORKDIAGNOSTICS_RSSI = "wifinetworkdiagnostics_rssi";
    public static final ChannelTypeUID CHANNEL_WIFINETWORKDIAGNOSTICS_RSSI = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WIFINETWORKDIAGNOSTICS_RSSI);

    public static final String CHANNEL_NAME_WIFINETWORKDIAGNOSTICS_BEACONLOSTCOUNT = "BeaconLostCount";
    public static final String CHANNEL_LABEL_WIFINETWORKDIAGNOSTICS_BEACONLOSTCOUNT = "beaconLostCount";
    public static final String CHANNEL_ID_WIFINETWORKDIAGNOSTICS_BEACONLOSTCOUNT = "wifinetworkdiagnostics_beaconlostcount";
    public static final ChannelTypeUID CHANNEL_WIFINETWORKDIAGNOSTICS_BEACONLOSTCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WIFINETWORKDIAGNOSTICS_BEACONLOSTCOUNT);

    public static final String CHANNEL_NAME_WIFINETWORKDIAGNOSTICS_BEACONRXCOUNT = "BeaconRxCount";
    public static final String CHANNEL_LABEL_WIFINETWORKDIAGNOSTICS_BEACONRXCOUNT = "beaconRxCount";
    public static final String CHANNEL_ID_WIFINETWORKDIAGNOSTICS_BEACONRXCOUNT = "wifinetworkdiagnostics_beaconrxcount";
    public static final ChannelTypeUID CHANNEL_WIFINETWORKDIAGNOSTICS_BEACONRXCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WIFINETWORKDIAGNOSTICS_BEACONRXCOUNT);

    public static final String CHANNEL_NAME_WIFINETWORKDIAGNOSTICS_PACKETMULTICASTRXCOUNT = "PacketMulticastRxCount";
    public static final String CHANNEL_LABEL_WIFINETWORKDIAGNOSTICS_PACKETMULTICASTRXCOUNT = "packetMulticastRxCount";
    public static final String CHANNEL_ID_WIFINETWORKDIAGNOSTICS_PACKETMULTICASTRXCOUNT = "wifinetworkdiagnostics_packetmulticastrxcount";
    public static final ChannelTypeUID CHANNEL_WIFINETWORKDIAGNOSTICS_PACKETMULTICASTRXCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WIFINETWORKDIAGNOSTICS_PACKETMULTICASTRXCOUNT);

    public static final String CHANNEL_NAME_WIFINETWORKDIAGNOSTICS_PACKETMULTICASTTXCOUNT = "PacketMulticastTxCount";
    public static final String CHANNEL_LABEL_WIFINETWORKDIAGNOSTICS_PACKETMULTICASTTXCOUNT = "packetMulticastTxCount";
    public static final String CHANNEL_ID_WIFINETWORKDIAGNOSTICS_PACKETMULTICASTTXCOUNT = "wifinetworkdiagnostics_packetmulticasttxcount";
    public static final ChannelTypeUID CHANNEL_WIFINETWORKDIAGNOSTICS_PACKETMULTICASTTXCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WIFINETWORKDIAGNOSTICS_PACKETMULTICASTTXCOUNT);

    public static final String CHANNEL_NAME_WIFINETWORKDIAGNOSTICS_PACKETUNICASTRXCOUNT = "PacketUnicastRxCount";
    public static final String CHANNEL_LABEL_WIFINETWORKDIAGNOSTICS_PACKETUNICASTRXCOUNT = "packetUnicastRxCount";
    public static final String CHANNEL_ID_WIFINETWORKDIAGNOSTICS_PACKETUNICASTRXCOUNT = "wifinetworkdiagnostics_packetunicastrxcount";
    public static final ChannelTypeUID CHANNEL_WIFINETWORKDIAGNOSTICS_PACKETUNICASTRXCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WIFINETWORKDIAGNOSTICS_PACKETUNICASTRXCOUNT);

    public static final String CHANNEL_NAME_WIFINETWORKDIAGNOSTICS_PACKETUNICASTTXCOUNT = "PacketUnicastTxCount";
    public static final String CHANNEL_LABEL_WIFINETWORKDIAGNOSTICS_PACKETUNICASTTXCOUNT = "packetUnicastTxCount";
    public static final String CHANNEL_ID_WIFINETWORKDIAGNOSTICS_PACKETUNICASTTXCOUNT = "wifinetworkdiagnostics_packetunicasttxcount";
    public static final ChannelTypeUID CHANNEL_WIFINETWORKDIAGNOSTICS_PACKETUNICASTTXCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WIFINETWORKDIAGNOSTICS_PACKETUNICASTTXCOUNT);

    public static final String CHANNEL_NAME_WIFINETWORKDIAGNOSTICS_CURRENTMAXRATE = "CurrentMaxRate";
    public static final String CHANNEL_LABEL_WIFINETWORKDIAGNOSTICS_CURRENTMAXRATE = "currentMaxRate";
    public static final String CHANNEL_ID_WIFINETWORKDIAGNOSTICS_CURRENTMAXRATE = "wifinetworkdiagnostics_currentmaxrate";
    public static final ChannelTypeUID CHANNEL_WIFINETWORKDIAGNOSTICS_CURRENTMAXRATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WIFINETWORKDIAGNOSTICS_CURRENTMAXRATE);

    public static final String CHANNEL_NAME_WIFINETWORKDIAGNOSTICS_OVERRUNCOUNT = "OverrunCount";
    public static final String CHANNEL_LABEL_WIFINETWORKDIAGNOSTICS_OVERRUNCOUNT = "overrunCount";
    public static final String CHANNEL_ID_WIFINETWORKDIAGNOSTICS_OVERRUNCOUNT = "wifinetworkdiagnostics_overruncount";
    public static final ChannelTypeUID CHANNEL_WIFINETWORKDIAGNOSTICS_OVERRUNCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_WIFINETWORKDIAGNOSTICS_OVERRUNCOUNT);

    // EthernetNetworkDiagnostics Cluster

    public static final String CHANNEL_NAME_ETHERNETNETWORKDIAGNOSTICS_PHYRATE = "PhyRate";
    public static final String CHANNEL_LABEL_ETHERNETNETWORKDIAGNOSTICS_PHYRATE = "phyRate";
    public static final String CHANNEL_ID_ETHERNETNETWORKDIAGNOSTICS_PHYRATE = "ethernetnetworkdiagnostics_phyrate";
    public static final ChannelTypeUID CHANNEL_ETHERNETNETWORKDIAGNOSTICS_PHYRATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ETHERNETNETWORKDIAGNOSTICS_PHYRATE);

    public static final String CHANNEL_NAME_ETHERNETNETWORKDIAGNOSTICS_FULLDUPLEX = "FullDuplex";
    public static final String CHANNEL_LABEL_ETHERNETNETWORKDIAGNOSTICS_FULLDUPLEX = "fullDuplex";
    public static final String CHANNEL_ID_ETHERNETNETWORKDIAGNOSTICS_FULLDUPLEX = "ethernetnetworkdiagnostics_fullduplex";
    public static final ChannelTypeUID CHANNEL_ETHERNETNETWORKDIAGNOSTICS_FULLDUPLEX = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ETHERNETNETWORKDIAGNOSTICS_FULLDUPLEX);

    public static final String CHANNEL_NAME_ETHERNETNETWORKDIAGNOSTICS_PACKETRXCOUNT = "PacketRxCount";
    public static final String CHANNEL_LABEL_ETHERNETNETWORKDIAGNOSTICS_PACKETRXCOUNT = "packetRxCount";
    public static final String CHANNEL_ID_ETHERNETNETWORKDIAGNOSTICS_PACKETRXCOUNT = "ethernetnetworkdiagnostics_packetrxcount";
    public static final ChannelTypeUID CHANNEL_ETHERNETNETWORKDIAGNOSTICS_PACKETRXCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ETHERNETNETWORKDIAGNOSTICS_PACKETRXCOUNT);

    public static final String CHANNEL_NAME_ETHERNETNETWORKDIAGNOSTICS_PACKETTXCOUNT = "PacketTxCount";
    public static final String CHANNEL_LABEL_ETHERNETNETWORKDIAGNOSTICS_PACKETTXCOUNT = "packetTxCount";
    public static final String CHANNEL_ID_ETHERNETNETWORKDIAGNOSTICS_PACKETTXCOUNT = "ethernetnetworkdiagnostics_packettxcount";
    public static final ChannelTypeUID CHANNEL_ETHERNETNETWORKDIAGNOSTICS_PACKETTXCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ETHERNETNETWORKDIAGNOSTICS_PACKETTXCOUNT);

    public static final String CHANNEL_NAME_ETHERNETNETWORKDIAGNOSTICS_TXERRCOUNT = "TxErrCount";
    public static final String CHANNEL_LABEL_ETHERNETNETWORKDIAGNOSTICS_TXERRCOUNT = "txErrCount";
    public static final String CHANNEL_ID_ETHERNETNETWORKDIAGNOSTICS_TXERRCOUNT = "ethernetnetworkdiagnostics_txerrcount";
    public static final ChannelTypeUID CHANNEL_ETHERNETNETWORKDIAGNOSTICS_TXERRCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ETHERNETNETWORKDIAGNOSTICS_TXERRCOUNT);

    public static final String CHANNEL_NAME_ETHERNETNETWORKDIAGNOSTICS_COLLISIONCOUNT = "CollisionCount";
    public static final String CHANNEL_LABEL_ETHERNETNETWORKDIAGNOSTICS_COLLISIONCOUNT = "collisionCount";
    public static final String CHANNEL_ID_ETHERNETNETWORKDIAGNOSTICS_COLLISIONCOUNT = "ethernetnetworkdiagnostics_collisioncount";
    public static final ChannelTypeUID CHANNEL_ETHERNETNETWORKDIAGNOSTICS_COLLISIONCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ETHERNETNETWORKDIAGNOSTICS_COLLISIONCOUNT);

    public static final String CHANNEL_NAME_ETHERNETNETWORKDIAGNOSTICS_OVERRUNCOUNT = "OverrunCount";
    public static final String CHANNEL_LABEL_ETHERNETNETWORKDIAGNOSTICS_OVERRUNCOUNT = "overrunCount";
    public static final String CHANNEL_ID_ETHERNETNETWORKDIAGNOSTICS_OVERRUNCOUNT = "ethernetnetworkdiagnostics_overruncount";
    public static final ChannelTypeUID CHANNEL_ETHERNETNETWORKDIAGNOSTICS_OVERRUNCOUNT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ETHERNETNETWORKDIAGNOSTICS_OVERRUNCOUNT);

    public static final String CHANNEL_NAME_ETHERNETNETWORKDIAGNOSTICS_CARRIERDETECT = "CarrierDetect";
    public static final String CHANNEL_LABEL_ETHERNETNETWORKDIAGNOSTICS_CARRIERDETECT = "carrierDetect";
    public static final String CHANNEL_ID_ETHERNETNETWORKDIAGNOSTICS_CARRIERDETECT = "ethernetnetworkdiagnostics_carrierdetect";
    public static final ChannelTypeUID CHANNEL_ETHERNETNETWORKDIAGNOSTICS_CARRIERDETECT = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ETHERNETNETWORKDIAGNOSTICS_CARRIERDETECT);

    public static final String CHANNEL_NAME_ETHERNETNETWORKDIAGNOSTICS_TIMESINCERESET = "TimeSinceReset";
    public static final String CHANNEL_LABEL_ETHERNETNETWORKDIAGNOSTICS_TIMESINCERESET = "timeSinceReset";
    public static final String CHANNEL_ID_ETHERNETNETWORKDIAGNOSTICS_TIMESINCERESET = "ethernetnetworkdiagnostics_timesincereset";
    public static final ChannelTypeUID CHANNEL_ETHERNETNETWORKDIAGNOSTICS_TIMESINCERESET = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ETHERNETNETWORKDIAGNOSTICS_TIMESINCERESET);

    // TimeSynchronization Cluster

    public static final String CHANNEL_NAME_TIMESYNCHRONIZATION_UTCTIME = "UtcTime";
    public static final String CHANNEL_LABEL_TIMESYNCHRONIZATION_UTCTIME = "utcTime";
    public static final String CHANNEL_ID_TIMESYNCHRONIZATION_UTCTIME = "timesynchronization_utctime";
    public static final ChannelTypeUID CHANNEL_TIMESYNCHRONIZATION_UTCTIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TIMESYNCHRONIZATION_UTCTIME);

    public static final String CHANNEL_NAME_TIMESYNCHRONIZATION_GRANULARITY = "Granularity";
    public static final String CHANNEL_LABEL_TIMESYNCHRONIZATION_GRANULARITY = "granularity";
    public static final String CHANNEL_ID_TIMESYNCHRONIZATION_GRANULARITY = "timesynchronization_granularity";
    public static final ChannelTypeUID CHANNEL_TIMESYNCHRONIZATION_GRANULARITY = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TIMESYNCHRONIZATION_GRANULARITY);

    public static final String CHANNEL_NAME_TIMESYNCHRONIZATION_TIMESOURCE = "TimeSource";
    public static final String CHANNEL_LABEL_TIMESYNCHRONIZATION_TIMESOURCE = "timeSource";
    public static final String CHANNEL_ID_TIMESYNCHRONIZATION_TIMESOURCE = "timesynchronization_timesource";
    public static final ChannelTypeUID CHANNEL_TIMESYNCHRONIZATION_TIMESOURCE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TIMESYNCHRONIZATION_TIMESOURCE);

    public static final String CHANNEL_NAME_TIMESYNCHRONIZATION_TRUSTEDTIMESOURCE = "TrustedTimeSource";
    public static final String CHANNEL_LABEL_TIMESYNCHRONIZATION_TRUSTEDTIMESOURCE = "trustedTimeSource";
    public static final String CHANNEL_ID_TIMESYNCHRONIZATION_TRUSTEDTIMESOURCE = "timesynchronization_trustedtimesource";
    public static final ChannelTypeUID CHANNEL_TIMESYNCHRONIZATION_TRUSTEDTIMESOURCE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TIMESYNCHRONIZATION_TRUSTEDTIMESOURCE);

    public static final String CHANNEL_NAME_TIMESYNCHRONIZATION_DEFAULTNTP = "DefaultNtp";
    public static final String CHANNEL_LABEL_TIMESYNCHRONIZATION_DEFAULTNTP = "defaultNtp";
    public static final String CHANNEL_ID_TIMESYNCHRONIZATION_DEFAULTNTP = "timesynchronization_defaultntp";
    public static final ChannelTypeUID CHANNEL_TIMESYNCHRONIZATION_DEFAULTNTP = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TIMESYNCHRONIZATION_DEFAULTNTP);

    public static final String CHANNEL_NAME_TIMESYNCHRONIZATION_TIMEZONE = "TimeZone";
    public static final String CHANNEL_LABEL_TIMESYNCHRONIZATION_TIMEZONE = "timeZone";
    public static final String CHANNEL_ID_TIMESYNCHRONIZATION_TIMEZONE = "timesynchronization_timezone";
    public static final ChannelTypeUID CHANNEL_TIMESYNCHRONIZATION_TIMEZONE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TIMESYNCHRONIZATION_TIMEZONE);

    public static final String CHANNEL_NAME_TIMESYNCHRONIZATION_DSTOFFSET = "DstOffset";
    public static final String CHANNEL_LABEL_TIMESYNCHRONIZATION_DSTOFFSET = "dstOffset";
    public static final String CHANNEL_ID_TIMESYNCHRONIZATION_DSTOFFSET = "timesynchronization_dstoffset";
    public static final ChannelTypeUID CHANNEL_TIMESYNCHRONIZATION_DSTOFFSET = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TIMESYNCHRONIZATION_DSTOFFSET);

    public static final String CHANNEL_NAME_TIMESYNCHRONIZATION_LOCALTIME = "LocalTime";
    public static final String CHANNEL_LABEL_TIMESYNCHRONIZATION_LOCALTIME = "localTime";
    public static final String CHANNEL_ID_TIMESYNCHRONIZATION_LOCALTIME = "timesynchronization_localtime";
    public static final ChannelTypeUID CHANNEL_TIMESYNCHRONIZATION_LOCALTIME = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TIMESYNCHRONIZATION_LOCALTIME);

    public static final String CHANNEL_NAME_TIMESYNCHRONIZATION_TIMEZONEDATABASE = "TimeZoneDatabase";
    public static final String CHANNEL_LABEL_TIMESYNCHRONIZATION_TIMEZONEDATABASE = "timeZoneDatabase";
    public static final String CHANNEL_ID_TIMESYNCHRONIZATION_TIMEZONEDATABASE = "timesynchronization_timezonedatabase";
    public static final ChannelTypeUID CHANNEL_TIMESYNCHRONIZATION_TIMEZONEDATABASE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TIMESYNCHRONIZATION_TIMEZONEDATABASE);

    public static final String CHANNEL_NAME_TIMESYNCHRONIZATION_NTPSERVERAVAILABLE = "NtpServerAvailable";
    public static final String CHANNEL_LABEL_TIMESYNCHRONIZATION_NTPSERVERAVAILABLE = "ntpServerAvailable";
    public static final String CHANNEL_ID_TIMESYNCHRONIZATION_NTPSERVERAVAILABLE = "timesynchronization_ntpserveravailable";
    public static final ChannelTypeUID CHANNEL_TIMESYNCHRONIZATION_NTPSERVERAVAILABLE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TIMESYNCHRONIZATION_NTPSERVERAVAILABLE);

    public static final String CHANNEL_NAME_TIMESYNCHRONIZATION_TIMEZONELISTMAXSIZE = "TimeZoneListMaxSize";
    public static final String CHANNEL_LABEL_TIMESYNCHRONIZATION_TIMEZONELISTMAXSIZE = "timeZoneListMaxSize";
    public static final String CHANNEL_ID_TIMESYNCHRONIZATION_TIMEZONELISTMAXSIZE = "timesynchronization_timezonelistmaxsize";
    public static final ChannelTypeUID CHANNEL_TIMESYNCHRONIZATION_TIMEZONELISTMAXSIZE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TIMESYNCHRONIZATION_TIMEZONELISTMAXSIZE);

    public static final String CHANNEL_NAME_TIMESYNCHRONIZATION_DSTOFFSETLISTMAXSIZE = "DstOffsetListMaxSize";
    public static final String CHANNEL_LABEL_TIMESYNCHRONIZATION_DSTOFFSETLISTMAXSIZE = "dstOffsetListMaxSize";
    public static final String CHANNEL_ID_TIMESYNCHRONIZATION_DSTOFFSETLISTMAXSIZE = "timesynchronization_dstoffsetlistmaxsize";
    public static final ChannelTypeUID CHANNEL_TIMESYNCHRONIZATION_DSTOFFSETLISTMAXSIZE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TIMESYNCHRONIZATION_DSTOFFSETLISTMAXSIZE);

    public static final String CHANNEL_NAME_TIMESYNCHRONIZATION_SUPPORTSDNSRESOLVE = "SupportsDnsResolve";
    public static final String CHANNEL_LABEL_TIMESYNCHRONIZATION_SUPPORTSDNSRESOLVE = "supportsDnsResolve";
    public static final String CHANNEL_ID_TIMESYNCHRONIZATION_SUPPORTSDNSRESOLVE = "timesynchronization_supportsdnsresolve";
    public static final ChannelTypeUID CHANNEL_TIMESYNCHRONIZATION_SUPPORTSDNSRESOLVE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_TIMESYNCHRONIZATION_SUPPORTSDNSRESOLVE);

    // OperationalCredentials Cluster

    public static final String CHANNEL_NAME_OPERATIONALCREDENTIALS_NOCS = "Nocs";
    public static final String CHANNEL_LABEL_OPERATIONALCREDENTIALS_NOCS = "nocs";
    public static final String CHANNEL_ID_OPERATIONALCREDENTIALS_NOCS = "operationalcredentials_nocs";
    public static final ChannelTypeUID CHANNEL_OPERATIONALCREDENTIALS_NOCS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OPERATIONALCREDENTIALS_NOCS);

    public static final String CHANNEL_NAME_OPERATIONALCREDENTIALS_FABRICS = "Fabrics";
    public static final String CHANNEL_LABEL_OPERATIONALCREDENTIALS_FABRICS = "fabrics";
    public static final String CHANNEL_ID_OPERATIONALCREDENTIALS_FABRICS = "operationalcredentials_fabrics";
    public static final ChannelTypeUID CHANNEL_OPERATIONALCREDENTIALS_FABRICS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OPERATIONALCREDENTIALS_FABRICS);

    public static final String CHANNEL_NAME_OPERATIONALCREDENTIALS_SUPPORTEDFABRICS = "SupportedFabrics";
    public static final String CHANNEL_LABEL_OPERATIONALCREDENTIALS_SUPPORTEDFABRICS = "supportedFabrics";
    public static final String CHANNEL_ID_OPERATIONALCREDENTIALS_SUPPORTEDFABRICS = "operationalcredentials_supportedfabrics";
    public static final ChannelTypeUID CHANNEL_OPERATIONALCREDENTIALS_SUPPORTEDFABRICS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OPERATIONALCREDENTIALS_SUPPORTEDFABRICS);

    public static final String CHANNEL_NAME_OPERATIONALCREDENTIALS_COMMISSIONEDFABRICS = "CommissionedFabrics";
    public static final String CHANNEL_LABEL_OPERATIONALCREDENTIALS_COMMISSIONEDFABRICS = "commissionedFabrics";
    public static final String CHANNEL_ID_OPERATIONALCREDENTIALS_COMMISSIONEDFABRICS = "operationalcredentials_commissionedfabrics";
    public static final ChannelTypeUID CHANNEL_OPERATIONALCREDENTIALS_COMMISSIONEDFABRICS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OPERATIONALCREDENTIALS_COMMISSIONEDFABRICS);

    public static final String CHANNEL_NAME_OPERATIONALCREDENTIALS_TRUSTEDROOTCERTIFICATES = "TrustedRootCertificates";
    public static final String CHANNEL_LABEL_OPERATIONALCREDENTIALS_TRUSTEDROOTCERTIFICATES = "trustedRootCertificates";
    public static final String CHANNEL_ID_OPERATIONALCREDENTIALS_TRUSTEDROOTCERTIFICATES = "operationalcredentials_trustedrootcertificates";
    public static final ChannelTypeUID CHANNEL_OPERATIONALCREDENTIALS_TRUSTEDROOTCERTIFICATES = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OPERATIONALCREDENTIALS_TRUSTEDROOTCERTIFICATES);

    public static final String CHANNEL_NAME_OPERATIONALCREDENTIALS_CURRENTFABRICINDEX = "CurrentFabricIndex";
    public static final String CHANNEL_LABEL_OPERATIONALCREDENTIALS_CURRENTFABRICINDEX = "currentFabricIndex";
    public static final String CHANNEL_ID_OPERATIONALCREDENTIALS_CURRENTFABRICINDEX = "operationalcredentials_currentfabricindex";
    public static final ChannelTypeUID CHANNEL_OPERATIONALCREDENTIALS_CURRENTFABRICINDEX = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OPERATIONALCREDENTIALS_CURRENTFABRICINDEX);

    // AdministratorCommissioning Cluster

    public static final String CHANNEL_NAME_ADMINISTRATORCOMMISSIONING_WINDOWSTATUS = "WindowStatus";
    public static final String CHANNEL_LABEL_ADMINISTRATORCOMMISSIONING_WINDOWSTATUS = "windowStatus";
    public static final String CHANNEL_ID_ADMINISTRATORCOMMISSIONING_WINDOWSTATUS = "administratorcommissioning_windowstatus";
    public static final ChannelTypeUID CHANNEL_ADMINISTRATORCOMMISSIONING_WINDOWSTATUS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ADMINISTRATORCOMMISSIONING_WINDOWSTATUS);

    public static final String CHANNEL_NAME_ADMINISTRATORCOMMISSIONING_ADMINFABRICINDEX = "AdminFabricIndex";
    public static final String CHANNEL_LABEL_ADMINISTRATORCOMMISSIONING_ADMINFABRICINDEX = "adminFabricIndex";
    public static final String CHANNEL_ID_ADMINISTRATORCOMMISSIONING_ADMINFABRICINDEX = "administratorcommissioning_adminfabricindex";
    public static final ChannelTypeUID CHANNEL_ADMINISTRATORCOMMISSIONING_ADMINFABRICINDEX = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ADMINISTRATORCOMMISSIONING_ADMINFABRICINDEX);

    public static final String CHANNEL_NAME_ADMINISTRATORCOMMISSIONING_ADMINVENDORID = "AdminVendorId";
    public static final String CHANNEL_LABEL_ADMINISTRATORCOMMISSIONING_ADMINVENDORID = "adminVendorId";
    public static final String CHANNEL_ID_ADMINISTRATORCOMMISSIONING_ADMINVENDORID = "administratorcommissioning_adminvendorid";
    public static final ChannelTypeUID CHANNEL_ADMINISTRATORCOMMISSIONING_ADMINVENDORID = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_ADMINISTRATORCOMMISSIONING_ADMINVENDORID);

    // OtaSoftwareUpdateProvider Cluster

    // OtaSoftwareUpdateRequestor Cluster

    public static final String CHANNEL_NAME_OTASOFTWAREUPDATEREQUESTOR_DEFAULTOTAPROVIDERS = "DefaultOtaProviders";
    public static final String CHANNEL_LABEL_OTASOFTWAREUPDATEREQUESTOR_DEFAULTOTAPROVIDERS = "defaultOtaProviders";
    public static final String CHANNEL_ID_OTASOFTWAREUPDATEREQUESTOR_DEFAULTOTAPROVIDERS = "otasoftwareupdaterequestor_defaultotaproviders";
    public static final ChannelTypeUID CHANNEL_OTASOFTWAREUPDATEREQUESTOR_DEFAULTOTAPROVIDERS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OTASOFTWAREUPDATEREQUESTOR_DEFAULTOTAPROVIDERS);

    public static final String CHANNEL_NAME_OTASOFTWAREUPDATEREQUESTOR_UPDATEPOSSIBLE = "UpdatePossible";
    public static final String CHANNEL_LABEL_OTASOFTWAREUPDATEREQUESTOR_UPDATEPOSSIBLE = "updatePossible";
    public static final String CHANNEL_ID_OTASOFTWAREUPDATEREQUESTOR_UPDATEPOSSIBLE = "otasoftwareupdaterequestor_updatepossible";
    public static final ChannelTypeUID CHANNEL_OTASOFTWAREUPDATEREQUESTOR_UPDATEPOSSIBLE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OTASOFTWAREUPDATEREQUESTOR_UPDATEPOSSIBLE);

    public static final String CHANNEL_NAME_OTASOFTWAREUPDATEREQUESTOR_UPDATESTATE = "UpdateState";
    public static final String CHANNEL_LABEL_OTASOFTWAREUPDATEREQUESTOR_UPDATESTATE = "updateState";
    public static final String CHANNEL_ID_OTASOFTWAREUPDATEREQUESTOR_UPDATESTATE = "otasoftwareupdaterequestor_updatestate";
    public static final ChannelTypeUID CHANNEL_OTASOFTWAREUPDATEREQUESTOR_UPDATESTATE = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OTASOFTWAREUPDATEREQUESTOR_UPDATESTATE);

    public static final String CHANNEL_NAME_OTASOFTWAREUPDATEREQUESTOR_UPDATESTATEPROGRESS = "UpdateStateProgress";
    public static final String CHANNEL_LABEL_OTASOFTWAREUPDATEREQUESTOR_UPDATESTATEPROGRESS = "updateStateProgress";
    public static final String CHANNEL_ID_OTASOFTWAREUPDATEREQUESTOR_UPDATESTATEPROGRESS = "otasoftwareupdaterequestor_updatestateprogress";
    public static final ChannelTypeUID CHANNEL_OTASOFTWAREUPDATEREQUESTOR_UPDATESTATEPROGRESS = new ChannelTypeUID(
            "matter:" + CHANNEL_ID_OTASOFTWAREUPDATEREQUESTOR_UPDATESTATEPROGRESS);
}
