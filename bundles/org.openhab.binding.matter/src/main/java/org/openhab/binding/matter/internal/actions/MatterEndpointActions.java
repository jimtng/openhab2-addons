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
package org.openhab.binding.matter.internal.actions;

import java.util.Map;
import java.util.concurrent.ExecutionException;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.matter.internal.MatterControllerClient;
import org.openhab.binding.matter.internal.client.model.PairingCodes;
import org.openhab.binding.matter.internal.handler.EndpointHandler;
import org.openhab.core.automation.annotation.ActionOutput;
import org.openhab.core.automation.annotation.ActionOutputs;
import org.openhab.core.automation.annotation.RuleAction;
import org.openhab.core.thing.binding.ThingActions;
import org.openhab.core.thing.binding.ThingActionsScope;
import org.openhab.core.thing.binding.ThingHandler;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@NonNullByDefault
/**
 * @author Dan Cunningham
 */
@Component(scope = ServiceScope.PROTOTYPE, service = MatterEndpointActions.class)
@ThingActionsScope(name = "matter")
public class MatterEndpointActions implements ThingActions {
    public final Logger logger = LoggerFactory.getLogger(getClass());
    private @Nullable EndpointHandler handler;

    @Override
    public void setThingHandler(@Nullable ThingHandler handler) {
        this.handler = (EndpointHandler) handler;
    }

    @Override
    public @Nullable ThingHandler getThingHandler() {
        return handler;
    }

    @RuleAction(label = "generate a new pairing code for a Matter device", description = "Generates a new manual and QR pairing code to be used to pair the Matter device with an external Matter controller")
    public @Nullable @ActionOutputs({
            @ActionOutput(name = "manualPairingCode", label = "Manual pairing code", type = "java.lang.String"),
            @ActionOutput(name = "qrPairingCode", label = "QR pairing code", type = "qrCode") }) Map<String, Object> generateNewPairingCode() {
        EndpointHandler handler = this.handler;
        if (handler != null) {
            MatterControllerClient client = handler.getClient();
            if (client != null) {
                try {
                    PairingCodes code = client.enhancedCommissioningWindow(handler.getNodeId()).get();
                    return Map.of("manualPairingCode", code.manualPairingCode, "qrPairingCode", code.qrPairingCode);
                } catch (InterruptedException | ExecutionException e) {
                    logger.debug("Failed to generate new pairing code for device {}", handler.getNodeId(), e);
                }
            }
        }
        return null;
    }
}
