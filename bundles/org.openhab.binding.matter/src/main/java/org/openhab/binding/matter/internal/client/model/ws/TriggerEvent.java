package org.openhab.binding.matter.internal.client.model.ws;

import java.util.Map;

public class TriggerEvent {
    public String eventNumber;
    public int priority;
    public String epochTimestamp;
    public Map<String, Object> data;
}
