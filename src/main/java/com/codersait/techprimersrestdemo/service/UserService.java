package com.codersait.techprimersrestdemo.service;

import com.codersait.techprimersrestdemo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();
    //public String saveUser(User user);

    public User getUser(String name);

    public User loadUser(User user);
}
