"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const eureka_js_client_1 = require("eureka-js-client");
const client = new eureka_js_client_1.Eureka({
    instance: {
        app: 'gestions-des-profs',
        hostName: 'localhost',
        ipAddr: '127.0.0.1',
        port: {
            $: 3000,
            '@enabled': true,
        },
        dataCenterInfo: {
            '@class': 'com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo',
            name: 'MyOwn',
        },
        vipAddress: 'gestions-des-profs'
    },
    eureka: {
        host: '127.0.0.1',
        port: 8761,
        servicePath: '/eureka/apps/',
    },
});
client.start((error) => {
    if (error) {
        console.error('Erreur lors du démarrage du client Eureka :', error);
    }
    else {
        console.log('Client Eureka démarré avec succès.');
    }
});
exports.default = client;
//# sourceMappingURL=eureka-client.js.map