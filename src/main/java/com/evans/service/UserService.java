package com.evans.service;

import com.evans.model.UserDao;

import java.util.List;

public interface UserService {
    List<UserDao> listAllUsers();
}
