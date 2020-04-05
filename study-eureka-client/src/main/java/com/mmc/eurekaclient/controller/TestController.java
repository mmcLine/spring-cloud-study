package com.mmc.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
