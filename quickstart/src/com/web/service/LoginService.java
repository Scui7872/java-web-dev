package com.web.service;

public class LoginService {
public boolean isLogin(String username ,String password){
    boolean flag = false;
    if ("Scui".equals(username.trim())&&"999".equals(password.trim())){
        flag = true;

    }
    return flag;
}
}
