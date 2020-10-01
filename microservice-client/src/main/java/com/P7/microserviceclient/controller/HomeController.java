package com.P7.microserviceclient.controller;

import com.P7.microserviceclient.bean.UserBean;
import com.P7.microserviceclient.proxies.MicroserviceUserProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    MicroserviceUserProxy microserviceUserProxy;
    @GetMapping("/home")
    @SuppressWarnings("unchecked")
    public String howdy(Model model, Principal principal) {
        OAuth2Authentication authentication = (OAuth2Authentication) principal;
        UserBean userBean = microserviceUserProxy.recupererUnUtilisateur((long) 1);
        userBean = (UserBean) authentication.getUserAuthentication().getDetails();
        model.addAttribute("user", userBean);
        return "home";
    }

}
