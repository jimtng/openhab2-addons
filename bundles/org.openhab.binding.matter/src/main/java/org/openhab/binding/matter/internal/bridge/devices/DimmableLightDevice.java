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

import java.util.Map;
import java.util.Optional;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.binding.matter.internal.bridge.MatterBridgeClient;
import org.openhab.core.items.GenericItem;
import org.openhab.core.items.GroupItem;
import org.openhab.core.items.Item;
import org.openhab.core.items.MetadataRegistry;
import org.openhab.core.library.items.DimmerItem;
import org.openhab.core.library.items.SwitchItem;
import org.openhab.core.library.types.HSBType;
import org.openhab.core.library.types.OnOffType;
import org.openhab.core.library.types.PercentType;
import org.openhab.core.types.State;

/**
 * The {@link DimmableLightDevice}
 *
 * @author Dan Cunningham - Initial contribution
 */
@NonNullByDefault
public class DimmableLightDevice extends GenericDevice {

    public DimmableLightDevice(MetadataRegistry metadataRegistry, MatterBridgeClient client, GenericItem item) {
        super(metadataRegistry, client, item);
    }

    @Override
    public String deviceType() {
        return "DimmableLightDevice";
    }

    @Override
    public Map<String, Object> activate() {
        dispose();
        primaryItem.addStateChangeListener(this);
        return Map.of("currentLevel", Optional.ofNullable(primaryItem.getStateAs(PercentType.class))
                .orElseGet(() -> new PercentType(0)).intValue());
    }

    @Override
    public void dispose() {
        primaryItem.removeStateChangeListener(this);
    }

    @Override
    public void handleMatterEvent(String clusterName, String attributeName, Object data) {
        switch (attributeName) {
            case "onOff": {
                if (primaryItem instanceof GroupItem groupItem) {
                    groupItem.send(OnOffType.from(Boolean.valueOf(data.toString())));
                } else {
                    ((SwitchItem) primaryItem).send(OnOffType.from(Boolean.valueOf(data.toString())));
                }
            }
                break;
            case "currentLevel": {
                if (primaryItem instanceof GroupItem groupItem) {
                    groupItem.send(levelToPercent(((Double) data).intValue()));
                } else if (primaryItem instanceof DimmerItem) {
                    ((DimmerItem) primaryItem).send(levelToPercent(((Double) data).intValue()));
                } else {
                    ((SwitchItem) primaryItem).send(OnOffType.from(((Double) data).intValue() > 0));
                }
            }
                break;
            default:
                break;
        }
    }

    public void updateState(Item item, State state) {
        if (state instanceof HSBType hsb) {
            setEndpointState("levelControl", "currentLevel", percentToLevel(hsb.getBrightness()));
        } else if (state instanceof PercentType percentType) {
            setEndpointState("levelControl", "currentLevel", percentToLevel(percentType));
        } else if (state instanceof OnOffType onOffType) {
            setEndpointState("onOff", "onOff", onOffType == OnOffType.ON ? true : false);
        }
    }
}
