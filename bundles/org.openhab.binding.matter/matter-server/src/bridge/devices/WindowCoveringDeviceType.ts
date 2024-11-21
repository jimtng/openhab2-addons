import { Endpoint } from "@matter/node";
import { WindowCoveringDevice } from "@matter/node/devices/window-covering";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { MovementDirection, MovementType, WindowCoveringServer } from '@matter/node/behaviors/window-covering';
import { WindowCovering } from '@matter/main/clusters';
import { GenericDeviceType } from './GenericDeviceType';
import { BridgeController } from "../BridgeController";
import { Logger } from "@matter/general";

const logger = Logger.get("WindowCoveringDeviceType");

export class WindowCoveringDeviceType extends GenericDeviceType {

    override createEndpoint(clusterValues: Record<string, any>) {
        const features: WindowCovering.Feature[] = [];
        features.push(WindowCovering.Feature.Lift);
        features.push(WindowCovering.Feature.PositionAwareLift);

        const endpoint = new Endpoint(WindowCoveringDevice.with(BridgedDeviceBasicInformationServer, this.createWindowCoveringServer().with(
            ...features,
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
        endpoint.events.windowCovering.currentPositionLiftPercent100ths$Changed.on(value => {
            logger.debug("currentPositionLiftPercent100ths changed", value);
        });
        endpoint.events.windowCovering.operationalStatus$Changed.on(value => {
            this.sendBridgeEvent("windowCovering", "operationalStatus", value);
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

    //this allows us to get all commands to move the device, not just if it thinks the position has changed
    private createWindowCoveringServer(): typeof WindowCoveringServer {
        const parent = this;
        return class extends WindowCoveringServer {
            override async handleMovement(type: MovementType, reversed: boolean, direction: MovementDirection, targetPercent100ths?: number): Promise<void> {
                logger.debug(`handleMovement: type ${type}, reversed ${reversed}, direction ${direction}, position ${targetPercent100ths}`);
                super.handleMovement(type, reversed, direction, targetPercent100ths);
                if (targetPercent100ths != null) {
                    parent.sendBridgeEvent("windowCovering", "targetPositionLiftPercent100ths", targetPercent100ths);
                }
            }
        };
    }
}