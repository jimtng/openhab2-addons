import { Endpoint } from "@matter/node";
import { HumiditySensorDevice } from "@matter/node/devices/humidity-sensor";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { GenericDeviceType } from './GenericDeviceType'; // Adjust the path as needed
import { BridgeController } from "../BridgeController";
import { Logger } from"@matter/general";

const logger = Logger.get("HumiditySensorType");

export class HumiditySensorType extends GenericDeviceType {
    
    override createEndpoint() {
        const endpoint = new Endpoint(HumiditySensorDevice.with(BridgedDeviceBasicInformationServer), {
            id: this.endpointId,
            bridgedDeviceBasicInformation: {
                nodeLabel: this.nodeLabel,
                productName: this.productName,
                productLabel: this.productLabel,
                serialNumber: this.serialNumber,
                reachable: true,
            },
            relativeHumidityMeasurement: {
                measuredValue: this.attributeMap.measuredValue || 0,
            },
        });
        return endpoint
    }
}