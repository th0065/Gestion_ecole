import { Eureka } from 'eureka-js-client';

// Exemple de configuration pour Eureka
const client = new Eureka({
  // Informations de l'instance d'application
  instance: {
    app: 'gestions-des-profs',
    hostName: 'localhost',
    ipAddr: '127.0.0.1',
    port: {
      $: 3000,
      '@enabled': true, // Requis par Eureka pour activer le port
    },
    dataCenterInfo: {
      '@class': 'com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo',
      name: 'MyOwn',
    },
    vipAddress: 'gestions-des-profs'
  },
  eureka: {
    // Hôte / port du serveur Eureka
    host: '127.0.0.1',
    port: 8761,
    servicePath: '/eureka/apps/',
  },
});


  // Démarrage du client Eureka
client.start((error: Error) => {
  if (error) {
    console.error('Erreur lors du démarrage du client Eureka :', error);
  } else {
    console.log('Client Eureka démarré avec succès.');
  }
});
    

export default client;
