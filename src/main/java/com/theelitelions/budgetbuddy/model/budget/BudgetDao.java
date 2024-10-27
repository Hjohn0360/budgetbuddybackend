package com.theelitelions.budgetbuddy.model.budget;

import com.theelitelions.budgetbuddy.model.transaction.Transaction;
import com.theelitelions.budgetbuddy.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BudgetDao {

    @Autowired
    private BudgetRepository repository;

    public Budget save(Budget budget){
        return repository.save(budget);
    }

    //Gives a list of all the users
    public List<Budget> getAllBudgets(){
        List<Budget> budgets = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(budgets :: add);
        return budgets;
    }

    public boolean deleteBudgetById(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    public Budget updateBudget(int id, Budget updatedBudget) {
        return repository.findById(id)
                .map(budget -> {
                    budget.setExpenseName(updatedBudget.getExpenseName());
                    budget.setExpenseAmount(updatedBudget.getExpenseAmount());// Updates the field
                    budget.setBudget_period(updatedBudget.getBudget_period());
                    budget.setAmount_to_save(updatedBudget.getAmount_to_save());
                    budget.setEmergency_fund(updatedBudget.getEmergency_fund());
                    budget.setDueDate(updatedBudget.getDueDate());
                    budget.setAmount_to_invest(updatedBudget.getAmount_to_invest());
                    budget.setApp_id(updatedBudget.getApp_id());
                    budget.setAutoPay(updatedBudget.isAutoPay());
                    budget.setCheck_id(updatedBudget.getCheck_id());
                    budget.setUser_id(updatedBudget.getUser_id());
                    budget.setSpending_limit(updatedBudget.getSpending_limit());
                    return repository.save(budget);
                })
                .orElse(null); // Return null if the user doesn't exist
    }
}
