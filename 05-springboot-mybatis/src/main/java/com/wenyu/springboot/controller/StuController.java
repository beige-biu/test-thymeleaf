package com.wenyu.springboot.controller;

import com.wenyu.springboot.model.stu;
import com.wenyu.springboot.service.StuService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Author:wenyu
 * 2020/2/22
 */
@RestController
public class StuController {

    @Resource
    private StuService stuService;

    @RequestMapping("/add")
    public Object add(stu stu){
        stuService.add(stu);
        return "添加成功";
    }

}
