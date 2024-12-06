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

import static org.openhab.binding.matter.internal.MatterBindingConstants.THING_TYPE_NODE;

import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.matter.internal.client.model.Endpoint;
import org.openhab.binding.matter.internal.client.model.Node;
import org.openhab.binding.matter.internal.client.model.cluster.BaseCluster;
import org.openhab.binding.matter.internal.client.model.cluster.gen.BasicInformationCluster;
import org.openhab.binding.matter.internal.client.model.cluster.gen.BridgedDeviceBasicInformationCluster;
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
 * The {@link MatterDiscoveryService}
 *
 * @author Dan Cunningham - Initial contribution
 */
@NonNullByDefault
public class MatterDiscoveryService extends AbstractDiscoveryService implements ThingHandlerService {
    private final Logger logger = LoggerFactory.getLogger(MatterDiscoveryService.class);
    private @Nullable ThingHandler thingHandler;

    public MatterDiscoveryService() throws IllegalArgumentException {
        // set a 5 min timeout, which should be plenty of time to discover devices, but stopScan will be called when the
        // Matter client is done looking for new Nodes/Endpoints
        super(Set.of(THING_TYPE_NODE), 60 * 5, false);
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

    public void discoverBridgeEndpoint(ThingUID thingUID, ThingUID bridgeUID, Endpoint root) {
        discoverThing(thingUID, bridgeUID, root, root.number.toString(), "endpointId", "Matter Bridged Device:");
    }

    public void discoverNodeDevice(ThingUID thingUID, ThingUID bridgeUID, Node node) {
        discoverThing(thingUID, bridgeUID, node.rootEndpoint, node.id.toString(), "nodeId", "Matter Device:");
    }

    private void discoverThing(ThingUID thingUID, ThingUID bridgeUID, Endpoint root, String id,
            String representationProperty, String label) {
        logger.debug("discoverThing: {} {} {}", thingUID, bridgeUID, id);
        String vendorName = "";
        String productName = "";
        String nodeLabel = "";
        String fixedLabel = "";

        BaseCluster cluster = root.clusters.get(BasicInformationCluster.CLUSTER_NAME);
        if (cluster != null && cluster instanceof BasicInformationCluster basicCluster) {
            vendorName = basicCluster.vendorName;
            productName = basicCluster.productName;
            nodeLabel = basicCluster.nodeLabel;
        } else {
            cluster = root.clusters.get(BridgedDeviceBasicInformationCluster.CLUSTER_NAME);
            if (cluster != null && cluster instanceof BridgedDeviceBasicInformationCluster basicCluster) {
                vendorName = basicCluster.vendorName;
                productName = basicCluster.productName;
                nodeLabel = basicCluster.nodeLabel;
            }
        }

        if (root.clusters.get(FixedLabelCluster.CLUSTER_NAME) instanceof FixedLabelCluster fixedLabelCluster) {
            fixedLabel = fixedLabelCluster.labelList.stream().map(l -> l.label + ": " + l.value)
                    .collect(Collectors.joining(" "));
        }

        if (nodeLabel != null && !nodeLabel.isEmpty()) {
            label += " " + nodeLabel;
        } else {
            if (vendorName != null && !vendorName.isEmpty()) {
                label += " " + vendorName;
            }
            if (productName != null && !productName.isEmpty()) {
                label += " " + productName;
            }
        }
        if (fixedLabel != null && !fixedLabel.isEmpty()) {
            label += " - " + fixedLabel;
        }
        DiscoveryResult result = DiscoveryResultBuilder.create(thingUID).withLabel(label)
                .withProperty(representationProperty, id).withRepresentationProperty(representationProperty)
                .withBridge(bridgeUID).build();
        thingDiscovered(result);
    }
}
