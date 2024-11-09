import { Endpoint } from "@matter/node";
import { DimmableLightDevice } from "@matter/node/devices/dimmable-light";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { GenericDevice } from './GenericDevice'; // Adjust the path as needed
import { BridgeController } from "../BridgeController";
import { Logger } from "@matter/general";

const logger = Logger.get("DimmableDevice");

export class DimmableDevice extends GenericDevice {

    
    override createEndpoint() {
        const endpoint = new Endpoint(DimmableLightDevice.with(BridgedDeviceBasicInformationServer), {
            id: this.endpointId,
            bridgedDeviceBasicInformation: {
                nodeLabel: this.nodeLabel,
                productName: this.productName,
                productLabel: this.productLabel,
                serialNumber: this.serialNumber,
                reachable: true,
            },
        });
        endpoint.events.onOff.onOff$Changed.on(value => {
            this.sendBridgeEvent("onOff","onOff", value);
        });
        endpoint.events.levelControl.currentLevel$Changed.on(value => {
            this.sendBridgeEvent("levelControl","currentLevel", value);
        });

        return endpoint;
        // if (attributeMap.onOff != undefined) {
        //     this.updateState("onOff", "onOff", attributeMap.onOff);
        // }
        // if (attributeMap.currentLevel != undefined) {
        //     this.updateState("levelControl", "currentLevel", attributeMap.currentLevel);
        // }
    }
}