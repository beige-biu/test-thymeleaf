package com.wenyu.springboot.mapper;

import com.wenyu.springboot.model.stu;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface stuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(stu record);

    int insertSelective(stu record);

    stu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(stu record);

    int updateByPrimaryKey(stu record);
}