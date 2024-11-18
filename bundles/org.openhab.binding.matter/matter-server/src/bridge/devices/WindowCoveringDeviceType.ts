import { Endpoint } from "@matter/node";
import { WindowCoveringDevice } from "@matter/node/devices/window-covering";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { WindowCoveringServer } from '@matter/node/behaviors/window-covering';
import { WindowCovering } from '@matter/main/clusters';
import { GenericDeviceType } from './GenericDeviceType'; 
import { BridgeController } from "../BridgeController";
import { Logger } from"@matter/general";

const logger = Logger.get("WindowCoveringDeviceType");

export class WindowCoveringDeviceType extends GenericDeviceType {
    
    override createEndpoint(clusterValues: Record<string, any>) {
        const features: WindowCovering.Feature[] = [];
        features.push(WindowCovering.Feature.Lift);
        features.push(WindowCovering.Feature.PositionAwareLift);
        
        const endpoint = new Endpoint(WindowCoveringDevice.with(BridgedDeviceBasicInformationServer, WindowCoveringServer.with(
           ...features
        )), {
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

        endpoint.events.windowCovering.currentPositionLift$Changed?.on(value => {
            this.sendBridgeEvent("windowCovering","currentPositionLift", value);
        });

        endpoint.events.windowCovering.targetPositionLiftPercent100ths$Changing.on(value => {
            logger.info("targetPositionLiftPercent100ths changing", JSON.stringify(value, null, 2));
        });

        endpoint.events.windowCovering.targetPositionLiftPercent100ths$Changed.on(value => {
            this.sendBridgeEvent("windowCovering","targetPositionLiftPercent100ths", value);
        });

        endpoint.events.windowCovering.operationalStatus$Changed.on(value => {
            this.sendBridgeEvent("windowCovering","operationalStatus", value);
        });
        return endpoint
    }

    override defaultClusterValues() {
        return {
            windowCovering: {
                currentPositionLiftPercent100ths: 0
            }
        }
    }
}