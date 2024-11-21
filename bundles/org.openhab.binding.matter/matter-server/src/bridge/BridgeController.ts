import { Logger } from "@matter/general";
import { Controller } from "../Controller";
import { WebSocketSession } from "../app";
import { DeviceNode } from "./DeviceNode";

const logger = Logger.get("BridgeController");

export class BridgeController extends Controller {

    deviceNode!: DeviceNode
    uniqueId: string;
    constructor(override ws: WebSocketSession, override params: URLSearchParams) {
        super(ws, params);
        let storagePath = this.params.get('storagePath');

        if (storagePath === null) {
            throw new Error('No storagePath parameters in the request');
        }

        let resetStorage = this.params.get('resetStorage') === 'true' ? true : false;

        const deviceName = this.params.get('deviceName');
        const vendorName = this.params.get('vendorName');
        const passcode = this.params.get('passcode');
        const discriminator = this.params.get('discriminator');
        const vendorId = this.params.get('vendorId');
        const productName = this.params.get('productName');
        const productId = this.params.get('productId');
        const port = this.params.get('port');
        const uniqueId = this.params.get('uniqueId');

        if (deviceName === null || vendorName === null || passcode === null || discriminator === null || vendorId === null || productName === null || productId === null || port === null || uniqueId === null) {
            throw new Error('Missing parameters in the request');
        }

        this.deviceNode = new DeviceNode(this, storagePath, resetStorage, deviceName, vendorName, parseInt(passcode), parseInt(discriminator), parseInt(vendorId), productName, parseInt(productId), parseInt(port), uniqueId);
        this.uniqueId = uniqueId;
    }
    override id(): string {
        return "bridge-" + this.uniqueId;
    }

    async init() {
        await this.deviceNode.init();
    }

    executeCommand(namespace: string, functionName: string, args: any[]): any | Promise<any> {
        let baseObject: any = this.deviceNode

        logger.debug(`Executing function ${namespace}.${functionName}(${Logger.toJSON(args)})`);

        if (typeof baseObject[functionName] !== 'function') {
            throw new Error(`Function ${functionName} not found`);
        }

        return baseObject[functionName](...args);
    }

    async close() {
        return this.deviceNode.close();
    }
}