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
package org.openhab.binding.matter.internal;

import java.io.File;
import java.math.BigInteger;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.binding.matter.internal.client.MatterWebsocketClient;
import org.openhab.binding.matter.internal.client.model.Node;
import org.openhab.binding.matter.internal.client.model.PairingCodes;
import org.openhab.binding.matter.internal.client.model.cluster.ClusterCommand;
import org.openhab.binding.matter.internal.client.model.ws.ActiveSessionInformation;
import org.openhab.binding.matter.internal.util.MatterWebsocketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

/**
 *
 * @author Dan Cunningham
 *
 */
@NonNullByDefault
public class MatterControllerClient extends MatterWebsocketClient {

    private static final Logger logger = LoggerFactory.getLogger(MatterControllerClient.class);

    public void connect(String host, int port, BigInteger nodeId, String controllerName, String storagePath)
            throws Exception {
        // TODO remove this check and helper function after a few releases of beta testing
        Map<String, String> params;
        if (isLegacyStorage(storagePath, controllerName)) {
            storagePath = storagePath + File.separator + controllerName + ".json";
            params = Map.of("nodeId", nodeId.toString(), "storagePath", storagePath);
        } else {
            params = Map.of("nodeId", nodeId.toString(), "controllerName", controllerName, "storagePath", storagePath);
        }
        connect(host, port, params);
    }

    public void connect(MatterWebsocketService wss, BigInteger nodeId, String controllerName, String storagePath) {
        // TODO remove this check and helper function after a few releases of beta testing
        Map<String, String> params;
        if (isLegacyStorage(storagePath, controllerName)) {
            storagePath = storagePath + File.separator + controllerName + ".json";
            params = Map.of("nodeId", nodeId.toString(), "storagePath", storagePath);
        } else {
            params = Map.of("nodeId", nodeId.toString(), "controllerName", controllerName, "storagePath", storagePath);
        }
        connect(wss, params);
    }

    /**
     * Get all nodes the are commissioned / paired to this controller
     * 
     * @param onlyConnected filter to nodes that are currently connected
     * @return
     * @throws Exception
     */
    public CompletableFuture<List<BigInteger>> getCommissionedNodeIds() {
        CompletableFuture<JsonElement> future = sendMessage("nodes", "listNodes", new Object[0]);
        return future.thenApply(obj -> {
            List<BigInteger> nodes = gson.fromJson(obj, new TypeToken<List<BigInteger>>() {
            }.getType());
            return nodes != null ? nodes : Collections.emptyList();
        });
    }

    public CompletableFuture<Node> getNode(BigInteger id) {
        CompletableFuture<JsonElement> future = sendMessage("nodes", "getNode", new Object[] { id });
        return future.thenApply(obj -> {
            Node node = gson.fromJson(obj, Node.class);
            if (node == null) {
                throw new IllegalStateException("Could not deserialize node");
            }
            return node;
        });
    }

    public CompletableFuture<Void> pairNode(String code) {
        String[] parts = code.trim().split(" ");
        CompletableFuture<JsonElement> future = null;
        if (parts.length == 2) {
            future = sendMessage("nodes", "pairNode", new Object[] { "", parts[0], parts[1] });
        } else {
            // MT is a matter QR code, other wise remove any dashes in a manual pairing code
            String pairCode = parts[0].indexOf("MT:") == 0 ? parts[0] : parts[0].replaceAll("-", "");
            future = sendMessage("nodes", "pairNode", new Object[] { pairCode });
        }
        return future.thenAccept(obj -> {
            // Do nothing, just to complete the future
        });
    }

    public CompletableFuture<Void> removeNode(BigInteger nodeId) {
        CompletableFuture<JsonElement> future = sendMessage("nodes", "removeNode", new Object[] { nodeId });
        return future.thenAccept(obj -> {
            // Do nothing, just to complete the future
        });
    }

    public CompletableFuture<PairingCodes> enhancedCommissioningWindow(BigInteger id) {
        CompletableFuture<JsonElement> future = sendMessage("nodes", "enhancedCommissioningWindow",
                new Object[] { id });
        return future.thenApply(obj -> {
            PairingCodes codes = gson.fromJson(obj, PairingCodes.class);
            if (codes == null) {
                throw new IllegalStateException("Could not deserialize pairing codes");
            }
            return codes;
        });
    }

    public CompletableFuture<Void> disconnectNode(BigInteger nodeId) {
        CompletableFuture<JsonElement> future = sendMessage("nodes", "disconnectNode", new Object[] { nodeId });
        return future.thenAccept(obj -> {
            // Do nothing, just to complete the future
        });
    } // enhancedCommissioningWindow

    public CompletableFuture<Void> clusterCommand(BigInteger nodeId, Integer endpointId, String clusterName,
            ClusterCommand command) {
        Object[] clusterArgs = { String.valueOf(nodeId), endpointId, clusterName, command.commandName, command.args };
        CompletableFuture<JsonElement> future = sendMessage("clusters", "command", clusterArgs);
        return future.thenAccept(obj -> {
            // Do nothing, just to complete the future
        });
    }

    public CompletableFuture<Void> clusterWriteAttribute(BigInteger nodeId, Integer endpointId, String clusterName,
            String attributeName, String value) {
        Object[] clusterArgs = { String.valueOf(nodeId), endpointId, clusterName, attributeName, value };
        CompletableFuture<JsonElement> future = sendMessage("clusters", "writeAttribute", clusterArgs);
        return future.thenAccept(obj -> {
            // Do nothing, just to complete the future
        });
    }

    public CompletableFuture<String> clusterReadAttribute(BigInteger nodeId, Integer endpointId, String clusterName,
            String attributeName) {
        Object[] clusterArgs = { String.valueOf(nodeId), endpointId, clusterName, attributeName };
        CompletableFuture<JsonElement> future = sendMessage("clusters", "readAttribute", clusterArgs);
        return future.thenApply(obj -> {
            return obj.getAsString();
        });
    }

    public CompletableFuture<ActiveSessionInformation[]> getSessionInformation() {
        CompletableFuture<JsonElement> future = sendMessage("nodes", "sessionInformation", new Object[0]);
        return future.thenApply(obj -> {
            ActiveSessionInformation[] sessions = gson.fromJson(obj, ActiveSessionInformation[].class);
            return sessions == null ? new ActiveSessionInformation[0] : sessions;
        });
    }

    private boolean isLegacyStorage(String storagePath, String controllerName) {
        java.nio.file.Path path = java.nio.file.Paths.get(storagePath + File.separator + controllerName + ".json");
        logger.debug("Checking for legacy storage {}", path);
        return Files.exists(path);
    }
}
