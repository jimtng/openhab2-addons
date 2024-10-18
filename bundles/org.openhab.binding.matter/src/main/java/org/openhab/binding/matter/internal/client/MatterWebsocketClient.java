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
package org.openhab.binding.matter.internal.client;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.net.URI;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.WebSocketListener;
import org.eclipse.jetty.websocket.api.WebSocketPolicy;
import org.eclipse.jetty.websocket.client.ClientUpgradeRequest;
import org.eclipse.jetty.websocket.client.WebSocketClient;
import org.openhab.binding.matter.internal.client.model.Endpoint;
import org.openhab.binding.matter.internal.client.model.Node;
import org.openhab.binding.matter.internal.client.model.PairingCodes;
import org.openhab.binding.matter.internal.client.model.cluster.BaseCluster;
import org.openhab.binding.matter.internal.client.model.cluster.ClusterCommand;
import org.openhab.binding.matter.internal.client.model.ws.*;
import org.openhab.binding.matter.internal.util.NodeManager;
import org.openhab.binding.matter.internal.util.NodeRunner;
import org.openhab.binding.matter.internal.util.NodeRunner.NodeProcessListener;
import org.openhab.core.common.ThreadPoolManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

/**
 *
 * @author Dan Cunningham
 *
 */
@NonNullByDefault
public class MatterWebsocketClient implements WebSocketListener {

    private static final Logger logger = LoggerFactory.getLogger(MatterWebsocketClient.class);
    private static final String MATTER_JS_PATH = "/matter-server/matter.js";
    private static final int BUFFER_SIZE = 1048576 * 2; // 2 Mb
    private final ScheduledExecutorService scheduler = ThreadPoolManager
            .getScheduledPool("matter.MatterWebsocketClient");
    private final Gson gson = new GsonBuilder().registerTypeAdapter(Node.class, new NodeDeserializer())
            .registerTypeAdapter(BigInteger.class, new BigIntegerSerializer()).create();
    private final WebSocketClient client = new WebSocketClient();
    private final ConcurrentHashMap<String, CompletableFuture<JsonElement>> pendingRequests = new ConcurrentHashMap<>();
    private final CopyOnWriteArrayList<MatterClientListener> clientListeners = new CopyOnWriteArrayList<>();

    @Nullable
    private Session session;
    @Nullable
    private NodeRunner nodeRunner;

    public void connect(String host, int port, String storagePath) throws Exception {
        connectWebsocket(host, port, storagePath);
    }

    public void connect(String storagePath) throws Exception {
        disconnect();
        NodeManager nodeManager = new NodeManager();
        String nodePath = nodeManager.getNodePath();
        NodeRunner nodeRunner = new NodeRunner(nodePath);
        nodeRunner.addProcessListener(new NodeProcessListener() {
            @Override
            public void onNodeExit(int exitCode) {
                disconnect();
                for (MatterClientListener listener : clientListeners) {
                    listener.onDisconnect("Exit code " + exitCode);
                }
            }

            @Override
            public void onNodeReady(int port) {
                try {
                    connectWebsocket("localhost", port, storagePath);
                } catch (Exception e) {
                    disconnect();
                    logger.error("Could not connect", e);
                    for (MatterClientListener listener : clientListeners) {
                        String msg = e.getLocalizedMessage();
                        listener.onDisconnect(msg != null ? msg : "Exception connecting");
                    }
                }
            }
        });
        nodeRunner.runNodeWithResource(MATTER_JS_PATH);
        this.nodeRunner = nodeRunner;
    }

    private void connectWebsocket(String host, int port, String storagePath) throws Exception {
        logger.debug("Connecting {}:{} ", host, port);
        String dest = "ws://" + host + ":" + port + "?nodeId=0&storagePath=" + storagePath;
        WebSocketClient client = new WebSocketClient();
        client.setMaxIdleTimeout(Long.MAX_VALUE);
        client.start();
        URI uri = new URI(dest);
        client.connect(this, uri, new ClientUpgradeRequest()).get();
    }

    public void disconnect() {
        Session session = this.session;
        try {
            if (session != null && session.isOpen()) {
                session.disconnect();
                session.close();
                session = null;
            }
        } catch (IOException e) {
            logger.debug("Error trying to disconnect", e);
        } finally {
            try {
                client.stop();
            } catch (Exception e) {
                logger.debug("Error closing Web Socket", e);
            }
        }
        NodeRunner nodeRunner = this.nodeRunner;
        if (nodeRunner != null) {
            nodeRunner.stopNode();
        }
    }

    public void addListener(MatterClientListener listener) {
        clientListeners.add(listener);
    }

    public void removeListener(MatterClientListener listener) {
        clientListeners.remove(listener);
    }

