package com.theelitelions.budgetbuddy.model.bill_reminder;
import com.theelitelions.budgetbuddy.model.bank_account.BankAccount;
import com.theelitelions.budgetbuddy.model.bank_account.BankAccountRepository;
import com.theelitelions.budgetbuddy.model.bill.Bill;
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
    public boolean deleteBillReminderById(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
    public BillReminder updateBillReminder(int id, BillReminder updatedBillReminder) {
        return repository.findById(id)
                .map(billReminder -> {
                    billReminder.setBill_id(updatedBillReminder.getBill_id()); // Updates the fields
                    billReminder.setReminder_time_before_due_date(updatedBillReminder.getReminder_time_before_due_date());
                    return repository.save(billReminder);
                })
                .orElse(null); // Return null if the bill doesn't exist
    }
}
