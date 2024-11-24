import { Endpoint } from "@matter/node";
import { DimmableLightDevice } from "@matter/node/devices/dimmable-light";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { GenericDeviceType } from './GenericDeviceType';

export class DimmableDeviceType extends GenericDeviceType {

    override createEndpoint(clusterValues: Record<string, any>) {
        const endpoint = new Endpoint(DimmableLightDevice.with(BridgedDeviceBasicInformationServer, this.createOnOffServer(), this.createLevelControlServer()), {
            ...this.endPointDefaults(),
            ...clusterValues
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