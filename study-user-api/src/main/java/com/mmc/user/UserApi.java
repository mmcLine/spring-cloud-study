package com.mmc.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @description:
 * @author: mmc
 * @create: 2020-04-05 11:27
 **/

@FeignClient(value = "study-user",path = "/user")
public interface UserApi {
    @RequestMapping(value = "/getUserById",method = RequestMethod.GET)
    User getUserById(Integer id);
}
