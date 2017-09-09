package com.jing.service;

import com.jing.mapper.UserMapper;
import com.jing.pojo.User;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * Created by JING on 2017/9/9.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource(name = "userMapper")
    private UserMapper userMapper;

    public void addUser(User user) {
        userMapper.addUser(user);
    }

    public void removeUser(User user) {
        userMapper.removeUser(user);
    }

    public void modifyUser(User user) {
        userMapper.modifyUser(user);
    }

    public List<User> findUser(User user) {
        return userMapper.findUser(user);
    }
}
