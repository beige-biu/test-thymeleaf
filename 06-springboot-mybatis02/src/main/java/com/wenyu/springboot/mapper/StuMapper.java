package com.wenyu.springboot.mapper;

import com.wenyu.springboot.model.Stu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Stu record);

    int insertSelective(Stu record);

    Stu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stu record);

    int updateByPrimaryKey(Stu record);

    List<Stu> selectAll();
}