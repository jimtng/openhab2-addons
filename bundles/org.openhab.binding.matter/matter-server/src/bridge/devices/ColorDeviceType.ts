import { Endpoint } from "@matter/node";
import { ExtendedColorLightDevice } from "@matter/node/devices/extended-color-light";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { GenericDeviceType } from './GenericDeviceType'; // Adjust the path as needed
import { ColorControlServer, LevelControlServer, OnOffServer } from "@matter/main/behaviors";
import { ColorControl } from "@matter/main/clusters";

export class ColorDeviceType extends GenericDeviceType {

    override createEndpoint(clusterValues: Record<string, any>) {
        const endpoint = new Endpoint(ExtendedColorLightDevice.with(BridgedDeviceBasicInformationServer, this.createOnOffServer(), this.createLevelControlServer(),
            this.createColorControlServer().with(
                ColorControl.Feature.HueSaturation,
                ColorControl.Feature.ColorTemperature
            )), {
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
            colorControl: {
                currentHue: 0,
                currentSaturation: 0,
                coupleColorTempToLevelMinMireds: 0,
                startUpColorTemperatureMireds: 0
            }
        }
    }

    protected createColorControlServer(): typeof ColorControlServer {
        const parent = this;
        return class extends ColorControlServer {
            override async moveToHueLogic(targetHue: number, direction: ColorControl.Direction, transitionTime: number, isEnhancedHue = false) {
                await parent.sendBridgeEvent("colorControl", "currentHue", targetHue);
                return super.moveToHueLogic(targetHue, direction, transitionTime, isEnhancedHue);
            }

            override async moveToSaturationLogic(targetSaturation: number, transitionTime: number) {
                await parent.sendBridgeEvent("colorControl", "currentSaturation", targetSaturation);
                return super.moveToSaturationLogic(targetSaturation, transitionTime);
            }

            override async moveToColorTemperatureLogic(targetMireds: number, transitionTime: number) {
                await parent.sendBridgeEvent("colorControl", "colorTemperatureMireds", targetMireds);
                return super.moveToColorTemperatureLogic(targetMireds, transitionTime);
            }
        };
    }
}