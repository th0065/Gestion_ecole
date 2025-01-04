package com.groupeisi.matieres.controller;


import com.groupeisi.matieres.repository.MatiereRepository;
import com.groupeisi.matieres.service.MatiereService;
import generated.GetMatiereRequest;
import generated.GetMatiereResponse;
import generated.Matiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Optional;

@Endpoint
public class MatiereEndpoint {

    private static final String NAMESPACE_URI = "http://localhost:8082/api/matieres";
    private final MatiereRepository matiereRepository;



//     @Autowired
     public MatiereEndpoint( MatiereRepository matiereRepository){

         this.matiereRepository = matiereRepository;
     }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMatiereRequest")
    @ResponsePayload
    public GetMatiereResponse getMatiere(@RequestPayload GetMatiereRequest request) {
        GetMatiereResponse response = new GetMatiereResponse();
        Matiere matiere = matiereRepository.findMatiere(request.getId());


        response.setMatiere(matiere);
        return response;
    }
}

