import { Endpoint } from "@matter/node";
import { HumiditySensorDevice } from "@matter/node/devices/humidity-sensor";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { GenericDeviceType } from './GenericDeviceType';

export class HumiditySensorType extends GenericDeviceType {
    
    override createEndpoint(clusterValues: Record<string, any>) {
        const endpoint = new Endpoint(HumiditySensorDevice.with(BridgedDeviceBasicInformationServer), {
            ...this.endPointDefaults(),
            ...clusterValues
        });
        return endpoint
    }

    override defaultClusterValues() {
        return {
            relativeHumidityMeasurement: {
                measuredValue: 0
            }
        }
    }
}