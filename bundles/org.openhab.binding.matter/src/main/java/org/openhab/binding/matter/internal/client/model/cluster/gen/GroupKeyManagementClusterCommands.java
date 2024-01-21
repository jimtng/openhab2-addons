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

// AUTO-GENERATED by zap. DO NOT EDIT!

package org.openhab.binding.matter.internal.client.model.cluster.gen;

import org.openhab.binding.matter.internal.client.model.cluster.ClusterCommand;
import org.openhab.binding.matter.internal.client.model.cluster.gen.GroupKeyManagementClusterTypes.*;

/**
 * GroupKeyManagement
 *
 * @author Dan Cunningham - Initial contribution
 */
public class GroupKeyManagementClusterCommands {

    public static ClusterCommand keySetWrite(GroupKeySetStruct[] groupKeySet) {
        return new ClusterCommand("keySetWrite", new KeySetWriteCommandOptions(groupKeySet));
    }

    public static ClusterCommand keySetRead(Integer groupKeySetID) {
        return new ClusterCommand("keySetRead", new KeySetReadCommandOptions(groupKeySetID));
    }

    public static ClusterCommand keySetReadResponse(GroupKeySetStruct[] groupKeySet) {
        return new ClusterCommand("keySetReadResponse", new KeySetReadResponseCommandOptions(groupKeySet));
    }

    public static ClusterCommand keySetRemove(Integer groupKeySetID) {
        return new ClusterCommand("keySetRemove", new KeySetRemoveCommandOptions(groupKeySetID));
    }

    public static ClusterCommand keySetReadAllIndices() {
        return new ClusterCommand("keySetReadAllIndices", new KeySetReadAllIndicesCommandOptions());
    }

    public static ClusterCommand keySetReadAllIndicesResponse(Integer groupKeySetIDs) {
        return new ClusterCommand("keySetReadAllIndicesResponse",
                new KeySetReadAllIndicesResponseCommandOptions(groupKeySetIDs));
    }
}