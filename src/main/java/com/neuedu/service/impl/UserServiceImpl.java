package com.neuedu.service.impl;

import com.neuedu.dao.UserMapper;
import com.neuedu.pojo.User;
import com.neuedu.service.UserService;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2019/4/1.
 */
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public int add(User user) {
        return userMapper.insertSelective(user);
    }
}
