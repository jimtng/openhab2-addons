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
package org.openhab.binding.matter.internal.handler;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.matter.internal.MatterStateDescriptionOptionProvider;
import org.openhab.binding.matter.internal.actions.MatterEndpointActions;
import org.openhab.binding.matter.internal.client.AttributeListener;
import org.openhab.binding.matter.internal.client.EventTriggeredListener;
import org.openhab.binding.matter.internal.client.MatterWebsocketClient;
import org.openhab.binding.matter.internal.client.model.Endpoint;
import org.openhab.binding.matter.internal.client.model.cluster.BaseCluster;
import org.openhab.binding.matter.internal.client.model.cluster.ClusterCommand;
import org.openhab.binding.matter.internal.client.model.cluster.gen.BasicInformationCluster;
import org.openhab.binding.matter.internal.client.model.cluster.gen.BridgedDeviceBasicInformationCluster;
import org.openhab.binding.matter.internal.client.model.cluster.gen.DescriptorCluster;
import org.openhab.binding.matter.internal.client.model.cluster.gen.FixedLabelCluster;
import org.openhab.binding.matter.internal.client.model.ws.AttributeChangedMessage;
import org.openhab.binding.matter.internal.client.model.ws.EventTriggeredMessage;
import org.openhab.binding.matter.internal.config.EndpointConfiguration;
import org.openhab.binding.matter.internal.devices.types.DeviceType;
import org.openhab.binding.matter.internal.devices.types.DeviceTypeRegistry;
import org.openhab.core.config.core.Configuration;
import org.openhab.core.config.core.validation.ConfigValidationException;
import org.openhab.core.thing.*;
import org.openhab.core.thing.binding.BaseThingHandler;
import org.openhab.core.thing.binding.BridgeHandler;
import org.openhab.core.thing.binding.ThingHandlerService;
import org.openhab.core.thing.binding.builder.ThingBuilder;
import org.openhab.core.types.Command;
import org.openhab.core.types.RefreshType;
import org.openhab.core.types.State;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The {@link EndpointHandler} is responsible for handling commands, which are
 * sent to one of the channels.
 *
 * @author Dan Cunningham - Initial contribution
 */
@NonNullByDefault
public class EndpointHandler extends BaseThingHandler implements AttributeListener, EventTriggeredListener {

    private final Logger logger = LoggerFactory.getLogger(EndpointHandler.class);
    private BigInteger nodeId = BigInteger.valueOf(0);
    protected int endpointId;
    private MatterStateDescriptionOptionProvider stateDescriptionProvider;
    private @Nullable DeviceType deviceType;
    private @Nullable MatterWebsocketClient cachedClient;

    public EndpointHandler(Thing thing, MatterStateDescriptionOptionProvider stateDescriptionProvider) {
        super(thing);
        this.stateDescriptionProvider = stateDescriptionProvider;
    }

    @Override
    public Collection<Class<? extends ThingHandlerService>> getServices() {
        return Set.of(MatterEndpointActions.class);
    }

    @Override
    public void handleCommand(ChannelUID channelUID, Command command) {
        MatterWebsocketClient client = getClient();
        if (client == null) {
            logger.debug("Matter client not present, ignoring command");
            return;
        }

        if (command instanceof RefreshType) {
            ControllerHandler clusterHandler = controllerHandler();
            if (clusterHandler != null) {
                clusterHandler.updateNode(nodeId);
            }
            return;
        }
        DeviceType deviceType = this.deviceType;
        if (deviceType != null) {
            deviceType.handleCommand(channelUID, command);
        }
    }

