package com.prueba2.prueba2.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.stereotype.Service;

//import org.hibernate.mapping.Array;
import org.springframework.stereotype.Service;
import com.prueba2.prueba2.model.User;

@Service
public class UserServiceArrayList implements UserService {
    private Map <Integer, User> userMap = new HashMap<>();
    //crear lista vacia
    private List <User> userList = new ArrayList<>();
    //user (id = 1 , nombre = nombre, = apellido = apellido) = un dato tipo object
    // tipo objeto n 0 = 1,frederick,cid
    // tipo objeto n 1 = 2, javier , sepulveda

    public UserServiceArrayList(){

    }
    //funcionalidad a metodo
    @Override
    public List<User> getAll(){
        return userList;
         // tipo objeto n 0 = 1,frederick,cid
         // tipo objeto n 1 = 2, javier , sepulveda
    }

    @Override
    public void add(User user /* nombre del objeto */){
        userList.add(user);// new User(id:1,nombre:frederick,Apellido:cid)
    }

    @Override
    public void remove(User user){
        userList.remove(user);
    }

    @Override
    public int size(){
        return userList.size();
    }

    @Override
    public User getUser(int position){
        return userList.get(position);
    }

    /*  @Override
    public Map<Integer, User> getAllMap() {
        return userMap;
    }
    @Override
    public void addMap(int num, User user) {
        userMap.put(num, user);
    } */
    
}
