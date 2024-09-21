package com.theelitelions.budgetbuddy.controller;

import com.theelitelions.budgetbuddy.model.bank_account.BankAccount;
import com.theelitelions.budgetbuddy.model.bank_account.BankAccountDao;
import com.theelitelions.budgetbuddy.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BankAccountController {

    @Autowired
    private BankAccountDao bankAccountDao;

    @GetMapping("/bankAccount/get-all")
    public List<BankAccount> getAllBankAccounts(){
        return bankAccountDao.getAllBankAccounts();
    }

    @PostMapping("/bankAccount/save")
    public BankAccount save(@RequestBody BankAccount bankAccount){
        return bankAccountDao.save(bankAccount);
    }
}
