package com.wenyu.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Author:wenyu
 * 2020/3/11
 */
@RestController
public class TestController {

    @RequestMapping("/private/test01")
    public Object test01(){
        System.out.println("进入了/private/test01的控制器");
        return "这是test01的数据";
    }
    @RequestMapping("/private/test02")
    public Object test02(){
        System.out.println("进入了/private/test02的控制器");
        return "这是test02的数据";
    }
    @RequestMapping("/test03")
    public Object test03(HttpSession httpSession){
        System.out.println("进入了/test03的控制器");
        httpSession.setAttribute("userSession", "成功登陆");
        return "这是test03的数据";
    }
}
