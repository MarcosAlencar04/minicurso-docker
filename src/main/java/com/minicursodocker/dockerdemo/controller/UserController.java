package com.minicursodocker.dockerdemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minicursodocker.dockerdemo.dao.UserDaoImpl;
import com.minicursodocker.dockerdemo.dao.UserDao;
import com.minicursodocker.dockerdemo.entity.User;

@RestController
public class UserController {

    @GetMapping("/users")
    List<User> getAllUsers() {
        UserDao dao = new UserDaoImpl();
        return dao.getUsers();
    }
    
}
