package com.wenyu.springboot.config;

import com.wenyu.springboot.interceptors.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Author:wenyu
 * 2020/3/11
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(new MyInterceptor());

        String[] addPathPatterns={"/private/**"};
        interceptorRegistration.addPathPatterns(addPathPatterns);

        String[] excludePathPatterns={"/private/test02"};
        interceptorRegistration.excludePathPatterns(excludePathPatterns);


    }
}
