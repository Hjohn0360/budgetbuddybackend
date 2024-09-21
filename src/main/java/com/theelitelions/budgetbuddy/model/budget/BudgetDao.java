package com.theelitelions.budgetbuddy.model.budget;

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

    public void delete(Budget budget){
        repository.delete(budget);
    }
}
