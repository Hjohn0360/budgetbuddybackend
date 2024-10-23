package com.theelitelions.budgetbuddy.model.transaction;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String expenseName;
    private float expenseAmount;
    private String category;
    private String subCategory;
    private LocalDate dueDate;
    private boolean isAutoPay;

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public float getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(float expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isAutoPay() {
        return isAutoPay;
    }

    public void setAutoPay(boolean autoPay) {
        isAutoPay = autoPay;
    }

    @Override
    public String toString(){
        return "Transaction{" +
                "id=" + id +
                ", expense name='" + expenseName + '\'' +
                ", expense amount=" + expenseAmount + '\'' +
                ", category='" + category + '\'' +
                ", subcategory='" + subCategory + '\'' +
                ", due date='" + dueDate + '\'' +
                ", Auto Pay=" + isAutoPay + '\'' +
                '}';
    }
}
