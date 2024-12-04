import { Endpoint } from "@matter/node";
import { OnOffPlugInUnitDevice } from "@matter/node/devices/on-off-plug-in-unit";
import { GenericDeviceType } from './GenericDeviceType';
import { OnOff } from "@matter/main/clusters";

export class OnOffPlugInDeviceType extends GenericDeviceType {

    override createEndpoint(clusterValues: Record<string, any>) {
        const endpoint = new Endpoint(OnOffPlugInUnitDevice.with(
            ...this.defaultClusterServers(),
            this.createOnOffServer().with(OnOff.Feature.Lighting)), {
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