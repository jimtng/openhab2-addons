import WebSocket, { Server } from 'ws';
import { Level, Logger } from "@project-chip/matter.js/log";
import { IncomingMessage } from 'http';
import { ClientController } from './client/ClientController';
import { Controller } from './Controller';
import { MatterNode } from "./client/MatterNode";
import yargs from 'yargs'
import { hideBin } from 'yargs/helpers'
import { Request, Response, Message, MessageType } from './MessageTypes';
import { convertJsonFile } from "./util/storageConverter"
import * as path from 'path';
const argv: any = yargs(hideBin(process.argv)).argv

const logger = Logger.get("matter");
Logger.defaultLogLevel = Level.DEBUG;

process.on('uncaughtException', function (err) {
    logger.error(`Caught exception: ${err} ${err.stack}`);
});

process.on("SIGINT", () => {
   logger.info("Received SIGINT. Closing WebSocket connections...");

    const closePromises: Promise<void>[] = [];

    wss.clients.forEach((client: WebSocket) => {
        if (client.readyState === WebSocket.OPEN) {
            closePromises.push(
                new Promise<void>((resolve) => {
                    client.close(1000, "Server shutting down");
                    client.on('close', () => {
                        resolve();
                    });
                    client.on('error', (err) => {
                        console.error('Error while closing WebSocket connection:', err);
                        resolve();
                    });
                })
            );
        }
    });

    Promise.all(closePromises)
        .then(() => {
           logger.info("All WebSocket connections closed.");
            return new Promise<void>((resolve) => wss.close(() => resolve()));
        })
        .then(() => {
           logger.info("WebSocket server closed.");
            process.exit(0);
        })
        .catch((err) => {
            console.error("Error during shutdown:", err);
            process.exit(1);
        });
});

export interface WebSocketSession extends WebSocket {
    controller?: Controller;
    sendResponse(type: string, id: string, result?: any, error?: string): void;
    sendEvent(type: string, data?: any): void;
}

const socketPort = argv.port ? parseInt(argv.port) : 8888;
const wss: Server = new WebSocket.Server({ port: socketPort, host: argv.host });

wss.on('connection', async (ws: WebSocketSession, req: IncomingMessage) => {

    ws.sendResponse = (type: string, id: string, result?: any, error?: string) => {
        const message: Message = {
            type: 'response',
            message: {
                type,
                id,
                result,
                error
            }
        };
        logger.debug(`Sending response: ${Logger.toJSON(message)}`);
        ws.send(Logger.toJSON(message));
    };

    ws.sendEvent = (type: string, data?: any) => {
        const message: Message = {
            type: 'event',
            message: {
                type,
                data
            }
        };
        logger.debug(`Sending event: ${Logger.toJSON(message)}`);
        ws.send(Logger.toJSON(message));
    };

    ws.on('open', () => {
        logger.info('WebSocket opened');
    });

    ws.on('message', (message: string) => {
        try {
            const request: Request = JSON.parse(message);
            ws.controller?.handleRequest(request);
        } catch (error) {
            if (error instanceof Error) {
                ws.sendResponse(MessageType.ResultError, '', undefined, error.message);
            }
        }
    });

    ws.on('close', () => {
        logger.info('WebSocket closed');
        if (ws.controller) {
            ws.controller.close();
        }
    });

    ws.on('error', (error: Error) => {
        logger.error(`WebSocket error: ${error} ${error.stack}`);
    });

    if (!req.url) {
        logger.error('No URL in the request');
        ws.close(1002, 'No URL in the request');
        return;
    }

    const params = new URLSearchParams(req.url.slice(req.url.indexOf('?')));
    const stringId = params.get('nodeId');
    const nodeId = stringId != null ? parseInt(stringId) : null;
    let storagePath = params.get('storagePath');
    let controllerName = params.get('controllerName');

    if (nodeId === null || storagePath === null) {
        ws.close(1002, 'No nodeId or storagePath parameters in the request');
        return;
    }

    try {
        //migrate legacy json files
        if (controllerName === null) {
            const parsedPath = path.parse(storagePath);
            const { outputDir, name } = convertJsonFile(storagePath, nodeId);
            storagePath = outputDir;
            controllerName = name;
        }
        ws.controller = await initController(ws, storagePath, controllerName, nodeId);
    } catch (error: any) {
       logger.error("returning error", error.message)
        ws.close(1002, error.message);
        return;
    }

    ws.sendEvent('ready', 'Controller initialized');
});

async function initController(ws: WebSocketSession, storagePath: string, controllerName: string, nodeNum: number, factoryReset = false) {
    const theNode = new MatterNode(storagePath, controllerName, nodeNum);
    await theNode.initialize();
    logger.info(`Started Node #${nodeNum}`);
    let controller = new ClientController(ws, theNode);
    return controller;
}

logger.info(`CHIP Controller Server listening on port ${socketPort}`);