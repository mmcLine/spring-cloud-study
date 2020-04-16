package com.mmc.trade.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: mmc
 * @create: 2020-04-15 21:58
 **/
@RestController
@RefreshScope
public class ConfigTestController {


    @Value("${ordernotiry}")
    private Boolean ordernotiry;


    @Value(("${loginpass}"))
    private String loginpass;

    @RequestMapping("/testconfig")
    public String testconfig(){
        System.out.println(loginpass);
        return String.valueOf(ordernotiry);
    }
}
