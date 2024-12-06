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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openhab.core.common.ThreadPoolManager;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.ServiceScope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Dan Cunningham - Initial contribution
 */
@Component(service = MatterWebsocketService.class, scope = ServiceScope.SINGLETON)
public class MatterWebsocketService {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private static final Pattern LOG_PATTERN = Pattern
            .compile("^\\S+\\s+\\S+\\s+(TRACE|DEBUG|INFO|WARN|ERROR)\\s+(\\S+)\\s+(.*)$");
    private static final String MATTER_JS_PATH = "/matter-server/matter.js";

    private final String nodePath;
    private Process nodeProcess;
    private boolean ready;
    private boolean shuttingDown;
    private int port;
    private final List<NodeProcessListener> processListeners = new ArrayList<>();
    private final ExecutorService executorService = Executors.newFixedThreadPool(4);
    private final ScheduledExecutorService scheduler = ThreadPoolManager
            .getScheduledPool("matter.MatterWebsocketService");

    @Activate
    public MatterWebsocketService() throws IOException {
        NodeJSRuntimeManager nodeManager = new NodeJSRuntimeManager();
        String nodePath = nodeManager.getNodePath();
        this.nodePath = nodePath;
        restart();
    }

    @Deactivate
    public void deactivate() {
        stopNode();
        executorService.shutdown();
    }

    public void restart() throws IOException {
        stopNode();
        port = runNodeWithResource(MATTER_JS_PATH);
    }

    public void addProcessListener(NodeProcessListener listener) {
        processListeners.add(listener);
        if (ready) {
            listener.onNodeReady(port);
        }
    }

    public void removeProcessListener(NodeProcessListener listener) {
        processListeners.remove(listener);
    }

    public void stopNode() {
        logger.debug("stopNode");
        shuttingDown = true;
        if (nodeProcess != null && nodeProcess.isAlive()) {
            nodeProcess.destroy();
            try {
                // Wait for the process to terminate
                if (!nodeProcess.waitFor(5, java.util.concurrent.TimeUnit.SECONDS)) {
                    nodeProcess.destroyForcibly();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                logger.debug("Interrupted while waiting for Node process to stop", e);
            }
        }
    }

    public int getPort() {
        return port;
    }

    public boolean isReady() {
        return ready;
    }

    private int runNodeWithResource(String resourcePath, String... additionalArgs) throws IOException {
        shuttingDown = false;
        ready = false;
        Path scriptPath = extractResourceToTempFile(resourcePath);

        port = findAvailablePort();
        List<String> command = new ArrayList<>();
        command.add(nodePath);
        command.add(scriptPath.toString());
        command.add("--host");
        command.add("localhost");
        command.add("--port");
        command.add(String.valueOf(port));
        command.addAll(List.of(additionalArgs));

        ProcessBuilder pb = new ProcessBuilder(command);
        nodeProcess = pb.start();

        // Start output and error stream readers
        executorService.submit(this::readOutputStream);
        executorService.submit(this::readErrorStream);

        // Wait for the process to exit in a separate thread
        executorService.submit(() -> {
            int exitCode = -1;
            try {
                exitCode = nodeProcess.waitFor();
                logger.debug("Node process exited with code: {}", exitCode);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                logger.debug("Interrupted while waiting for Node process to exit", e);
            } finally {
                try {
                    Files.deleteIfExists(scriptPath);
                    notifyExitListeners(exitCode);
                } catch (IOException e) {
                    logger.debug("Failed to delete temporary script file", e);
                }
                ready = false;
                if (!shuttingDown) {
                    scheduler.schedule(() -> {
                        try {
                            restart();
                        } catch (IOException e) {
                            logger.error("Failed to restart Node process", e);
                        }
                    }, 5, TimeUnit.SECONDS);
                }
            }
        });
        return port;
    }

    private void readOutputStream() {
        processStream(nodeProcess.getInputStream(), "Error reading Node process output");
    }

    private void readErrorStream() {
        processStream(nodeProcess.getErrorStream(), "Error reading Node process error stream");
    }

    private void processStream(InputStream inputStream, String errorMessage) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!ready) {
                    ready = true;
                    scheduler.schedule(() -> {
                        notifyReadyListeners();
                    }, 1, TimeUnit.SECONDS);
                }
                Matcher matcher = LOG_PATTERN.matcher(line);
                if (matcher.matches()) {
                    String logLevel = matcher.group(1);
                    String component = matcher.group(2);
                    String message = matcher.group(3);
                    logMessage(logLevel, component + ": " + message);
                } else {
                    logMessage("DEBUG", "none: " + line);
                }
            }
        } catch (IOException e) {
            if (!shuttingDown) {
                logger.debug("{}", errorMessage, e);
            }
        }
    }

    private void logMessage(String logLevel, String message) {
        switch (logLevel) {
            case "TRACE":
            case "DEBUG":
                logger.trace("{}", message);
                break;
            case "INFO":
            case "WARN":
            case "ERROR":
            default:
                logger.debug("{}", message);

        }
    }

    private void notifyExitListeners(int exitCode) {
        for (NodeProcessListener listener : processListeners) {
            listener.onNodeExit(exitCode);
        }
    }

    private void notifyReadyListeners() {
        for (NodeProcessListener listener : processListeners) {
            listener.onNodeReady(port);
        }
    }

    private Path extractResourceToTempFile(String resourcePath) throws IOException {
        Path tempFile = Files.createTempFile("node-script-", ".js");
        try (InputStream in = getClass().getResourceAsStream(resourcePath)) {
            if (in == null) {
                throw new IOException("Resource not found: " + resourcePath);
            }
            Files.copy(in, tempFile, StandardCopyOption.REPLACE_EXISTING);
        }
        tempFile.toFile().deleteOnExit(); // Ensure the temp file is deleted on JVM exit
        return tempFile;
    }

    private int findAvailablePort() throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(0);
            return serverSocket.getLocalPort();
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    logger.debug("Failed to close ServerSocket", e);
                }
            }
        }
    }

    public interface NodeProcessListener {
        void onNodeExit(int exitCode);

        void onNodeReady(int port);
    }
}
