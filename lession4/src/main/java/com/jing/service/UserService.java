package com.jing.service;

import com.jing.pojo.User;

import java.util.List;

/**
 * Created by JING on 2017/9/10.
 */
public interface UserService {

    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);

    /**
     * 根据id删除用户
     * @param id
     */
    void removeUser(Integer id);

    /**
     * 根据id修改用户
     * @param user
     */
    void modifyUser(User user);

    /**
     * 根据id查询单个用户
     * @param id
     * @return
     */
    User findUser(Integer id);

    /**
     * 查询所有用户
     * @return
     */
    List<User> findAllUser();

}
