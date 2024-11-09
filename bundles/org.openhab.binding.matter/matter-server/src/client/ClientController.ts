import { NodeStateInformation } from "@project-chip/matter.js/device";
import { Logger } from"@project-chip/matter.js/log";
import { MatterNode } from "./MatterNode";
import { Nodes } from "./namespaces/Nodes";
import { Clusters } from "./namespaces/Clusters";
import { WebSocketSession } from "../app";
import { Request, MessageType, EventType } from '../MessageTypes';
import { Controller } from "../Controller";
import { convertJsonFile } from "../util/storageConverter"

const logger = Logger.get("ClientController");

/**
 * This class exists to expose the "nodes" and "clusters" namespaces to websocket clients
 */
export class ClientController extends Controller {
    
    nodes?: Nodes;
    clusters?: Clusters;
    theNode: MatterNode;
    
    constructor(override ws: WebSocketSession, override params: URLSearchParams) {
        super(ws, params);
        const stringId = this.params.get('nodeId');
        const nodeId = stringId != null ? parseInt(stringId) : null;
        let storagePath = this.params.get('storagePath');
        let controllerName = this.params.get('controllerName');

        if (nodeId === null || storagePath === null) {
            throw new Error('No nodeId or storagePath parameters in the request');
        }

        //migrate legacy json files
        if (controllerName === null) {
            const { outputDir, name } = convertJsonFile(storagePath, nodeId);
            storagePath = outputDir;
            controllerName = name;
        }
        this.theNode = new MatterNode(storagePath, controllerName, nodeId);
    }

    async init() {
        await this.theNode.initialize();
        logger.info(`Started Node`);
       
        //set up listeners to send events back to the client
        this.nodes = new Nodes(this.theNode, {
            autoSubscribe: true,
            attributeChangedCallback: (peerNodeId, data) => {
                logger.debug(`attributeChangedCallback ${peerNodeId} ${Logger.toJSON(data)}`);
                data.path.nodeId = peerNodeId;
                this.ws.sendEvent(EventType.AttributeChanged, data)
            },
            eventTriggeredCallback: (peerNodeId, data) => {
                logger.debug(`eventTriggeredCallback ${peerNodeId} ${Logger.toJSON(data)}`);
                data.path.nodeId = peerNodeId;
                this.ws.sendEvent(EventType.EventTriggered, data)
            },
            stateInformationCallback: (peerNodeId, info) => {
                logger.debug(`stateInformationCallback ${peerNodeId} ${Logger.toJSON(info)}`);
                const data: any = {
                    nodeId: peerNodeId,
                    state: NodeStateInformation[info]
                };
                this.ws.sendEvent(EventType.NodeStateInformation, data)
            }
        });
        this.clusters = new Clusters(this.theNode);
    }

    async close() {
        return this.theNode?.close();
    }

     executeCommand(namespace: string, functionName: string, args: any[]): any | Promise<any> {
        const controllerAny: any = this;
        let baseObject: any;
    
        logger.debug(`Executing function ${namespace}.${functionName}(${Logger.toJSON(args)})`);
       
        if (typeof controllerAny[namespace] !== 'object') {
            throw new Error(`Namespace ${namespace} not found`);
        }
         
        baseObject = controllerAny[namespace];
        if (typeof baseObject[functionName] !== 'function') {
            throw new Error(`Function ${functionName} not found`);
        }
         
        return baseObject[functionName](...args);
     }
}