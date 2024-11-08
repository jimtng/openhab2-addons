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
package org.openhab.binding.matter.internal.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.openhab.core.OpenHAB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Dan Cunningham - Initial contribution
 */
class NodeManager {
    private static final Logger logger = LoggerFactory.getLogger(NodeManager.class);

    private static final String NODE_VERSION = "v22.0.0";
    private static final String BASE_URL = "https://nodejs.org/dist/" + NODE_VERSION + "/";
    private static final String CACHE_DIR = Paths
            .get(OpenHAB.getUserDataFolder(), "cache", "org.openhab.binding.matter", "node_cache").toString();

    private String platform;
    private String arch;
    private String nodeExecutable;

    public NodeManager() {
        detectPlatformAndArch();
    }

    private void detectPlatformAndArch() {
        String os = System.getProperty("os.name").toLowerCase();
        String arch = System.getProperty("os.arch").toLowerCase();

        if (os.contains("win")) {
            platform = "win";
            nodeExecutable = "node.exe";
        } else if (os.contains("mac")) {
            platform = "darwin";
            nodeExecutable = "node";
        } else if (os.contains("nux")) {
            platform = "linux";
            nodeExecutable = "node";
        } else {
            throw new UnsupportedOperationException("Unsupported operating system");
        }

        if (arch.contains("amd64") || arch.contains("x86_64")) {
            this.arch = "x64";
        } else if (arch.contains("aarch64") || arch.contains("arm64")) {
            this.arch = "arm64";
        } else if (arch.contains("arm")) {
            this.arch = "armv7l";
        } else {
            throw new UnsupportedOperationException("Unsupported architecture");
        }
    }

    public String getNodePath() throws IOException {
        String cacheDir = CACHE_DIR + File.separator + platform + "-" + arch + File.separator + NODE_VERSION;
        Path nodePath = findNodeExecutable(cacheDir);

        if (nodePath == null) {
            downloadAndExtract(cacheDir);
            nodePath = findNodeExecutable(cacheDir);
            if (nodePath == null) {
                throw new IOException("Unable to locate Node.js executable after download and extraction");
            }
        }

        return nodePath.toString();
    }

    private Path findNodeExecutable(String cacheDir) throws IOException {
        Path rootDir = Paths.get(cacheDir);
        if (!Files.exists(rootDir)) {
            return null;
        }

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(rootDir)) {
            for (Path path : stream) {
                if (Files.isDirectory(path) && path.getFileName().toString().startsWith("node-" + NODE_VERSION)) {
                    Path execPath = path.resolve("bin").resolve(nodeExecutable);
                    if (Files.exists(execPath)) {
                        return execPath;
                    }
                }
            }
        }
        return null;
    }

    private void downloadAndExtract(String cacheDir) throws IOException {
        String fileName = "node-" + NODE_VERSION + "-" + platform + "-" + arch
                + (platform.equals("win") ? ".zip" : ".tar.gz");
        String downloadUrl = BASE_URL + fileName;

        Path downloadPath = Paths.get(cacheDir, fileName);
        Files.createDirectories(downloadPath.getParent());

        logger.debug("Downloading Node.js from: {}", downloadUrl);
        try (InputStream in = new URL(downloadUrl).openStream()) {
            Files.copy(in, downloadPath, StandardCopyOption.REPLACE_EXISTING);
        }

        logger.debug("Extracting Node.js");
        if (platform.equals("win")) {
            unzip(downloadPath.toString(), cacheDir);
        } else {
            untar(downloadPath.toString(), cacheDir);
        }

        Files.delete(downloadPath);
    }

    private void unzip(String zipFilePath, String destDir) throws IOException {
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFilePath))) {
            ZipEntry zipEntry;
            while ((zipEntry = zis.getNextEntry()) != null) {
                Path newPath = Paths.get(destDir, zipEntry.getName());
                if (zipEntry.isDirectory()) {
                    Files.createDirectories(newPath);
                } else {
                    Files.createDirectories(newPath.getParent());
                    Files.copy(zis, newPath, StandardCopyOption.REPLACE_EXISTING);
                }
                zis.closeEntry();
            }
        }
    }

    private void untar(String tarFilePath, String destDir) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("tar", "-xzf", tarFilePath, "-C", destDir);
        Process p = pb.start();
        try {
            p.waitFor();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Interrupted while extracting tar file", e);
        }
    }
}
