package com.henryzhang.service;

import com.henryzhang.po.User;

public interface  UserService {

    User checkUser(String username, String password);

}
