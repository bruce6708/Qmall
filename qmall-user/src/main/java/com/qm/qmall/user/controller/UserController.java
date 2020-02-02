package com.qm.qmall.user.controller;

import com.qm.qmall.user.bean.UmsMember;
import com.qm.qmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/index")
    public String hello() {
        return "用户";
    }

    @RequestMapping(value = "/getAllUser")
    public List<UmsMember> getAllUser(){
         return userService.getAllUser();
    }
}
