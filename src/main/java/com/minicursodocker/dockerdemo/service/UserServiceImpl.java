package com.minicursodocker.dockerdemo.service;

import java.util.List;

import com.minicursodocker.dockerdemo.dao.UserDao;
import com.minicursodocker.dockerdemo.dao.UserDaoImpl;
import com.minicursodocker.dockerdemo.entity.User;

public class UserServiceImpl implements UserService{

    @Override
    public User getUser(Long id) {
        UserDao userDao = new UserDaoImpl();
        return userDao.getUser(id).get();
    }

    @Override
    public List<User> getUsers() {
        UserDao userDao = new UserDaoImpl();
        return userDao.getUsers();
    }


}
