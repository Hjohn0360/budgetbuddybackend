package com.theelitelions.budgetbuddy.controller;

import com.theelitelions.budgetbuddy.model.budget.Budget;
import com.theelitelions.budgetbuddy.model.budget.BudgetDao;
import com.theelitelions.budgetbuddy.model.transaction.Transaction;
import com.theelitelions.budgetbuddy.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class BudgetController {

    @Autowired
    private BudgetDao budgetDao;

    @GetMapping("/budget/get-all")
    public List<Budget> getAllBudgets(){
        return budgetDao.getAllBudgets();
    }

    @PostMapping("/budget/save")
    public Budget save(@RequestBody Budget budget){
        return budgetDao.save(budget);
    }

    @DeleteMapping("/budget/delete/{id}")
    public ResponseEntity<Void> deleteBudgetById(@PathVariable int id) {
        boolean isDeleted = budgetDao.deleteBudgetById(id);
        if (isDeleted) {
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }

    @PutMapping("/budget/update/{id}")
    public ResponseEntity<Budget> updateBudget(@PathVariable int id, @RequestBody Budget updatedBudget) {
        Budget budget = budgetDao.updateBudget(id, updatedBudget);
        if (budget != null) {
            return ResponseEntity.ok(budget); // 200 OK
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }
}
