package com.techprimers.security.springsecurityauthserver.controller;

import com.techprimers.security.springsecurityauthserver.model.Users;
import com.techprimers.security.springsecurityauthserver.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping(value ="/Name/{name}")
    public Optional<Users> recupererUnUtilisateur(@PathVariable String name){

        Optional<Users> user = usersRepository.findByName(name);

        return user;
    }


    @GetMapping(value ="/User/{id}")
    public Optional<Users> UserFindById(@PathVariable Long id){

        Optional<Users> userId = usersRepository.findById(id);

        return userId;

    }

}
