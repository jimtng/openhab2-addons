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
package org.openhab.binding.matter.internal.bridge.devices;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.binding.matter.internal.bridge.MatterBridgeClient;
import org.openhab.binding.matter.internal.client.model.cluster.gen.ThermostatCluster;
import org.openhab.core.items.*;
import org.openhab.core.library.items.NumberItem;
import org.openhab.core.library.types.DecimalType;
import org.openhab.core.library.types.QuantityType;
import org.openhab.core.library.types.StringType;
import org.openhab.core.types.State;
import org.openhab.core.types.UnDefType;

/**
 * The {@link DimmableLightDevice}
 *
 * @author Dan Cunningham - Initial contribution
 */
@NonNullByDefault
public class ThermostatDevice extends GenericDevice {
    // private final Logger logger = LoggerFactory.getLogger(ThermostatDevice.class);
    private final Map<String, GenericItem> itemMap = new HashMap<>();
    private final Map<String, String> attributeToItemNameMap = new HashMap<>();
    private final SystemModeMapper systemModeMapper = new SystemModeMapper();

    public ThermostatDevice(MetadataRegistry metadataRegistry, MatterBridgeClient client, GenericItem item) {
        super(metadataRegistry, client, item);
    }

    @Override
    public String deviceType() {
        return "ThermostatDevice";
    }

    @Override
    public void handleMatterEvent(String clusterName, String attributeName, Object data) {
        String itemUid = attributeToItemNameMap.get(attributeName);
        if (itemUid != null) {
            GenericItem item = itemMap.get(itemUid);
            if (item != null) {
                // State state = TypeParser.parseState(item.getAcceptedDataTypes(), data.toString());
                switch (attributeName) {
                    case "localTemperature":
                    case "outdoorTemperature":
                    case "occupiedHeatingSetpoint":
                    case "occupiedCoolingSetpoint":
                        QuantityType t = valueToTemperature(Float.valueOf(data.toString()).intValue());
                        item.setState(t);
                        break;
                    case "systemMode":
                        try {
                            String mappedMode = systemModeMapper
                                    .toCustomValue(Double.valueOf(data.toString()).intValue());
                            if (item instanceof NumberItem) {
                                item.setState(new DecimalType(mappedMode));
                            } else {
                                item.setState(new StringType(mappedMode));
                            }
                        } catch (SystemModeMappingException e) {
                            logger.debug("Could not convert {} to custom value", data);
                        }
                        break;
                    default:
                        break;
                }
            }

        }
    }

    public void updateState(Item item, State state) {
        attributeToItemNameMap.forEach((attribute, itemUid) -> {
            if (itemUid.equals(item.getUID())) {
                // we need to do conversion here
                switch (attribute) {
                    case "localTemperature":
                    case "outdoorTemperature":
                    case "occupiedHeatingSetpoint":
                    case "occupiedCoolingSetpoint":
                        Integer value = temperatureToValue(state);
                        if (value != null) {
                            logger.debug("Setting {} to {}", attribute, value);
                            setEndpointState("thermostat", attribute, value);
                        } else {
                            logger.debug("Could not convert {} to matter value", state.toString());
                        }
                        break;
                    case "systemMode":
                        try {
                            int mode = systemModeMapper.fromCustomValue(state.toString()).value;
                            setEndpointState("thermostat", attribute, mode);
                        } catch (SystemModeMappingException e) {
                            logger.debug("Could not convert {} to matter value", state.toString());
                        }
                        break;
                    default:
                        break;
                }
            }
        });
    }

