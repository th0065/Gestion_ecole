package com.groupeisi.classes.service;
import com.groupeisi.classes.entity.Classes;
import com.groupeisi.classes.repository.ClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesService {
    @Autowired
    private ClassesRepository classesRepository;

    public Classes getClasses(Long id) {
        return classesRepository.findById(id).orElse(null);
    }

    public List<Classes> getAllClasses() {
        return classesRepository.findAll();
    }
    public Classes createClasses(String nom, List<Long> professeurIds, List<Long> etudiantIds, List<Long> matiereIds) {
        Classes classes = new Classes();
        classes.setNom(nom);
        classes.setProfesseurIds(professeurIds);
        classes.setEtudiantIds(etudiantIds);
        classes.setMatiereIds(matiereIds);
        return classesRepository.save(classes);
    }

}
