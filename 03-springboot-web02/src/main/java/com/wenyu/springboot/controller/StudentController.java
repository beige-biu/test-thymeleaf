package com.wenyu.springboot.controller;

import com.wenyu.springboot.model.student;
import com.wenyu.springboot.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author:wenyu
 * 2020/2/21
 */
@RestController
public class StudentController {
    @Resource
    private StudentService studentService;
    @RequestMapping("/add")
    public String add(student student){
        studentService.add(student);
        return "添加成功";
    }
    @RequestMapping("/selectAll")
    public Object selectAll(){
        List<student> lists = studentService.selectAll();
        return lists;
    }

}
