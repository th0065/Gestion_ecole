package com.groupeisi.etudiants.controller;


import com.groupeisi.etudiants.entity.Etudiant;
import com.groupeisi.etudiants.service.EtudiantService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/etudiants")
public class EtudiantController {

    private final EtudiantService etudiantService;

    public EtudiantController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }


    @GetMapping
    public List<Etudiant> getAll() {
        return etudiantService.getAllEtudiants(); //findAll();
    }

    // Récupérer un étudiant par son ID
    @GetMapping("/{id}")
    public ResponseEntity<Etudiant> getById(@PathVariable long id) {
        return etudiantService.getEtudiantById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Mettre à jour un étudiant
    @PutMapping("/{id}")
    public ResponseEntity<Etudiant> update(@PathVariable long id, @RequestBody @Valid Etudiant etudiant) {
        return etudiantService.updateEtudiant(id, etudiant)
                .map(updatedEtudiant -> ResponseEntity.ok().body(updatedEtudiant))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Etudiant create(@RequestBody Etudiant etudiant) {

        return etudiantService.saveEtudiant(etudiant);
    }
}
