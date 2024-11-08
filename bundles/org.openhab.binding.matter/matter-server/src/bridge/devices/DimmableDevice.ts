import { Endpoint } from "@matter/node";
import { DimmableLightDevice } from "@matter/node/devices/dimmable-light";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { GenericDevice } from './GenericDevice'; // Adjust the path as needed
import { BridgeController } from "../BridgeController";
import { Logger } from "@matter/general";

const logger = Logger.get("DimmableDevice");

export class DimmableDevice extends GenericDevice {

    #endpoint: Endpoint<DimmableLightDevice>;
    
    constructor(bridgeController: BridgeController, attributeMap: { [key: string]: any }, endpointId: string, nodeLabel: string, productName: string, productLabel: string, serialNumber: string) {
        super(bridgeController, attributeMap);
        this.#endpoint = new Endpoint(DimmableLightDevice.with(BridgedDeviceBasicInformationServer), {
            id: endpointId,
            bridgedDeviceBasicInformation: {
                nodeLabel: nodeLabel,
                productName: productName,
                productLabel: productLabel,
                serialNumber: serialNumber,
                reachable: true,
            },
        });
        this.#endpoint.events.onOff.onOff$Changed.on(value => {
            logger.info(`onOff value changed to ${value}`);
            this.sendBridgeEvent("onOff","onOff", value);
        });
        this.#endpoint.events.levelControl.currentLevel$Changed.on(value => {
            logger.info(`levelControl value changed to ${value}`);
            this.sendBridgeEvent("levelControl","currentLevel", value);
        });
    }
    
    get endpoint() {
        return this.#endpoint;
    }
}