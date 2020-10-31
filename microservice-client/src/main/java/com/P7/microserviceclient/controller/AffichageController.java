package com.P7.microserviceclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AffichageController {

    @RequestMapping(value = "/acceuil")
    public String acceuil(){
        return "Acceuil";
    }

    @RequestMapping(value = "/listeOuvrage")
    public String listeOuvrage(){
        return "ListeOuvrage";
    }

}
