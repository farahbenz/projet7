package com.P7.microserviceouvrages.web.controller;

import com.P7.microserviceouvrages.dao.OuvrageDao;
import com.P7.microserviceouvrages.model.Ouvrage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class OuvrageController {

    @Autowired
    private OuvrageDao ouvrageDao;

    // Affiche la liste de tous les ouvrages disponibles
    @GetMapping(value = "/Ouvrages")
    public List<Ouvrage> listeDesOuvrages(){

        List<Ouvrage> ouvrages = ouvrageDao.findAll();

        return ouvrages;

    }

    //Récuperer un ouvrage par son id
    @GetMapping( value = "/Ouvrages/{id}")
    public Optional<Ouvrage> recupererUnProduit(@PathVariable Long id) {

        Optional<Ouvrage> ouvrage = ouvrageDao.findById(id);

        return ouvrage;
    }
}
