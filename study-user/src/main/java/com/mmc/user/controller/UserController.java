package com.mmc.user.controller;

import com.mmc.user.User;
import com.mmc.user.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: mmc
 * @create: 2020-04-05 11:37
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserApi userApi;

    @RequestMapping("/getUserById")
    public User getUserById(@RequestParam(name = "id") Integer id){
        System.out.println("调用方法");
        if(id==1){
            int i=1/0;
        }
        User user = new User();
        user.setId(1);
        user.setName("小明");
        return user;
    }

    @RequestMapping("/test")
    public User test(Integer id){
        User user = userApi.getUserById(id);
        return user;
    }
}
