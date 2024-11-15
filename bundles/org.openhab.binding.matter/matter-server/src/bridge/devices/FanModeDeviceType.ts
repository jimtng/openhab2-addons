import { Endpoint } from "@matter/node";
import { FanDevice } from "@matter/node/devices/fan";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { GenericDeviceType } from './GenericDeviceType'; // Adjust the path as needed
import { BridgeController } from "../BridgeController";
import { Logger } from "@matter/general";
import { FanControl } from "@matter/main/clusters";
//import { FanControl } from "#clusters/fan-control";

const logger = Logger.get("FanModeDeviceType");

export class FanModeDeviceType extends GenericDeviceType {

    override createEndpoint() {

        const endpoint = new Endpoint(FanDevice.with(BridgedDeviceBasicInformationServer), {
            id: this.endpointId,
            bridgedDeviceBasicInformation: {
                nodeLabel: this.nodeLabel,
                productName: this.productName,
                productLabel: this.productLabel,
                serialNumber: this.serialNumber,
                reachable: true,
            },
            fanControl: {
                fanMode: this.attributeMap.fanMode || FanControl.FanMode.Off,
                fanModeSequence: this.attributeMap.fanModeSequence || FanControl.FanModeSequence.OffHigh,
                percentCurrent: this.attributeMap.percentCurrent || 0,
                percentSetting: this.attributeMap.percentCurrent || 0,
            }
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
}