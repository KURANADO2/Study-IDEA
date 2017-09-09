package com.jing.service;

import com.jing.pojo.User;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by JING on 2017/9/9.
 */
public interface UserService {

    void addUser(User user);

    void removeUser(User user);

    void modifyUser(User user);

    List<User> findUser(User user);

}
