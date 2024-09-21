package com.theelitelions.budgetbuddy.model.app;

import com.theelitelions.budgetbuddy.model.user.User;
import com.theelitelions.budgetbuddy.model.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppDao {

    @Autowired
    private AppRepository repository;

    public App save(App app){
        return repository.save(app);
    }

    //Gives a list of all the apps
    public List<App> getAllApps(){
        List<App> apps = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(apps :: add);
        return apps;
    }

    public void delete(App app){
        repository.delete(app);
    }
}
