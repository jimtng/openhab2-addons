import { Endpoint } from "@matter/node";
import { FanDevice } from "@matter/node/devices/fan";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { GenericDeviceType } from './GenericDeviceType';
import { FanControl } from "@matter/main/clusters";


export class FanModeDeviceType extends GenericDeviceType {

    override createEndpoint(clusterValues: Record<string, any>) {

        const endpoint = new Endpoint(FanDevice.with(BridgedDeviceBasicInformationServer), {
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
        endpoint.events.fanControl.fanMode$Changed.on(value => {
            this.sendBridgeEvent("fan", "fanMode", value);
        });

        endpoint.events.fanControl.fanModeSequence$Changed.on(value => {
            this.sendBridgeEvent("fan", "fanModeSequence", value);
        });

        endpoint.events.fanControl.percentSetting$Changed.on(value => {
            this.sendBridgeEvent("fan", "percentSetting", value);
        });

        return endpoint
    }

    override defaultClusterValues() {
        return {
            fanControl: {
                fanMode: FanControl.FanMode.Off,
                fanModeSequence: FanControl.FanModeSequence.OffHigh,
                percentCurrent: 0,
                percentSetting: 0
            }
        }
    }
}