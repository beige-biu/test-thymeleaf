package com.wenyu.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:wenyu
 * 2020/2/18
 */
@RestController
@ResponseBody
public class HelloController {
    @Value("${person.last-name}")
    private String name;
    @RequestMapping( value = "/hello",produces = { "application/json;charset=UTF-8" })
    public String hello(){
        return "Hello "+name+"  中文测试";
    }

}
