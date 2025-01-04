package com.groupeisi.etudiants.repository;

import com.groupeisi.etudiants.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
