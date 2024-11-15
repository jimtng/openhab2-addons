package org.openhab.binding.matter.internal.bridge;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.binding.matter.internal.client.MatterWebsocketClient;
import org.openhab.binding.matter.internal.client.model.PairingCodes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonElement;

@NonNullByDefault
public class MatterBridgeClient extends MatterWebsocketClient {
    private static final Logger logger = LoggerFactory.getLogger(MatterBridgeClient.class);

    public CompletableFuture<PairingCodes> getPairingCodes() {
        CompletableFuture<JsonElement> future = sendMessage("bridge", "getPairingCodes", new Object[0]);
        return future.thenApply(obj -> {
            PairingCodes codes = gson.fromJson(obj, PairingCodes.class);
            if (codes == null) {
                throw new IllegalStateException("Could not deserialize pairing codes");
            }
            return codes;
        });
    }

    public CompletableFuture<String> addEndpoint(String deviceType, String id, String nodeLabel, String productName,
            String productLabel, String serialNumber, Map<String, Object> attributeMap) {
        CompletableFuture<JsonElement> future = sendMessage("bridge", "addEndpoint",
                new Object[] { deviceType, id, nodeLabel, productName, productLabel, serialNumber, attributeMap });
        return future.thenApply(obj -> obj == null ? "" : obj.toString());
    }

    public CompletableFuture<Void> setEndpointState(String endpointId, String clusterName, String attributeName,
            Object state) {
        CompletableFuture<JsonElement> future = sendMessage("bridge", "setEndpointState",
                new Object[] { endpointId, clusterName, attributeName, state });
        return future.thenAccept(obj -> {
            // Do nothing, just to complete the future
        });
    }

    public CompletableFuture<Void> resetBridge() {
        CompletableFuture<JsonElement> future = sendMessage("bridge", "resetBridge", new Object[0]);
        return future.thenAccept(obj -> {
            // Do nothing, just to complete the future
        });
    }

    public CompletableFuture<Void> startBridge() {
        CompletableFuture<JsonElement> future = sendMessage("bridge", "startBridge", new Object[0]);
        return future.thenAccept(obj -> {
            // Do nothing, just to complete the future
        });
    }
}
