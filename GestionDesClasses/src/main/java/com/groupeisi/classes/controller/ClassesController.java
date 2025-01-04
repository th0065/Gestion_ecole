package com.groupeisi.classes.controller;

import com.groupeisi.classes.entity.Classes;
import com.groupeisi.classes.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClassesController {

    @Autowired
    private ClassesService classesService;

    @QueryMapping
    public Classes getClasses(Long id) {
        return classesService.getClasses(id);
    }

    @QueryMapping
    public List<Classes> getAllClasses() {
        return classesService.getAllClasses();
    }
    @MutationMapping
    public Classes createClasse(String nom, List<Long> professeurIds, List<Long> etudiantIds, List<Long> matiereIds) {
        return classesService.createClasses(nom, professeurIds, etudiantIds, matiereIds);
    }

}
