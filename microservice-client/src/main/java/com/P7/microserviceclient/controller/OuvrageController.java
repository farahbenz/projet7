package com.P7.microserviceclient.controller;


import com.P7.microserviceclient.bean.OuvrageBean;
import com.P7.microserviceclient.proxies.MicroserviceOuvrageProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.util.List;

@Controller
public class OuvrageController {

    @Autowired
    MicroserviceOuvrageProxy microserviceOuvrageProxy;

    @RequestMapping(value = "/listeOuvrages", method = RequestMethod.GET)
    public String listeOuvrages(Model model){

        List<OuvrageBean> ouvrages = microserviceOuvrageProxy.listeDesOuvrages();
        model.addAttribute("ouvrages", ouvrages);

        return "ListeOuvrages";
    }


    @RequestMapping(value ="/Emprunt/{id}", method = RequestMethod.GET)
    public String modifierTag(@PathVariable("id")Long id, RedirectAttributes redirectAttrs, Model model) {
        OuvrageBean ouvrageBean = microserviceOuvrageProxy.recupererUnProduit(id);
        Long id1 = ouvrageBean.getId();
        model.addAttribute("id", id1);
        redirectAttrs.addAttribute("idSpot",id);
        return "Acceuil";
    }

}
