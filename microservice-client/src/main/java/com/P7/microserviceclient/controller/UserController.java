package com.P7.microserviceclient.controller;

import com.P7.microserviceclient.bean.UserBean;
import com.P7.microserviceclient.proxies.MicroserviceUserProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    MicroserviceUserProxy microserviceUserProxy;

    @RequestMapping(value = "/User/{id}", method = RequestMethod.GET)
    public String recupererUnUtilisateur(Long id, ModelMap modelMap){
            UserBean userBean = microserviceUserProxy.recupererUnUtilisateur((long) 1);
            modelMap.addAttribute("user", userBean);
            return "TableauBord";

    }
}
