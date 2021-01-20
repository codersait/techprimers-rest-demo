package com.codersait.techprimersrestdemo.service;

import com.codersait.techprimersrestdemo.model.User;
import com.codersait.techprimersrestdemo.repository.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public User loadUser(User user) {
        return userRepository.save(user);
    }


}
