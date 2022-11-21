package com.prueba2.prueba2.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.prueba2.prueba2.model.User;

@Service
public class UserServiceMap implements UserServiceHashmap {
    private Map<Integer, User> userMap = new HashMap<>();
                //KEY ,  VALUE
    public UserServiceMap(){

    }

    @Override
    public Map<Integer, User> getAllMap() {
        return userMap;
    }

    @Override
    public void addMap(int num, User user) {
        userMap.put(num, user);
    }

    @Override
    public void removeMap(int num) {   // KEY = CUALQUIER VALOR , VALUE = CUALQUIER VALOR
        userMap.remove(num);           // KEY = INT = NUM
        
    }

    @Override
    public int sizeMap() {
        return userMap.size();
    }

    @Override
    public  User getOneUser(Integer position) {
        return userMap.get(position);
    }

}