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
package org.openhab.binding.matter.internal;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.type.ChannelTypeUID;

/**
 * The {@link MatterBindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Dan Cunningham - Initial contribution
 */
@NonNullByDefault
public class MatterBindingConstants {

    public static final String BINDING_ID = "matter";

    // List of all Thing Type UIDs
    // public static final ThingTypeUID THING_TYPE_SAMPLE = new ThingTypeUID(BINDING_ID, "sample");
    public static final ThingTypeUID THING_TYPE_CONTROLLER = new ThingTypeUID(BINDING_ID, "controller");
    // public static final ThingTypeUID THING_TYPE_NODE = new ThingTypeUID(BINDING_ID, "node");
    public static final ThingTypeUID THING_TYPE_ENDPOINT = new ThingTypeUID(BINDING_ID, "endpoint");

    // List of all Channel ids
    public static final String CHANNEL_PAIR_CODE = "pair_code";
    public static final String CHANNEL_COMMAND = "command";

    // This was borrowed from the zigbee binding as Matter uses the same cluster API model
    // List of Channel UIDs
    public static final String CHANNEL_NAME_ONOFF_ONOFF = "onoff";
    public static final String CHANNEL_LABEL_ONOFF_ONOFF = "On Off";
    public static final ChannelTypeUID CHANNEL_ONOFF_ONOFF = new ChannelTypeUID("matter:onoffcontrol-onoff");

    public static final String CHANNEL_NAME_LEVEL_LEVEL = "level";
    public static final String CHANNEL_LABEL_LEVEL_LEVEL = "Level Control";
    public static final ChannelTypeUID CHANNEL_LEVEL_LEVEL = new ChannelTypeUID("matter:levelcontrol-level");

    public static final String CHANNEL_NAME_COLOR_COLOR = "color";
    public static final String CHANNEL_LABEL_COLOR_COLOR = "Color Control";
    public static final ChannelTypeUID CHANNEL_COLOR_COLOR = new ChannelTypeUID("matter:colorcontrol-color");

    public static final String CHANNEL_NAME_COLOR_TEMPERATURE = "colortemperature";
    public static final String CHANNEL_LABEL_COLOR_TEMPERATURE = "Color Temperature";
    public static final ChannelTypeUID CHANNEL_COLOR_TEMPERATURE = new ChannelTypeUID(
            "matter:colorcontrol-temperature");

    public static final String CHANNEL_NAME_POWER_BATTERYPERCENT = "batterylevel";
    public static final String CHANNEL_LABEL_POWER_BATTERYPERCENT = "Battery Level";
    public static final ChannelTypeUID CHANNEL_POWER_BATTERYPERCENT = new ChannelTypeUID("system:battery-level");

    public static final String CHANNEL_NAME_POWER_BATTERYVOLTAGE = "batteryvoltage";
    public static final String CHANNEL_LABEL_POWER_BATTERYVOLTAGE = "Battery Voltage";
    public static final ChannelTypeUID CHANNEL_POWER_BATTERYVOLTAGE = new ChannelTypeUID("matter:battery-voltage");

    public static final String CHANNEL_NAME_POWER_BATTERYALARM = "batteryalarm";
    public static final String CHANNEL_LABEL_POWER_BATTERYALARM = "Battery Alarm";
    public static final ChannelTypeUID CHANNEL_POWER_BATTERYALARM = new ChannelTypeUID("matter:battery-alarm");

    public static final String CHANNEL_NAME_THERMOSTAT_LOCALTEMPERATURE = "thermostatlocaltemperature";
    public static final String CHANNEL_LABEL_THERMOSTAT_LOCALTEMPERATURE = "Local Temperature";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_LOCALTEMPERATURE = new ChannelTypeUID(
            "matter:thermostat-localtemperature");

    public static final String CHANNEL_NAME_THERMOSTAT_OUTDOORTEMPERATURE = "thermostatoutdoortemperature";
    public static final String CHANNEL_LABEL_THERMOSTAT_OUTDOORTEMPERATURE = "Outdoor Temperature";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_OUTDOORTEMPERATURE = new ChannelTypeUID(
            "matter:thermostat-outdoortemperature");

    public static final String CHANNEL_NAME_THERMOSTAT_OCCUPIEDCOOLING = "thermostatoccupiedcooling";
    public static final String CHANNEL_LABEL_THERMOSTAT_OCCUPIEDCOOLING = "Occupied Cooling Setpoint";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_OCCUPIEDCOOLING = new ChannelTypeUID(
            "matter:thermostat-occupiedcooling");

    public static final String CHANNEL_NAME_THERMOSTAT_OCCUPIEDHEATING = "thermostatoccupiedheating";
    public static final String CHANNEL_LABEL_THERMOSTAT_OCCUPIEDHEATING = "Occupied Heating Setpoint";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_OCCUPIEDHEATING = new ChannelTypeUID(
            "matter:thermostat-occupiedheating");

