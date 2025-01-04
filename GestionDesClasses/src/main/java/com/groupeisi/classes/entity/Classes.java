package com.groupeisi.classes.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Classes {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column
        private String nom;



        @ElementCollection
        private List<Long> professeurIds;

        @ElementCollection
        private List<Long> etudiantIds;

        @ElementCollection
        private List<Long> matiereIds;

        // Getters and Setters

        public String getNom() {
                return nom;
        }

        public Long getId() {
                return id;
        }

        public List<Long> getProfesseurIds() {
                return professeurIds;
        }

        public List<Long> getEtudiantIds() {
                return etudiantIds;
        }

        public List<Long> getMatiereIds() {
                return matiereIds;
        }


        public void setNom(String nom) {
                this.nom = nom;
        }

        public void setProfesseurIds(List<Long> professeurIds) {
                this.professeurIds = professeurIds;
        }

        public void setEtudiantIds(List<Long> etudiantIds) {
                this.etudiantIds = etudiantIds;
        }

        public void setMatiereIds(List<Long> matiereIds) {
                this.matiereIds = matiereIds;
        }




    }


