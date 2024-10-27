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
    private BankAccountRepository repository;

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

    public boolean deleteBankAccountById(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    public BankAccount updateBankAccount(int id, BankAccount updatedBankAccount) {
        return repository.findById(id)
                .map(bankAccount -> {
                    bankAccount.setBank_name(updatedBankAccount.getBank_name()); // Updates the fields
                    bankAccount.setEncryption(updatedBankAccount.getEncryption());
                    bankAccount.setAccount_number(updatedBankAccount.getAccount_number());
                    bankAccount.setBank_connected(updatedBankAccount.isBank_connected());
                    bankAccount.setAccount_balance(updatedBankAccount.getAccount_balance());
                    bankAccount.setMonthly_earnings(updatedBankAccount.getMonthly_earnings());
                    bankAccount.setRouting_number(updatedBankAccount.getRouting_number());
                    bankAccount.setCheck_frequency(updatedBankAccount.getCheck_frequency());
                    bankAccount.setCheck_id(updatedBankAccount.getCheck_id());
                    bankAccount.setDate_paid(updatedBankAccount.getDate_paid());
                    bankAccount.setUser_id(updatedBankAccount.getUser_id());
                    return repository.save(bankAccount);
                })
                .orElse(null); // Return null if the user doesn't exist
    }
}
