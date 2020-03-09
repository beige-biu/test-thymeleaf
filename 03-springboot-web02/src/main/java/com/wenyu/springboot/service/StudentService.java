package com.wenyu.springboot.service;

import com.wenyu.springboot.model.student;

import java.util.List;

/**
 * Author:wenyu
 * 2020/2/21
 */

public interface StudentService {

    void add(student stu);

    List<student> selectAll();



}
