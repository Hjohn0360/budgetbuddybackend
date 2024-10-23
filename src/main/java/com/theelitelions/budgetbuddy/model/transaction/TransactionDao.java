package com.theelitelions.budgetbuddy.model.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionDao {

    @Autowired
    private TransactionRepository repository;

    public Transaction save(Transaction transactions){
        return repository.save(transactions);
    }

    //Gives a list of all the transactions
    public List<Transaction> getAllTransactions(){
        List<Transaction> transactions = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(transactions :: add);
        return transactions;
    }

    public void delete(Transaction transaction){
        repository.delete(transaction);
    }
}
