package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.sevice.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


/**
 * @author yuancaifu
 * @date 2019/12/25 14:43
 * @description HelloWordController
 */

@RestController
@RequestMapping("/user")
public class HelloWordController {
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public Object login(@RequestBody User info) {
        HashMap ret = new HashMap();
        User user = userService.findUserByNameAndPassword(info.getName(), info.getPassword());
        if (user == null) {
            ret.put("state", 500);
            ret.put("msg", "登录失败,用户名或密码不存在");
        } else {
            ret.put("state", 200);
            ret.put("msg", "登录成功");
        }
        return ret;
    }
}
