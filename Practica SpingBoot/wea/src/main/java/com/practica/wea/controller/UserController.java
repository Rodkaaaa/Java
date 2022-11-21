package com.practica.wea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practica.wea.model.User;
import com.practica.wea.service.UserService;



@CrossOrigin("*")
@RestController
public class UserController {
     private UserService userService;

     public UserController(@Autowired UserService userService){
        this.userService =  userService;
     }


     @GetMapping("/allUser")
     protected List<User> getAllUser(){
        return userService.getAllUser();
     }

     @GetMapping("/user")
     public User newUser(@RequestBody User user){
        return userService.save(user);
     }
}