    protected CompletableFuture<JsonElement> sendMessage(String namespace, String functionName,
            @Nullable Object args[]) {
        Session session = this.session;
        if (session == null) {
            throw new RuntimeException("No valid session");
        }
        String requestId = UUID.randomUUID().toString();
        CompletableFuture<JsonElement> responseFuture = new CompletableFuture<>();
        pendingRequests.put(requestId, responseFuture);
        Request message = new Request(requestId, namespace, functionName, args);
        String jsonMessage = gson.toJson(message);
        logger.debug("sendMessage: {}", jsonMessage);
        session.getRemote().sendStringByFuture(jsonMessage);
        return responseFuture;
    }

    @Override
    public void onWebSocketConnect(@Nullable Session session) {
        if (session != null) {
            final WebSocketPolicy currentPolicy = session.getPolicy();
            currentPolicy.setInputBufferSize(BUFFER_SIZE);
            currentPolicy.setMaxTextMessageSize(BUFFER_SIZE);
            currentPolicy.setMaxBinaryMessageSize(BUFFER_SIZE);
            this.session = session;
            for (MatterClientListener listener : clientListeners) {
                listener.onConnect();
            }
        }
    }

    @Override
    public void onWebSocketText(@Nullable String msg) {
        logger.debug("onWebSocketText {}", msg);
        scheduler.submit(() -> {
            Message message = gson.fromJson(msg, Message.class);
            if (message == null) {
                logger.debug("invalid Message");
                return;
            }
            if ("response".equals(message.type)) {
                Response response = gson.fromJson(message.message, Response.class);
                if (response == null) {
                    logger.debug("invalid response Message");
                    return;
                }
                CompletableFuture<JsonElement> future = pendingRequests.remove(response.id);
                if (future != null) {
                    logger.debug("result type: {} ", response.type);
                    if (!"resultSuccess".equals(response.type)) {
                        future.completeExceptionally(new Exception(response.error));
                    } else {
                        future.complete(response.result);
                    }
                }
            } else if ("event".equals(message.type)) {
                Event event = gson.fromJson(message.message, Event.class);
                if (event == null) {
                    logger.debug("invalid Event");
                    return;
                }
                switch (event.type) {
                    case "attributeChanged":
                        logger.debug("attributeChanged message {}", event.data);
                        AttributeChangedMessage changedMessage = gson.fromJson(event.data,
                                AttributeChangedMessage.class);
                        if (changedMessage == null) {
                            logger.debug("invalid AttributeChangedMessage");
                            return;
                        }
                        for (MatterClientListener listener : clientListeners) {
                            try {
                                listener.onEvent(changedMessage);
                            } catch (Exception e) {
                                logger.debug("Error notifying listener", e);
                            }
                        }
                        break;
                    case "eventTriggered":
                        logger.debug("eventTriggered message {}", event.data);
                        EventTriggeredMessage triggeredMessage = gson.fromJson(event.data, EventTriggeredMessage.class);
                        if (triggeredMessage == null) {
                            logger.debug("invalid EventTriggeredMessage");
                            return;
                        }
                        for (MatterClientListener listener : clientListeners) {
                            try {
                                listener.onEvent(triggeredMessage);
                            } catch (Exception e) {
                                logger.debug("Error notifying listener", e);
                            }
                        }
                        break;
                    case "nodeStateInformation":
                        logger.debug("nodeStateInformation message {}", event.data);
                        NodeStateMessage nodeStateMessage = gson.fromJson(event.data, NodeStateMessage.class);
                        if (nodeStateMessage == null) {
                            logger.debug("invalid NodeStateMessage");
                            return;
                        }
                        for (MatterClientListener listener : clientListeners) {
                            try {
                                listener.onEvent(nodeStateMessage);
                            } catch (Exception e) {
                                logger.debug("Error notifying listener", e);
                            }
                        }
                        break;
                    case "ready":
                        for (MatterClientListener listener : clientListeners) {
                            listener.onReady();
                        }
                        break;
                    default:
                        break;
                }
            }
        });
    }

    @Override
    public void onWebSocketClose(int statusCode, @Nullable String reason) {
        logger.debug("onWebSocketClose {} {}", statusCode, reason);
        for (MatterClientListener listener : clientListeners) {
            listener.onDisconnect(reason != null ? reason : "Code " + statusCode);
        }
    }

    @Override
    public void onWebSocketError(@Nullable Throwable cause) {
        logger.debug("onWebSocketError", cause);
    }

    @Override
    public void onWebSocketBinary(byte @Nullable [] payload, int offset, int len) {
        logger.debug("onWebSocketBinary data, not supported");
    }

