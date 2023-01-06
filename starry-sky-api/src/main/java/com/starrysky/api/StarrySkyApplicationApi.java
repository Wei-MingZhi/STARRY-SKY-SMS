package com.starrysky.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wmz
 */
//@EnableEncryptableProperties
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableFeignClients(value = {"com.starrysky.feign.*"})
public class StarrySkyApplicationApi {

    public static void main(String[] args) {
        SpringApplication.run(StarrySkyApplicationApi.class,args);
    }

}
