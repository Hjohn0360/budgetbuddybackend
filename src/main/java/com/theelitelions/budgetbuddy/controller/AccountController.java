package com.theelitelions.budgetbuddy.controller;

import com.theelitelions.budgetbuddy.model.account.Account;
import com.theelitelions.budgetbuddy.model.account.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
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
}
