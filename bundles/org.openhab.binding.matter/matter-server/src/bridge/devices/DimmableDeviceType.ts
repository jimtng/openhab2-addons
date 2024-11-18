import { Endpoint } from "@matter/node";
import { DimmableLightDevice } from "@matter/node/devices/dimmable-light";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { GenericDeviceType } from './GenericDeviceType'; // Adjust the path as needed
import { Logger } from "@matter/general";

const logger = Logger.get("DimmableDeviceType");

export class DimmableDeviceType extends GenericDeviceType {

    override createEndpoint(clusterValues: Record<string, any>) {
        const endpoint = new Endpoint(DimmableLightDevice.with(BridgedDeviceBasicInformationServer), {
            id: this.endpointId,
            bridgedDeviceBasicInformation: {
                nodeLabel: this.nodeLabel,
                productName: this.productName,
                productLabel: this.productLabel,
                serialNumber: this.serialNumber,
                reachable: true,
            },
            ...clusterValues
        });
        endpoint.events.onOff.onOff$Changed.on(value => {
            this.sendBridgeEvent("onOff","onOff", value);
        });
        endpoint.events.onOff.onOff$Changing.on(value => {
            logger.info("onOff$Changing", value)
        });
        endpoint.events.levelControl.currentLevel$Changed.on(value => {
            this.sendBridgeEvent("levelControl","currentLevel", value);
        });

        return endpoint;
    }

    override defaultClusterValues() {
        return {
            levelControl: {
                currentLevel: 0
            },
            onOff: {
                onOff: false
            },
        }
    }
}