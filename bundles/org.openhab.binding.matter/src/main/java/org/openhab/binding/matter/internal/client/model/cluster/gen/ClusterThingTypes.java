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

import static java.util.Map.entry;

import java.util.Map;
import java.util.Set;

import org.openhab.binding.matter.internal.MatterBindingConstants;
import org.openhab.core.thing.ThingTypeUID;

/**
 *
 * ClusterThingTypes
 * 
 * @author Dan Cunningham - Initial contribution
 */
public class ClusterThingTypes {
    public static final ThingTypeUID THING_TYPE_IDENTIFY = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "identify");
    public static final ThingTypeUID THING_TYPE_GROUPS = new ThingTypeUID(MatterBindingConstants.BINDING_ID, "groups");
    public static final ThingTypeUID THING_TYPE_SCENES_MANAGEMENT = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "scenesManagement");
    public static final ThingTypeUID THING_TYPE_ON_OFF = new ThingTypeUID(MatterBindingConstants.BINDING_ID, "onOff");
    public static final ThingTypeUID THING_TYPE_LEVEL_CONTROL = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "levelControl");
    public static final ThingTypeUID THING_TYPE_PULSE_WIDTH_MODULATION = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "pulseWidthModulation");
    public static final ThingTypeUID THING_TYPE_BOOLEAN_STATE = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "booleanState");
    public static final ThingTypeUID THING_TYPE_BOOLEAN_STATE_CONFIGURATION = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "booleanStateConfiguration");
    public static final ThingTypeUID THING_TYPE_MODE_SELECT = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "modeSelect");
    public static final ThingTypeUID THING_TYPE_MODE_BASE = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "modeBase");
    public static final ThingTypeUID THING_TYPE_LOW_POWER = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "lowPower");
    public static final ThingTypeUID THING_TYPE_WAKE_ON_LAN = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "wakeOnLan");
    public static final ThingTypeUID THING_TYPE_SWITCH = new ThingTypeUID(MatterBindingConstants.BINDING_ID, "switch");
    public static final ThingTypeUID THING_TYPE_OPERATIONAL_STATE = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "operationalState");
    public static final ThingTypeUID THING_TYPE_ALARM_BASE = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "alarmBase");
    public static final ThingTypeUID THING_TYPE_MESSAGES = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "messages");
    public static final ThingTypeUID THING_TYPE_ILLUMINANCE_MEASUREMENT = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "illuminanceMeasurement");
    public static final ThingTypeUID THING_TYPE_TEMPERATURE_MEASUREMENT = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "temperatureMeasurement");
    public static final ThingTypeUID THING_TYPE_PRESSURE_MEASUREMENT = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "pressureMeasurement");
    public static final ThingTypeUID THING_TYPE_FLOW_MEASUREMENT = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "flowMeasurement");
    public static final ThingTypeUID THING_TYPE_RELATIVE_HUMIDITY_MEASUREMENT = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "relativeHumidityMeasurement");
    public static final ThingTypeUID THING_TYPE_OCCUPANCY_SENSING = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "occupancySensing");
    public static final ThingTypeUID THING_TYPE_RESOURCE_MONITORING = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "resourceMonitoring");
    public static final ThingTypeUID THING_TYPE_HEPA_FILTER_MONITORING = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "hepaFilterMonitoring");
    public static final ThingTypeUID THING_TYPE_ACTIVATED_CARBON_FILTER_MONITORING = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "activatedCarbonFilterMonitoring");
    public static final ThingTypeUID THING_TYPE_AIR_QUALITY = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "airQuality");
    public static final ThingTypeUID THING_TYPE_CONCENTRATION_MEASUREMENT = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "concentrationMeasurement");
    public static final ThingTypeUID THING_TYPE_CARBON_MONOXIDE_CONCENTRATION_MEASUREMENT = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "carbonMonoxideConcentrationMeasurement");
    public static final ThingTypeUID THING_TYPE_CARBON_DIOXIDE_CONCENTRATION_MEASUREMENT = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "carbonDioxideConcentrationMeasurement");
    public static final ThingTypeUID THING_TYPE_NITROGEN_DIOXIDE_CONCENTRATION_MEASUREMENT = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "nitrogenDioxideConcentrationMeasurement");
    public static final ThingTypeUID THING_TYPE_OZONE_CONCENTRATION_MEASUREMENT = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "ozoneConcentrationMeasurement");
    public static final ThingTypeUID THING_TYPE_PM2 = new ThingTypeUID(MatterBindingConstants.BINDING_ID, "pm2");
    public static final ThingTypeUID THING_TYPE_FORMALDEHYDE_CONCENTRATION_MEASUREMENT = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "formaldehydeConcentrationMeasurement");
    public static final ThingTypeUID THING_TYPE_PM1CONCENTRATION_MEASUREMENT = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "pm1ConcentrationMeasurement");
    public static final ThingTypeUID THING_TYPE_PM10CONCENTRATION_MEASUREMENT = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "pm10ConcentrationMeasurement");
    public static final ThingTypeUID THING_TYPE_TOTAL_VOLATILE_ORGANIC_COMPOUNDS_CONCENTRATION_MEASUREMENT = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "totalVolatileOrganicCompoundsConcentrationMeasurement");
    public static final ThingTypeUID THING_TYPE_RADON_CONCENTRATION_MEASUREMENT = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "radonConcentrationMeasurement");
    public static final ThingTypeUID THING_TYPE_SMOKE_CO_ALARM = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "smokeCoAlarm");
    public static final ThingTypeUID THING_TYPE_ELECTRICAL_ENERGY_MEASUREMENT = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "electricalEnergyMeasurement");
    public static final ThingTypeUID THING_TYPE_ELECTRICAL_POWER_MEASUREMENT = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "electricalPowerMeasurement");
    public static final ThingTypeUID THING_TYPE_COLOR_CONTROL = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "colorControl");
    public static final ThingTypeUID THING_TYPE_BALLAST_CONFIGURATION = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "ballastConfiguration");
    public static final ThingTypeUID THING_TYPE_PUMP_CONFIGURATION_AND_CONTROL = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "pumpConfigurationAndControl");
    public static final ThingTypeUID THING_TYPE_THERMOSTAT = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "thermostat");
    public static final ThingTypeUID THING_TYPE_FAN_CONTROL = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "fanControl");
    public static final ThingTypeUID THING_TYPE_THERMOSTAT_USER_INTERFACE_CONFIGURATION = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "thermostatUserInterfaceConfiguration");
    public static final ThingTypeUID THING_TYPE_VALVE_CONFIGURATION_AND_CONTROL = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "valveConfigurationAndControl");
    public static final ThingTypeUID THING_TYPE_DOOR_LOCK = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "doorLock");
    public static final ThingTypeUID THING_TYPE_WINDOW_COVERING = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "windowCovering");
    public static final ThingTypeUID THING_TYPE_ACCOUNT_LOGIN = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "accountLogin");
    public static final ThingTypeUID THING_TYPE_APPLICATION_BASIC = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "applicationBasic");
    public static final ThingTypeUID THING_TYPE_APPLICATION_LAUNCHER = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "applicationLauncher");
    public static final ThingTypeUID THING_TYPE_AUDIO_OUTPUT = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "audioOutput");
    public static final ThingTypeUID THING_TYPE_KEYPAD_INPUT = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "keypadInput");
    public static final ThingTypeUID THING_TYPE_MEDIA_INPUT = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "mediaInput");
    public static final ThingTypeUID THING_TYPE_MEDIA_PLAYBACK = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "mediaPlayback");
    public static final ThingTypeUID THING_TYPE_TARGET_NAVIGATOR = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "targetNavigator");
    public static final ThingTypeUID THING_TYPE_CONTENT_APP_OBSERVER = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "contentAppObserver");
    public static final ThingTypeUID THING_TYPE_CONTENT_CONTROL = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "contentControl");
    public static final ThingTypeUID THING_TYPE_RVC_RUN_MODE = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "rvcRunMode");
    public static final ThingTypeUID THING_TYPE_RVC_CLEAN_MODE = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "rvcCleanMode");
    public static final ThingTypeUID THING_TYPE_RVC_OPERATIONAL_STATE = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "rvcOperationalState");
    public static final ThingTypeUID THING_TYPE_TEMPERATURE_CONTROL = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "temperatureControl");
    public static final ThingTypeUID THING_TYPE_DISHWASHER_MODE = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "dishwasherMode");
    public static final ThingTypeUID THING_TYPE_DISHWASHER_ALARM = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "dishwasherAlarm");
    public static final ThingTypeUID THING_TYPE_LAUNDRY_WASHER_MODE = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "laundryWasherMode");
    public static final ThingTypeUID THING_TYPE_LAUNDRY_WASHER_CONTROLS = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "laundryWasherControls");
    public static final ThingTypeUID THING_TYPE_REFRIGERATOR_AND_TEMPERATURE_CONTROLLED_CABINET_MODE = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "refrigeratorAndTemperatureControlledCabinetMode");
    public static final ThingTypeUID THING_TYPE_REFRIGERATOR_ALARM = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "refrigeratorAlarm");
    public static final ThingTypeUID THING_TYPE_LAUNDRY_DRYER_CONTROLS = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "laundryDryerControls");
    public static final ThingTypeUID THING_TYPE_OVEN_CAVITY_OPERATIONAL_STATE = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "ovenCavityOperationalState");
    public static final ThingTypeUID THING_TYPE_OVEN_MODE = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "ovenMode");
    public static final ThingTypeUID THING_TYPE_MICROWAVE_OVEN_MODE = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "microwaveOvenMode");
    public static final ThingTypeUID THING_TYPE_MICROWAVE_OVEN_CONTROL = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "microwaveOvenControl");
    public static final ThingTypeUID THING_TYPE_DEVICE_ENERGY_MANAGEMENT = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "deviceEnergyManagement");
    public static final ThingTypeUID THING_TYPE_ENERGY_EVSE = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "energyEvse");
    public static final ThingTypeUID THING_TYPE_ENERGY_EVSE_MODE = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "energyEvseMode");
    public static final ThingTypeUID THING_TYPE_ENERGY_PREFERENCE = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "energyPreference");
    public static final ThingTypeUID THING_TYPE_DEVICE_ENERGY_MANAGEMENT_MODE = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "deviceEnergyManagementMode");
    public static final ThingTypeUID THING_TYPE_DESCRIPTOR = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "descriptor");
    public static final ThingTypeUID THING_TYPE_BINDING = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "binding");
    public static final ThingTypeUID THING_TYPE_LABEL = new ThingTypeUID(MatterBindingConstants.BINDING_ID, "label");
    public static final ThingTypeUID THING_TYPE_ACCESS_CONTROL = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "accessControl");
    public static final ThingTypeUID THING_TYPE_BRIDGED_DEVICE_BASIC_INFORMATION = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "bridgedDeviceBasicInformation");
    public static final ThingTypeUID THING_TYPE_ACTIONS = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "actions");
    public static final ThingTypeUID THING_TYPE_PROXY_DISCOVERY = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "proxyDiscovery");
    public static final ThingTypeUID THING_TYPE_PROXY_CONFIGURATION = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "proxyConfiguration");
    public static final ThingTypeUID THING_TYPE_VALID_PROXIES = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "validProxies");
    public static final ThingTypeUID THING_TYPE_ICD_MANAGEMENT = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "icdManagement");
    public static final ThingTypeUID THING_TYPE_BASIC_INFORMATION = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "basicInformation");
    public static final ThingTypeUID THING_TYPE_GROUP_KEY_MANAGEMENT = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "groupKeyManagement");
    public static final ThingTypeUID THING_TYPE_LOCALIZATION_CONFIGURATION = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "localizationConfiguration");
    public static final ThingTypeUID THING_TYPE_TIME_FORMAT_LOCALIZATION = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "timeFormatLocalization");
    public static final ThingTypeUID THING_TYPE_UNIT_LOCALIZATION = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "unitLocalization");
    public static final ThingTypeUID THING_TYPE_POWER_SOURCE_CONFIGURATION = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "powerSourceConfiguration");
    public static final ThingTypeUID THING_TYPE_POWER_SOURCE = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "powerSource");
    public static final ThingTypeUID THING_TYPE_POWER_TOPOLOGY = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "powerTopology");
    public static final ThingTypeUID THING_TYPE_NETWORK_COMMISSIONING = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "networkCommissioning");
    public static final ThingTypeUID THING_TYPE_GENERAL_COMMISSIONING = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "generalCommissioning");
    public static final ThingTypeUID THING_TYPE_DIAGNOSTIC_LOGS = new ThingTypeUID(MatterBindingConstants.BINDING_ID,
            "diagnosticLogs");
    public static final ThingTypeUID THING_TYPE_GENERAL_DIAGNOSTICS = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "generalDiagnostics");
    public static final ThingTypeUID THING_TYPE_SOFTWARE_DIAGNOSTICS = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "softwareDiagnostics");
    public static final ThingTypeUID THING_TYPE_THREAD_NETWORK_DIAGNOSTICS = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "threadNetworkDiagnostics");
    public static final ThingTypeUID THING_TYPE_WI_FI_NETWORK_DIAGNOSTICS = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "wiFiNetworkDiagnostics");
    public static final ThingTypeUID THING_TYPE_ETHERNET_NETWORK_DIAGNOSTICS = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "ethernetNetworkDiagnostics");
    public static final ThingTypeUID THING_TYPE_TIME_SYNCHRONIZATION = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "timeSynchronization");
    public static final ThingTypeUID THING_TYPE_OPERATIONAL_CREDENTIALS = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "operationalCredentials");
    public static final ThingTypeUID THING_TYPE_ADMINISTRATOR_COMMISSIONING = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "administratorCommissioning");
    public static final ThingTypeUID THING_TYPE_OTA_SOFTWARE_UPDATE_PROVIDER = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "otaSoftwareUpdateProvider");
    public static final ThingTypeUID THING_TYPE_OTA_SOFTWARE_UPDATE_REQUESTOR = new ThingTypeUID(
            MatterBindingConstants.BINDING_ID, "otaSoftwareUpdateRequestor");

    public static final Map<ThingTypeUID, String> THING_TYPE_TO_HANDLER_MAPPING = Map.ofEntries(
            entry(THING_TYPE_IDENTIFY, "IdentifyHandler"), entry(THING_TYPE_GROUPS, "GroupsHandler"),
            entry(THING_TYPE_SCENES_MANAGEMENT, "ScenesManagementHandler"), entry(THING_TYPE_ON_OFF, "OnOffHandler"),
            entry(THING_TYPE_LEVEL_CONTROL, "LevelControlHandler"),
            entry(THING_TYPE_PULSE_WIDTH_MODULATION, "PulseWidthModulationHandler"),
            entry(THING_TYPE_BOOLEAN_STATE, "BooleanStateHandler"),
            entry(THING_TYPE_BOOLEAN_STATE_CONFIGURATION, "BooleanStateConfigurationHandler"),
            entry(THING_TYPE_MODE_SELECT, "ModeSelectHandler"), entry(THING_TYPE_MODE_BASE, "ModeBaseHandler"),
            entry(THING_TYPE_LOW_POWER, "LowPowerHandler"), entry(THING_TYPE_WAKE_ON_LAN, "WakeOnLanHandler"),
            entry(THING_TYPE_SWITCH, "SwitchHandler"), entry(THING_TYPE_OPERATIONAL_STATE, "OperationalStateHandler"),
            entry(THING_TYPE_ALARM_BASE, "AlarmBaseHandler"), entry(THING_TYPE_MESSAGES, "MessagesHandler"),
            entry(THING_TYPE_ILLUMINANCE_MEASUREMENT, "IlluminanceMeasurementHandler"),
            entry(THING_TYPE_TEMPERATURE_MEASUREMENT, "TemperatureMeasurementHandler"),
            entry(THING_TYPE_PRESSURE_MEASUREMENT, "PressureMeasurementHandler"),
            entry(THING_TYPE_FLOW_MEASUREMENT, "FlowMeasurementHandler"),
            entry(THING_TYPE_RELATIVE_HUMIDITY_MEASUREMENT, "RelativeHumidityMeasurementHandler"),
            entry(THING_TYPE_OCCUPANCY_SENSING, "OccupancySensingHandler"),
            entry(THING_TYPE_RESOURCE_MONITORING, "ResourceMonitoringHandler"),
            entry(THING_TYPE_HEPA_FILTER_MONITORING, "HepaFilterMonitoringHandler"),
            entry(THING_TYPE_ACTIVATED_CARBON_FILTER_MONITORING, "ActivatedCarbonFilterMonitoringHandler"),
            entry(THING_TYPE_AIR_QUALITY, "AirQualityHandler"),
            entry(THING_TYPE_CONCENTRATION_MEASUREMENT, "ConcentrationMeasurementHandler"),
            entry(THING_TYPE_CARBON_MONOXIDE_CONCENTRATION_MEASUREMENT,
                    "CarbonMonoxideConcentrationMeasurementHandler"),
            entry(THING_TYPE_CARBON_DIOXIDE_CONCENTRATION_MEASUREMENT, "CarbonDioxideConcentrationMeasurementHandler"),
            entry(THING_TYPE_NITROGEN_DIOXIDE_CONCENTRATION_MEASUREMENT,
                    "NitrogenDioxideConcentrationMeasurementHandler"),
            entry(THING_TYPE_OZONE_CONCENTRATION_MEASUREMENT, "OzoneConcentrationMeasurementHandler"),
            entry(THING_TYPE_PM2, "Pm2Handler"),
            entry(THING_TYPE_FORMALDEHYDE_CONCENTRATION_MEASUREMENT, "FormaldehydeConcentrationMeasurementHandler"),
            entry(THING_TYPE_PM1CONCENTRATION_MEASUREMENT, "Pm1ConcentrationMeasurementHandler"),
            entry(THING_TYPE_PM10CONCENTRATION_MEASUREMENT, "Pm10ConcentrationMeasurementHandler"),
            entry(THING_TYPE_TOTAL_VOLATILE_ORGANIC_COMPOUNDS_CONCENTRATION_MEASUREMENT,
                    "TotalVolatileOrganicCompoundsConcentrationMeasurementHandler"),
            entry(THING_TYPE_RADON_CONCENTRATION_MEASUREMENT, "RadonConcentrationMeasurementHandler"),
            entry(THING_TYPE_SMOKE_CO_ALARM, "SmokeCoAlarmHandler"),
            entry(THING_TYPE_ELECTRICAL_ENERGY_MEASUREMENT, "ElectricalEnergyMeasurementHandler"),
            entry(THING_TYPE_ELECTRICAL_POWER_MEASUREMENT, "ElectricalPowerMeasurementHandler"),
            entry(THING_TYPE_COLOR_CONTROL, "ColorControlHandler"),
            entry(THING_TYPE_BALLAST_CONFIGURATION, "BallastConfigurationHandler"),
            entry(THING_TYPE_PUMP_CONFIGURATION_AND_CONTROL, "PumpConfigurationAndControlHandler"),
            entry(THING_TYPE_THERMOSTAT, "ThermostatHandler"), entry(THING_TYPE_FAN_CONTROL, "FanControlHandler"),
            entry(THING_TYPE_THERMOSTAT_USER_INTERFACE_CONFIGURATION, "ThermostatUserInterfaceConfigurationHandler"),
            entry(THING_TYPE_VALVE_CONFIGURATION_AND_CONTROL, "ValveConfigurationAndControlHandler"),
            entry(THING_TYPE_DOOR_LOCK, "DoorLockHandler"), entry(THING_TYPE_WINDOW_COVERING, "WindowCoveringHandler"),
            entry(THING_TYPE_ACCOUNT_LOGIN, "AccountLoginHandler"),
            entry(THING_TYPE_APPLICATION_BASIC, "ApplicationBasicHandler"),
            entry(THING_TYPE_APPLICATION_LAUNCHER, "ApplicationLauncherHandler"),
            entry(THING_TYPE_AUDIO_OUTPUT, "AudioOutputHandler"), entry(THING_TYPE_KEYPAD_INPUT, "KeypadInputHandler"),
            entry(THING_TYPE_MEDIA_INPUT, "MediaInputHandler"),
            entry(THING_TYPE_MEDIA_PLAYBACK, "MediaPlaybackHandler"),
            entry(THING_TYPE_TARGET_NAVIGATOR, "TargetNavigatorHandler"),
            entry(THING_TYPE_CONTENT_APP_OBSERVER, "ContentAppObserverHandler"),
            entry(THING_TYPE_CONTENT_CONTROL, "ContentControlHandler"),
            entry(THING_TYPE_RVC_RUN_MODE, "RvcRunModeHandler"),
            entry(THING_TYPE_RVC_CLEAN_MODE, "RvcCleanModeHandler"),
            entry(THING_TYPE_RVC_OPERATIONAL_STATE, "RvcOperationalStateHandler"),
            entry(THING_TYPE_TEMPERATURE_CONTROL, "TemperatureControlHandler"),
            entry(THING_TYPE_DISHWASHER_MODE, "DishwasherModeHandler"),
            entry(THING_TYPE_DISHWASHER_ALARM, "DishwasherAlarmHandler"),
            entry(THING_TYPE_LAUNDRY_WASHER_MODE, "LaundryWasherModeHandler"),
            entry(THING_TYPE_LAUNDRY_WASHER_CONTROLS, "LaundryWasherControlsHandler"),
            entry(THING_TYPE_REFRIGERATOR_AND_TEMPERATURE_CONTROLLED_CABINET_MODE,
                    "RefrigeratorAndTemperatureControlledCabinetModeHandler"),
            entry(THING_TYPE_REFRIGERATOR_ALARM, "RefrigeratorAlarmHandler"),
            entry(THING_TYPE_LAUNDRY_DRYER_CONTROLS, "LaundryDryerControlsHandler"),
            entry(THING_TYPE_OVEN_CAVITY_OPERATIONAL_STATE, "OvenCavityOperationalStateHandler"),
            entry(THING_TYPE_OVEN_MODE, "OvenModeHandler"),
            entry(THING_TYPE_MICROWAVE_OVEN_MODE, "MicrowaveOvenModeHandler"),
            entry(THING_TYPE_MICROWAVE_OVEN_CONTROL, "MicrowaveOvenControlHandler"),
            entry(THING_TYPE_DEVICE_ENERGY_MANAGEMENT, "DeviceEnergyManagementHandler"),
            entry(THING_TYPE_ENERGY_EVSE, "EnergyEvseHandler"),
            entry(THING_TYPE_ENERGY_EVSE_MODE, "EnergyEvseModeHandler"),
            entry(THING_TYPE_ENERGY_PREFERENCE, "EnergyPreferenceHandler"),
            entry(THING_TYPE_DEVICE_ENERGY_MANAGEMENT_MODE, "DeviceEnergyManagementModeHandler"),
            entry(THING_TYPE_DESCRIPTOR, "DescriptorHandler"), entry(THING_TYPE_BINDING, "BindingHandler"),
            entry(THING_TYPE_LABEL, "LabelHandler"), entry(THING_TYPE_ACCESS_CONTROL, "AccessControlHandler"),
            entry(THING_TYPE_BRIDGED_DEVICE_BASIC_INFORMATION, "BridgedDeviceBasicInformationHandler"),
            entry(THING_TYPE_ACTIONS, "ActionsHandler"), entry(THING_TYPE_PROXY_DISCOVERY, "ProxyDiscoveryHandler"),
            entry(THING_TYPE_PROXY_CONFIGURATION, "ProxyConfigurationHandler"),
            entry(THING_TYPE_VALID_PROXIES, "ValidProxiesHandler"),
            entry(THING_TYPE_ICD_MANAGEMENT, "IcdManagementHandler"),
            entry(THING_TYPE_BASIC_INFORMATION, "BasicInformationHandler"),
            entry(THING_TYPE_GROUP_KEY_MANAGEMENT, "GroupKeyManagementHandler"),
            entry(THING_TYPE_LOCALIZATION_CONFIGURATION, "LocalizationConfigurationHandler"),
            entry(THING_TYPE_TIME_FORMAT_LOCALIZATION, "TimeFormatLocalizationHandler"),
            entry(THING_TYPE_UNIT_LOCALIZATION, "UnitLocalizationHandler"),
            entry(THING_TYPE_POWER_SOURCE_CONFIGURATION, "PowerSourceConfigurationHandler"),
            entry(THING_TYPE_POWER_SOURCE, "PowerSourceHandler"),
            entry(THING_TYPE_POWER_TOPOLOGY, "PowerTopologyHandler"),
            entry(THING_TYPE_NETWORK_COMMISSIONING, "NetworkCommissioningHandler"),
            entry(THING_TYPE_GENERAL_COMMISSIONING, "GeneralCommissioningHandler"),
            entry(THING_TYPE_DIAGNOSTIC_LOGS, "DiagnosticLogsHandler"),
            entry(THING_TYPE_GENERAL_DIAGNOSTICS, "GeneralDiagnosticsHandler"),
            entry(THING_TYPE_SOFTWARE_DIAGNOSTICS, "SoftwareDiagnosticsHandler"),
            entry(THING_TYPE_THREAD_NETWORK_DIAGNOSTICS, "ThreadNetworkDiagnosticsHandler"),
            entry(THING_TYPE_WI_FI_NETWORK_DIAGNOSTICS, "WiFiNetworkDiagnosticsHandler"),
            entry(THING_TYPE_ETHERNET_NETWORK_DIAGNOSTICS, "EthernetNetworkDiagnosticsHandler"),
            entry(THING_TYPE_TIME_SYNCHRONIZATION, "TimeSynchronizationHandler"),
            entry(THING_TYPE_OPERATIONAL_CREDENTIALS, "OperationalCredentialsHandler"),
            entry(THING_TYPE_ADMINISTRATOR_COMMISSIONING, "AdministratorCommissioningHandler"),
            entry(THING_TYPE_OTA_SOFTWARE_UPDATE_PROVIDER, "OtaSoftwareUpdateProviderHandler"),
            entry(THING_TYPE_OTA_SOFTWARE_UPDATE_REQUESTOR, "OtaSoftwareUpdateRequestorHandler"));

    public static final Map<String, ThingTypeUID> CLUSTER_NAME_TO_THING_TYPE_MAPPING = Map.ofEntries(
            entry("Identify", THING_TYPE_IDENTIFY), entry("Groups", THING_TYPE_GROUPS),
            entry("ScenesManagement", THING_TYPE_SCENES_MANAGEMENT), entry("OnOff", THING_TYPE_ON_OFF),
            entry("LevelControl", THING_TYPE_LEVEL_CONTROL),
            entry("PulseWidthModulation", THING_TYPE_PULSE_WIDTH_MODULATION),
            entry("BooleanState", THING_TYPE_BOOLEAN_STATE),
            entry("BooleanStateConfiguration", THING_TYPE_BOOLEAN_STATE_CONFIGURATION),
            entry("ModeSelect", THING_TYPE_MODE_SELECT), entry("ModeBase", THING_TYPE_MODE_BASE),
            entry("LowPower", THING_TYPE_LOW_POWER), entry("WakeOnLan", THING_TYPE_WAKE_ON_LAN),
            entry("Switch", THING_TYPE_SWITCH), entry("OperationalState", THING_TYPE_OPERATIONAL_STATE),
            entry("AlarmBase", THING_TYPE_ALARM_BASE), entry("Messages", THING_TYPE_MESSAGES),
            entry("IlluminanceMeasurement", THING_TYPE_ILLUMINANCE_MEASUREMENT),
            entry("TemperatureMeasurement", THING_TYPE_TEMPERATURE_MEASUREMENT),
            entry("PressureMeasurement", THING_TYPE_PRESSURE_MEASUREMENT),
            entry("FlowMeasurement", THING_TYPE_FLOW_MEASUREMENT),
            entry("RelativeHumidityMeasurement", THING_TYPE_RELATIVE_HUMIDITY_MEASUREMENT),
            entry("OccupancySensing", THING_TYPE_OCCUPANCY_SENSING),
            entry("ResourceMonitoring", THING_TYPE_RESOURCE_MONITORING),
            entry("HepaFilterMonitoring", THING_TYPE_HEPA_FILTER_MONITORING),
            entry("ActivatedCarbonFilterMonitoring", THING_TYPE_ACTIVATED_CARBON_FILTER_MONITORING),
            entry("AirQuality", THING_TYPE_AIR_QUALITY),
            entry("ConcentrationMeasurement", THING_TYPE_CONCENTRATION_MEASUREMENT),
            entry("CarbonMonoxideConcentrationMeasurement", THING_TYPE_CARBON_MONOXIDE_CONCENTRATION_MEASUREMENT),
            entry("CarbonDioxideConcentrationMeasurement", THING_TYPE_CARBON_DIOXIDE_CONCENTRATION_MEASUREMENT),
            entry("NitrogenDioxideConcentrationMeasurement", THING_TYPE_NITROGEN_DIOXIDE_CONCENTRATION_MEASUREMENT),
            entry("OzoneConcentrationMeasurement", THING_TYPE_OZONE_CONCENTRATION_MEASUREMENT),
            entry("Pm2", THING_TYPE_PM2),
            entry("FormaldehydeConcentrationMeasurement", THING_TYPE_FORMALDEHYDE_CONCENTRATION_MEASUREMENT),
            entry("Pm1ConcentrationMeasurement", THING_TYPE_PM1CONCENTRATION_MEASUREMENT),
            entry("Pm10ConcentrationMeasurement", THING_TYPE_PM10CONCENTRATION_MEASUREMENT),
            entry("TotalVolatileOrganicCompoundsConcentrationMeasurement",
                    THING_TYPE_TOTAL_VOLATILE_ORGANIC_COMPOUNDS_CONCENTRATION_MEASUREMENT),
            entry("RadonConcentrationMeasurement", THING_TYPE_RADON_CONCENTRATION_MEASUREMENT),
            entry("SmokeCoAlarm", THING_TYPE_SMOKE_CO_ALARM),
            entry("ElectricalEnergyMeasurement", THING_TYPE_ELECTRICAL_ENERGY_MEASUREMENT),
            entry("ElectricalPowerMeasurement", THING_TYPE_ELECTRICAL_POWER_MEASUREMENT),
            entry("ColorControl", THING_TYPE_COLOR_CONTROL),
            entry("BallastConfiguration", THING_TYPE_BALLAST_CONFIGURATION),
            entry("PumpConfigurationAndControl", THING_TYPE_PUMP_CONFIGURATION_AND_CONTROL),
            entry("Thermostat", THING_TYPE_THERMOSTAT), entry("FanControl", THING_TYPE_FAN_CONTROL),
            entry("ThermostatUserInterfaceConfiguration", THING_TYPE_THERMOSTAT_USER_INTERFACE_CONFIGURATION),
            entry("ValveConfigurationAndControl", THING_TYPE_VALVE_CONFIGURATION_AND_CONTROL),
            entry("DoorLock", THING_TYPE_DOOR_LOCK), entry("WindowCovering", THING_TYPE_WINDOW_COVERING),
            entry("AccountLogin", THING_TYPE_ACCOUNT_LOGIN), entry("ApplicationBasic", THING_TYPE_APPLICATION_BASIC),
            entry("ApplicationLauncher", THING_TYPE_APPLICATION_LAUNCHER),
            entry("AudioOutput", THING_TYPE_AUDIO_OUTPUT), entry("KeypadInput", THING_TYPE_KEYPAD_INPUT),
            entry("MediaInput", THING_TYPE_MEDIA_INPUT), entry("MediaPlayback", THING_TYPE_MEDIA_PLAYBACK),
            entry("TargetNavigator", THING_TYPE_TARGET_NAVIGATOR),
            entry("ContentAppObserver", THING_TYPE_CONTENT_APP_OBSERVER),
            entry("ContentControl", THING_TYPE_CONTENT_CONTROL), entry("RvcRunMode", THING_TYPE_RVC_RUN_MODE),
            entry("RvcCleanMode", THING_TYPE_RVC_CLEAN_MODE),
            entry("RvcOperationalState", THING_TYPE_RVC_OPERATIONAL_STATE),
            entry("TemperatureControl", THING_TYPE_TEMPERATURE_CONTROL),
            entry("DishwasherMode", THING_TYPE_DISHWASHER_MODE), entry("DishwasherAlarm", THING_TYPE_DISHWASHER_ALARM),
            entry("LaundryWasherMode", THING_TYPE_LAUNDRY_WASHER_MODE),
            entry("LaundryWasherControls", THING_TYPE_LAUNDRY_WASHER_CONTROLS),
            entry("RefrigeratorAndTemperatureControlledCabinetMode",
                    THING_TYPE_REFRIGERATOR_AND_TEMPERATURE_CONTROLLED_CABINET_MODE),
            entry("RefrigeratorAlarm", THING_TYPE_REFRIGERATOR_ALARM),
            entry("LaundryDryerControls", THING_TYPE_LAUNDRY_DRYER_CONTROLS),
            entry("OvenCavityOperationalState", THING_TYPE_OVEN_CAVITY_OPERATIONAL_STATE),
            entry("OvenMode", THING_TYPE_OVEN_MODE), entry("MicrowaveOvenMode", THING_TYPE_MICROWAVE_OVEN_MODE),
            entry("MicrowaveOvenControl", THING_TYPE_MICROWAVE_OVEN_CONTROL),
            entry("DeviceEnergyManagement", THING_TYPE_DEVICE_ENERGY_MANAGEMENT),
            entry("EnergyEvse", THING_TYPE_ENERGY_EVSE), entry("EnergyEvseMode", THING_TYPE_ENERGY_EVSE_MODE),
            entry("EnergyPreference", THING_TYPE_ENERGY_PREFERENCE),
            entry("DeviceEnergyManagementMode", THING_TYPE_DEVICE_ENERGY_MANAGEMENT_MODE),
            entry("Descriptor", THING_TYPE_DESCRIPTOR), entry("Binding", THING_TYPE_BINDING),
            entry("Label", THING_TYPE_LABEL), entry("AccessControl", THING_TYPE_ACCESS_CONTROL),
            entry("BridgedDeviceBasicInformation", THING_TYPE_BRIDGED_DEVICE_BASIC_INFORMATION),
            entry("Actions", THING_TYPE_ACTIONS), entry("ProxyDiscovery", THING_TYPE_PROXY_DISCOVERY),
            entry("ProxyConfiguration", THING_TYPE_PROXY_CONFIGURATION),
            entry("ValidProxies", THING_TYPE_VALID_PROXIES), entry("IcdManagement", THING_TYPE_ICD_MANAGEMENT),
            entry("BasicInformation", THING_TYPE_BASIC_INFORMATION),
            entry("GroupKeyManagement", THING_TYPE_GROUP_KEY_MANAGEMENT),
            entry("LocalizationConfiguration", THING_TYPE_LOCALIZATION_CONFIGURATION),
            entry("TimeFormatLocalization", THING_TYPE_TIME_FORMAT_LOCALIZATION),
            entry("UnitLocalization", THING_TYPE_UNIT_LOCALIZATION),
            entry("PowerSourceConfiguration", THING_TYPE_POWER_SOURCE_CONFIGURATION),
            entry("PowerSource", THING_TYPE_POWER_SOURCE), entry("PowerTopology", THING_TYPE_POWER_TOPOLOGY),
            entry("NetworkCommissioning", THING_TYPE_NETWORK_COMMISSIONING),
            entry("GeneralCommissioning", THING_TYPE_GENERAL_COMMISSIONING),
            entry("DiagnosticLogs", THING_TYPE_DIAGNOSTIC_LOGS),
            entry("GeneralDiagnostics", THING_TYPE_GENERAL_DIAGNOSTICS),
            entry("SoftwareDiagnostics", THING_TYPE_SOFTWARE_DIAGNOSTICS),
            entry("ThreadNetworkDiagnostics", THING_TYPE_THREAD_NETWORK_DIAGNOSTICS),
            entry("WiFiNetworkDiagnostics", THING_TYPE_WI_FI_NETWORK_DIAGNOSTICS),
            entry("EthernetNetworkDiagnostics", THING_TYPE_ETHERNET_NETWORK_DIAGNOSTICS),
            entry("TimeSynchronization", THING_TYPE_TIME_SYNCHRONIZATION),
            entry("OperationalCredentials", THING_TYPE_OPERATIONAL_CREDENTIALS),
            entry("AdministratorCommissioning", THING_TYPE_ADMINISTRATOR_COMMISSIONING),
            entry("OtaSoftwareUpdateProvider", THING_TYPE_OTA_SOFTWARE_UPDATE_PROVIDER),
            entry("OtaSoftwareUpdateRequestor", THING_TYPE_OTA_SOFTWARE_UPDATE_REQUESTOR));

    public static final Set<ThingTypeUID> SUPPORTED_DISCOVERY_THING_TYPES_UIDS = Set.of(THING_TYPE_IDENTIFY,
            THING_TYPE_GROUPS, THING_TYPE_SCENES_MANAGEMENT, THING_TYPE_ON_OFF, THING_TYPE_LEVEL_CONTROL,
            THING_TYPE_PULSE_WIDTH_MODULATION, THING_TYPE_BOOLEAN_STATE, THING_TYPE_BOOLEAN_STATE_CONFIGURATION,
            THING_TYPE_MODE_SELECT, THING_TYPE_MODE_BASE, THING_TYPE_LOW_POWER, THING_TYPE_WAKE_ON_LAN,
            THING_TYPE_SWITCH, THING_TYPE_OPERATIONAL_STATE, THING_TYPE_ALARM_BASE, THING_TYPE_MESSAGES,
            THING_TYPE_ILLUMINANCE_MEASUREMENT, THING_TYPE_TEMPERATURE_MEASUREMENT, THING_TYPE_PRESSURE_MEASUREMENT,
            THING_TYPE_FLOW_MEASUREMENT, THING_TYPE_RELATIVE_HUMIDITY_MEASUREMENT, THING_TYPE_OCCUPANCY_SENSING,
            THING_TYPE_RESOURCE_MONITORING, THING_TYPE_HEPA_FILTER_MONITORING,
            THING_TYPE_ACTIVATED_CARBON_FILTER_MONITORING, THING_TYPE_AIR_QUALITY, THING_TYPE_CONCENTRATION_MEASUREMENT,
            THING_TYPE_CARBON_MONOXIDE_CONCENTRATION_MEASUREMENT, THING_TYPE_CARBON_DIOXIDE_CONCENTRATION_MEASUREMENT,
            THING_TYPE_NITROGEN_DIOXIDE_CONCENTRATION_MEASUREMENT, THING_TYPE_OZONE_CONCENTRATION_MEASUREMENT,
            THING_TYPE_PM2, THING_TYPE_FORMALDEHYDE_CONCENTRATION_MEASUREMENT, THING_TYPE_PM1CONCENTRATION_MEASUREMENT,
            THING_TYPE_PM10CONCENTRATION_MEASUREMENT,
            THING_TYPE_TOTAL_VOLATILE_ORGANIC_COMPOUNDS_CONCENTRATION_MEASUREMENT,
            THING_TYPE_RADON_CONCENTRATION_MEASUREMENT, THING_TYPE_SMOKE_CO_ALARM,
            THING_TYPE_ELECTRICAL_ENERGY_MEASUREMENT, THING_TYPE_ELECTRICAL_POWER_MEASUREMENT, THING_TYPE_COLOR_CONTROL,
            THING_TYPE_BALLAST_CONFIGURATION, THING_TYPE_PUMP_CONFIGURATION_AND_CONTROL, THING_TYPE_THERMOSTAT,
            THING_TYPE_FAN_CONTROL, THING_TYPE_THERMOSTAT_USER_INTERFACE_CONFIGURATION,
            THING_TYPE_VALVE_CONFIGURATION_AND_CONTROL, THING_TYPE_DOOR_LOCK, THING_TYPE_WINDOW_COVERING,
            THING_TYPE_ACCOUNT_LOGIN, THING_TYPE_APPLICATION_BASIC, THING_TYPE_APPLICATION_LAUNCHER,
            THING_TYPE_AUDIO_OUTPUT, THING_TYPE_KEYPAD_INPUT, THING_TYPE_MEDIA_INPUT, THING_TYPE_MEDIA_PLAYBACK,
            THING_TYPE_TARGET_NAVIGATOR, THING_TYPE_CONTENT_APP_OBSERVER, THING_TYPE_CONTENT_CONTROL,
            THING_TYPE_RVC_RUN_MODE, THING_TYPE_RVC_CLEAN_MODE, THING_TYPE_RVC_OPERATIONAL_STATE,
            THING_TYPE_TEMPERATURE_CONTROL, THING_TYPE_DISHWASHER_MODE, THING_TYPE_DISHWASHER_ALARM,
            THING_TYPE_LAUNDRY_WASHER_MODE, THING_TYPE_LAUNDRY_WASHER_CONTROLS,
            THING_TYPE_REFRIGERATOR_AND_TEMPERATURE_CONTROLLED_CABINET_MODE, THING_TYPE_REFRIGERATOR_ALARM,
            THING_TYPE_LAUNDRY_DRYER_CONTROLS, THING_TYPE_OVEN_CAVITY_OPERATIONAL_STATE, THING_TYPE_OVEN_MODE,
            THING_TYPE_MICROWAVE_OVEN_MODE, THING_TYPE_MICROWAVE_OVEN_CONTROL, THING_TYPE_DEVICE_ENERGY_MANAGEMENT,
            THING_TYPE_ENERGY_EVSE, THING_TYPE_ENERGY_EVSE_MODE, THING_TYPE_ENERGY_PREFERENCE,
            THING_TYPE_DEVICE_ENERGY_MANAGEMENT_MODE, THING_TYPE_DESCRIPTOR, THING_TYPE_BINDING, THING_TYPE_LABEL,
            THING_TYPE_ACCESS_CONTROL, THING_TYPE_BRIDGED_DEVICE_BASIC_INFORMATION, THING_TYPE_ACTIONS,
            THING_TYPE_PROXY_DISCOVERY, THING_TYPE_PROXY_CONFIGURATION, THING_TYPE_VALID_PROXIES,
            THING_TYPE_ICD_MANAGEMENT, THING_TYPE_BASIC_INFORMATION, THING_TYPE_GROUP_KEY_MANAGEMENT,
            THING_TYPE_LOCALIZATION_CONFIGURATION, THING_TYPE_TIME_FORMAT_LOCALIZATION, THING_TYPE_UNIT_LOCALIZATION,
            THING_TYPE_POWER_SOURCE_CONFIGURATION, THING_TYPE_POWER_SOURCE, THING_TYPE_POWER_TOPOLOGY,
            THING_TYPE_NETWORK_COMMISSIONING, THING_TYPE_GENERAL_COMMISSIONING, THING_TYPE_DIAGNOSTIC_LOGS,
            THING_TYPE_GENERAL_DIAGNOSTICS, THING_TYPE_SOFTWARE_DIAGNOSTICS, THING_TYPE_THREAD_NETWORK_DIAGNOSTICS,
            THING_TYPE_WI_FI_NETWORK_DIAGNOSTICS, THING_TYPE_ETHERNET_NETWORK_DIAGNOSTICS,
            THING_TYPE_TIME_SYNCHRONIZATION, THING_TYPE_OPERATIONAL_CREDENTIALS, THING_TYPE_ADMINISTRATOR_COMMISSIONING,
            THING_TYPE_OTA_SOFTWARE_UPDATE_PROVIDER, THING_TYPE_OTA_SOFTWARE_UPDATE_REQUESTOR);
}
