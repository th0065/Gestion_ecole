package com.groupeisi.matieres.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Matiere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToMany(fetch = FetchType.LAZY)
//    private List<Etudiant> etudiants ;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private Long classeId;

    @Column(nullable = false)
    private Long professeurId;

    @Column(nullable = true)
    private String description;



    // Getters et Setters
}
