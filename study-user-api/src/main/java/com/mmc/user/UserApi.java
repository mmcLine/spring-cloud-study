package com.mmc.user;

import com.mmc.user.fallback.UserApiFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: mmc
 * @create: 2020-04-05 11:27
 **/

@FeignClient(value = "study-user",path = "/user",fallback =UserApiFallBack.class)
public interface UserApi {
    @RequestMapping(value = "/getUserById",method = RequestMethod.GET)
    User getUserById(@RequestParam(name = "id") Integer id);
}
