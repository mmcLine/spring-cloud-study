package com.mmc.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: mmc
 * @create: 2020-03-29 15:50
 **/
@RestController
public class TestController {

    @RequestMapping("/say")
    public String say(){
        return "say";
    }
}
