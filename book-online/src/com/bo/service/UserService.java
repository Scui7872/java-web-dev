package com.bo.service;

import com.bo.entity.User;
import com.web.util.Md5Util;

import java.util.List;

/**
*@ClassName UserService
*@Description  用户业务逻辑类
*@author crj
*Data 
*@Version 1.0
**/
public class UserService {
    private List<User> userList;

    public void setUserList(List<User> userList){
        this.userList = userList;
    }

    /**
     * 用户登录功能
     */
    public User signIn(String account,String password) {
        for (User user : userList) {
            if (user.getAccount().equals(account) && user.getPassword().equals(Md5Util.crypt(password))) {
                return user;
            }
        }
        return null;
    }
    public  static  void main(String[] args){
        User user =new UserService().signIn("Scui",Md5Util.crypt("999"));
        if (user!=null){
            System.out.println(user);
        } else {
            System.out.println("登陆失败");
        }
    }
}

