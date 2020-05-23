package com.P7.microserviceuser.web.controller;

import com.P7.microserviceuser.dao.UtilisateurDao;
import com.P7.microserviceuser.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UtilisateurControleur {

    @Autowired
    private UtilisateurDao utilisateurDao;

    // Enregistrer un utilisateur
    @PostMapping(value = "/inscriptionUtilisateur")
    public ResponseEntity<Utilisateur> enregistrerUtilisateur(@RequestBody Utilisateur compteUtilisateur){

        Utilisateur nouveauUtilisateur = utilisateurDao.save(compteUtilisateur);

        return new ResponseEntity<Utilisateur>(compteUtilisateur, HttpStatus.CREATED);
    }

    // Recuperer l'id de l'utilisateur
    @GetMapping(value = "/utilisateur/{id}")
    public Optional<Utilisateur> recupererUnUtilisateur(@PathVariable Long id){

        Optional<Utilisateur> compteUtilisateur = utilisateurDao.findById(id);

        return compteUtilisateur;
    }
}
