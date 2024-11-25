package com.minicursodocker.dockerdemo.dao;

import java.util.List;
import java.util.Optional;

import com.minicursodocker.dockerdemo.entity.User;

public interface UserDao {

    public Optional<User> getUser(Long id);

    public List<User> getUsers();
}
