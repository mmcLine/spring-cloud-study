package com.mmc.trade.controller;

import com.mmc.user.User;
import com.mmc.user.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: mmc
 * @create: 2020-04-05 11:41
 **/
@RestController
@RequestMapping("/trade")
public class TradeController {


    @Autowired
    private UserApi userApi;

    @RequestMapping(value = "/testTrade/{userid}",method = RequestMethod.GET)
    public String testTrade(@PathVariable Integer userid){
        User user= userApi.getUserById(userid);
        String name = user.getName();
        System.out.println("用户"+name+"下单成功....");
        return "用户"+name+"下单成功";
    }
}
