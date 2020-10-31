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

    @GetMapping(value = "/emprunt/{id}")
    public Optional<Emprunt> recupererUnEmprunt(@PathVariable Long id){
        Optional<Emprunt> emprunt = empruntDao.findById(id);
        return emprunt;
    }

    @PostMapping(value = "/save")
    public Emprunt saveEmprunt(@RequestBody Emprunt emprunt) {
        Emprunt emprunt1 = empruntDao.save(emprunt);
        return emprunt1;
    }


    @GetMapping(value = "/ListEmpruntsUserId/{userId}")
    public List<Emprunt> listeDesEmprunts(@PathVariable Long userId){
        List<Emprunt> emprunts = empruntDao.findByUserId(userId);
        return emprunts;
    }




    }
