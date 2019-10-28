package com.service.impl;

import com.dao.UserMapper;
import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wanggq on 2019/10/25.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    public User login(String name, String pwd){
        return userMapper.login(name,pwd);
    }

    public List<User> list(){
        return userMapper.list();
    }
}
