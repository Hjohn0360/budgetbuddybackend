package com.theelitelions.budgetbuddy.controller;

import com.theelitelions.budgetbuddy.model.transaction.Transaction;
import com.theelitelions.budgetbuddy.model.transaction.TransactionDao;
import com.theelitelions.budgetbuddy.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @DeleteMapping("/transaction/delete/{id}")
    public ResponseEntity<Void> deleteTransactionById(@PathVariable int id) {
        boolean isDeleted = transactionDao.deleteTransactionById(id);
        if (isDeleted) {
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }

    @PutMapping("/transaction/update/{id}")
    public ResponseEntity<Transaction> updateTransaction(@PathVariable int id, @RequestBody Transaction updatedTransaction) {
        Transaction transaction = transactionDao.updateTransaction(id, updatedTransaction);
        if (transaction != null) {
            return ResponseEntity.ok(transaction); // 200 OK
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }
}
