package com.theelitelions.budgetbuddy.controller;

import com.theelitelions.budgetbuddy.model.app.App;
import com.theelitelions.budgetbuddy.model.app.AppDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class AppController {

    @Autowired
    private AppDao appDao;

    @GetMapping("/app/get-all")
    public List<App> getAllApps(){
        return appDao.getAllApps();
    }

    @PostMapping("/app/save")
    public App save(@RequestBody App app){
        return appDao.save(app);
    }
}
