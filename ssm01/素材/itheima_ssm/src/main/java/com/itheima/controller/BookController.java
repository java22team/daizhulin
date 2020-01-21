package com.itheima.controller;

import com.itheima.service.BookService;
import com.itheima.utils.PageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author:Asus
 * @Date:2020/1/21/14:59
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/findAll")
    public String findAll(Model model, @RequestParam(value = "pageNum",required=false,defaultValue = "1") Integer pageNum, @RequestParam(value = "pageNum",required=false,defaultValue = "3") Integer pageSize){
        PageBean pageBean = bookService.findAll(pageNum, pageSize);
        model.addAttribute("pageBean",pageBean);
        System.out.println(pageBean);
        return "/book_list.jsp";
    }
}
