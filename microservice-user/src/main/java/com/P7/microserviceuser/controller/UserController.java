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

    @GetMapping(value ="/User/{name}")
    public Optional<User> recupererUnUtilisateur(@PathVariable String name){

        Optional<com.p7.microserviceuser.model.User> user = userDao.findByName(name);

        return user;

    }

}
