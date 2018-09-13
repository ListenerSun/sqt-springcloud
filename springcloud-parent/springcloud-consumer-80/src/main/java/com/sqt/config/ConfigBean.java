package com.sqt.config;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import myrule.RandomRule_ZY;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: sqt
 * @Description:
 * @Date: Created in 18:35 ${Date}
 */
@Configuration
public class ConfigBean {

    //注入restful服务模板
    @LoadBalanced  //Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
    @Bean
    public RestTemplate restTemplate() {

        return new RestTemplate();
    }

    @Bean
    public IRule myRule()
    {
       return new RandomRule_ZY();
        //    return new RandomRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询。
//        return new RetryRule();
    }
}
