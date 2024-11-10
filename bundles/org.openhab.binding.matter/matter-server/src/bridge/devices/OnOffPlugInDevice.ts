import { Endpoint } from "@matter/node";
import { OnOffPlugInUnitDevice } from "@matter/node/devices/on-off-plug-in-unit";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { GenericDevice } from './GenericDevice'; // Adjust the path as needed
import { BridgeController } from "../BridgeController";
import { Logger } from"@matter/general";

const logger = Logger.get("OnOffPlugInDevice");

export class OnOffPlugInDevice extends GenericDevice {
    
    override createEndpoint() {
        const endpoint = new Endpoint(OnOffPlugInUnitDevice.with(BridgedDeviceBasicInformationServer), {
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
        return endpoint
    }
}