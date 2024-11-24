import { Endpoint } from "@matter/main";
import { BridgeController } from "../BridgeController";
import { EventType, BridgeEvent, BridgeEventType } from '../../MessageTypes';
import { OnOffServer } from '@matter/node/behaviors/on-off';
import { LevelControlServer } from '@matter/node/behaviors/level-control';

import { Logger } from "@matter/main";

const logger = Logger.get("GenericDevice");

export abstract class GenericDeviceType {

    protected updateLocks = new Set<string>();
    endpoint: Endpoint;

    constructor(protected bridgeController: BridgeController, protected attributeMap: Record<string, any>, protected endpointId: string, protected nodeLabel: string, protected productName: string, protected productLabel: string, protected serialNumber: string) {
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
        // const be: BridgeAttributeChangedEvent = {  
        //     endpointId: this.endpoint.id,
        //     clusterName: clusterName,
        //     attributeName: attributeName,
        //     data: attributeValue,
        // }
        const be: BridgeEvent = {
            type: BridgeEventType.AttributeChanged,
            data: {
                endpointId: this.endpoint.id,
                clusterName: clusterName,
                attributeName: attributeName,
                data: attributeValue,
            }
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

    protected endPointDefaults() {
        return {
            id: this.endpointId,
            bridgedDeviceBasicInformation: {
                nodeLabel: this.nodeLabel,
                productName: this.productName,
                productLabel: this.productLabel,
                serialNumber: this.serialNumber,
                reachable: true,
            }
        }
    }
    
    //note that these overrides assume openHAB will be sending the state back when changed as we will not set it here prematurely  
    //other wise we would want to call super.on() and so on (same for level control or any other cluster behavior)to set local state
    protected createOnOffServer(): typeof OnOffServer {
        const parent = this;
        return class extends OnOffServer {
            override async on() {
                await parent.sendBridgeEvent("onOff", "onOff", true);
            }
            override async off() {
                await parent.sendBridgeEvent("onOff", "onOff", false);
            }
        };
    }

    protected createLevelControlServer(): typeof LevelControlServer {
        const parent = this;
        return class extends LevelControlServer {
            override async moveToLevelLogic(level: number, transitionTime: number | null, withOnOff: boolean){
                await parent.sendBridgeEvent("levelControl", "currentLevel", level);
            }
        };
    }

}