package com.wenyu.springboot.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author:wenyu
 * 2020/3/11
 */
public class MyInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("进入了拦截器");
        Object userSession = request.getSession().getAttribute("userSession");
        if(userSession==null){
            System.out.println("用户没有登陆");
            return false;
        }
        return true;
    }


}
