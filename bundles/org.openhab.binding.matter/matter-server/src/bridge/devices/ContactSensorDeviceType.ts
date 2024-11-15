import { Endpoint } from "@matter/node";
import { ContactSensorDevice } from "@matter/node/devices/contact-sensor";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { GenericDeviceType } from './GenericDeviceType'; // Adjust the path as needed
import { BridgeController } from "../BridgeController";
import { Logger } from"@matter/general";

const logger = Logger.get("ContactSensorDeviceType");

export class ContactSensorDeviceType extends GenericDeviceType {
    
    override createEndpoint() {
        logger.info(`Creating Occupancy Sensor Device Endpoint ${JSON.stringify(this.attributeMap)}`);
        const endpoint = new Endpoint(ContactSensorDevice.with(BridgedDeviceBasicInformationServer), {
            id: this.endpointId,
            bridgedDeviceBasicInformation: {
                nodeLabel: this.nodeLabel,
                productName: this.productName,
                productLabel: this.productLabel,
                serialNumber: this.serialNumber,
                reachable: true,
            },
            booleanState: {
                stateValue : this.attributeMap.stateValue || false
            }
        });
        return endpoint
    }
}