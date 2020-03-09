package com.wenyu.springboot.mapper;

import com.wenyu.springboot.model.student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface studentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(student record);

    int insertSelective(student record);

    student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(student record);

    int updateByPrimaryKey(student record);

    List<student> selectAll();
}