package com.wenyu.springboot.config;

import com.wenyu.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author:wenyu
 * 2020/2/18
 */
@Configuration
public class MyAppConfig {
    @Bean
    public HelloService helloService(){
        System.out.println("配置类给容器添加了HelloService组件");
        return new HelloService();
    }
}
