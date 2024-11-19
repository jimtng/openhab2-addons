import { Endpoint } from "@matter/node";
import { ContactSensorDevice } from "@matter/node/devices/contact-sensor";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { GenericDeviceType } from './GenericDeviceType'; // Adjust the path as needed
import { BridgeController } from "../BridgeController";
import { Logger } from"@matter/general";

const logger = Logger.get("ContactSensorDeviceType");

export class ContactSensorDeviceType extends GenericDeviceType {
    
    override createEndpoint(clusterValues: Record<string, any>) {
        const defaults = {
            booleanState: {
                stateValue : false
            }
        }
        logger.info(`Creating Contact Sensor Device Endpoint ${JSON.stringify(clusterValues)}`);
        const endpoint = new Endpoint(ContactSensorDevice.with(BridgedDeviceBasicInformationServer), {
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
            booleanState: {
                stateValue: false
            }
        }
    }
}