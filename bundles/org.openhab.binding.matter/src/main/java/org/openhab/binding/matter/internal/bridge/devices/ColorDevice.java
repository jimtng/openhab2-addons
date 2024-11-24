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
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.matter.internal.bridge.MatterBridgeClient;
import org.openhab.core.items.GenericItem;
import org.openhab.core.items.Item;
import org.openhab.core.items.MetadataRegistry;
import org.openhab.core.library.items.ColorItem;
import org.openhab.core.library.types.DecimalType;
import org.openhab.core.library.types.HSBType;
import org.openhab.core.library.types.OnOffType;
import org.openhab.core.library.types.PercentType;
import org.openhab.core.types.State;

/**
 * The {@link ColorDevice}
 *
 * @author Dan Cunningham - Initial contribution
 */
@NonNullByDefault
public class ColorDevice extends GenericDevice {
    private ScheduledExecutorService colorUpdateScheduler = Executors.newSingleThreadScheduledExecutor();
    private @Nullable ScheduledFuture<?> colorUpdateTimer = null;
    private HSBType lastHSB = new HSBType();

    public ColorDevice(MetadataRegistry metadataRegistry, MatterBridgeClient client, GenericItem item) {
        super(metadataRegistry, client, item);
    }

    @Override
    public String deviceType() {
        return "Color";
    }

    @Override
    public MatterDeviceOptions activate() {
        dispose();
        primaryItem.addStateChangeListener(this);
        MetaDataMapping primaryMetadata = metaDataMapping(primaryItem);
        Map<String, Object> attributeMap = primaryMetadata.getAttributeOptions();
        if (primaryItem instanceof ColorItem colorItem) {
            HSBType hsbType = colorItem.getStateAs(HSBType.class);
            if (hsbType != null) {
                lastHSB = hsbType;
                Float currentHue = toHue(hsbType.getHue());
                Float currentSaturation = toSaturation(hsbType.getSaturation());
                Integer currentLevel = toBrightness(hsbType.getBrightness());
                attributeMap.put("levelControl.currentLevel", currentLevel);
                attributeMap.put("colorControl.currentHue", currentHue);
                attributeMap.put("colorControl.currentSaturation", currentSaturation);
                attributeMap.put("onOff.onOff", currentLevel > 0);
            }
        }
        return new MatterDeviceOptions(attributeMap, primaryMetadata.label);
    }

    @Override
    public void dispose() {
        primaryItem.removeStateChangeListener(this);
        if (colorUpdateTimer != null) {
            colorUpdateTimer.cancel(true);
        }
    }

    @Override
    public void handleMatterEvent(String clusterName, String attributeName, Object data) {
        if (primaryItem instanceof ColorItem colorItem) {
            switch (attributeName) {
                case "onOff":
                    colorItem.send(OnOffType.from(Boolean.valueOf(data.toString())));
                    break;
                case "currentHue":
                case "currentSaturation":
                case "currentLevel":
                    updateHSB(colorItem, clusterName, attributeName, data);
                    if (colorUpdateTimer != null) {
                        colorUpdateTimer.cancel(true);
                    }
                    colorUpdateTimer = colorUpdateScheduler.schedule(() -> updatePrimaryHSB(), 500,
                            TimeUnit.MILLISECONDS);
                    break;
                case "colorTemperatureMireds":
                    // todo
                    break;
                default:
                    break;
            }
        }
    }

    private synchronized void updateHSB(ColorItem colorItem, String clusterName, String attributeName, Object data) {
        HSBType hsb = this.lastHSB;
        DecimalType h = hsb.getHue();
        PercentType s = hsb.getSaturation();
        PercentType b = hsb.getBrightness();
        Double value = (Double) data;
        switch (attributeName) {
            case "currentHue":
                float hueValue = value == 0 ? 0.0f : value.floatValue() * 360.0f / 254.0f;
                h = new DecimalType(Float.valueOf(hueValue).toString());
                break;
            case "currentSaturation":
                float saturationValue = value == 0 ? 0.0f : value.floatValue() / 254.0f * 100.0f;
                s = new PercentType(Float.valueOf(saturationValue).toString());
            case "currentLevel":
                b = levelToPercent(value.intValue());
                break;
            default:
                break;
        }
        lastHSB = new HSBType(h, s, b);
    }

    public void updateState(Item item, State state) {
        if (state instanceof HSBType hsb) {
            lastHSB = hsb;
            setEndpointState("levelControl", "currentLevel", toBrightness(hsb.getBrightness()));
            setEndpointState("onOff", "onOff", hsb.getBrightness().intValue() > 0);
            setEndpointState("colorControl", "currentHue", toHue(hsb.getHue()));
            setEndpointState("colorControl", "currentSaturation", toSaturation(hsb.getSaturation()));
        } else if (state instanceof PercentType percentType) {
            setEndpointState("onOff", "onOff", percentType.intValue() > 0);
            setEndpointState("levelControl", "currentLevel", toBrightness(percentType));
        } else if (state instanceof OnOffType onOffType) {
            setEndpointState("onOff", "onOff", onOffType == OnOffType.ON ? true : false);
        }
    }

    private void updatePrimaryHSB() {
        if (primaryItem instanceof ColorItem colorItem) {
            colorItem.send(lastHSB);
        }
    }

    private Float toHue(DecimalType h) {
        return h.floatValue() * 254.0f / 360.0f;
    }

    private Float toSaturation(PercentType s) {
        return s.floatValue() * 254.0f / 100.0f;
    }

    private Integer toBrightness(PercentType b) {
        return percentToLevel(b);
    }
}
