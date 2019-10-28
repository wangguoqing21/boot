package com.service;

import com.entity.User;

import java.util.List;

/**
 * Created by wanggq on 2019/10/25.
 */
public interface UserService {
    public User login(String name, String pwd);
    public List<User> list();
}
