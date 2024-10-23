package com.theelitelions.budgetbuddy.model.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountDao {

    @Autowired
    private AccountRepository repository;

    public Account save(Account account){
        return repository.save(account);
    }

    //Gives a list of all the account's info
    public List<Account> getAllAccounts(){
        List<Account> accounts = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(accounts :: add);
        return accounts;
    }

    public void delete(Account account){
        repository.delete(account);
    }
}
