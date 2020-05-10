package com.P7.microserviceclient.controller;


import com.P7.microserviceclient.bean.OuvrageBean;
import com.P7.microserviceclient.proxies.MicroserviceOuvrageProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ClientController {

    @Autowired
    MicroserviceOuvrageProxy microserviceOuvrageProxy;

    @RequestMapping(value = "/acceuil")
    public String acceuil(Model model){
        return "Acceuil";
    }

    @RequestMapping(value = "/listeOuvrages", method = RequestMethod.GET)
    public String listeOuvrages(Model model){

        List<OuvrageBean> ouvrages = microserviceOuvrageProxy.listeDesOuvrages();
        model.addAttribute("ouvrages", ouvrages);

        return "ListeOuvrages";
    }

}
