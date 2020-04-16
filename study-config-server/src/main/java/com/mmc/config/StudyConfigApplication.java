package com.mmc.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @description:
 * @author: mmc
 * @create: 2020-04-14 22:44
 **/
@SpringBootApplication
@EnableConfigServer
public class StudyConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyConfigApplication.class);
    }
}
