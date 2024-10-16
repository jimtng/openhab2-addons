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
package org.openhab.binding.matter.internal.discovery;

import static org.openhab.binding.matter.internal.MatterBindingConstants.THING_TYPE_ENDPOINT;

import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.matter.internal.client.model.Endpoint;
import org.openhab.binding.matter.internal.client.model.Node;
import org.openhab.binding.matter.internal.client.model.cluster.BaseCluster;
import org.openhab.binding.matter.internal.client.model.cluster.gen.BasicInformationCluster;
import org.openhab.binding.matter.internal.client.model.cluster.gen.BridgedDeviceBasicInformationCluster;
import org.openhab.binding.matter.internal.client.model.cluster.gen.DescriptorCluster;
import org.openhab.binding.matter.internal.client.model.cluster.gen.FixedLabelCluster;
import org.openhab.core.config.discovery.AbstractDiscoveryService;
import org.openhab.core.config.discovery.DiscoveryResult;
import org.openhab.core.config.discovery.DiscoveryResultBuilder;
import org.openhab.core.thing.ThingUID;
import org.openhab.core.thing.binding.ThingHandler;
import org.openhab.core.thing.binding.ThingHandlerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Dan Cunningham
 *
 */
@NonNullByDefault
public class MatterDiscoveryService extends AbstractDiscoveryService implements ThingHandlerService {
    private final Logger logger = LoggerFactory.getLogger(MatterDiscoveryService.class);
    private @Nullable ThingHandler thingHandler;

    public MatterDiscoveryService() throws IllegalArgumentException {
        // set a 5 min timeout, which should be plenty of time to discover devices, but stopScan will be called when the
        // Matter client is done looking for new Nodes/Endpoints
        super(Set.of(THING_TYPE_ENDPOINT), 60 * 5, false);
    }

    @Override
    public void setThingHandler(ThingHandler handler) {
        logger.debug("setThingHandler {}", handler);
        if (handler instanceof MatterDiscoveryHandler childDiscoveryHandler) {
            childDiscoveryHandler.setDiscoveryService(this);
            this.thingHandler = handler;
        }
    }

    @Override
    public @Nullable ThingHandler getThingHandler() {
        return thingHandler;
    }

    @Override
    public void activate() {
        super.activate(null);
    }

    @Override
    public void deactivate() {
        super.deactivate();
    }

    @Override
    public @Nullable String getScanInputLabel() {
        return "Matter Pairing Code";
    }

    @Override
    public @Nullable String getScanInputDescription() {
        return "11 digit matter pairing code (with or without hyphens) or a short code and key (separated by a space)";
    }

    public void discoverChildEndpointThing(ThingUID thingUID, ThingUID bridgeUID, Node node, Integer endpointId) {
        logger.debug("discoverChildEndpointThing: {} {} {}", thingUID, bridgeUID, endpointId);
        String vendorName = "";
        String productName = "";
        String nodeLabel = "";
        String fixedLabel = "";
        Endpoint root = node.endpoints.get(Integer.valueOf(0));
        if (root != null) {
            BaseCluster cluster = root.clusters.get(BasicInformationCluster.CLUSTER_NAME);
            if (cluster != null && cluster instanceof BasicInformationCluster basicCluster) {
                vendorName = basicCluster.vendorName;
                productName = basicCluster.productName;
            }
        }
        Endpoint device = node.endpoints.get(endpointId);
        if (device != null) {
            if (device.clusters.get(
                    BridgedDeviceBasicInformationCluster.CLUSTER_NAME) instanceof BridgedDeviceBasicInformationCluster bridgedCluster) {
                nodeLabel = bridgedCluster.nodeLabel;
            }

            if (device.clusters.get(FixedLabelCluster.CLUSTER_NAME) instanceof FixedLabelCluster fixedLabelCluster) {
                fixedLabel = fixedLabelCluster.labelList.stream().map(l -> l.label + ": " + l.value)
                        .collect(Collectors.joining(" "));
            }
            DescriptorCluster cluster = (DescriptorCluster) device.clusters.get(DescriptorCluster.CLUSTER_NAME);
            String deviceTypeIds = cluster.deviceTypeList.stream().map(d -> d.deviceType.toString())
                    .collect(Collectors.joining(","));
            String idSting = node.id.toString();
            // String shortId = (idSting.length() > 5 ? idSting.substring(idSting.length() - 5) : idSting) + "-"
            // + endpointId;
            String label = "Matter Device";
            if (vendorName != null && !vendorName.isEmpty()) {
                label += " " + vendorName;
            }
            if (productName != null && !productName.isEmpty()) {
                label += " " + productName;
            }
            if (nodeLabel != null && !nodeLabel.isEmpty()) {
                label += " " + nodeLabel;
            }
            if (fixedLabel != null && !fixedLabel.isEmpty()) {
                label += " " + fixedLabel;
            }
            String path = idSting + ":" + endpointId;
            DiscoveryResult result = DiscoveryResultBuilder.create(thingUID).withLabel(label)
                    .withProperty("nodeId", node.id.toString()).withProperty("endpointId", endpointId)
                    .withProperty("path", path).withProperty("deviceTypes", deviceTypeIds)
                    .withRepresentationProperty("path").withBridge(bridgeUID).build();
            thingDiscovered(result);
        }
    }

    @Override
    protected void startScan() {
        startScan("");
    }

    @Override
    public void startScan(String input) {
        ThingHandler handler = this.thingHandler;
        if (handler != null && handler instanceof MatterDiscoveryHandler childDiscoveryHandler) {
            childDiscoveryHandler.startScan(input.length() > 0 ? input : null).whenComplete((value, e) -> {
                logger.debug("startScan complete");
                stopScan();
            });
        }
    }
}
