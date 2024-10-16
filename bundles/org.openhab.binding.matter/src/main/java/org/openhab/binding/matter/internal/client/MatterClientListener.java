package org.openhab.binding.matter.internal.client;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.binding.matter.internal.client.model.ws.AttributeChangedMessage;
import org.openhab.binding.matter.internal.client.model.ws.EventTriggeredMessage;
import org.openhab.binding.matter.internal.client.model.ws.NodeStateMessage;

@NonNullByDefault
public interface MatterClientListener {
    public void onDisconnect(String reason);

    public void onConnect();

    public void onReady();

    public void onEvent(NodeStateMessage message);

    public void onEvent(AttributeChangedMessage message);

    public void onEvent(EventTriggeredMessage message);
}
