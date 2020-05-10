package com.P7.microservicecompte.web.controller;

import com.P7.microservicecompte.dao.CompteUtilisateurDao;
import com.P7.microservicecompte.model.CompteUtilisateur;
import com.P7.microservicecompte.web.exception.CompteUtilisateurNotFoundException;
import com.P7.microservicecompte.web.exception.ImpossibleAjouterCompteUtilisateurException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CompteUtilisateurController {

    @Autowired
    private CompteUtilisateurDao compteUtilisateurDao;

    // Enregistrer un compteUtilisateur
    @PostMapping(value = "/compteUtilisateur")
    public ResponseEntity<CompteUtilisateur> enregistrerUtilisateur(@RequestBody CompteUtilisateur compteUtilisateur){

        CompteUtilisateur nouveauUtilisateur = compteUtilisateurDao.save(compteUtilisateur);

        if(nouveauUtilisateur == null) throw new ImpossibleAjouterCompteUtilisateurException("Impossible d'enregistrer un utilisateur");

        return new ResponseEntity<CompteUtilisateur>(compteUtilisateur, HttpStatus.CREATED);
    }

    // Recuperer l'id du compteUtilisateur
    @GetMapping(value = "/emprunt/{id}")
    public Optional<CompteUtilisateur> recupererUnUtilisateur(@PathVariable Long id){

        Optional<CompteUtilisateur> compteUtilisateur = compteUtilisateurDao.findById(id);

        if(!compteUtilisateur.isPresent()) throw new CompteUtilisateurNotFoundException("Cette commande n'existe pas");

        return compteUtilisateur;
    }

}
