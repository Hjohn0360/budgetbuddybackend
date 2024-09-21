package com.theelitelions.budgetbuddy.model.bank_account;

import com.theelitelions.budgetbuddy.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BankAccountDao {

    @Autowired
    private BanKAccountRepository repository;

    public BankAccount save(BankAccount bankAccount){
        return repository.save(bankAccount);
    }

    //Gives a list of all the users
    public List<BankAccount> getAllBankAccounts(){
        List<BankAccount> bankAccounts = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(bankAccounts :: add);
        return bankAccounts;
    }

    public void delete(BankAccount bankAccount){
        repository.delete(bankAccount);
    }
}
