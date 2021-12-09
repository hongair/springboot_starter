package com.springboot_1209.service.impl;

import com.springboot_1209.model.User;
import com.springboot_1209.mapper.UserMapper;
import com.springboot_1209.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author astupidcoder
 * @since 2021-12-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired(required=false)
    UserMapper userMapper;

    @Override
    public User selectById(int userId) {
        return userMapper.selectById(userId);
    }
    @Override
    public List<User> getByAge(int age) {
        return userMapper.getByAge(age);
    }
}
