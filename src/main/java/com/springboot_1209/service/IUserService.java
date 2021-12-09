package com.springboot_1209.service;

import com.springboot_1209.model.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author astupidcoder
 * @since 2021-12-09
 */
public interface IUserService extends IService<User> {
    public User selectById(int userId);
    public List<User> getByAge(int age);
}
