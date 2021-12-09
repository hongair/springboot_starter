package com.springboot_1209.mapper;

import com.springboot_1209.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author astupidcoder
 * @since 2021-12-09
 */
public interface UserMapper extends BaseMapper<User> {
    public User selectById(int userId);

    @Select("select * from user where age = #{age}")
    public List<User> getByAge(@Param("age") int age);
}
