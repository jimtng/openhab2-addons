import { Endpoint } from "@matter/node";
import { BridgeController } from "../BridgeController";
import { Request, MessageType, EventType, BridgeEvent } from '../../MessageTypes';
import { Logger } from "@matter/main";

const logger = Logger.get("GenericDevice");

export abstract class GenericDevice {
    
    protected updateLocks = new Set<string>();

    constructor(protected bridgeController : BridgeController, protected attributeMap: { [key: string]: any }) {
    }
    
    abstract get endpoint(): Endpoint;

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
        console.log(`Sending event: ${eventName} with data: ${data}`);
        this.bridgeController.ws.sendEvent(eventName, data)
    }
}