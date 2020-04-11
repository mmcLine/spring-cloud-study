package com.mmc.user.fallback;

import com.mmc.user.User;
import com.mmc.user.UserApi;
import org.springframework.stereotype.Component;

/**
 * @description: 降级方法
 * @author: mmc
 * @create: 2020-04-11 11:55
 **/

@Component
public class UserApiFallBack implements UserApi {

    @Override
    public User getUserById(Integer id) {
        System.out.println("调用降级方法");
        User user = new User();
        user.setName("熔断用户");
        return user;
    }
}
