package com.theelitelions.budgetbuddy.controller;

import com.theelitelions.budgetbuddy.model.transaction.Transaction;
import com.theelitelions.budgetbuddy.model.transaction.TransactionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TransactionController {

    @Autowired
    private TransactionDao transactionDao;

    @GetMapping("/transaction/get-all")
    public List<Transaction> getAllTransactions(){
        return transactionDao.getAllTransactions();
    }

    @PostMapping("/transaction/save")
    public Transaction save(@RequestBody Transaction transaction){
        return transactionDao.save(transaction);
    }
}
