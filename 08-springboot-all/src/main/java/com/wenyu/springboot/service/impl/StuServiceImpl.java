package com.wenyu.springboot.service.impl;

import com.wenyu.springboot.mapper.StuMapper;
import com.wenyu.springboot.model.Stu;
import com.wenyu.springboot.service.StuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author:wenyu
 * 2020/2/27
 */
@Service
public class StuServiceImpl implements StuService {

    @Resource
    private StuMapper stuMapper;


    @Override
    public List<Stu> selectAll() {
        List<Stu> list = stuMapper.selectAll();
        return list;
    }

    @Override
    public void deleteById(int id) {
        stuMapper.deleteByPrimaryKey(Math.toIntExact(id));
    }

    @Override
    public void update(Stu stu) {
        stuMapper.updateByPrimaryKey(stu);
    }

    @Override
    public Stu selectById(Integer id) {

        return stuMapper.selectByPrimaryKey(id);
    }

    @Override
    public void add(Stu stu) {
        stuMapper.insert(stu);
    }


}
