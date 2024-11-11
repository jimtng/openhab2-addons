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
package org.openhab.binding.matter.internal.bridge;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.matter.internal.bridge.devices.*;
import org.openhab.binding.matter.internal.client.MatterClientListener;
import org.openhab.binding.matter.internal.client.model.PairingCodes;
import org.openhab.binding.matter.internal.client.model.ws.AttributeChangedMessage;
import org.openhab.binding.matter.internal.client.model.ws.BridgeEventMessage;
import org.openhab.binding.matter.internal.client.model.ws.EventTriggeredMessage;
import org.openhab.binding.matter.internal.client.model.ws.NodeStateMessage;
import org.openhab.binding.matter.internal.util.MatterWebsocketService;
import org.openhab.core.OpenHAB;
import org.openhab.core.common.ThreadPoolManager;
import org.openhab.core.common.registry.RegistryChangeListener;
import org.openhab.core.config.core.ConfigurableService;
import org.openhab.core.config.core.Configuration;
import org.openhab.core.items.*;
import org.osgi.framework.Constants;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.component.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The {@link MatterBridge}
 *
 * @author Dan Cunningham - Initial contribution
 */
@Component(immediate = true, service = MatterBridge.class, configurationPid = MatterBridge.CONFIG_PID, property = Constants.SERVICE_PID
        + "=" + MatterBridge.CONFIG_PID)
@ConfigurableService(category = "io", label = "Matter Bridge", description_uri = MatterBridge.CONFIG_URI)
@NonNullByDefault
public class MatterBridge implements MatterClientListener {
    private final Logger logger = LoggerFactory.getLogger(MatterBridge.class);
    private static final String CONFIG_PID = "org.openhab.matter";
    private static final String CONFIG_URI = "io:matter";

    private static final String VENDOR_NAME = "openHAB";
    private static final String DEVICE_NAME = "Bridge Device";
    private static final String PRODUCT_ID = "0001";
    private static final String VENDOR_ID = "65521";
    // this will be used in the name of the storage directory
    private static final String UNIQUE_ID = "bridge-0";

    private final Map<String, GenericDevice> devices = new HashMap<>();

    private MatterBridgeClient client;
    private ItemRegistry itemRegistry;
    private MetadataRegistry metadataRegistry;
    private MatterWebsocketService websocketService;
    private ConfigurationAdmin configAdmin;
    private MatterBridgeSettings settings;

    private final ItemRegistryChangeListener itemRegistryChangeListener;
    private final RegistryChangeListener<Metadata> metadataRegistryChangeListener;
    private final ScheduledExecutorService scheduler = ThreadPoolManager
            .getScheduledPool(ThreadPoolManager.THREAD_POOL_NAME_COMMON);
    private boolean resetBridge = false;
    private boolean bridgeInitialized = false;
    private @Nullable ScheduledFuture<?> modifyFuture;

    @Activate
    public MatterBridge(final @Reference ItemRegistry itemRegistry, final @Reference MetadataRegistry metadataRegistry,
            final @Reference MatterWebsocketService websocketService, final @Reference ConfigurationAdmin configAdmin) {
        this.itemRegistry = itemRegistry;
        this.metadataRegistry = metadataRegistry;
        this.websocketService = websocketService;
        this.configAdmin = configAdmin;
        this.client = new MatterBridgeClient();
        this.settings = new MatterBridgeSettings();

        itemRegistryChangeListener = new ItemRegistryChangeListener() {
            private boolean handleMetadataChange(Item item) {
                if (metadataRegistry.get(new MetadataKey("matter", item.getUID())) != null) {
                    updateModifyFuture();
                    return true;
                }
                return false;
            }

            @Override
            public void added(Item element) {
                handleMetadataChange(element);
            }

            @Override
            public void updated(Item oldElement, Item element) {
                if (!handleMetadataChange(oldElement)) {
                    handleMetadataChange(element);
                }
            }

            @Override
            public void allItemsChanged(Collection<String> oldItemNames) {
                updateModifyFuture();
            }

            @Override
            public void removed(Item element) {
                handleMetadataChange(element);
            }
        };
        this.itemRegistry.addRegistryChangeListener(itemRegistryChangeListener);

        metadataRegistryChangeListener = new RegistryChangeListener<>() {
            private void handleMetadataChange(Metadata element) {
                if ("matter".equals(element.getUID().getNamespace())) {
                    updateModifyFuture();
                }
            }

            public void added(Metadata element) {
                handleMetadataChange(element);
            }

            public void removed(Metadata element) {
                handleMetadataChange(element);
            }

            public void updated(Metadata oldElement, Metadata element) {
                handleMetadataChange(element);
            }
        };
        this.metadataRegistry.addRegistryChangeListener(metadataRegistryChangeListener);
    }

