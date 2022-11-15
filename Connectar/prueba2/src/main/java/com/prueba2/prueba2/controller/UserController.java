package com.prueba2.prueba2.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.prueba2.prueba2.model.User;
import com.prueba2.prueba2.service.UserService;
import com.prueba2.prueba2.service.UserServiceHashmap;

@RestController
public class UserController   {
    public UserService userService;
    public UserServiceHashmap userServiceHashmap;

    public UserController(@Autowired UserService userService, UserServiceHashmap userServiceHashmap){
        this.userService = userService;   
        this.userServiceHashmap = userServiceHashmap;    
        userService.add(new User(1,"Frederick","cid"));
        userService.add(new User(2,"Manito","Juja"));
        userServiceHashmap.addMap(1, new User(3,"tangananica","tanganana"));
        
    } 

   /*  public UserController(@Autowired UserServiceHashmap userServiceHashmap,){
        this.userServiceHashmap = userServiceHashmap;        
        userServiceHashmap.addMap(1, new User(3,"tangananica","tanganana"));
    }   */
    
    
    @GetMapping("/user")
    public User getUser(){
        return userService.getUser(0);
    } 


    @GetMapping("/AllUser")
    public List<User> getAllUser(){
        return userService.getAll();
    }
    
    @GetMapping("/HashMap")
    public Map<Integer, User> getAllMap() {
        return userServiceHashmap.getAllMap();
    }
    @GetMapping("/HashMapUno")
    public User Posicion(int position) {
        return userServiceHashmap.getOneUser("1");
    }

    //localhost:8080/FindUser/1
    @PostMapping("/FindUser/{id}")
    public User findUser(@PathVariable("id") int id){
        return userService.getUser(id);
    }
}
