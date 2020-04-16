package com.mmc.trade.controller;

import com.mmc.user.User;
import com.mmc.user.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

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
        int i=1/0;
        User user= userApi.getUserById(userid);
        String name = user.getName();
        System.out.println("用户"+name+"下单成功....");
        return "用户"+name+"下单成功";
    }


    @RequestMapping("/admin")
    public String admin(){
        return "获取管理员权限";
    }

    @RequestMapping("/getCookies")
    public String getCookies(HttpServletRequest request){
        String cname="";
        Cookie[] cookies = request.getCookies();
        if(cookies!=null){
            for(Cookie cookie:cookies){
                cname+=cookie.getName();
            }
        }
        return cname;
    }
}
