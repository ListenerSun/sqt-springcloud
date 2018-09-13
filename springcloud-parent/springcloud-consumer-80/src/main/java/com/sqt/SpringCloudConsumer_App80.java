package com.sqt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudConsumer_App80 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumer_App80.class,args);
    }
}
