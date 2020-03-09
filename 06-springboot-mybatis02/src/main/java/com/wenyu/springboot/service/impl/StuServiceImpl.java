package com.wenyu.springboot.service.impl;

import com.wenyu.springboot.mapper.StuMapper;
import com.wenyu.springboot.model.Stu;
import com.wenyu.springboot.service.StuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author:wenyu
 * 2020/2/24
 */
@Service
public class StuServiceImpl implements StuService {

    @Resource
    private StuMapper stuMapper;

    @Override
    public void add(Stu stu) {
        stuMapper.insert(stu);
    }

    @Override
    public List<Stu> selectAll() {
        return stuMapper.selectAll();
    }
}
