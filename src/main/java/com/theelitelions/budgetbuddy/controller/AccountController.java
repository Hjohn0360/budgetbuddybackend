package com.theelitelions.budgetbuddy.controller;

import com.theelitelions.budgetbuddy.model.account.Account;
import com.theelitelions.budgetbuddy.model.account.AccountDao;
import com.theelitelions.budgetbuddy.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AccountController {

    @Autowired
    private AccountDao accountDao;

    @GetMapping("/account/get-all")
    public List<Account> getAllAccounts(){
        return accountDao.getAllAccounts();
    }

    @PostMapping("/account/save")
    public Account save(@RequestBody Account account){
        return accountDao.save(account);
    }

    @DeleteMapping("/account/delete/{id}")
    public ResponseEntity<Void> deleteAccountById(@PathVariable int id) {
        boolean isDeleted = accountDao.deleteAccountById(id);
        if (isDeleted) {
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }

    @PutMapping("/account/update/{id}")
    public ResponseEntity<Account> updateAccount(@PathVariable int id, @RequestBody Account updatedAccount) {
        Account account = accountDao.updateAccount(id, updatedAccount);
        if (account != null) {
            return ResponseEntity.ok(account); // 200 OK
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }
}
