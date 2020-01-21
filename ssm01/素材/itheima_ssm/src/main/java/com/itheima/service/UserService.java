package com.itheima.service;

import com.itheima.domain.User;

/**
 * @Author:Asus
 * @Date:2020/1/21/12:59
 */

public interface UserService {
    User login(User user)throws Exception;
}
