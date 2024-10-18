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

    public void delete(Bill bill){
        repository.delete(bill);
    }
}
