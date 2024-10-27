package com.theelitelions.budgetbuddy.controller;

import com.theelitelions.budgetbuddy.model.bank_account.BankAccount;
import com.theelitelions.budgetbuddy.model.bank_account.BankAccountDao;
import com.theelitelions.budgetbuddy.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
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

    @DeleteMapping("/bankAccount/delete/{id}")
    public ResponseEntity<Void> deleteBankAccountById(@PathVariable int id) {
        boolean isDeleted = bankAccountDao.deleteBankAccountById(id);
        if (isDeleted) {
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }

    @PutMapping("/bankAccount/update/{id}")
    public ResponseEntity<BankAccount> updateBankAccount(@PathVariable int id, @RequestBody BankAccount updatedBankAccount) {
        BankAccount bankAccount = bankAccountDao.updateBankAccount(id, updatedBankAccount);
        if (bankAccount != null) {
            return ResponseEntity.ok(bankAccount); // 200 OK
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }
}
