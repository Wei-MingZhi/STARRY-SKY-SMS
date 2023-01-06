package com.starrysky.userinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wmz
 */
@SpringBootApplication
@EnableEurekaClient
public class StarrySkyUserInfoApplication {
    public static void main(String[] args) {
        SpringApplication.run(StarrySkyUserInfoApplication.class,args);
    }
}
