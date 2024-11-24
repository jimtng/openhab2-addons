import { Endpoint } from "@matter/node";
import { DoorLockDevice } from "@matter/node/devices/door-lock";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { GenericDeviceType } from './GenericDeviceType'; // Adjust the path as needed
import { BridgeController } from "../BridgeController";
import { DoorLockServer } from "@matter/main/behaviors";
import { DoorLock } from "@matter/main/clusters";

export class DoorLockDeviceType extends GenericDeviceType {

    override createEndpoint(clusterValues: Record<string, any>) {
        const endpoint = new Endpoint(DoorLockDevice.with(BridgedDeviceBasicInformationServer, DoorLockServer.with(
            DoorLock.Feature.PinCredential
        )), {
            ...this.endPointDefaults(),
            ...clusterValues
        });
        endpoint.events.doorLock.lockState$Changed.on(value => {
            this.sendBridgeEvent("doorLock", "lockState", value);
        });

        return endpoint
    }

    override defaultClusterValues() {
        return {
            doorLock:  {
                lockState: 0,
                lockType: 0,
                actuatorEnabled: true,
                doorState: 1,
                maxPinCodeLength: 10,
                minPinCodeLength: 1,
                wrongCodeEntryLimit: 5,
                userCodeTemporaryDisableTime: 10
            }
        }
    }
}