    @Activate
    public void activate(Map<String, Object> properties) {
        logger.debug("Activating Matter Bridge");
        if (!parseConfig(properties)) {
            connectClient();
        }
    }

    @Deactivate
    public void deactivate() {
        logger.debug("Deactivating Matter Bridge");
        itemRegistry.removeRegistryChangeListener(itemRegistryChangeListener);
        metadataRegistry.removeRegistryChangeListener(metadataRegistryChangeListener);
        stopClient();
    }

    @Modified
    protected synchronized void modified(Map<String, Object> properties) {
        if (!parseConfig(properties)) {
            stopClient();
            scheduler.schedule(this::connectClient, 5, TimeUnit.SECONDS);
        }
    }

    private synchronized void connectClient() {
        if (client.isConnected()) {
            logger.debug("Already Connected, returning");
            return;
        }

        try {
            String folderName = OpenHAB.getUserDataFolder() + File.separator + "matter";
            File folder = new File(folderName);
            if (!folder.exists()) {
                folder.mkdirs();
            }

            Map<String, String> paramsMap = new HashMap<>();

            paramsMap.put("service", "bridge");
            paramsMap.put("storagePath", folder.getAbsolutePath());

            // default values the bridge exposes to clients
            paramsMap.put("deviceName", DEVICE_NAME);
            paramsMap.put("vendorName", VENDOR_NAME);
            paramsMap.put("vendorId", VENDOR_ID);
            paramsMap.put("productId", PRODUCT_ID);
            paramsMap.put("uniqueId", UNIQUE_ID);

            paramsMap.put("productName", settings.bridgeName);
            paramsMap.put("passcode", String.valueOf(settings.passcode));
            paramsMap.put("discriminator", String.valueOf(settings.discriminator));
            paramsMap.put("port", String.valueOf(settings.port));

            if (resetBridge) {
                resetBridge = false;
                paramsMap.put("resetBridge", "true");
            }

            client.addListener(this);
            client.connect(this.websocketService, paramsMap);
        } catch (Exception e) {
            logger.error("Error connecting to websocket", e);
        }
    }

    public void stopClient() {
        logger.debug("Stopping Matter Bridge Client");
        ScheduledFuture<?> modifyFuture = this.modifyFuture;
        if (modifyFuture != null) {
            modifyFuture.cancel(true);
        }
        MatterBridgeClient client = this.client;
        if (client != null) {
            client.removeListener(this);
            client.disconnect();
        }
        devices.values().forEach(GenericDevice::dispose);
        devices.clear();
        bridgeInitialized = false;
    }

    public boolean parseConfig(Map<String, Object> properties) {
        logger.debug("Parse Config Matter Bridge");

        Dictionary<String, Object> props = null;
        org.osgi.service.cm.Configuration config = null;
        MatterBridgeSettings settings = (new Configuration(properties)).as(MatterBridgeSettings.class);

        try {
            config = configAdmin.getConfiguration(MatterBridge.CONFIG_PID);
            props = config.getProperties();
        } catch (IOException e) {
            logger.warn("cannot retrieve config admin {}", e.getMessage());
        }

        logger.debug("settings {} config {} props {}", settings, config, props);
        if (props == null) { // if null, the configuration is new
            props = new Hashtable<>();
        }

        // A discriminator uniquely identifies a Matter device on the IPV6 network, 12-bit integer (0-4095)
        int discriminator = -1;
        @Nullable
        Object discriminatorProp = props.get("discriminator");
        if (discriminatorProp instanceof String discriminatorString) {
            try {
                discriminator = Integer.parseInt(discriminatorString);
            } catch (NumberFormatException e) {
                logger.debug("Could not parse discriminator {}", discriminatorString);
            }
        } else if (discriminatorProp instanceof Integer discriminatorInteger) {
            discriminator = discriminatorInteger;
        }

        // randomly create one if not set
        if (discriminator < 0) {
            Random random = new Random();
            discriminator = random.nextInt(4096);
        }

        props.put("discriminator", discriminator);
        settings.discriminator = discriminator;

        // reset option. this is tricky, we want to detect this change, but not persist it (so change it back). This
        // causes reactivation of this service.
        if (!resetBridge || settings.resetBridge) {
            resetBridge = true;
            // reset bridge should never persist true
            props.put("resetBridge", false);
            settings.resetBridge = false;
        }

        boolean changed = false;
        if (config != null) {
            try {
                changed = config.updateIfDifferent(props);
            } catch (IOException e) {
                logger.warn("cannot update configuration {}", e.getMessage());
            }
        }
        this.settings = settings;
        return changed;
    }

