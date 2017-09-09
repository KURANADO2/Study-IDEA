package com.jing.controller;

import com.jing.pojo.User;
import com.jing.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

import java.util.List;

/**
 * Created by JING on 2017/9/9.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource(name = "userServiceImpl")
    private UserService userService;

    @RequestMapping(value = "/find", method = {RequestMethod.POST, RequestMethod.GET})
    public void find() {
        User user = new User();
        user.setUsername("");
        List<User> userList = userService.findUser(user);
    }

    @RequestMapping(value = "/add", method = {RequestMethod.POST, RequestMethod.GET})
    public void add() {
        User user = new User();
        user.setUsername("张三");
        user.setPassword("123456asdfaedf");
        user.setAddress("上海市浦东新区");
        user.setPhone("110");
        userService.addUser(user);
    }

    @RequestMapping(value = "/remove", method = {RequestMethod.POST, RequestMethod.GET})
    public void remove() {
        User user = new User();
        user.setUsername("张三");
        userService.removeUser(user);
    }

    @RequestMapping(value = "/modify", method = {RequestMethod.POST, RequestMethod.GET})
    public void modify() {
        User user = new User();
        user.setId(2);
        user.setUsername("王五");
        user.setPassword("156432");
        user.setAddress("安徽省淮南市");
        user.setPhone("18255684463");
        userService.modifyUser(user);
    }



}
