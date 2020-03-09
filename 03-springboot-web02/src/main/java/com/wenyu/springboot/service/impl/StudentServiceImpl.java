package com.wenyu.springboot.service.impl;

import com.wenyu.springboot.mapper.studentMapper;
import com.wenyu.springboot.model.student;
import com.wenyu.springboot.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author:wenyu
 * 2020/2/21
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private studentMapper studentMapper;

    @Override
    public void add(student student){
        studentMapper.insert(student);

    }

    @Override
    public List<student> selectAll() {
        return studentMapper.selectAll();
    }



}
