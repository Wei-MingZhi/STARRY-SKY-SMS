package com.starrysky.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wmz
 */
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
@EnableEurekaClient
public class StarrySkyOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarrySkyOrderApplication.class,args);
    }

}