    public boolean isConnected() {
        return session != null && session.isOpen();
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

    public CompletableFuture<String> genericCommand(String namespace, String functionName,
            @Nullable Object... objects) {
        CompletableFuture<JsonElement> future = sendMessage(namespace, functionName,
                objects == null ? new Object[0] : objects);
        return future.thenApply(obj -> obj == null ? "" : obj.toString());
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

    public CompletableFuture<ActiveSessionInformation[]> getSessionInformation() {
        CompletableFuture<JsonElement> future = sendMessage("nodes", "sessionInformation", new Object[0]);
        return future.thenApply(obj -> {
            ActiveSessionInformation[] sessions = gson.fromJson(obj, ActiveSessionInformation[].class);
            return sessions == null ? new ActiveSessionInformation[0] : sessions;
        });
    }

    class NodeDeserializer implements JsonDeserializer<Node> {
        @Override
        public @Nullable Node deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
                throws JsonParseException {
            JsonObject jsonObjectNode = json.getAsJsonObject();
            Node node = new Node();
            node.id = jsonObjectNode.get("id").getAsBigInteger();
            node.endpoints = new HashMap<>();
            JsonObject endpointsJson = jsonObjectNode.get("endpoints").getAsJsonObject();
            Set<Map.Entry<String, JsonElement>> endpointEntries = endpointsJson.entrySet();
            for (Map.Entry<String, JsonElement> endpointEntry : endpointEntries) {
                JsonObject jsonObjectElement = endpointEntry.getValue().getAsJsonObject();
                Endpoint endpoint = new Endpoint();
                endpoint.number = jsonObjectElement.get("number").getAsInt();
                endpoint.clusters = new HashMap<>();
                JsonObject clustersJson = jsonObjectElement.get("clusters").getAsJsonObject();
                Set<Map.Entry<String, JsonElement>> clusterEntries = clustersJson.entrySet();
                for (Map.Entry<String, JsonElement> clusterEntry : clusterEntries) {
                    String clusterName = clusterEntry.getKey();
                    JsonElement clusterElement = clusterEntry.getValue();
                    logger.trace("Cluster {}", clusterEntry);
                    try {
                        Class<?> clazz = Class
                                .forName(BaseCluster.class.getPackageName() + ".gen." + clusterName + "Cluster");
                        if (BaseCluster.class.isAssignableFrom(clazz)) {
                            BaseCluster cluster = context.deserialize(clusterElement, clazz);
                            deserializeFields(cluster, clusterElement, clazz, context);
                            endpoint.clusters.put(clusterName, cluster);
                        }
                    } catch (ClassNotFoundException e) {
                        logger.debug("Cluster not found: {} ", clusterName);
                    } catch (JsonSyntaxException | IllegalArgumentException | SecurityException
                            | IllegalAccessException e) {
                        logger.debug("Exception for cluster {}", clusterName, e);
                    }
                }
                node.endpoints.put(endpoint.number, endpoint);
            }
            return node;
        }

        private void deserializeFields(Object instance, JsonElement jsonElement, Class<?> clazz,
                JsonDeserializationContext context) throws IllegalAccessException {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                String fieldName = entry.getKey();
                JsonElement element = entry.getValue();

                try {
                    Field field = getField(clazz, fieldName);
                    field.setAccessible(true);

                    if (List.class.isAssignableFrom(field.getType())) {
                        // Handle lists generically
                        Type fieldType = ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];
                        List<?> list = context.deserialize(element,
                                TypeToken.getParameterized(List.class, fieldType).getType());
                        field.set(instance, list);
                    } else {
                        // Handle normal fields
                        Object fieldValue = context.deserialize(element, field.getType());
                        field.set(instance, fieldValue);
                    }
                } catch (NoSuchFieldException e) {
                    logger.trace("Skipping field {}", fieldName);
                }
            }
        }

        private Field getField(Class<?> clazz, String fieldName) throws NoSuchFieldException {
            try {
                return clazz.getDeclaredField(fieldName);
            } catch (NoSuchFieldException e) {
                Class<?> superClass = clazz.getSuperclass();
                if (superClass == null) {
                    throw e;
                } else {
                    return getField(superClass, fieldName);
                }
            }
        }
    }

    class AttributeChangedMessageDeserializer implements JsonDeserializer<AttributeChangedMessage> {

        @Override
        public @Nullable AttributeChangedMessage deserialize(JsonElement json, Type typeOfT,
                JsonDeserializationContext context) throws JsonParseException {
            JsonObject jsonObject = json.getAsJsonObject();

            Path path = context.deserialize(jsonObject.get("path"), Path.class);
            Long version = jsonObject.get("version").getAsLong();

            JsonElement valueElement = jsonObject.get("value");
            Object value = null;
            if (valueElement.isJsonPrimitive()) {
                JsonPrimitive primitive = valueElement.getAsJsonPrimitive();
                if (primitive.isNumber()) {
                    value = primitive.getAsNumber();
                } else if (primitive.isString()) {
                    value = primitive.getAsString();
                } else if (primitive.isBoolean()) {
                    value = primitive.getAsBoolean();
                }
            } else if (valueElement.isJsonArray()) {
                value = context.deserialize(valueElement.getAsJsonArray(), List.class);
            } else {
                value = valueElement.toString();
            }

            return new AttributeChangedMessage(path, version, value);
        }
    }

    /**
     * Biginteger types have to be represented as strings in JSON
     */
    class BigIntegerSerializer implements JsonSerializer<BigInteger> {
        @Override
        public JsonElement serialize(BigInteger src, Type typeOfSrc, JsonSerializationContext context) {
            return new JsonPrimitive(src.toString());
        }
    }
}
