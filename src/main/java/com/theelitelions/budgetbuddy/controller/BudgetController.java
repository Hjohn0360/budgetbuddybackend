package com.theelitelions.budgetbuddy.controller;

import com.theelitelions.budgetbuddy.model.budget.Budget;
import com.theelitelions.budgetbuddy.model.budget.BudgetDao;
import com.theelitelions.budgetbuddy.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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
}
