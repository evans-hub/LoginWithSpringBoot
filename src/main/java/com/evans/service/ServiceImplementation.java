package com.evans.service;

import com.evans.model.UserDao;
import com.evans.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImplementation implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDao> listAllUsers() {
        return userRepository.findAll();
    }
}
