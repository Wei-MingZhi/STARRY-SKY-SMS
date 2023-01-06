package com.starrysky.api.rest;

import com.starrysky.feign.login.LoginFeign;
import com.starrysky.sms.config.ResponseResult;
import com.starrysky.sms.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wmz
 */
@RestController
@RequestMapping("/starry-sky")
public class LoginRest {

    private LoginFeign loginFeign;

    private ResponseResult loginRest(User user) {
        return loginFeign.loginService(user);
    }

}
