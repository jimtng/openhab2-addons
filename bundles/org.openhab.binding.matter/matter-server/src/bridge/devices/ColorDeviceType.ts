import { Endpoint } from "@matter/node";
import { ColorDimmerSwitchDevice } from "@matter/node/devices/color-dimmer-switch";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { GenericDeviceType } from './GenericDeviceType'; // Adjust the path as needed
import { Logger } from "@matter/general";
import { ColorControlServer, LevelControlServer, OnOffServer } from "@matter/main/behaviors";
import { ColorControl } from "@matter/main/clusters";

const logger = Logger.get("ColorDeviceType");

export class ColorDeviceType extends GenericDeviceType {

    override createEndpoint() {
        const endpoint = new Endpoint(ColorDimmerSwitchDevice.with(BridgedDeviceBasicInformationServer,
            ColorControlServer.with(
            ColorControl.Feature.ColorTemperature,
            ColorControl.Feature.HueSaturation
        ), LevelControlServer, OnOffServer), {
            id: this.endpointId,
            bridgedDeviceBasicInformation: {
                nodeLabel: this.nodeLabel,
                productName: this.productName,
                productLabel: this.productLabel,
                serialNumber: this.serialNumber,
                reachable: true,
            },
            levelControl: {
                currentLevel: this.attributeMap.currentLevel || 0,
            },
            onOff: {
                onOff: this.attributeMap.onOff || false,
            },
            colorControl: {
                currentHue: this.attributeMap.currentHue || 0,
                currentSaturation: this.attributeMap.currentSaturation || 0,
                coupleColorTempToLevelMinMireds: 0,
                startUpColorTemperatureMireds: 0
            }
        });
        endpoint.events.onOff.onOff$Changed.on(value => {
            this.sendBridgeEvent("onOff","onOff", value);
        });
        endpoint.events.levelControl.currentLevel$Changed.on(value => {
            this.sendBridgeEvent("levelControl","currentLevel", value);
        });
        endpoint.events.colorControl.currentHue$Changed.on(value => {
            this.sendBridgeEvent("colorControl","currentHue", value);
        });
        endpoint.events.colorControl.currentSaturation$Changed.on(value => {
            this.sendBridgeEvent("colorControl","currentHue", value);
        });

        return endpoint;
    }
}