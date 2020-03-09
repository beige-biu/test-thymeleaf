package com.wenyu.springboot.controller;

import com.wenyu.springboot.model.Stu;
import com.wenyu.springboot.service.StuService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author:wenyu
 * 2020/2/24
 */
@RestController
public class StuController {
    @Resource
    private StuService stuService;
    @RequestMapping("/add")
    public Object add(Stu stu){
        stuService.add(stu);
        return "添加成功";
    }
    @RequestMapping("/selectAll")
    public Object selectAll(){
         List<Stu> list = stuService.selectAll();
        return list;
    }

}
