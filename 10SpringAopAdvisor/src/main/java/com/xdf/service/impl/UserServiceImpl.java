package com.xdf.service.impl;

import com.xdf.service.UserService;

public class UserServiceImpl implements UserService {
    //主业务
    public String eat() {
        System.out.println("正在吃苹果......");
        return "apple";

    }

    //主业务
    public void sleep() {
        System.out.println("正在休息......");
    }
}
