package com.wenyu.springboot.controller;

import com.wenyu.springboot.model.Stu;
import com.wenyu.springboot.service.StuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author:wenyu
 * 2020/2/27
 */
@Controller
public class StuController {
    @Resource
    private StuService stuService;

    @RequestMapping("/")
    public  Object selectAll(Model model){
        List<Stu> list = stuService.selectAll();
        model.addAttribute("stuList", list);
        return "student";


    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id")int id){
        stuService.deleteById(id);
        return "redirect:/";
    }



    @RequestMapping("/update/{id}")
    public String toUpdate(@PathVariable("id")Integer id,Model model){
        Stu stu=stuService.selectById(id);
        model.addAttribute("stu",stu);
        return "update";
    }



    @RequestMapping("/update")
    public String update(Stu stu){
        stuService.update(stu);
        return "redirect:/";
    }

    @RequestMapping("/add")
    public String add( Stu stu){
        stuService.add(stu);
        return "add";
    }


}

