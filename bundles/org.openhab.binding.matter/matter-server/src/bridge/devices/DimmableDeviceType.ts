import { Endpoint } from "@matter/node";
import { DimmableLightDevice } from "@matter/node/devices/dimmable-light";
import { GenericDeviceType } from './GenericDeviceType';

export class DimmableDeviceType extends GenericDeviceType {

    override createEndpoint(clusterValues: Record<string, any>) {
        const endpoint = new Endpoint(DimmableLightDevice.with(this.createOnOffServer(), this.createLevelControlServer(), ...this.defaultClusterServers()), {
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