package com.theelitelions.budgetbuddy.controller;

import com.theelitelions.budgetbuddy.model.account.Account;
import com.theelitelions.budgetbuddy.model.app.App;
import com.theelitelions.budgetbuddy.model.app.AppDao;
import com.theelitelions.budgetbuddy.model.bill.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AppController {

    @Autowired
    private AppDao appDao;

    @GetMapping("/app/get-all")
    public List<App> getAllApps() {
        return appDao.getAllApps();
    }

    @PostMapping("/app/save")
    public App save(@RequestBody App app) {
        return appDao.save(app);
    }

    @DeleteMapping("/app/delete/{id}")
    public ResponseEntity<Void> deleteAppById(@PathVariable int id) {
        boolean isDeleted = appDao.deleteAppById(id);
        if (isDeleted) {
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }

    @PutMapping("/app/update/{id}")
    public ResponseEntity<App> updatedApp(@PathVariable int id, @RequestBody App updatedApp) {
        App app = appDao.updateApp(id, updatedApp);
        if (app != null) {
            return ResponseEntity.ok(app); // 200 OK
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }
}