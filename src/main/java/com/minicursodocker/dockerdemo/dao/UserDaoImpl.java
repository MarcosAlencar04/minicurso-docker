package com.minicursodocker.dockerdemo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.minicursodocker.dockerdemo.entity.Address;
import com.minicursodocker.dockerdemo.entity.User;

public class UserDaoImpl implements UserDao{

    private List<User> users = new ArrayList<User>();

    public UserDaoImpl(){
        //fake address
        Address address = new Address((long) 1, "Rua de Sao miguel do iguaçu");
        
        //fake user
        User user = new User();
        user.setId((long) 1);
        user.setFirstName("Joao");
        user.setLastName("niero");
        user.setAddress(address);
        
        //add node
        users.add(user);
    }

    @Override
    public Optional<User> getUser(Long id) {
        for(User user: this.users){
            if (user.getId().longValue() == id.longValue()){
                return Optional.ofNullable(user);
            }
        }

        return Optional.empty();
    }

    @Override
    public List<User> getUsers() {
        return this.users;
    }

}
