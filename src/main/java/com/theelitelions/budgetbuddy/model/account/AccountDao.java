package com.theelitelions.budgetbuddy.model.account;

import com.theelitelions.budgetbuddy.model.user.User;
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

    public boolean deleteAccountById(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    public Account updateAccount(int id, Account updatedAccount) {
        return repository.findById(id)
                .map(account -> {
                    account.setYearlyIncome(updatedAccount.getYearlyIncome()); // Updates the fields
                    account.setGoal(updatedAccount.getGoal());
                    account.setInvestmentName(updatedAccount.getInvestmentName());
                    account.setCurrentSavings(updatedAccount.getCurrentSavings());
                    account.setYearlyExpenses(updatedAccount.getYearlyExpenses());
                    account.setInvestmentAmount(updatedAccount.getInvestmentAmount());
                    return repository.save(account);
                })
                .orElse(null); // Return null if the user doesn't exist
    }
}
