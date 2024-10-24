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
    // TODO -- Finish this
    public Budget updateBudget(int id, Budget updatedBudget) {
        return repository.findById(id)
                .map(budget -> {
                    updatedBudget.setExpenseName(updatedBudget.getExpenseName());
                    updatedBudget.setExpenseAmount(updatedBudget.getExpenseAmount());// Updates the field
                    updatedBudget.setBudget_period(updatedBudget.getBudget_period());
                    updatedBudget.setAmount_to_save(updatedBudget.getAmount_to_save());
                    updatedBudget.setEmergency_fund(updatedBudget.getEmergency_fund());
                    updatedBudget.setDueDate(updatedBudget.getDueDate());
                    return repository.save(budget);
                })
                .orElse(null); // Return null if the user doesn't exist
    }
}
