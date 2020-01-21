package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Author:Asus
 * @Date:2020/1/21/12:57
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public String login(User luser, HttpSession session){
        User user = null;
        try {
            user = userService.login(luser);
            session.setAttribute("user",user);
            return "/book/findAll";
        }catch (Exception e){
            return "/login.jsp";
        }


    }
}
