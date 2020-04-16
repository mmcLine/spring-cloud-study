package com.mmc.trade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @author: mmc
 * @create: 2020-04-05 14:26
 **/

@SpringBootApplication
@EnableFeignClients(basePackages = "com.mmc.user")
public class TradeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TradeApplication.class);
    }

}
