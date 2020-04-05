package com.mmc.user.controller;

import com.mmc.user.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: mmc
 * @create: 2020-04-05 11:37
 **/
@RestController
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/getUserById")
    public User getUserById(Integer id){
        User user = new User();
        user.setId(1);
        user.setName("小明");
        return user;
    }
}
