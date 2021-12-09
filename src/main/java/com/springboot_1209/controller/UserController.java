package com.springboot_1209.controller;


import com.springboot_1209.model.User;
import com.springboot_1209.service.IUserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author astupidcoder
 * @since 2021-12-09
 */
@Api(tags="用户管理")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("/getUser/{userId}")
    public User getUserById(@PathVariable int userId){
        return userService.selectById(userId);
    }
    @PostMapping("/getAge/{age}")
    public List<User> getUserByAge(@PathVariable int age){
        return userService.getByAge(age);
    }
}
