package com.jing.service;

import com.jing.mapper.UserMapper;
import com.jing.pojo.User;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * Created by JING on 2017/9/10.
 */
@Service
public class UserServiceImpl implements UserService {


    @Resource(name = "userMapper")
    private UserMapper userMapper;

    public void addUser(User user) {
        userMapper.addUser(user);
    }

    public void removeUser(Integer id) {
        userMapper.removeUser(id);
    }

    public void modifyUser(User user) {
        userMapper.modifyUser(user);
    }

    public User findUser(Integer id) {
        return userMapper.findUser(id);
    }

    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }
}
