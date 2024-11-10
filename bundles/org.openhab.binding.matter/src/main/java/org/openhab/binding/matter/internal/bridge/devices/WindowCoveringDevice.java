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
import org.openhab.core.library.items.RollershutterItem;
import org.openhab.core.library.types.OpenClosedType;
import org.openhab.core.library.types.PercentType;
import org.openhab.core.types.State;

/**
 * The {@link DimmableLightDevice}
 *
 * @author Dan Cunningham - Initial contribution
 */
@NonNullByDefault
public class WindowCoveringDevice extends GenericDevice {

    public WindowCoveringDevice(MetadataRegistry metadataRegistry, MatterBridgeClient client, GenericItem item) {
        super(metadataRegistry, client, item);
    }

    @Override
    public String deviceType() {
        return "WindowCoveringDevice";
    }

    @Override
    public Map<String, Object> setupDevice() {
        dispose();
        primaryItem.addStateChangeListener(this);
        return Map.of("currentPositionLiftPercentage", Optional.ofNullable(primaryItem.getStateAs(PercentType.class))
                .orElseGet(() -> new PercentType(0)).intValue());
    }

    @Override
    public void dispose() {
        primaryItem.removeStateChangeListener(this);
    }

    @Override
    public void handleMatterEvent(String clusterName, String attributeName, Object data) {
        PercentType percentType = null;
        switch (attributeName) {
            case "targetPositionLiftPercent100ths":
                percentType = new PercentType((int) ((Double) data / 100));
                break;
            case "currentPositionLiftPercentage":
                percentType = new PercentType(((Double) data).intValue());
                break;
            default:
                break;
        }
        if (percentType != null) {
            if (primaryItem instanceof GroupItem groupItem) {
                groupItem.send(percentType);
            } else if (primaryItem instanceof DimmerItem dimmerItem) {
                dimmerItem.send(percentType);
            } else if (primaryItem instanceof RollershutterItem rollerShutterItem) {
                rollerShutterItem.send(percentType);
            }
        }
    }

    public void updateState(Item item, State state) {
        if (state instanceof PercentType percentType) {
            setEndpointState("windowCovering", "currentPositionLiftPercentage", percentType.intValue());
        } else if (state instanceof OpenClosedType openClosedType) {
            setEndpointState("windowCovering", "currentPositionLiftPercentage",
                    openClosedType == OpenClosedType.OPEN ? 100 : 0);
        }
    }
}
