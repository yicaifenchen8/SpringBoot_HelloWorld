package com.example.demo.sevice;

import com.example.demo.entity.User;
import com.example.demo.jpa.UserJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author yuancaifu
 * @date 2019/12/25 15:03
 * @description
 **/
@Service
public class UserService {
    @Autowired
    UserJPA userJPA;
    public User findUserByNameAndPassword(String name, String password){
        return userJPA.findUserByNameAndPassword(name, password);
    }
}
