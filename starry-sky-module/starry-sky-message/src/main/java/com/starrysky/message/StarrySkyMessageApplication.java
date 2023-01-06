package com.starrysky.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wmz
 */
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
@EnableEurekaClient
public class StarrySkyMessageApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarrySkyMessageApplication.class,args);
    }
}
