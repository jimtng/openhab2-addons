import { Endpoint } from "@matter/node";
import { TemperatureSensorDevice } from "@matter/node/devices/temperature-sensor";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { GenericDeviceType } from './GenericDeviceType'; // Adjust the path as needed
import { BridgeController } from "../BridgeController";
import { Logger } from"@matter/general";

const logger = Logger.get("TemperatureSensorType");

export class TemperatureSensorType extends GenericDeviceType {
    
    override createEndpoint(clusterValues: Record<string, any>) {
        const endpoint = new Endpoint(TemperatureSensorDevice.with(BridgedDeviceBasicInformationServer), {
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
        return endpoint
    }
    override defaultClusterValues() {
        return {
            temperatureMeasurement: {
                measuredValue:  0
            }
        }
    }
}