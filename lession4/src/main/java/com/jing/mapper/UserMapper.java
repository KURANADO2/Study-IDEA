package com.jing.mapper;

import com.jing.pojo.User;

import java.util.List;

/**
 * Created by JING on 2017/9/9.
 */
public interface UserMapper {

    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);

    /**
     * 删除用户
     * @param user
     */
    void removeUser(User user);

    /**
     * 修改用户
     * @param user
     */
    void modifyUser(User user);

    /**
     * 查找用户
     * @param user
     * @return
     */
    List<User> findUser(User user);
}

