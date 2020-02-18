package com.wenyu.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:wenyu
 * 2020/1/17
 */
@RestController
public class TestController {
    @Value("${person.name}")
   private String name;
    @Value("${person.age}")
    private Integer age;

    @RequestMapping("/show")
    public String show(){

        return "springboot访问成功 name="+name+",age="+age ;
    }

}
