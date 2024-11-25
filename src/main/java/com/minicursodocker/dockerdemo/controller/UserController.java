package com.minicursodocker.dockerdemo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.minicursodocker.dockerdemo.dao.UserDaoImpl;
import com.minicursodocker.dockerdemo.dao.UserDao;
import com.minicursodocker.dockerdemo.entity.User;


@Controller
public class UserController {

    @GetMapping("/users")
    List<User> getAllUsers() {
        UserDao dao = new UserDaoImpl();
        return dao.getUsers();
    }
    
}
