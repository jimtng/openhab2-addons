import { Endpoint } from "@matter/node";
import { ThermostatDevice } from "@matter/node/devices/thermostat";
import { BridgedDeviceBasicInformationServer } from "@matter/node/behaviors/bridged-device-basic-information";
import { ThermostatServer } from '@matter/node/behaviors/thermostat';
import { Thermostat } from '@matter/main/clusters';
import { GenericDeviceType } from './GenericDeviceType'; // Adjust the path as needed
import { BridgeController } from "../BridgeController";
import { Logger } from"@matter/general";

const logger = Logger.get("ThermostatDeviceType");

export class ThermostatDeviceType extends GenericDeviceType {

    override createEndpoint() {
        let controlSequenceOfOperation = -1;
        const features: Thermostat.Feature[] = [];
        if (this.attributeMap.occupiedHeatingSetpoint != undefined) {
            features.push(Thermostat.Feature.Heating);
            controlSequenceOfOperation = 2;
        }
        if (this.attributeMap.occupiedCoolingSetpoint != undefined) {
            features.push(Thermostat.Feature.Cooling);
            controlSequenceOfOperation = 0;
        }
        if (features.indexOf(Thermostat.Feature.Heating) != -1 && features.indexOf(Thermostat.Feature.Cooling) != -1) {
            features.push(Thermostat.Feature.AutoMode);
            controlSequenceOfOperation = 4;
        }

        if (controlSequenceOfOperation < 0) {
            throw new Error("At least heating, cooling or both must be added")
        }

        this.attributeMap.controlSequenceOfOperation = controlSequenceOfOperation;

        const defaultParams = {
            systemMode: 0,
            localTemperature: 0,
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

        const finalMap = { ...defaultParams, ...this.attributeMap }
        
        logger.debug(`ThermoDevice attributeMap: ${JSON.stringify(finalMap, null, 2)} features: ${features}`);
        
        const endpoint = new Endpoint(ThermostatDevice.with(BridgedDeviceBasicInformationServer, ThermostatServer.with(
            ...features
        )), {
            id: this.endpointId,
            bridgedDeviceBasicInformation: {
                nodeLabel: this.nodeLabel,
                productName: this.productName,
                productLabel: this.productLabel,
                serialNumber: this.serialNumber,
                reachable: true,
            },
            thermostat: {
                ...finalMap
            }

        });
        endpoint.events.thermostat.localTemperature$Changed.on((value) => {
            this.sendBridgeEvent('thermostat','localTemperature', value);
        });
        endpoint.events.thermostat.outdoorTemperature$Changed?.on((value) => {
            this.sendBridgeEvent('thermostat','outdoorTemperature', value);
        });
        endpoint.events.thermostat.occupiedHeatingSetpoint$Changed?.on((value) => {
            this.sendBridgeEvent('thermostat','occupiedHeatingSetpoint', value);
        });
        endpoint.events.thermostat.occupiedCoolingSetpoint$Changed?.on((value) => {
            this.sendBridgeEvent('thermostat','occupiedCoolingSetpoint', value);
        });
        endpoint.events.thermostat.systemMode$Changed.on((value) => {
            this.sendBridgeEvent('thermostat','systemMode', value);
        });
        endpoint.events.thermostat.thermostatRunningMode$Changed?.on((value) => {
            this.sendBridgeEvent('thermostat','thermostatRunningMode', value);
        });
        return endpoint;
    }
}