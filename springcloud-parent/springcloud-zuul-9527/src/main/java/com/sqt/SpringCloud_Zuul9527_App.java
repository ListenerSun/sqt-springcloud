package com.sqt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableZuulProxy //配置支持路由
public class SpringCloud_Zuul9527_App {
    public static void main( String[] args ){

        SpringApplication.run(SpringCloud_Zuul9527_App.class,args);
    }
}
