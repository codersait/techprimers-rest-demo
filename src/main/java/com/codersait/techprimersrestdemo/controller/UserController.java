package com.codersait.techprimersrestdemo.controller;

import com.codersait.techprimersrestdemo.model.User;
import com.codersait.techprimersrestdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/all")
    public List<User> getAll(){
        return userService.getAllUsers();
    }
    @GetMapping(value = "/{userId}")
    public User getUser(@PathVariable(value = "userId") String name){
        return userService.getUser(name);
    }

    @PostMapping(value = "load")
    public User load(@RequestBody User user){
       return userService.loadUser(user);
    }



}
