import { Endpoint } from "@matter/node";
import { ThermostatDevice } from "@matter/node/devices/thermostat";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { ThermostatServer } from '@matter/node/behaviors/thermostat';
import { Thermostat } from '@matter/main/clusters';
import { GenericDevice } from './GenericDevice'; // Adjust the path as needed
import { BridgeController } from "../BridgeController";
import { Logger } from"@matter/general";

const logger = Logger.get("ThermoDevice");

export class ThermoDevice extends GenericDevice {

    // how do i define this without creating a new instance?
    #endpoint = new Endpoint(ThermostatDevice.with(BridgedDeviceBasicInformationServer, ThermostatServer.with(
        Thermostat.Feature.AutoMode,
        Thermostat.Feature.Heating,
        Thermostat.Feature.Cooling
    )), {
        thermostat: {}
    });
    
    constructor(bridgeController: BridgeController, attributeMap: { [key: string]: any }, endpointId: string, nodeLabel: string, productName: string, productLabel: string, serialNumber: string) {
        super(bridgeController, attributeMap);

        const features: Thermostat.Feature[] = [];
        if (attributeMap.occupiedHeatingSetpoint != undefined) {
            features.push(Thermostat.Feature.Heating);
        }
        if (attributeMap.occupiedCoolingSetpoint != undefined) {
            features.push(Thermostat.Feature.Cooling);
        }
        if (features.indexOf(Thermostat.Feature.Heating) != -1 && features.indexOf(Thermostat.Feature.Cooling) != -1) {
            features.push(Thermostat.Feature.AutoMode);
        }

        const defaultParams = {
            systemMode: 0,
            localTemperature: 0,
            controlSequenceOfOperation: 4,
            minHeatSetpointLimit: 0,
            maxHeatSetpointLimit: 3500,
            absMinHeatSetpointLimit: 0,
            absMaxHeatSetpointLimit: 3500,
            minCoolSetpointLimit: 0,
            absMinCoolSetpointLimit: 0,
            maxCoolSetpointLimit: 3500,
            absMaxCoolSetpointLimit: 3500,
            occupiedHeatingSetpoint: 0,
            occupiedCoolingSetpoint: 0,
            minSetpointDeadBand: 0
        }

        const finalMap = { ...defaultParams, ...attributeMap }
        
        logger.info(`ThermoDevice attributeMap: ${JSON.stringify(finalMap, null, 2)} features: ${features}`);
        
        this.#endpoint = new Endpoint(ThermostatDevice.with(BridgedDeviceBasicInformationServer, ThermostatServer.with(
            ...features
        )), {
            id: endpointId,
            bridgedDeviceBasicInformation: {
                nodeLabel: nodeLabel,
                productName: productName,
                productLabel: productLabel,
                serialNumber: serialNumber,
                reachable: true,
            },
            thermostat: {
                ...finalMap
            }

        });
        this.#endpoint.events.thermostat.localTemperature$Changed.on((value) => {
            logger.info(`localTemperature value changed to ${value}`);
            this.sendBridgeEvent('thermostat','localTemperature', value);
        });
        this.#endpoint.events.thermostat.outdoorTemperature$Changed?.on((value) => {
            logger.info(`outdoorTemperature value changed to ${value}`);
            this.sendBridgeEvent('thermostat','outdoorTemperature', value);
        });
        this.#endpoint.events.thermostat.occupiedHeatingSetpoint$Changed?.on((value) => {
            logger.info(`occupiedHeatingSetpoint value changed to ${value}`);
            this.sendBridgeEvent('thermostat','occupiedHeatingSetpoint', value);
        });
        this.#endpoint.events.thermostat.occupiedCoolingSetpoint$Changed?.on((value) => {
            logger.info(`occupiedCoolingSetpoint value changed to ${value}`);
            this.sendBridgeEvent('thermostat','occupiedCoolingSetpoint', value);
        });
        this.#endpoint.events.thermostat.systemMode$Changed.on((value) => {
            logger.info(`systemMode value changed to ${value}`);
            this.sendBridgeEvent('thermostat','systemMode', value);
        });
        this.#endpoint.events.thermostat.thermostatRunningMode$Changed?.on((value) => {
            logger.info(`thermostatRunningMode value changed to ${value}`);
            this.sendBridgeEvent('thermostat','thermostatRunningMode', value);
        });

    }

    get endpoint() {
        return this.#endpoint;
    }
}