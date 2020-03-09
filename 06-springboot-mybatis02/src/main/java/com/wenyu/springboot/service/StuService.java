package com.wenyu.springboot.service;

import com.wenyu.springboot.model.Stu;

import java.util.List;

/**
 * Author:wenyu
 * 2020/2/24
 */
public interface StuService {
    void add(Stu stu);

    List<Stu> selectAll();
}
