import { Endpoint } from "@matter/node";
import { OnOffLightDevice } from "@matter/node/devices/on-off-light";
import { GenericDeviceType } from './GenericDeviceType';
import { OnOff } from "@matter/main/clusters";

export class OnOffDeviceType extends GenericDeviceType {

    override createEndpoint(clusterValues: Record<string, any>) {
        const endpoint = new Endpoint(OnOffLightDevice.with(
            ...this.defaultClusterServers(), this.createOnOffServer().with(OnOff.Feature.Lighting)), {
            ...this.endPointDefaults(),
            ...clusterValues
        });
        return endpoint
    }

    override defaultClusterValues() {
        return {
            onOff: {
                onOff: false
            }
        }
    }
}