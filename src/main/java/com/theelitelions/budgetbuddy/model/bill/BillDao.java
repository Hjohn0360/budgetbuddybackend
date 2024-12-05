package com.theelitelions.budgetbuddy.model.bill;

import com.theelitelions.budgetbuddy.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BillDao {

    @Autowired
    private BillRepository repository;

    public Bill save(Bill bill) {
        return repository.save(bill);
    }

    public List<Bill> getAllBills(){
        List<Bill> bills = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(bills :: add);
        return bills;
    }

    public boolean deleteBillById(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    public Bill updateBill(int id, Bill updatedBill) {
        return repository.findById(id)
                .map(bill -> {
                    bill.setPrice(updatedBill.getPrice()); // Updates the fields
                    bill.setRecurring_payment(updatedBill.isRecurring_payment());
                    bill.setAutomatic_payments_on(updatedBill.isAutomatic_payments_on());
                    bill.setName(updatedBill.getName());
                    bill.setDue_date(updatedBill.getDue_date());
                    bill.setSign_up_date(updatedBill.getSign_up_date());
                    return repository.save(bill);
                })
                .orElse(null); // Return null if the bill doesn't exist
    }
}
