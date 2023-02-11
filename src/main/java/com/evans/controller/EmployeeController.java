package com.evans.controller;
import com.evans.model.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin()
public class EmployeeController {
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String getEmployees() {
        return "Welcome!";
    }
    @GetMapping("/hi")
    public ResponseEntity<UserDto> getUser(){
        return getUser();
    }
    @GetMapping("/hello")
    public String getUsers(){
        return "hello evans";
    }
}