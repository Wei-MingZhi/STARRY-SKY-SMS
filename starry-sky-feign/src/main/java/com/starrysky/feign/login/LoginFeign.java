package com.starrysky.feign.login;

import com.starrysky.sms.config.ResponseResult;
import com.starrysky.sms.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author wmz
 */
@FeignClient(value = "starry-sky-sms", contextId = "LoginFeign")
public interface LoginFeign {

    /**
     * 登录
     * @param user
     * @return
     */
    @PostMapping("/login/user-login")
    ResponseResult loginService(User user);


}
