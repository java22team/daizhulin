package com.itheima.mapper;

import com.itheima.domain.User;

/**
 * @Author:Asus
 * @Date:2020/1/21/13:03
 */
public interface UserMapper {
    User login(User user)throws Exception;
}