    public static final String CHANNEL_NAME_THERMOSTAT_UNOCCUPIEDCOOLING = "thermostatunoccupiedcooling";
    public static final String CHANNEL_LABEL_THERMOSTAT_UNOCCUPIEDCOOLING = "Unoccupied Cooling Setpoint";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_UNOCCUPIEDCOOLING = new ChannelTypeUID(
            "matter:thermostat-unoccupiedcooling");

    public static final String CHANNEL_NAME_THERMOSTAT_UNOCCUPIEDHEATING = "thermostatunoccupiedheating";
    public static final String CHANNEL_LABEL_THERMOSTAT_UNOCCUPIEDHEATING = "Unoccupied Heating Setpoint";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_UNOCCUPIEDHEATING = new ChannelTypeUID(
            "matter:thermostat-unoccupiedheating");

    public static final String CHANNEL_NAME_THERMOSTAT_SYSTEMMODE = "thermostatsystemmode";
    public static final String CHANNEL_LABEL_THERMOSTAT_SYSTEMMODE = "System Mode";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_SYSTEMMODE = new ChannelTypeUID(
            "matter:thermostat-systemmode");

    public static final String CHANNEL_NAME_THERMOSTAT_RUNNINGMODE = "thermostatrunningmode";
    public static final String CHANNEL_LABEL_THERMOSTAT_RUNNINGMODE = "Running Mode";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_RUNNINGMODE = new ChannelTypeUID(
            "matter:thermostat-runningmode");

    public static final String CHANNEL_NAME_THERMOSTAT_HEATING_DEMAND = "thermostatheatingdemand";
    public static final String CHANNEL_LABEL_THERMOSTAT_HEATING_DEMAND = "Heating Demand";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_HEATING_DEMAND = new ChannelTypeUID(
            "matter:thermostat-heatingdemand");

    public static final String CHANNEL_NAME_THERMOSTAT_COOLING_DEMAND = "thermostatcoolingdemand";
    public static final String CHANNEL_LABEL_THERMOSTAT_COOLING_DEMAND = "Cooling Demand";
    public static final ChannelTypeUID CHANNEL_THERMOSTAT_COOLING_DEMAND = new ChannelTypeUID(
            "matter:thermostat-coolingdemand");

    public static final String CHANNEL_NAME_DOORLOCK_STATE = "doorlockstate";
    public static final String CHANNEL_LABEL_DOORLOCK_STATE = "Door Lock State";
    public static final ChannelTypeUID CHANNEL_DOORLOCK_STATE = new ChannelTypeUID("matter:door-state");

    public static final String CHANNEL_NAME_WINDOWCOVERING_LIFT = "windowcoveringlift";
    public static final String CHANNEL_LABEL_WINDOWCOVERING_LIFT = "Window Covering Lift";
    public static final ChannelTypeUID CHANNEL_WINDOWCOVERING_LIFT = new ChannelTypeUID("matter:windowcovering-lift");

    public static final String CHANNEL_NAME_MODESELECT_MODE = "MODESELECT_MODE";
    public static final ChannelTypeUID CHANNEL_MODESELECT_MODE = new ChannelTypeUID("matter:modeselect-mode");

    public static final String CHANNEL_NAME_SWITCH_SWITCH = "SWITCH_SWITCH";
    public static final String CHANNEL_LABEL_SWITCH_SWITCH = "Switch";
    public static final ChannelTypeUID CHANNEL_SWITCH_SWITCH = new ChannelTypeUID("matter:switch-switch");
    public static final ChannelTypeUID CHANNEL_SWITCH_SWITCHLATECHED = new ChannelTypeUID(
            "matter:switch-switchlatched");
    public static final ChannelTypeUID CHANNEL_SWITCH_INITIALPRESS = new ChannelTypeUID("matter:switch-initialpress");
    public static final ChannelTypeUID CHANNEL_SWITCH_LONGPRESS = new ChannelTypeUID("matter:switch-longpress");
    public static final ChannelTypeUID CHANNEL_SWITCH_SHORTRELEASE = new ChannelTypeUID("matter:switch-shortrelease");
    public static final ChannelTypeUID CHANNEL_SWITCH_LONGRELEASE = new ChannelTypeUID("matter:switch-longrelease");
    public static final ChannelTypeUID CHANNEL_SWITCH_MULTIPRESSONGOING = new ChannelTypeUID(
            "matter:switch-multipressongoing");
    public static final ChannelTypeUID CHANNEL_SWITCH_MULTIPRESSCOMPLETE = new ChannelTypeUID(
            "matter:switch-multipresscomplete");

    public static final String ITEM_TYPE_COLOR = "Color";
    public static final String ITEM_TYPE_CONTACT = "Contact";
    public static final String ITEM_TYPE_DIMMER = "Dimmer";
    public static final String ITEM_TYPE_NUMBER = "Number";
    public static final String ITEM_TYPE_NUMBER_PRESSURE = "Number:Pressure";
    public static final String ITEM_TYPE_NUMBER_TEMPERATURE = "Number:Temperature";
    public static final String ITEM_TYPE_ROLLERSHUTTER = "Rollershutter";
    public static final String ITEM_TYPE_SWITCH = "Switch";
    public static final String ITEM_TYPE_STRING = "String";
}