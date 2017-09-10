package com.jing.controller;

import com.jing.pojo.User;
import com.jing.service.UserService;

import org.springframework.stereotype.Controller;
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

    @RequestMapping(value = "/add", method = {RequestMethod.POST, RequestMethod.GET})
    public void addUser() {
        User user = new User();
        user.setUsername("张三丰");
        user.setPassword("7895246");
        user.setPhone("120");
        user.setAddress("金銮殿");
        userService.addUser(user);
    }

    @RequestMapping(value = "/remove", method = {RequestMethod.POST, RequestMethod.GET})
    public void removeUser() {
        Integer id = 3;
        userService.removeUser(id);
    }

    @RequestMapping(value = "/modify", method = {RequestMethod.POST, RequestMethod.GET})
    public void modifyUser() {
        User user = new User();
        user.setId(6);
        user.setUsername("慈禧太后");
        user.setPassword("456798");
        user.setPhone("119");
        user.setAddress("北京市");
        userService.modifyUser(user);
    }

    @RequestMapping(value = "/find", method = {RequestMethod.POST, RequestMethod.GET})
    public void findUser() {
        Integer id = 6;
        User user = userService.findUser(id);
    }

    @RequestMapping(value = "/findAll", method = {RequestMethod.POST, RequestMethod.GET})
    public void findAllUser() {
        List<User> userList = userService.findAllUser();
    }
}
