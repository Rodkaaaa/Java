package com.practica.wea.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.practica.wea.model.User;
import com.practica.wea.repository.UserRepository;

@Service
public class funcionDeUsuario implements UserService {
    private UserRepository userRepository;
    public funcionDeUsuario(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public List <User> getAllUser() {
       /* for (User user : userRepository.findAll()) {
            userlist.add(user);
       } */
        return (List<User>) userRepository.findAll();
    }
    @Override
    public User getUser(Integer id) {
        Optional<User> users = userRepository.findById(id);
        return users.orElse(null);
    }

    @Override
    public User save(User user) {
        // TODO Auto-generated method stub
        return userRepository.save(user); // new user(id,name,lastname)
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        userRepository.deleteById(id);;
    }

    
}
