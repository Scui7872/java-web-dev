package com.login.servlet.service;

import com.login.servlet.service.entity.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
*@ClassName UserService
*@Description  TODO
*@author crj
*Data 
*@Version 1.0
**/
public class UserService {
    private List<User> userList;

    public UserService() {
        init();
    }

    /**
     * 数据初始化方法
     */
    public List<User> init() {
        userList = new ArrayList<>(2);
        User[] users = new User[]{
                new User("crj", "0d0871f0806eae32d30983b62252da50 ", "时光", "3.jpg"),
                new User("Scui", "0d0871f0806eae32d30983b62252da50 ", "幸运", "4.jpg"),

        };
        userList = Arrays.asList(users);
        return userList;
    }

    /**
     * 登陆功能
     *
     * @param account
     * @param password
     * @return user
     */
    public User signIn(String account, String password) {
        for (User user : userList) {
            if (user.getAccount().equals(account) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        User user = new UserService().signIn("aaa", com.web.util.Md5Util.crypt("111"));
        System.out.println(user);
    }
}

