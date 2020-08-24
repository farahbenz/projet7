package com.p7.microserviceemprunt.web.controller;

import com.p7.microserviceemprunt.dao.EmpruntDao;
import com.p7.microserviceemprunt.model.Emprunt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmpruntController {

    @Autowired
    private EmpruntDao empruntDao;


    // Recuperer les emprunts
    @GetMapping(value = "/emprunt/{id}")
    public Optional<Emprunt> recupererUnEmprunt(@PathVariable Long id){

        Optional<Emprunt> emprunt = empruntDao.findById(id);

        return emprunt;
    }

    // Affiche la liste de tous les ouvrages disponibles
    @GetMapping(value = "/Ouvrages")
    public List<Emprunt> listeDesOuvrages(){

        List<Emprunt> emprunts = empruntDao.findAll();

        return emprunts;

    }



    }
