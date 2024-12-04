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

import static org.openhab.binding.matter.internal.MatterBindingConstants.THING_TYPE_BRIDGE_ENDPOINT;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.binding.matter.internal.MatterChannelTypeProvider;
import org.openhab.binding.matter.internal.MatterStateDescriptionOptionProvider;
import org.openhab.binding.matter.internal.actions.MatterEndpointActions;
import org.openhab.binding.matter.internal.client.model.Endpoint;
import org.openhab.binding.matter.internal.client.model.Node;
import org.openhab.binding.matter.internal.client.model.cluster.gen.BridgedDeviceBasicInformationCluster;
import org.openhab.binding.matter.internal.client.model.ws.AttributeChangedMessage;
import org.openhab.binding.matter.internal.client.model.ws.EventTriggeredMessage;
import org.openhab.binding.matter.internal.config.NodeConfiguration;
import org.openhab.binding.matter.internal.discovery.MatterDiscoveryService;
import org.openhab.binding.matter.internal.util.MatterUIDUtils;
import org.openhab.core.thing.*;
import org.openhab.core.thing.binding.BridgeHandler;
import org.openhab.core.thing.binding.ThingHandler;
import org.openhab.core.thing.binding.ThingHandlerService;
import org.openhab.core.thing.binding.builder.BridgeBuilder;
import org.openhab.core.thing.binding.builder.ThingBuilder;

/**
 * The {@link BridgeEndpointHandler} is responsible for handling commands, which are
 * sent to one of the channels.
 *
 * @author Dan Cunningham - Initial contribution
 */
@NonNullByDefault
public class NodeHandler extends MatterBaseThingHandler implements BridgeHandler {
    protected BigInteger nodeId = BigInteger.valueOf(0);
    private ConcurrentHashMap<Integer, BridgeEndpointHandler> bridgedEndpoints = new ConcurrentHashMap<>();

    public NodeHandler(Bridge bridge, MatterStateDescriptionOptionProvider stateDescriptionProvider,
            MatterChannelTypeProvider channelGroupTypeProvider) {
        super(bridge, stateDescriptionProvider, channelGroupTypeProvider);
    }

    @Override
    public void initialize() {
        NodeConfiguration config = getConfigAs(NodeConfiguration.class);
        nodeId = new BigInteger(config.nodeId);
        logger.debug("initialize endpoint {}", nodeId);
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
    public BigInteger getNodeId() {
        return nodeId;
    }

    @Override
    public ThingTypeUID getDynamicThingTypeUID() {
        return MatterUIDUtils.nodeThingTypeUID(getNodeId());
    }

    @Override
    public boolean isBridgeType() {
        return true;
    }

    @Override
    public Bridge getThing() {
        return (Bridge) super.getThing();
    }

    @Override
    protected ThingBuilder editThing() {
        return BridgeBuilder.create(getDynamicThingTypeUID(), getThing().getUID()).withBridge(getThing().getBridgeUID())
                .withChannels(getThing().getChannels()).withConfiguration(getThing().getConfiguration())
                .withLabel(getThing().getLabel()).withLocation(getThing().getLocation())
                .withProperties(getThing().getProperties());
    }

    @Override
    public Collection<Class<? extends ThingHandlerService>> getServices() {
        return Set.of(MatterEndpointActions.class);
    }

    public void updateNode(Node node) {
        if (getThing().getStatus() != ThingStatus.ONLINE) {
            logger.debug("Setting Online {}", getNodeId());
            updateStatus(ThingStatus.ONLINE);
        }
        updateRootProperties(node.rootEndpoint);
        updateEndpoint(node.rootEndpoint);
    }

    protected boolean shouldAddEndpoint(Endpoint endpoint) {
        if (endpoint.clusters.containsKey(BridgedDeviceBasicInformationCluster.CLUSTER_NAME)) {
            updateBridgeEndpoint(endpoint);
            return false;
        }
        return true;
    }

    @Override
    public void handleRemoval() {
        ControllerHandler bridge = controllerHandler();
        if (bridge != null) {
            bridge.removeNode(nodeId, true);
        }
        updateStatus(ThingStatus.REMOVED);
    }

    @Override
    public void childHandlerInitialized(ThingHandler childHandler, Thing childThing) {
        logger.debug("childHandlerInitialized ready {}", childHandler);
        if (childHandler instanceof BridgeEndpointHandler handler) {
            bridgedEndpoints.put(handler.getEndpointId(), handler);
            ControllerHandler ch = controllerHandler();
            if (ch != null) {
                // todo we should change this to only request the endpoint
                ch.updateNode(getNodeId());
            }
        }
    }

    @Override
    public void childHandlerDisposed(ThingHandler childHandler, Thing childThing) {
        if (childHandler instanceof BridgeEndpointHandler handler) {
            bridgedEndpoints.entrySet().removeIf(entry -> entry.getValue().equals(handler));
        }
    }

    @Override
    public void onEvent(AttributeChangedMessage message) {
        if (bridgedEndpoints.get(message.path.endpointId) instanceof BridgeEndpointHandler endpointHandler) {
            endpointHandler.onEvent(message);
        } else {
            super.onEvent(message);
        }
    }

    @Override
    public void onEvent(EventTriggeredMessage message) {
        if (bridgedEndpoints.get(message.path.endpointId) instanceof BridgeEndpointHandler endpointHandler) {
            endpointHandler.onEvent(message);
        } else {
            super.onEvent(message);
        }
    }

    private void updateBridgeEndpoint(Endpoint endpoint) {
        discoverChildBridge(endpoint);
        BridgeEndpointHandler handler = bridgedEndpoints.get(endpoint.number);
        if (handler != null) {
            updateBridgeEndpointMap(endpoint, handler);
            handler.updateEndpoint(endpoint);
        }
    }

    private void updateBridgeEndpointMap(Endpoint endpoint, final BridgeEndpointHandler handler) {
        bridgedEndpoints.put(endpoint.number, handler);
        endpoint.children.forEach(e -> updateBridgeEndpointMap(e, handler));
    }

    private void discoverChildBridge(Endpoint endpoint) {
        logger.debug("discoverChildBridge {}", endpoint.number);
        ControllerHandler controller = controllerHandler();
        if (controller != null) {
            MatterDiscoveryService discoveryService = controller.getDiscoveryService();
            if (discoveryService != null) {
                ThingUID bridgeUID = getThing().getUID();
                ThingUID thingUID = new ThingUID(THING_TYPE_BRIDGE_ENDPOINT, bridgeUID, endpoint.number.toString());
                discoveryService.discoverBridgeEndpoint(thingUID, bridgeUID, endpoint);
            }
        }
    }
}