    @Override
    public void onDisconnect(String reason) {
    }

    @Override
    public void onConnect() {
    }

    @Override
    public void onReady() {
        updatePairingCodes();
        registerItems();
    }

    @Override
    public void onEvent(NodeStateMessage message) {
    }

    @Override
    public void onEvent(AttributeChangedMessage message) {
    }

    @Override
    public void onEvent(EventTriggeredMessage message) {
    }

    @Override
    public void onEvent(BridgeEventMessage message) {
        GenericDevice d = devices.get(message.endpointId);
        if (d != null) {
            d.handleMatterEvent(message.clusterName, message.attributeName, message.data);
        }
    }

    private void registerItems() {

        if (bridgeInitialized) {
            try {
                logger.debug("Resetting Endpoints");
                client.resetBridge().get();
                bridgeInitialized = false;
                devices.values().forEach(GenericDevice::dispose);
                devices.clear();
            } catch (InterruptedException | ExecutionException e) {
                logger.debug("Could not reset endpoints", e);
                return;
            }
        }
        metadataRegistry.getAll().forEach(metadata -> {
            final MetadataKey uid = metadata.getUID();
            if ("matter".equals(uid.getNamespace())) {
                try {
                    logger.debug("Metadata {}", metadata);
                    if (devices.containsKey(uid.getItemName())) {
                        logger.debug("Updating item {}", uid.getItemName());
                    }
                    final GenericItem item = (GenericItem) itemRegistry.getItem(uid.getItemName());
                    String deviceType = metadata.getValue();
                    GenericDevice device = null;
                    switch (deviceType) {
                        case "OnOffLight":
                            device = new OnOffLightDevice(metadataRegistry, client, item);
                            break;
                        case "OnOffPlugInUnit":
                            device = new OnOffPlugInUnitDevice(metadataRegistry, client, item);
                            break;
                        case "DimmableLight":
                            device = new DimmableLightDevice(metadataRegistry, client, item);
                            break;
                        case "Thermostat":
                            device = new ThermostatDevice(metadataRegistry, client, item);
                            break;
                        case "WindowCovering":
                            device = new WindowCoveringDevice(metadataRegistry, client, item);
                            break;
                        default:
                            break;
                    }
                    if (device != null) {
                        try {
                            String node = device.registerDevice().get();
                            logger.info("Registered item {} with node {}", item.getName(), node);
                            devices.put(item.getName(), device);
                        } catch (InterruptedException | ExecutionException e) {
                            logger.debug("Could not register device with bridge", e);
                        }
                    }
                } catch (ItemNotFoundException e) {
                    logger.debug("Could not find item {}", uid.getItemName(), e);
                }
            }
        });
        bridgeInitialized = true;
    }

    private void updatePairingCodes() {
        MatterBridgeClient client = this.client;
        if (client != null) {
            try {
                org.osgi.service.cm.Configuration config = configAdmin.getConfiguration(MatterBridge.CONFIG_PID);
                Dictionary<String, Object> props = config.getProperties();
                if (props == null) {
                    props = new Hashtable<>();
                }
                PairingCodes codes = client.getPairingCodes().get();
                if (codes.manualPairingCode != null) {
                    props.put("manualPairingCode", codes.manualPairingCode);
                    props.put("qrCode", codes.qrPairingCode);
                } else {
                    props.put("manualPairingCode", "Already commissioned, use paired client to generate code.");
                    props.put("qrCode", "");
                }
                config.updateIfDifferent(props);
            } catch (IOException | InterruptedException | ExecutionException | RuntimeException e) {
                logger.debug("Could not get pairing codes", e);
            }
        }
    }

    private void updateModifyFuture() {
        ScheduledFuture<?> modifyFuture = this.modifyFuture;
        if (modifyFuture != null) {
            modifyFuture.cancel(false);
        }
        this.modifyFuture = scheduler.schedule(this::registerItems, 5, TimeUnit.SECONDS);
    }
}
