package com.itheima.mapper;

import com.itheima.domain.Book;
import com.itheima.utils.PageBean;

import java.util.List;

/**
 * @Author:Asus
 * @Date:2020/1/21/15:36
 */
public interface BookMapper {
    List<Book> findAll();
    Integer findCount();
}
