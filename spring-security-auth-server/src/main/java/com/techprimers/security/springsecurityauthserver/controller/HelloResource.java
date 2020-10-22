package com.techprimers.security.springsecurityauthserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {


    @GetMapping("/principal")
    public String user(Principal principal) {
        return principal.getName();
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

}
