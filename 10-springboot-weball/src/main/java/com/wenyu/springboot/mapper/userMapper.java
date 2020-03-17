package com.wenyu.springboot.mapper;

import com.wenyu.springboot.model.user;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface userMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);

    List<user> selectAll();
}