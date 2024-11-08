import { Endpoint } from "@matter/node";
import { OnOffLightDevice } from "@matter/node/devices/on-off-light";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { GenericDevice } from './GenericDevice'; // Adjust the path as needed
import { BridgeController } from "../BridgeController";
import { Logger } from"@matter/general";

const logger = Logger.get("OnOff");

export class OnOffDevice extends GenericDevice {

    #endpoint: Endpoint<OnOffLightDevice>;
    
    constructor(bridgeController: BridgeController, attributeMap: { [key: string]: any }, endpointId: string, nodeLabel: string, productName: string, productLabel: string, serialNumber: string) {
        super(bridgeController, attributeMap);
        this.#endpoint = new Endpoint(OnOffLightDevice.with(BridgedDeviceBasicInformationServer), {
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
    }
    
    get endpoint() {
        return this.#endpoint;
    }
}