    @Override
    public void initialize() {
        EndpointConfiguration config = getConfigAs(EndpointConfiguration.class);
        nodeId = new BigInteger(config.nodeId);
        endpointId = config.endpointId;
        logger.debug("initialize endpoint {}", endpointId);
        ControllerHandler handler = controllerHandler();
        if (handler == null) {
            updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.BRIDGE_UNINITIALIZED);
        } else if (handler.getThing().getStatus() != ThingStatus.ONLINE) {
            updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.BRIDGE_OFFLINE);
        } else {
            updateStatus(ThingStatus.UNKNOWN);
        }
    }

    @Override
    public void handleConfigurationUpdate(Map<String, Object> configurationParameters)
            throws ConfigValidationException {
        logger.debug("handleConfigurationUpdate");
        validateConfigurationParameters(configurationParameters);
        Configuration configuration = editConfiguration();
        boolean reinitialize = false;
        boolean commission = false;
        for (Entry<String, Object> configurationParameter : configurationParameters.entrySet()) {
            Object value = configurationParameter.getValue();
            logger.debug("{}: old: {} {} new: {} {}", configurationParameter.getKey(),
                    configuration.get(configurationParameter.getKey()),
                    configuration.get(configurationParameter.getKey()).getClass().getName(),
                    configurationParameter.getValue(), configurationParameter.getValue().getClass().getName());
            // Ignore any configuration parameters that have not changed
            if (areEqual(configurationParameter.getValue(), configuration.get(configurationParameter.getKey()))) {
                logger.debug("Endpoint Configuration update ignored {} to {} ({})", configurationParameter.getKey(),
                        value, value == null ? "null" : value.getClass().getSimpleName());
                continue;
            }
            logger.debug("Endpoint Configuration update {} to {}", configurationParameter.getKey(), value);
            switch (configurationParameter.getKey()) {
                case "nodeId":
                case "endpointId":
                    reinitialize = true;
                    break;
                case "commissionMode":
                    if (value instanceof Boolean mode) {
                        commission = mode;
                        value = false;
                    }
            }
            configuration.put(configurationParameter.getKey(), value);
        }
        updateConfiguration(configuration);
        if (reinitialize) {
            dispose();
            initialize();
        } else if (commission) {
            MatterWebsocketClient client = getClient();
            if (client != null) {
                client.enhancedCommissioningWindow(nodeId).thenAccept(pairingCodes -> {
                    getThing().setProperty("externalPairCode", pairingCodes.manualPairingCode);
                }).exceptionally(e -> {
                    logger.debug("Error communicating with controller", e);
                    return null;
                });
            }
        }
    }

    @Override
    public void bridgeStatusChanged(ThingStatusInfo bridgeStatusInfo) {
        if (bridgeStatusInfo.getStatus() != ThingStatus.ONLINE) {
            updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.BRIDGE_OFFLINE);
        }
    }

    // making this public
    @Override
    public void updateThing(Thing thing) {
        super.updateThing(thing);
    }

    // making this public
    @Override
    public void updateState(String channelID, State state) {
        super.updateState(channelID, state);
    }

    // making this public
    @Override
    public void triggerChannel(String channelID, String event) {
        super.triggerChannel(channelID, event);
    }

    // making this public
    @Override
    public ThingBuilder editThing() {
        return super.editThing();
    }

    public int getEndpointId() {
        return endpointId;
    }

    public void updateEndpoint(Endpoint endpoint) {
        logger.debug("updateEndpoint {} {}", endpoint.number, nodeId);
        if (getThing().getStatus() != ThingStatus.ONLINE) {
            logger.debug("Setting Online {} {}", endpoint.number, nodeId);
            updateStatus(ThingStatus.ONLINE);
        }
        Map<String, BaseCluster> clusters = endpoint.clusters;

        Object basicInfoObject = clusters.get(BasicInformationCluster.CLUSTER_NAME);
        if (basicInfoObject != null) {
            BasicInformationCluster basicInfo = (BasicInformationCluster) basicInfoObject;
            String label = basicInfo.nodeLabel != null && basicInfo.nodeLabel.length() > 0 ? basicInfo.nodeLabel
                    : basicInfo.productLabel;
            updateProperty("label", label);

        } else {
            basicInfoObject = clusters.get(BridgedDeviceBasicInformationCluster.CLUSTER_NAME);
            if (basicInfoObject != null) {
                BridgedDeviceBasicInformationCluster basicInfo = (BridgedDeviceBasicInformationCluster) basicInfoObject;
                String label = basicInfo.nodeLabel != null && basicInfo.nodeLabel.length() > 0 ? basicInfo.nodeLabel
                        : basicInfo.productLabel;
                updateProperty("label", label);
            }
        }

        if (clusters.get(FixedLabelCluster.CLUSTER_NAME) instanceof FixedLabelCluster fixedLabelCluster) {
            fixedLabelCluster.labelList
                    .forEach(fixedLabel -> updateProperty("label-" + fixedLabel.label, fixedLabel.value));
        }

        DescriptorCluster descriptorCluster = (DescriptorCluster) clusters.get(DescriptorCluster.CLUSTER_NAME);
        DeviceType deviceType = this.deviceType;
        if (deviceType == null) {
            Integer dt = -1;
            if (descriptorCluster != null && !descriptorCluster.deviceTypeList.isEmpty()) {
                dt = descriptorCluster.deviceTypeList.get(0).deviceType;
            }
            deviceType = DeviceTypeRegistry.createDeviceType(dt, this);
        }

        deviceType.createChannels(clusters);
        final DeviceType dt = deviceType;
        clusters.forEach((clusterName, cluster) -> dt.updateCluster(cluster));
        deviceType.getStateDescriptions().forEach((channelUID, stateDescription) -> {
            if (stateDescription != null) {
                Optional.ofNullable(stateDescription.getOptions())
                        .ifPresent(options -> stateDescriptionProvider.setStateOptions(channelUID, options));

                Optional.ofNullable(stateDescription.getPattern())
                        .ifPresent(pattern -> stateDescriptionProvider.setStatePattern(channelUID, pattern));
            }
        });
        this.deviceType = deviceType;
    }

    @Override
    public void handleRemoval() {
        ControllerHandler bridge = controllerHandler();
        if (bridge != null) {
            bridge.endpointRemoved(nodeId, endpointId, true);
        }
        updateStatus(ThingStatus.REMOVED);
    }

    @Override
    public void onEvent(AttributeChangedMessage message) {
        DeviceType deviceType = this.deviceType;
        if (deviceType != null) {
            deviceType.onEvent(message);
        }
    }

    @Override
    public void onEvent(EventTriggeredMessage message) {
        DeviceType deviceType = this.deviceType;
        if (deviceType != null) {
            deviceType.onEvent(message);
        }
    }

    public BigInteger getNodeId() {
        return nodeId;
    }

    public void setEndpointStatus(ThingStatus status, ThingStatusDetail detail, String description) {
        logger.debug("setEndpointStatus {} {} {} {} {}", status, detail, description, endpointId, nodeId);
        updateStatus(status, detail, description);
    }

    public void sendClusterCommand(String clusterName, ClusterCommand command) {
        MatterWebsocketClient client = getClient();
        if (client != null) {
            client.clusterCommand(nodeId, endpointId, clusterName, command);
        }
    }

    public void writeAttribute(String clusterName, String attributeName, String value) {
        MatterWebsocketClient ws = getClient();
        if (ws != null) {
            ws.clusterWriteAttribute(nodeId, endpointId, clusterName, attributeName, value);
        }
    }

    protected @Nullable ControllerHandler controllerHandler() {
        Bridge bridge = getBridge();
        if (bridge != null) {
            BridgeHandler handler = bridge.getHandler();
            if (handler instanceof ControllerHandler controllerHandler) {
                return controllerHandler;
            }
            // if (handler instanceof NodeHandler nodeHandler) {
            // return nodeHandler.controllerHandler();
            // }
        }
        return null;
    }

    public @Nullable MatterWebsocketClient getClient() {
        if (cachedClient == null) {
            ControllerHandler c = controllerHandler();
            if (c != null) {
                cachedClient = c.getClient();
            }
        }
        return cachedClient;
    }

    public static boolean areEqual(Object obj1, Object obj2) {
        if (obj1 == null || obj2 == null) {
            return Objects.equals(obj1, obj2); // Return true if both are null, false if one is null
        }

        if (obj1 instanceof BigDecimal && obj2 instanceof BigDecimal) {
            return ((BigDecimal) obj1).compareTo((BigDecimal) obj2) == 0;
        }

        if (obj1 instanceof Number && obj2 instanceof Number) {
            return BigDecimal.valueOf(((Number) obj1).doubleValue())
                    .compareTo(BigDecimal.valueOf(((Number) obj2).doubleValue())) == 0;
        }

        return obj1.equals(obj2); // Fallback to the default equals method
    }
}
