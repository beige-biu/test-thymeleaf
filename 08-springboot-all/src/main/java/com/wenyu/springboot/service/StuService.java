package com.wenyu.springboot.service;

import com.wenyu.springboot.model.Stu;

import java.util.List;

/**
 * Author:wenyu
 * 2020/2/27
 */
public interface StuService {
    List<Stu> selectAll();

    void deleteById(int id);

    void update(Stu stu);

    Stu selectById(Integer id);

    void add(Stu stu);
}
