package com.itheima.service;

import com.itheima.utils.PageBean;

/**
 * @Author:Asus
 * @Date:2020/1/21/15:01
 */
public interface BookService {
    PageBean findAll(Integer pageNum,Integer pageSize);
}
