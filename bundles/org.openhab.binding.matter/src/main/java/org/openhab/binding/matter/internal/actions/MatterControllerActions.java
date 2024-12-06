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

import java.util.concurrent.ExecutionException;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.matter.internal.controller.MatterControllerClient;
import org.openhab.binding.matter.internal.handler.ControllerHandler;
import org.openhab.core.automation.annotation.ActionInput;
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
@Component(scope = ServiceScope.PROTOTYPE, service = MatterControllerActions.class)
@ThingActionsScope(name = "matter")
public class MatterControllerActions implements ThingActions {
    public final Logger logger = LoggerFactory.getLogger(getClass());
    private @Nullable ControllerHandler handler;

    @Override
    public void setThingHandler(@Nullable ThingHandler handler) {
        this.handler = (ControllerHandler) handler;
    }

    @Override
    public @Nullable ThingHandler getThingHandler() {
        return handler;
    }

    @RuleAction(label = "Send a raw command to the controller", description = "Sends a raw command to the controller, eg. namespace=nodes functionName=disconnectNode parameters=1234567890")
    public @Nullable @ActionOutputs({
            @ActionOutput(name = "result", label = "The command result", type = "java.lang.String") }) String sendCommand(
                    @ActionInput(name = "namespace", label = "Manual pairing code", type = "java.lang.String") String namespace,
                    @ActionInput(name = "functionName", label = "The function name to be called", type = "java.lang.String") String functionName,
                    @ActionInput(name = "parameters", label = "Function parameters separated by a space", type = "java.lang.String") String parameters) {
        ControllerHandler handler = this.handler;
        if (handler != null) {
            MatterControllerClient client = handler.getClient();
            if (client != null) {

                String[] args = parameters.toString().split(" ");
                try {
                    return client.genericCommand(namespace, functionName, (Object[]) args).get();
                } catch (InterruptedException | ExecutionException e) {
                    logger.debug("Failed to execute command", e);
                    return e.getLocalizedMessage();
                }
            }
        }
        return null;
    }
}
