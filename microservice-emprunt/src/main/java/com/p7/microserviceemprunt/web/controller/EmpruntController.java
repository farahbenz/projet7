package com.p7.microserviceemprunt.web.controller;

import com.p7.microserviceemprunt.dao.EmpruntDao;
import com.p7.microserviceemprunt.model.Emprunt;
import com.p7.microserviceemprunt.web.exception.EmpruntNotFoundException;
import com.p7.microserviceemprunt.web.exception.ImpossibleAjouterEmpruntException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmpruntController {

    @Autowired
    private EmpruntDao empruntDao;

    // Enregistrer un emprunt
    @PostMapping(value = "/emprunt")
    public ResponseEntity<Emprunt> enregistrerEmprunt(@RequestBody Emprunt emprunt){

        Emprunt nouveauEmprunt = empruntDao.save(emprunt);

        if(nouveauEmprunt == null) throw new ImpossibleAjouterEmpruntException("Impossible d'emprunter");

        return new ResponseEntity<Emprunt>(emprunt, HttpStatus.CREATED);
    }

    // Recuperer l'id de l'emprunt
    @GetMapping(value = "/emprunt/{id}")
    public Optional<Emprunt> recupererUnEmprunt(@PathVariable Long id){

        Optional<Emprunt> emprunt = empruntDao.findById(id);

        if(!emprunt.isPresent()) throw new EmpruntNotFoundException("Cette commande n'existe pas");

        return emprunt;
    }


    }
