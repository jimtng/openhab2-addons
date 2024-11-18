import { Endpoint } from "@matter/node";
import { OccupancySensorDevice } from "@matter/node/devices/occupancy-sensor";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { GenericDeviceType } from './GenericDeviceType'; // Adjust the path as needed
import { BridgeController } from "../BridgeController";
import { Logger } from"@matter/general";

const logger = Logger.get("OccupancySensorDeviceType");

export class OccupancySensorDeviceType extends GenericDeviceType {
    
    override createEndpoint(clusterValues: Record<string, any>) {
        logger.info(`Creating Occupancy Sensor Device Endpoint ${JSON.stringify(clusterValues)}`);
        const endpoint = new Endpoint(OccupancySensorDevice.with(BridgedDeviceBasicInformationServer), {
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
            occupancySensing: {
                occupancy: {
                    occupied: false
                },
                occupancySensorType: 3
            }
        }
    }
}