package com.theelitelions.budgetbuddy.controller;

import com.theelitelions.budgetbuddy.model.bank_account.BankAccount;
import com.theelitelions.budgetbuddy.model.bill_reminder.BillReminder;
import com.theelitelions.budgetbuddy.model.bill_reminder.BillReminderDao;
import com.theelitelions.budgetbuddy.model.investment_portfolio.InvestmentPortfolio;
import com.theelitelions.budgetbuddy.model.investment_portfolio.InvestmentPortfolioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class BillReminderController {
    @Autowired
    private BillReminderDao billReminderDao;

    @GetMapping("/billReminder/get-all")
    public List<BillReminder> getAllBillReminders() {
        return billReminderDao.getAllBillReminders();
    }

    @PostMapping("/billReminder/save")
    public BillReminder save(@RequestBody BillReminder billReminder) {
        return billReminderDao.save(billReminder);
    }

    @DeleteMapping("/billreminder/delete/{id}")
    public ResponseEntity<Void> deleteBillReminderById(@PathVariable int id) {
        boolean isDeleted = billReminderDao.deleteBillReminderById(id);
        if (isDeleted) {
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }

    @PutMapping("//update/{id}")
    public ResponseEntity<BillReminder> updateBillReminder(@PathVariable int id, @RequestBody BillReminder updatedBillReminder) {
        BillReminder billReminder = billReminderDao.updateBillReminder(id, updatedBillReminder);
        if (billReminder != null) {
            return ResponseEntity.ok(billReminder); // 200 OK
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }
}