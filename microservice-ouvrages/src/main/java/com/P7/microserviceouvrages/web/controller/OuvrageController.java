package com.P7.microserviceouvrages.web.controller;

import com.P7.microserviceouvrages.dao.OuvrageDao;
import com.P7.microserviceouvrages.model.Ouvrage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OuvrageController {

    @Autowired
    private OuvrageDao ouvrageDao;

    @GetMapping(value = "/Ouvrages")
    public List<Ouvrage> listeDesOuvrages(){
        List<Ouvrage> ouvrages = ouvrageDao.findAll();
        return ouvrages;
    }

    @GetMapping(value = "/Ouvrages/{id}")
    public Optional<Ouvrage> recupererUnProduit(@PathVariable Long id) {

        Optional<Ouvrage> ouvrage = ouvrageDao.findById(id);

        return ouvrage;
    }

    @GetMapping(value = "/rechercher/{nom}")
    public List<Ouvrage> getOuvrageByNom(@PathVariable String nom) {

        List<Ouvrage> ouvrages = ouvrageDao.findOuvrageByNom(nom);

        return ouvrages;
    }

}
