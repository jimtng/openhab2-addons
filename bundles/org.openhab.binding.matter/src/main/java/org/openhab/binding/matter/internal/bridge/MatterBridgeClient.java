package org.openhab.binding.matter.internal.bridge;

import java.util.concurrent.CompletableFuture;

import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.matter.internal.client.MatterWebsocketClient;
import org.openhab.binding.matter.internal.client.model.PairingCodes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonElement;

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

    public CompletableFuture<String> addEndpoint(@Nullable Object... objects) {
        CompletableFuture<JsonElement> future = sendMessage("bridge", "addEndpoint",
                objects == null ? new Object[0] : objects);
        return future.thenApply(obj -> obj == null ? "" : obj.toString());
    }

    public CompletableFuture<Void> resetBridge() {
        CompletableFuture<JsonElement> future = sendMessage("bridge", "resetBridge", new Object[0]);
        return future.thenAccept(obj -> {
            // Do nothing, just to complete the future
        });
    }
}
