package com.sqt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.sqt"})
@ComponentScan("com.sqt")//扫描@FeignClient注解，该注解在依赖的第三方包内
public class SpringCloudConsumer_AppFegin81 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumer_AppFegin81.class, args);
    }
}
