package com.theelitelions.budgetbuddy.model.transaction;

import com.theelitelions.budgetbuddy.model.user.User;
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

    public boolean deleteTransactionById(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    public Transaction updateTransaction(int id, Transaction updatedTransaction) {
        return repository.findById(id)
                .map(transaction -> {
                    transaction.setExpenseName(updatedTransaction.getExpenseName()); // Updates the fields
                    transaction.setExpenseAmount(updatedTransaction.getExpenseAmount());
                    transaction.setDueDate(updatedTransaction.getDueDate());
                    transaction.setCategory(updatedTransaction.getCategory());
                    transaction.setSubCategory(updatedTransaction.getSubCategory());
                    return repository.save(transaction);
                })
                .orElse(null); // Return null if the user doesn't exist
    }
}
