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
package org.openhab.binding.matter.internal.devices.converter;

import static org.openhab.binding.matter.internal.MatterBindingConstants.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.matter.internal.client.model.cluster.ClusterCommand;
import org.openhab.binding.matter.internal.client.model.cluster.gen.ColorControlCluster;
import org.openhab.binding.matter.internal.client.model.cluster.gen.ColorControlCluster.Options;
import org.openhab.binding.matter.internal.client.model.cluster.gen.LevelControlCluster;
import org.openhab.binding.matter.internal.client.model.cluster.gen.LevelControlCluster.OptionsBitmap;
import org.openhab.binding.matter.internal.client.model.cluster.gen.OnOffCluster;
import org.openhab.binding.matter.internal.client.model.ws.AttributeChangedMessage;
import org.openhab.binding.matter.internal.handler.EndpointHandler;
import org.openhab.core.library.types.DecimalType;
import org.openhab.core.library.types.HSBType;
import org.openhab.core.library.types.OnOffType;
import org.openhab.core.library.types.PercentType;
import org.openhab.core.library.types.QuantityType;
import org.openhab.core.library.unit.Units;
import org.openhab.core.thing.Channel;
import org.openhab.core.thing.ChannelUID;
import org.openhab.core.thing.ThingUID;
import org.openhab.core.thing.binding.builder.ChannelBuilder;
import org.openhab.core.types.Command;
import org.openhab.core.types.StateDescription;
import org.openhab.core.types.StateDescriptionFragmentBuilder;
import org.openhab.core.types.UnDefType;
import org.openhab.core.util.ColorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Dan Cunningham - Initial contribution
 * @author Chris Jackson - Original Zigbee binding color logic
 *
 */
@NonNullByDefault
public class ColorControlConverter extends GenericConverter<ColorControlCluster> {

    private final Logger logger = LoggerFactory.getLogger(ColorControlConverter.class);

    private boolean supportsHue = false;
    private int lastHue = -1;
    private int lastSaturation = -1;
    private boolean hueChanged = false;
    private boolean saturationChanged = false;
    private @Nullable ScheduledFuture<?> colorUpdateTimer = null;
    private int lastX = -1;
    private int lastY = -1;
    private boolean xChanged = false;
    private boolean yChanged = false;
    private HSBType lastHSB = new HSBType("0,0,0");
    private Integer colorTempPhysicalMinMireds = 0;
    private Integer colorTempPhysicalMaxMireds = 0;
    private Options optionsMask = new Options(true);
    private OptionsBitmap optionsBitmap = new OptionsBitmap(true, true);
    private ScheduledExecutorService colorUpdateScheduler = Executors.newSingleThreadScheduledExecutor();

    public ColorControlConverter(ColorControlCluster cluster, EndpointHandler handler) {
        super(cluster, handler);
    }

    @Override
    public Map<Channel, @Nullable StateDescription> createChannels(ThingUID thingUID) {
        Map<Channel, @Nullable StateDescription> map = new HashMap<>();

        map.put(ChannelBuilder.create(new ChannelUID(thingUID, CHANNEL_COLOR_COLOR.getId()), ITEM_TYPE_COLOR)
                .withType(CHANNEL_COLOR_COLOR).withLabel(CHANNEL_LABEL_COLOR_COLOR).build(), null);

        // see Matter spec 3.2.6.1. For more information on color temperature
        if (cluster.featureMap.colorTemperature) {
            map.put(ChannelBuilder.create(new ChannelUID(thingUID, CHANNEL_COLOR_TEMPERATURE.getId()), ITEM_TYPE_DIMMER)
                    .withType(CHANNEL_COLOR_TEMPERATURE).withLabel(CHANNEL_LABEL_COLOR_TEMPERATURE).build(), null);

            Optional.ofNullable(cluster.colorTempPhysicalMinMireds)
                    .ifPresent(temp -> colorTempPhysicalMinMireds = temp);
            Optional.ofNullable(cluster.colorTempPhysicalMaxMireds)
                    .ifPresent(temp -> colorTempPhysicalMaxMireds = temp);
            StateDescription stateDescription = null;
            if (colorTempPhysicalMinMireds < colorTempPhysicalMaxMireds) {
                stateDescription = StateDescriptionFragmentBuilder.create().withPattern("%.0f mirek")
                        .withMinimum(BigDecimal.valueOf(colorTempPhysicalMinMireds))
                        .withMaximum(BigDecimal.valueOf(colorTempPhysicalMaxMireds)).build().toStateDescription();
            }
            map.put(ChannelBuilder
                    .create(new ChannelUID(thingUID, CHANNEL_COLOR_TEMPERATURE_ABS.getId()),
                            ITEM_TYPE_NUMBER_TEMPERATURE)
                    .withType(CHANNEL_COLOR_TEMPERATURE_ABS).withLabel(CHANNEL_LABEL_COLOR_TEMPERATURE_ABS).build(),
                    stateDescription);
        }
        return map;
    }

