package com.example.demo.jpa;

import com.example.demo.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yuancaifu
 * @date 2019/12/25 14:54
 * @description
 **/
public interface UserJPA extends JpaRepository<User, String> {
    User findUserByNameAndPassword(String name, String password);
}
