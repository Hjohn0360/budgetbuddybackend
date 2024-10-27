package com.theelitelions.budgetbuddy.model.bill_reminder;
import com.theelitelions.budgetbuddy.model.bank_account.BankAccount;
import com.theelitelions.budgetbuddy.model.bank_account.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BillReminderDao {
    @Autowired
    private BillReminderRepository repository;

    public BillReminder save(BillReminder billReminder){
        return repository.save(billReminder);
    }

    //Gives a list of all the users
    public List<BillReminder> getAllBillReminders(){
        List<BillReminder> billReminders = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(billReminders :: add);
        return billReminders;
    }

    // TODO -- Delete and Update methods(Keyron)
}