    @Override
    public void handleCommand(ChannelUID channelUID, Command command) {
        if (command instanceof HSBType color) {
            PercentType brightness = color.getBrightness();

            ClusterCommand levelCommand = LevelControlCluster.moveToLevelWithOnOff(percentToLevel(brightness), 0,
                    optionsBitmap, optionsBitmap);

            handler.sendClusterCommand(LevelControlCluster.CLUSTER_NAME, levelCommand);

            if (supportsHue) {
                changeColorHueSaturation(color);
            } else {
                changeColorXY(color);
            }
        } else if (command instanceof OnOffType onOffType) {
            ClusterCommand onOffCommand = onOffType == OnOffType.ON ? OnOffCluster.on() : OnOffCluster.off();
            handler.sendClusterCommand(OnOffCluster.CLUSTER_NAME, onOffCommand);
            // ClusterCommand levelCommand = LevelControlCluster.moveToLevelWithOnOff(
            // percentToLevel(onOffType == OnOffType.OFF ? new PercentType(0) : lastHSB.getBrightness()), 0,
            // new OptionsBitmap(true, true), new OptionsBitmap(true, true));
            // handler.sendClusterCommand(LevelControlCluster.CLUSTER_NAME, levelCommand);
        } else if (command instanceof PercentType percentType) {
            if (channelUID.getId().equals(CHANNEL_COLOR_TEMPERATURE.getId())) {
                ClusterCommand tempCommand = ColorControlCluster
                        .moveToColorTemperature(percentTypeToMireds(percentType), 0, optionsMask, optionsMask);
                handler.sendClusterCommand(ColorControlCluster.CLUSTER_NAME, tempCommand);
            } else {
                ClusterCommand levelCommand = LevelControlCluster.moveToLevelWithOnOff(percentToLevel(percentType), 0,
                        optionsBitmap, optionsBitmap);
                handler.sendClusterCommand(LevelControlCluster.CLUSTER_NAME, levelCommand);
            }
        } else if (channelUID.getId().equals(CHANNEL_COLOR_TEMPERATURE_ABS.getId())
                && command instanceof DecimalType decimal) {
            ClusterCommand tempCommand = ColorControlCluster.moveToColorTemperature(decimal.intValue(), 0, optionsMask,
                    optionsMask);
            handler.sendClusterCommand(ColorControlCluster.CLUSTER_NAME, tempCommand);
        } else if (channelUID.getId().equals(CHANNEL_COLOR_TEMPERATURE_ABS.getId())
                && command instanceof QuantityType<?> quantity) {
            quantity = quantity.toInvertibleUnit(Units.MIRED);
            if (quantity != null) {
                ClusterCommand tempCommand = ColorControlCluster.moveToColorTemperature(quantity.intValue(), 0,
                        optionsMask, optionsMask);
                handler.sendClusterCommand(ColorControlCluster.CLUSTER_NAME, tempCommand);
            }
        }
    }

    @Override
    public void onEvent(AttributeChangedMessage message) {
        Integer numberValue = message.value instanceof Number number ? number.intValue() : 0;
        switch (message.path.attributeName) {
            case "currentX":
                lastX = numberValue;
                xChanged = true;
                break;
            case "currentY":
                lastY = numberValue;
                yChanged = true;
                break;
            case "currentHue":
                lastHue = numberValue;
                hueChanged = true;
                break;
            case "currentSaturation":
                lastSaturation = numberValue;
                saturationChanged = true;
                break;
            case "colorTemperatureMireds":
                updateState(CHANNEL_COLOR_TEMPERATURE,
                        numberValue == 0 ? UnDefType.UNDEF : miredsToPercenType(numberValue));
                updateState(CHANNEL_COLOR_TEMPERATURE_ABS, numberValue == 0 ? UnDefType.UNDEF
                        : QuantityType.valueOf(Double.valueOf(numberValue), Units.MIRED));
                break;
            case "enhancedCurrentHue":
                break;
            default:
                logger.debug("Unknown attribute {}", message.path.attributeName);
        }
        if (supportsHue && (hueChanged || saturationChanged)) {
            if (colorUpdateTimer != null) {
                colorUpdateTimer.cancel(true);
            }

            colorUpdateTimer = colorUpdateScheduler.schedule(() -> updateColorHSB(), 500, TimeUnit.MILLISECONDS);
        }
        if (!supportsHue && (xChanged || yChanged)) {
            if (colorUpdateTimer != null) {
                colorUpdateTimer.cancel(true);
            }
            colorUpdateTimer = colorUpdateScheduler.schedule(() -> updateColorXY(), 500, TimeUnit.MILLISECONDS);
        }
    }

