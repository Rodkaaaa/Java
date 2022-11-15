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
    private List <User> userList = new ArrayList<>();

    public UserServiceArrayList(){

    }

    @Override
    public List<User> getAll(){
        return userList;
    }

    @Override
    public void add(User user){
        userList.add(user);
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
