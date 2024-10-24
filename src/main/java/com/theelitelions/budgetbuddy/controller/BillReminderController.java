package com.theelitelions.budgetbuddy.controller;

import com.theelitelions.budgetbuddy.model.bill_reminder.BillReminder;
import com.theelitelions.budgetbuddy.model.bill_reminder.BillReminderDao;
import com.theelitelions.budgetbuddy.model.investment_portfolio.InvestmentPortfolio;
import com.theelitelions.budgetbuddy.model.investment_portfolio.InvestmentPortfolioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class BillReminderController {
    @Autowired
    private BillReminderDao billReminderDao;
    @GetMapping("/billReminder/get-all")
    public List<BillReminder> getAllBillReminders(){
        return billReminderDao.getAllBillReminders();
    }

    @PostMapping("/billReminder/save")
    public BillReminder save(@RequestBody BillReminder billReminder){
        return billReminderDao.save(billReminder);
    }
}
