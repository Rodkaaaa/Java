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
    public UserService userService /* <-nombre de clase */;// invocar Clsee
    public UserServiceHashmap userServiceHashmap;
    //funcionalida interna
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
    
    // para mostrar a usuario o que usario interactue
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
    @GetMapping("/FindUser/{id}")//java es el medio webeo pero s
    public User findUser(@PathVariable("id") int id){
        return userService.getUser(id);

    //mysql.jc.jbdc.localhost:8080/mydb/root/admin
    }

    @GetMapping("/addUser/{id}/{nombre}/{apellido}")
    public List<User> addUser(@PathVariable("id") int id, @PathVariable("nombre") String nombre, @PathVariable String apellido){
        userService.add(new User(id,nombre,apellido));
        return userService.getAll();
    }

    @GetMapping("/removeUser/{id}/{nombre}/{apellido}")
    public List<User> removreUser(@PathVariable("id") int id, @PathVariable("nombre") String nombre, @PathVariable String apellido){
        userService.remove(new User(id,nombre,apellido));
        return userService.getAll();
    }

    @GetMapping("/CountUser")
    public int count(){
        return userService.size();
    }

    @GetMapping("/AgregarMap/{num}/{id}/{nombre}/{apellido}")
    public Map<Integer, User> agregarMap(@PathVariable("num") int num ,@PathVariable("id") int id, @PathVariable("nombre") String nombre, @PathVariable String apellido){
        userServiceHashmap.addMap(num, new User(id,nombre,apellido));
        return userServiceHashmap.getAllMap();
    }

    @GetMapping("/BorrarMap/{num}")
    public Map<Integer, User> borrarMap(@PathVariable("num") int num){
        userServiceHashmap.removeMap(num);
        return userServiceHashmap.getAllMap();
    }
}
