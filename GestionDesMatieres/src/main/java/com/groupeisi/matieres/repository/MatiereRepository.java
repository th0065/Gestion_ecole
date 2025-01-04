package com.groupeisi.matieres.repository;


import generated.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface MatiereRepository extends JpaRepository<Matiere, Long> {
   Matiere findMatiere(long id);
}



