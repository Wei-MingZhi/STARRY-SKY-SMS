package com.starrysky.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wmz
 */
@EnableEurekaServer
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class, MongoAutoConfiguration.class})
public class StarrySkyEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarrySkyEurekaApplication.class,args);
    }
}
