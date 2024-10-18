package com.theelitelions.budgetbuddy.controller;

import com.theelitelions.budgetbuddy.model.bill.Bill;
import com.theelitelions.budgetbuddy.model.bill.BillDao;
import com.theelitelions.budgetbuddy.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class BillController {

    @Autowired
    private BillDao billDao;

    @GetMapping("/bill/get-all")
    public List<Bill> getAllBills(){
        return billDao.getAllBills();
    }

    @PostMapping("/bill/save")
    public Bill save(@RequestBody Bill bill){
        return billDao.save(bill);
    }
}
