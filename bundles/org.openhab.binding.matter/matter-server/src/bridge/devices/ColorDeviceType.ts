import { Endpoint } from "@matter/node";
import { ExtendedColorLightDevice } from "@matter/node/devices/extended-color-light";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { GenericDeviceType } from './GenericDeviceType'; // Adjust the path as needed
import { Logger } from "@matter/general";
import { ColorControlServer, LevelControlServer, OnOffServer } from "@matter/main/behaviors";
import { ColorControl } from "@matter/main/clusters";

const logger = Logger.get("ColorDeviceType");

export class ColorDeviceType extends GenericDeviceType {

    override createEndpoint(clusterValues: Record<string, any>) {
        const endpoint = new Endpoint(ExtendedColorLightDevice.with(BridgedDeviceBasicInformationServer,
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
            ...clusterValues
        });
        endpoint.events.onOff.onOff$Changed.on(value => {
            this.sendBridgeEvent("onOff", "onOff", value);
        });
        endpoint.events.levelControl.currentLevel$Changed.on(value => {
            this.sendBridgeEvent("levelControl", "currentLevel", value);
        });
        endpoint.events.colorControl.currentHue$Changed.on(value => {
            this.sendBridgeEvent("colorControl", "currentHue", value);
        });
        endpoint.events.colorControl.currentSaturation$Changed.on(value => {
            this.sendBridgeEvent("colorControl", "currentSaturation", value);
        });
        endpoint.events.colorControl.colorTemperatureMireds$Changing.on(value => {
            this.sendBridgeEvent("colorControl", "colorTemperatureMireds", value);
        });
        // endpoint.events.colorControl.currentX$Changed.on(value => {
        //     this.sendBridgeEvent("colorControl", "currentX", value);
        // });
        // endpoint.events.colorControl.currentY$Changed.on(value => {
        //     this.sendBridgeEvent("colorControl", "currentY", value);
        // });
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
            colorControl: {
                currentHue: 0,
                currentSaturation: 0,
                coupleColorTempToLevelMinMireds: 0,
                startUpColorTemperatureMireds: 0
            }
        }
    }
}