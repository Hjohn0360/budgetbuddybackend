package com.theelitelions.budgetbuddy.model.user;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.util.Streamable;

@Service
public class UserDao {
    //DAO means Data Access Object

    @Autowired
    private UserRepository repository;

    public User save(User user){
        return repository.save(user);
    }

    //Gives a list of all the users
    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(users :: add);
        return users;
    }

    public void delete(User user){
        repository.delete(user);
    }
}
