package com.theelitelions.budgetbuddy.controller;

import java.util.List;

import com.theelitelions.budgetbuddy.model.user.User;
import com.theelitelions.budgetbuddy.model.user.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/user/get-all")
    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }

    @PostMapping("/user/save")
    public User save(@RequestBody User user){
        return userDao.save(user);
    }

}
