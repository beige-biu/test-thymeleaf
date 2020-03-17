package com.wenyu.springboot.service.impl;

import com.wenyu.springboot.mapper.userMapper;
import com.wenyu.springboot.model.user;
import com.wenyu.springboot.service.UserService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author:wenyu
 * 2020/3/17
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private userMapper userMapper;
    //添加redis
    @Resource
    private RedisTemplate redisTemplate;
    private StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();

    @Override
    public List<user> selectAll() {

        redisTemplate.setKeySerializer(stringRedisSerializer);
        List<user> list = (List<user>) redisTemplate.opsForValue().get("userAll");

        if (list == null || list.isEmpty()) {
            synchronized (this) {
                if (list == null || list.isEmpty()) {
                    list = userMapper.selectAll();
                    redisTemplate.opsForValue().set("userAll", list);
                }
            }
        }
        return list;
    }

    @Override
    public void deleteByid(Integer id) {
        redisTemplate.setKeySerializer(stringRedisSerializer);
        userMapper.deleteByPrimaryKey(id);
        redisTemplate.delete("userAll");
    }

    @Override
    public user getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(user user) {
        redisTemplate.setKeySerializer(stringRedisSerializer);
        userMapper.updateByPrimaryKey(user);
        redisTemplate.delete("userAll");
    }

    @Override
    public void add(user user) {
        redisTemplate.setKeySerializer(stringRedisSerializer);
        userMapper.insert(user);
        redisTemplate.delete("userAll");
    }
}
