package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.domain.Book;
import com.itheima.mapper.BookMapper;
import com.itheima.service.BookService;
import com.itheima.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:Asus
 * @Date:2020/1/21/15:34
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public PageBean findAll(Integer pageNum,Integer pageSize) {
        PageBean pageBean = new PageBean();
        PageHelper.startPage(pageNum,pageSize);
        List<Book> bookList = bookMapper.findAll();
        pageBean.setData(bookList);
        pageBean.setCurrentPage(pageNum);
        pageBean.setPageSize(pageSize);
        Integer total = bookMapper.findCount();
        pageBean.setTotal(total);
        int pages  = (int) Math.ceil(total/pageSize);
        pageBean.setPages(pages);
        return pageBean;
    }
}
