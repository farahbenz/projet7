package com.P7.microservicecompte.web.controller;

import com.P7.microservicecompte.dao.CompteUtilisateurDao;
import com.P7.microservicecompte.model.CompteUtilisateur;
import com.P7.microservicecompte.web.exception.CompteUtilisateurNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CompteUtilisateurController {

    @Autowired
    private CompteUtilisateurDao compteUtilisateurDao;


    // Recuperer l'id du compteUtilisateur
    @GetMapping(value = "/compteUtilisateur/{id}")
    public Optional<CompteUtilisateur> recupererUnUtilisateur(@PathVariable Long id){

        Optional<CompteUtilisateur> compteUtilisateur = compteUtilisateurDao.findById(id);

        if(!compteUtilisateur.isPresent()) throw new CompteUtilisateurNotFoundException("Cette commande n'existe pas");

        return compteUtilisateur;
    }

}
