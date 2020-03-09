package com.wenyu.springboot.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:wenyu
 * 2020/2/20
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("message", "这是前台传入的数据");
        return "success.jsp";
        //return "forward:success.jsp";
    }
}
