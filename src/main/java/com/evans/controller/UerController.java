package com.evans.controller;
import com.evans.model.UserDao;
import com.evans.model.UserDto;
import com.evans.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin()
public class UerController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String getEmployees() {
        return "Welcome!";
    }
    @GetMapping("/hello")
    public List<UserDao> getUsers(){
        return userService.listAllUsers();
    }
}