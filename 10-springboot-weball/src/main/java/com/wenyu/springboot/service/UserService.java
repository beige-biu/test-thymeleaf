package com.wenyu.springboot.service;

import com.wenyu.springboot.model.user;

import java.util.List;

/**
 * Author:wenyu
 * 2020/3/17
 */
public interface UserService {
    List<user> selectAll();

    void deleteByid(Integer id);

    user getUserById(Integer id);

    void update(user user);

    void add(user user);
}
