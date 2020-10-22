package com.techprimers.security.springsecurityauthserver.controller;

import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/rest/hello")
@EnableResourceServer
public class HelloResource {

    @GetMapping("/principal")
    public Principal user(Principal principal) {
        return principal;
    }

    @GetMapping
    public String hello() {
        return "Hello World";
    }

}
