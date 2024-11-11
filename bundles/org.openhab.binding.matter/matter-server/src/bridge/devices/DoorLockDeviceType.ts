import { Endpoint } from "@matter/node";
import { DoorLockDevice } from "@matter/node/devices/door-lock";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { GenericDeviceType } from './GenericDeviceType'; // Adjust the path as needed
import { BridgeController } from "../BridgeController";
import { Logger } from "@matter/general";

const logger = Logger.get("DoorLockDeviceType");

export class DoorLockDeviceType extends GenericDeviceType {

    override createEndpoint() {

        const defaultParams = {
            lockState: 0,
            lockType: 0,
            actuatorEnabled: true,
            doorState: 1
        }
        const finalMap = { ...defaultParams, ...this.attributeMap }

        const endpoint = new Endpoint(DoorLockDevice.with(BridgedDeviceBasicInformationServer), {
            id: this.endpointId,
            bridgedDeviceBasicInformation: {
                nodeLabel: this.nodeLabel,
                productName: this.productName,
                productLabel: this.productLabel,
                serialNumber: this.serialNumber,
                reachable: true,
            },
            doorLock: {
               ...finalMap
            },
        });
        endpoint.events.doorLock.lockState$Changed.on(value => {
            this.sendBridgeEvent("doorLock", "lockState", value);
        });

        return endpoint
    }
}