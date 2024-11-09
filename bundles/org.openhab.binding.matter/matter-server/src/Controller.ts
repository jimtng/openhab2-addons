import { WebSocketSession } from "./app";
import { Request, MessageType } from './MessageTypes';
import { Logger } from"@project-chip/matter.js/log";

const logger = Logger.get("Controller");

export abstract class Controller {

    constructor(protected ws: WebSocketSession, protected params: URLSearchParams) {
    }
    
    abstract init(): Promise<void>;
    abstract close(): void;
    abstract executeCommand(namespace: string, functionName: string, args: any[]): any | Promise<any>

    async handleRequest(request: Request): Promise<void> {
        const { id, namespace, function: functionName, args } = request;
        logger.debug(`Received request: ${Logger.toJSON(request)}`);
        try {
            const result = this.executeCommand(namespace, functionName, args || []);
            if (result instanceof Promise) {
                result.then((asyncResult) => {
                    this.ws.sendResponse(MessageType.ResultSuccess, id, asyncResult);
                }).catch((error) => {
                    this.printError(error, functionName);
                    this.ws.sendResponse(MessageType.ResultError, id, undefined, error.message);
                });
            } else {
                this.ws.sendResponse(MessageType.ResultSuccess, id, result);
            }
        } catch (error) {
            if (error instanceof Error) {
                this.printError(error, functionName);
                this.ws.sendResponse(MessageType.ResultError, id, undefined, error.message);
            } else {
                logger.error(`Unexpected error executing function ${functionName}: ${error}`);
                this.ws.sendResponse(MessageType.ResultError, id, undefined, String(error));
            }
        }
    }

    printError(error: Error, functionName: String) {

        logger.error(`Error executing function ${functionName}: ${error.message}`);
        logger.error(`Stack trace: ${error.stack}`);

        // Log additional error properties if available
        if ('code' in error) {
            logger.error(`Error code: ${(error as any).code}`);
        }
        if ('name' in error) {
            logger.error(`Error name: ${(error as any).name}`);
        }

        // Fallback: log the entire error object in case there are other useful details
        logger.error(`Full error object: ${JSON.stringify(error, Object.getOwnPropertyNames(error))}`)
        logger.error(error)
    }
}