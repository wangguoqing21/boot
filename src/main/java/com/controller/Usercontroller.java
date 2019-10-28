package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by wanggq on 2019/10/25.
 */
@Controller
@RequestMapping
public class Usercontroller {

    @Autowired
    private UserService userService;

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "helle word";
    }
    @RequestMapping("loginym")
    public String loginym(){
        return "login";
    }
    @RequestMapping("login")
    public String login(String name,String pwd){
        User login = userService.login(name, pwd);
        if(login!=null){
            return "redirect:list";
        }
        return "login";
    }
    @RequestMapping("list")
    public String list(ModelMap map){
        List<User> list = userService.list();
        map.put("list",list);
        return "index";
    }

}