    @Override
    public Map<String, Object> activate() {
        dispose();
        primaryItem.addStateChangeListener(this);
        Map<String, Object> attributeMap = new HashMap<>();
        for (Item member : ((GroupItem) primaryItem).getAllMembers()) {
            if (member instanceof GenericItem genericMember) {
                Metadata metadata = metadataRegistry.get(new MetadataKey("matter", genericMember.getUID()));
                if (metadata != null) {
                    String[] attributes = metadata.getValue().split(",");
                    State state = genericMember.getState();
                    for (String attribute : attributes) {
                        switch (attribute) {
                            case "localTemperature":
                            case "outdoorTemperature":
                            case "occupiedHeatingSetpoint":
                            case "occupiedCoolingSetpoint":
                                if (state instanceof UnDefType) {
                                    attributeMap.put(attribute, 0);
                                } else {
                                    Integer value = temperatureToValue(state);
                                    attributeMap.put(attribute, value != null ? value : 0);
                                }
                                break;
                            case "systemMode":
                                if (state instanceof DecimalType decimalType) {
                                    attributeMap.put(attribute, decimalType.intValue());
                                } else {
                                    attributeMap.put(attribute, 0);
                                }
                                Map<String, Object> config = metadata.getConfiguration();
                                if (!config.isEmpty()) {
                                    systemModeMapper.initializeMappings(config);
                                }
                                break;
                            default:
                                continue;
                        }
                        if (!itemMap.containsKey(genericMember.getUID())) {
                            itemMap.put(genericMember.getUID(), genericMember);
                            genericMember.addStateChangeListener(this);
                        }
                        attributeToItemNameMap.put(attribute, genericMember.getUID());
                    }
                }
            }
        }
        // todo make this configurable and maybe support it in a different way
        // attributeMap.put("systemModeMap", "OFF=0,AUTO=1,COOL=3,HEAT=4");
        // attributeMap.put("controlSequenceOfOperation",
        // ThermostatCluster.ControlSequenceOfOperationEnum.COOLING_AND_HEATING.value);

        return attributeMap;
    }

    @Override
    public void dispose() {
        attributeToItemNameMap.clear();
        primaryItem.removeStateChangeListener(this);
        itemMap.forEach((uid, item) -> {
            ((GenericItem) item).removeStateChangeListener(this);
        });
        itemMap.clear();
    }

    class SystemModeMapper {
        private final Map<Integer, String> intToCustomMap = new HashMap<>();
        private final Map<String, ThermostatCluster.SystemModeEnum> customToEnumMap = new HashMap<>();

        public SystemModeMapper() {
            Map<String, Object> mappings = new HashMap<>();
            mappings.put("OFF", 0);
            mappings.put("HEAT", 1);
            mappings.put("COOL", 2);
            mappings.put("AUTO", 3);
            mappings.put("EMERGENCY_HEAT", 4);
            mappings.put("PRECOOLING", 5);
            mappings.put("FAN_ONLY", 6);
            mappings.put("DRY", 7);
            mappings.put("SLEEP", 8);
            initializeMappings(mappings);
        }

        public SystemModeMapper(Map<String, Object> mappings) {
            initializeMappings(mappings);
        }

        private void initializeMappings(Map<String, Object> mappings) {
            intToCustomMap.clear();
            customToEnumMap.clear();
            for (Map.Entry<String, Object> entry : mappings.entrySet()) {
                try {
                    ThermostatCluster.SystemModeEnum mode = ThermostatCluster.SystemModeEnum
                            .valueOf(entry.getKey().trim());
                    String customValue = entry.getValue() != null ? entry.getValue().toString().trim() : null;

                    if (customValue != null) {
                        intToCustomMap.put(mode.value, customValue); // Use integer value of the enum
                        customToEnumMap.put(customValue, mode);
                    }
                } catch (IllegalArgumentException e) {
                    logger.debug("Invalid mode: {}", entry.getKey());
                }
            }
        }

        public String toCustomValue(int modeValue) throws SystemModeMappingException {
            String value = intToCustomMap.get(modeValue);
            if (value == null) {
                throw new SystemModeMappingException("No mapping for mode: " + modeValue);
            }
            return value;
        }

        public ThermostatCluster.SystemModeEnum fromCustomValue(String customValue) throws SystemModeMappingException {
            ThermostatCluster.SystemModeEnum value = customToEnumMap.get(customValue);
            if (value == null) {
                throw new SystemModeMappingException("No mapping for custom value: " + customValue);
            }
            return value;
        }
    }

    class SystemModeMappingException extends Exception {
        private static final long serialVersionUID = 1L;

        public SystemModeMappingException(String message) {
            super(message);
        }
    }
}
