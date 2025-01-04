package com.groupeisi.etudiants.service;

import aj.org.objectweb.asm.commons.Remapper;
import com.groupeisi.etudiants.entity.Etudiant;
import com.groupeisi.etudiants.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    public Optional<Etudiant> updateEtudiant(long id, Etudiant updatedEtudiant) {
        return etudiantRepository.findById(id).map(existingEtudiant -> {
            // Mettre à jour les champs de l'étudiant existant
            existingEtudiant.setNom(updatedEtudiant.getNom());
            existingEtudiant.setPrenom(updatedEtudiant.getPrenom());
            existingEtudiant.setEmail(updatedEtudiant.getEmail());
            existingEtudiant.setClasseId(updatedEtudiant.getClasseId());
            existingEtudiant.setMatiereIds(updatedEtudiant.getMatiereIds());
            // Ajouter d'autres champs si nécessaire
            return etudiantRepository.save(existingEtudiant);
        });
    }


    public Etudiant saveEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    public Optional<Etudiant> getEtudiantById(long id) {
        return etudiantRepository.findById(id);
    }
}
