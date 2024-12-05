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

    public boolean deleteUserById(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    public User updateUser(int id, User updatedUser) {
        return repository.findById(id)
                .map(user -> {
                    user.setFirst_name(updatedUser.getFirst_Name()); // Updates the fields
                    user.setLast_name(updatedUser.getLast_Name());
                    user.setAge(updatedUser.getAge());
                    user.setUsername(updatedUser.getUsername());
                    user.setPhoneNumber(updatedUser.getPhoneNumber());
                    user.setAddress(updatedUser.getAddress());
                    user.setEmail(updatedUser.getUsername());
                    user.setPassword(updatedUser.getPassword());
                    return repository.save(user);
                })
                .orElse(null); // Return null if the user doesn't exist
    }
}
