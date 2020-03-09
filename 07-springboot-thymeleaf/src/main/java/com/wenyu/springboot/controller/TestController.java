package com.wenyu.springboot.controller;

import com.wenyu.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:wenyu
 * 2020/2/25
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("mykey", "我的数据");
        User user = new User("迈克", 18, "男");
        model.addAttribute("user", user);

        User user1 = new User("张三", 19, "男");
        User user2 = new User("lili", 19, "女");
        User user3 = new User("mike", 21, "男");
        User user4 = new User("jone", 17, "男");
        User user5 = new User("jan", 19, "女");

        List<User> lists = new ArrayList<>();
        lists.add(user1);
        lists.add(user2);
        lists.add(user3);
        lists.add(user4);
        lists.add(user5);
        model.addAttribute("lists", lists);



        return "index";
    }
    @RequestMapping("/bb/test2")
    public String test2(Model model){
        model.addAttribute("mykey", "我的数据");
        User user = new User("迈克", 18, "男");
        model.addAttribute("user", user);
        return "index2";
    }



}
