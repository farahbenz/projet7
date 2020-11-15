package com.P7.microserviceclient.controller;


import com.P7.microserviceclient.bean.EmpruntBean;
import com.P7.microserviceclient.bean.OuvrageBean;
import com.P7.microserviceclient.bean.UserBean;
import com.P7.microserviceclient.proxies.MicroserviceEmpruntProxy;
import com.P7.microserviceclient.proxies.MicroserviceOuvrageProxy;
import com.P7.microserviceclient.proxies.MicroserviceUserProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
public class OuvrageController {

    @Autowired
    MicroserviceOuvrageProxy microserviceOuvrageProxy;

    @Autowired
    MicroserviceUserProxy microserviceUserProxy;

    @Autowired
    MicroserviceEmpruntProxy microserviceEmpruntProxy;

    @RequestMapping(value = "/listeOuvrages", method = RequestMethod.GET)
    public String listeOuvrages(Model model){

        List<OuvrageBean> ouvrages = microserviceOuvrageProxy.listeDesOuvrages();
        model.addAttribute("ouvrages", ouvrages);

        return "ListeOuvrages";
    }

    @RequestMapping(value ="/Emprunt/{id}", method = RequestMethod.GET)
    public String EmpruntOuvrage(@PathVariable("id") Long id, EmpruntBean emprunt) {

        OuvrageBean ouvrageBean = microserviceOuvrageProxy.recupererUnOuvrage(id);
        Long id1 = ouvrageBean.getId();
        int nbExemplaire = ouvrageBean.getNbExemplaire();

        if(nbExemplaire!=0) {

            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            String name = authentication.getName();
            UserBean userBean = microserviceUserProxy.recupererUnUtilisateur(name);

            emprunt.setNomOuvrage(ouvrageBean.getNom());

            Long idUser = userBean.getId();
            emprunt.setUserId(idUser);

            emprunt.setOuvrageId(id1);

            Date aujourdhui = new Date();
            emprunt.setDateEmprunt(aujourdhui);


            ouvrageBean.setNbExemplaire(nbExemplaire -1);
            microserviceOuvrageProxy.saveOuvrage(ouvrageBean);
            microserviceEmpruntProxy.saveEmprunt(emprunt);
        }

        return "redirect:/listeOuvrages";
    }

}
