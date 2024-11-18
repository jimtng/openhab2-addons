import { Endpoint } from "@matter/node";
import { BridgeController } from "../BridgeController";
import { Request, MessageType, EventType, BridgeEvent } from '../../MessageTypes';
import { Logger } from "@matter/main";

const logger = Logger.get("GenericDevice");

export abstract class GenericDeviceType {
    
    protected updateLocks = new Set<string>();
    endpoint: Endpoint;

    constructor(protected bridgeController: BridgeController, protected attributeMap: Record<string, any>, protected endpointId: string, protected  nodeLabel: string, protected productName: string, protected productLabel: string, protected serialNumber: string) {
        this.nodeLabel = this.truncateString(nodeLabel);
        this.productLabel = this.truncateString(productLabel);
        this.productName = this.truncateString(productName);
        this.serialNumber = this.truncateString(serialNumber);
        this.endpoint = this.createEndpoint(this.mergeWithDefaults(this.defaultClusterValues(), attributeMap));
    }

    abstract defaultClusterValues(): Record<string, any>;
    abstract createEndpoint(clusterValues: Record<string, any>): Endpoint;
    
    async updateState(clusterName: string, attributeName: string, attributeValue: any) {
        const args = {} as { [key: string]: any }
        args[clusterName] = {} as { [key: string]: any }
        args[clusterName][attributeName] = attributeValue
        //lock sending event back to prevent update loop
        this.updateLocks.add(`${clusterName}.${attributeName}`);
        await this.endpoint.set(args);
        setTimeout(() => {
            this.updateLocks.delete(`${clusterName}.${attributeName}`);
        }, 100);
    }

    sendBridgeEvent(clusterName: string, attributeName: string, attributeValue: any) {
        if (this.updateLocks.has(`${clusterName}.${attributeName}`)) {
            logger.debug(`skipping sending bridge event for ${clusterName}.${attributeName} = ${attributeValue}`);
            return;
        }
        const be: BridgeEvent = {  
            endpointId: this.endpoint.id,
            clusterName: clusterName,
            attributeName: attributeName,
            data: attributeValue,
        }
        this.sendEvent(EventType.BridgeEvent, be)
    }

    sendEvent(eventName: string, data: any) {
        logger.debug(`Sending event: ${eventName} with data: ${data}`);
        this.bridgeController.ws.sendEvent(eventName, data)
    }

    truncateString(str: string, maxLength: number = 32): string {
        return str.slice(0, maxLength);
    }

    mergeWithDefaults<T extends Record<string, any>, U extends Partial<T>>(defaults: T, overrides: U): T {
        // Helper function to check if a value is a plain object
        function isPlainObject(value: any): value is Record<string, any> {
            return value && typeof value === 'object' && !Array.isArray(value);
        }
        return Object.keys(defaults).reduce((result, key) => {
            const defaultValue = defaults[key];
            const overrideValue = overrides[key];
    
            // If both defaultValue and overrideValue are objects, merge them recursively
            if (
                isPlainObject(defaultValue) &&
                isPlainObject(overrideValue)
            ) {
                result[key] = this.mergeWithDefaults(defaultValue, overrideValue);
            } else {
                // Otherwise, use the override value if it exists, else the default value
                result[key] = key in overrides ? overrideValue : defaultValue;
            }
    
            return result;
        }, {} as Record<string, any>) as T;
    }
    
    
    
}