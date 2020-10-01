package com.P7.microserviceclient.controller;

import com.P7.microserviceclient.bean.OuvrageBean;
import com.P7.microserviceclient.proxies.MicroserviceOuvrageProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class RechercheController {

    @Autowired
    MicroserviceOuvrageProxy microserviceOuvrageProxy;

    @RequestMapping(value = "/rechercher", method = RequestMethod.GET)
    public String getOuvrage (@RequestParam("nom") String nom, ModelMap modelMap){
        List<OuvrageBean> ouvrage = microserviceOuvrageProxy.getOuvrageByNom(nom);
        modelMap.addAttribute("ouvrage", ouvrage);

        return "Recherche";
    }

}
