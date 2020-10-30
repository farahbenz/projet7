package com.p7.microserviceuser.controller;

import com.p7.microserviceuser.dao.UserDao;
import com.p7.microserviceuser.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping(value ="/Name/{name}")
    public Optional<User> recupererUnUtilisateur(@PathVariable String name){

        Optional<User> user = userDao.findByName(name);

        return user;

    }

    @GetMapping(value ="/User/{id}")
    public Optional<User> UserFindById(@PathVariable Long id){

        Optional<User> userId = userDao.findById(id);

        return userId;

    }

}
