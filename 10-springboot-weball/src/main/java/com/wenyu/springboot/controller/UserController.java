package com.wenyu.springboot.controller;

import com.wenyu.springboot.model.user;
import com.wenyu.springboot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author:wenyu
 * 2020/3/17
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping("/test")
    public String userList(Model model) {

        List<user> list = userService.selectAll();
        model.addAttribute("userList", list);
        return "userList";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        userService.deleteByid(id);
        return "redirect:/test";
    }

    @RequestMapping("/update/{id}")
    public String update(@PathVariable("id") Integer id, Model model) {
        user user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "update";
    }

    @RequestMapping("/update")
    public String update(user user) {
        userService.update(user);
        return "redirect:/test";
    }


    @RequestMapping("/toadd")
    public String toadd() {
        return "add";
    }

    @RequestMapping("/add")
    public String add(user user) {
        userService.add(user);
        return "redirect:/test";
    }

}
