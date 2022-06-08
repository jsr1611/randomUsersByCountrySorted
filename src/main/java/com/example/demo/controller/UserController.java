package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

/**
 * Project demo1
 * Author: jimmy
 */

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService service;
    public UserController(final UserServiceImpl service){
        this.service = service;
    }
    @GetMapping("/usersByCountry")
    public Map<String, Integer> getUsersByNationality(){
        return service.getUsersCountByCountry();
    }

    @GetMapping("/")
    public String hello(){
        return "Hello there! This is the basic entry point for the application. Please, do check other API endpoints.";
    }
}