    @Override
    public void updateCluster(ColorControlCluster cluster) {
        super.updateCluster(cluster);
        supportsHue = cluster.featureMap.hueSaturation;
        lastX = cluster.currentX;
        lastY = cluster.currentY;
        lastHue = cluster.currentHue;
        lastSaturation = cluster.currentSaturation;
        Optional.ofNullable(cluster.colorTempPhysicalMaxMireds).ifPresent(temp -> colorTempPhysicalMaxMireds = temp);
        Optional.ofNullable(cluster.colorTempPhysicalMinMireds).ifPresent(temp -> colorTempPhysicalMinMireds = temp);

        if (supportsHue) {
            updateColorHSB();
        } else {
            updateColorXY();
        }
        if (cluster.colorTemperatureMireds != null) {
            updateState(CHANNEL_COLOR_TEMPERATURE, cluster.colorTemperatureMireds == 0 ? UnDefType.UNDEF
                    : miredsToPercenType(cluster.colorTemperatureMireds));
            updateState(CHANNEL_COLOR_TEMPERATURE_ABS, cluster.colorTemperatureMireds == 0 ? UnDefType.UNDEF
                    : QuantityType.valueOf(Double.valueOf(cluster.colorTemperatureMireds), Units.MIRED));
        }
    }

    // These functions are borrowed from the Zigbee openHAB binding

    // TODO make sure this is called by updates to level control if associated with color control????

    public void updateBrightness(PercentType brightness) {
        // Extra temp variable to avoid thread sync concurrency issues on lastHSB
        HSBType oldHSB = lastHSB;
        HSBType newHSB = new HSBType(oldHSB.getHue(), oldHSB.getSaturation(), brightness);
        lastHSB = newHSB;
        updateState(CHANNEL_COLOR_COLOR, newHSB);
    }

    private void updateColorHSB(DecimalType hue, PercentType saturation) {
        // Extra temp variable to avoid thread sync concurrency issues on lastHSB
        HSBType oldHSB = lastHSB;
        HSBType newHSB = new HSBType(hue, saturation, oldHSB.getBrightness());
        lastHSB = newHSB;
        updateState(CHANNEL_COLOR_COLOR, newHSB);
    }

    private void updateColorXY(PercentType x, PercentType y) {
        HSBType color = ColorUtil.xyToHsb(new double[] { x.floatValue() / 100.0f, y.floatValue() / 100.0f });
        updateColorHSB(color.getHue(), color.getSaturation());
    }

    private void updateColorHSB() {
        float hueValue = lastHue * 360.0f / 254.0f;
        float saturationValue = lastSaturation * 100.0f / 254.0f;
        DecimalType hue = new DecimalType(Float.valueOf(hueValue).toString());
        PercentType saturation = new PercentType(Float.valueOf(saturationValue).toString());
        updateColorHSB(hue, saturation);
        hueChanged = false;
        saturationChanged = false;
    }

    private void updateColorXY() {
        float xValue = lastX / 65536.0f;
        float yValue = lastY / 65536.0f;
        PercentType x = new PercentType(Float.valueOf(xValue * 100.0f).toString());
        PercentType y = new PercentType(Float.valueOf(yValue * 100.0f).toString());
        updateColorXY(x, y);
        xChanged = false;
        yChanged = false;
    }

    private void changeColorHueSaturation(HSBType color) {
        int hue = (int) (color.getHue().floatValue() * 254.0f / 360.0f + 0.5f);
        int saturation = percentToLevel(color.getSaturation());
        handler.sendClusterCommand(ColorControlCluster.CLUSTER_NAME,
                ColorControlCluster.moveToHueAndSaturation(hue, saturation, 0, optionsMask, optionsMask));
    }

    private void changeColorXY(HSBType color) {
        PercentType xy[] = color.toXY();
        int x = (int) (xy[0].floatValue() / 100.0f * 65536.0f + 0.5f); // up to 65279
        int y = (int) (xy[1].floatValue() / 100.0f * 65536.0f + 0.5f); // up to 65279
        handler.sendClusterCommand(ColorControlCluster.CLUSTER_NAME,
                ColorControlCluster.moveToColor(x, y, 0, optionsMask, optionsMask));
    }

    private PercentType miredsToPercenType(Integer mireds) {
        if (mireds == 0 || colorTempPhysicalMaxMireds - colorTempPhysicalMinMireds == 0) {
            return new PercentType(0);
        }
        return new PercentType((int) (((double) (mireds - colorTempPhysicalMinMireds)
                / (colorTempPhysicalMaxMireds - colorTempPhysicalMinMireds)) * 100));
    }

    private Integer percentTypeToMireds(PercentType percent) {
        return (int) ((percent.doubleValue() / 100) * (colorTempPhysicalMaxMireds - colorTempPhysicalMinMireds))
                + colorTempPhysicalMinMireds;
    }
}
