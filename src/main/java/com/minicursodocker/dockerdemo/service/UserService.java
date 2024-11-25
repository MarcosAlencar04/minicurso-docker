package com.minicursodocker.dockerdemo.service;

import java.util.List;

import com.minicursodocker.dockerdemo.entity.User;

public interface UserService {

    public User getUser(Long id);

    public List<User> getUsers();

}
