// Include this first to auto-register Crypto, Network and Time Node.js implementations
import { CommissioningController, MatterServer } from "@project-chip/matter.js";
import { NodeId } from "@matter/types";
import { PairedNode, CommissioningControllerNodeOptions } from "@project-chip/matter.js/device";
import { EndpointInterface } from "@project-chip/matter.js/endpoint";
import { Environment, Logger, StorageContext } from "@matter/general";
import { ControllerStore } from "@matter/node";

const logger = Logger.get("MatterNode");

/**
 * This class contains all the core Matter functionality uses by "Cluster", "Nodes", etc... 
 */
export class MatterNode {

    private storageContext?: StorageContext;

    #environment: Environment = Environment.default;

    commissioningController?: CommissioningController;
    private matterController?: MatterServer;

    constructor(
        private readonly storageLocation: string,
        private readonly controllerName: string,
        private readonly nodeNum: number,
        private readonly netInterface?: string
    ) { }

    get Store() {
        if (!this.storageContext) {
            throw new Error("Storage uninitialized");
        }
        return this.storageContext;
    }

    async close() {
        await this.matterController?.close();
    }

    async initialize() {
        const outputDir = this.storageLocation;
        const id = `${this.controllerName}-${this.nodeNum}`

        logger.info(`Storage location: ${outputDir} (Directory)`);
        this.#environment.vars.set('storage.path', outputDir)
        if (this.netInterface !== undefined) {
            this.#environment.vars.set("mdns.networkinterface", this.netInterface);
        }
        this.commissioningController = new CommissioningController({
            environment: {
                environment: this.#environment,
                id,
            },
            autoConnect: false,
        });
        await this.commissioningController.initializeControllerStore();

        const controllerStore = this.#environment.get(ControllerStore);

        this.storageContext = controllerStore.storage.createContext("Node");

        if (this.matterController !== undefined) {
            await this.matterController.start();
        } else if (this.commissioningController !== undefined) {
            await this.commissioningController.start();
        } else {
            throw new Error("No controller initialized");
        }
    }

    async getNode(nodeId: number | string | NodeId, connectOptions?: CommissioningControllerNodeOptions) {
        if (this.commissioningController === undefined) {
            throw new Error("CommissioningController not initialized");
        }
        logger.debug(`converting ${nodeId} to ${BigInt(nodeId)}`)
        const node = await this.commissioningController.connectNode(NodeId(BigInt(nodeId)), connectOptions)
        if (node === undefined) {
            throw new Error(`Node ${nodeId} not connected`);
        }
        return node;
    }

    async getCommissionedNodes() {
        return this.commissioningController?.getCommissionedNodes();
    }

    /**
     * Finds the given endpoint, included nested endpoints
     * @param node 
     * @param endpointId 
     * @returns 
     */
    getEndpoint(node: PairedNode, endpointId: number) {
        const endpoints = node.getDevices();
        for (const e of endpoints) {
            const endpoint = this.findEndpoint(e, endpointId);
            if (endpoint != undefined) {
                return endpoint;
            }
        }
        return undefined;
    }

    /**
     * 
     * @param root Endpoints can have child endpoints. This function recursively searches for the endpoint with the given id.
     * @param endpointId 
     * @returns 
     */
    private findEndpoint(root: EndpointInterface, endpointId: number): EndpointInterface | undefined {
        if (root.number === endpointId) {
            return root;
        }
        for (const endpoint of root.getChildEndpoints()) {
            const found = this.findEndpoint(endpoint, endpointId);
            if (found !== undefined) {
                return found;
            }
        }
        return undefined;
    }
}
