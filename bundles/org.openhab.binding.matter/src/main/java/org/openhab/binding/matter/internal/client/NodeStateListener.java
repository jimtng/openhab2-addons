/**
 * Copyright (c) 2010-2023 Contributors to the openHAB project
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

import org.openhab.binding.matter.internal.client.MatterWebsocketClient.NodeStateMessage;

/**
 * @author Dan Cunningham
 *
 */
public interface NodeStateListener {

    public void onEvent(NodeStateMessage messasge);
}
