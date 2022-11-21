package com.generation.generation1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.generation.generation1.model.User;
import com.generation.generation1.repository.UserRepository;



@Service
public class UserServiceImpl implements UserService{
    ArrayList <User> userlist = new ArrayList<>();
    private UserRepository userRepository;
    // esto verifica la conexion a la bbdd
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    
    @Override
    public User getUser(Integer id) {
        // selecet * from user where id = id ;
        Optional<User> users = userRepository.findById(id);
       // el orElse nos permite verificar si hay o no datos en nuestra lista
        return users.orElse(null);
    }
    @Override
    public User save(User user) {
        // insert into user (columnas) (value);
        return userRepository.save(user);
    }
    @Override
    public void delete(Integer id) {
        //delete from user where id = id
        userRepository.deleteById(id);
    }

    @Override
    public List <User> getAllUser() {
       /* for (User user : userRepository.findAll()) {
            userlist.add(user);
       } */
        return (List<User>) userRepository.findAll();
    }

    
}
