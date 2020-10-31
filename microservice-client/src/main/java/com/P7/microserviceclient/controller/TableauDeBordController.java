package com.P7.microserviceclient.controller;

import com.P7.microserviceclient.bean.EmpruntBean;
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
public class TableauDeBordController {

    @Autowired
    MicroserviceUserProxy microserviceUserProxy;

    @Autowired
    MicroserviceEmpruntProxy microserviceEmpruntProxy;

    @Autowired
    MicroserviceOuvrageProxy microserviceOuvrageProxy;

    /**
     * Methode qui va permettre d'afficher le tableau de bord de chaque utilisateur connecté
     */

    @RequestMapping(value ="/dashboard", method = RequestMethod.GET)
    public String affichageDashboard(Model model) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();
        UserBean userBean = microserviceUserProxy.recupererUnUtilisateur(name);
        Long userId = userBean.getId();

        List<EmpruntBean> empruntBean = microserviceEmpruntProxy.listeDesEmprunts(userId);
        model.addAttribute("empruntUser", empruntBean);

        return "TableauBord";
    }

    @RequestMapping(value = "/RenouvelerEmprunt/{id}", method = RequestMethod.GET)
    public String renouvelerEmprunt (@PathVariable Long id){
        Date aujourdhui = new Date();
        EmpruntBean empruntBean = microserviceEmpruntProxy.recupererUnEmprunt(id);
        empruntBean.setDateEmprunt(aujourdhui);
        microserviceEmpruntProxy.saveEmprunt(empruntBean);
        return "TableauBord";
    }


}
