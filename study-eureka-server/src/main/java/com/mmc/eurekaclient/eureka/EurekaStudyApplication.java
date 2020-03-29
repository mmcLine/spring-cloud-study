package com.mmc.eurekaclient.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description:
 * @author: mmc
 * @create: 2020-03-29 15:27
 **/

@SpringBootApplication
@EnableEurekaServer
public class EurekaStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaStudyApplication.class,args);
    }
}
