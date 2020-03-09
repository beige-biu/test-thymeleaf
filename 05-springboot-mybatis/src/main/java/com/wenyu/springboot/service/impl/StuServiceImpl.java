package com.wenyu.springboot.service.impl;

import com.wenyu.springboot.mapper.stuMapper;
import com.wenyu.springboot.model.stu;
import com.wenyu.springboot.service.StuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author:wenyu
 * 2020/2/22
 */

@Service
public class StuServiceImpl implements StuService {

    @Resource
    private stuMapper stuMapper;

    public void add(stu stu){
        stuMapper.insert(stu);
    }

}
