package org.openhab.binding.matter.internal.util;

import java.math.BigInteger;

import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.matter.internal.MatterBindingConstants;
import org.openhab.core.thing.ThingTypeUID;

public class MatterUIDUtils {

    /**
     * Node thing types will have a UUID like matter:node_1234567890
     * 
     * @param nodeId
     * @return
     */
    public static ThingTypeUID nodeThingTypeUID(BigInteger nodeId) {
        return new ThingTypeUID(MatterBindingConstants.BINDING_ID,
                MatterBindingConstants.THING_TYPE_NODE.getId() + "_" + nodeId);
    }

    /**
     * Bridge Endpoint thing types will have a UUID like matter matter:bride-endpoint_1234567890_1
     * 
     * @param nodeId
     * @param endpointNumber
     * @return
     */
    public static ThingTypeUID bridgeEndpointThingTypeUID(BigInteger nodeId, Integer endpointNumber) {
        return new ThingTypeUID(MatterBindingConstants.BINDING_ID,
                MatterBindingConstants.THING_TYPE_BRIDGE_ENDPOINT.getId() + "_" + nodeId + "_" + endpointNumber);
    }

    /**
     * Returns the base Thing type (node, bridge-endpoint, etc...) for a dynamic thing
     * 
     * @param thingTypeUID
     * @return
     */
    public static @Nullable ThingTypeUID baseTypeForThingType(ThingTypeUID thingTypeUID) {
        String type = thingTypeUID.getId().split("_", 2)[0];
        switch (type) {
            case "node":
                return MatterBindingConstants.THING_TYPE_NODE;
            case "bridge-endpoint":
                return MatterBindingConstants.THING_TYPE_BRIDGE_ENDPOINT;
            default:
                return null;
        }
    }
}
