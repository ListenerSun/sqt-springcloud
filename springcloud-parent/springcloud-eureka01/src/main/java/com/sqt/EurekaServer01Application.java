package com.sqt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer //Eureka启动类，表示接受其他服务注册进来
public class EurekaServer01Application {
    public static void main(String[] args) {

       SpringApplication.run(EurekaServer01Application.class,args);
    }
}
