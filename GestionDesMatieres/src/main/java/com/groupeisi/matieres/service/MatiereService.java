package com.groupeisi.matieres.service;

import com.groupeisi.matieres.repository.MatiereRepository;
import generated.Matiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatiereService {

    @Autowired
    private MatiereRepository matiereRepository;

    public List<Matiere> getAllMatieres() {
        return matiereRepository.findAll();
    }

    public Optional<Matiere> updateMatiere(long id, Matiere updatedMatiere) {
        return matiereRepository.findById(id).map(existingMatiere -> {
            // Mettre à jour les champs de l'étudiant existant
            existingMatiere.setNom(updatedMatiere.getNom());
            existingMatiere.setClasseId(updatedMatiere.getClasseId());
            existingMatiere.setProfesseurId(updatedMatiere.getProfesseurId());
            existingMatiere.setDescription(updatedMatiere.getDescription());
            // Ajouter d'autres champs si nécessaire
            return matiereRepository.save(existingMatiere);
        });
    }


    public Matiere saveMatiere(Matiere matiere) {
        return matiereRepository.save(matiere);
    }

    public Optional<generated.Matiere> getMatiereById(long id) {

        return matiereRepository.findById(id);
    }



}
