package com.theelitelions.budgetbuddy.model.budget;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double amount_to_save;
    private double spending_limit;
    private double amount_to_invest;
    private double emergency_fund;
    private int app_id;
    private int check_id;
    private int user_id;
    private LocalDateTime budget_period;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount_to_save() {
        return amount_to_save;
    }

    public void setAmount_to_save(double amount_to_save) {
        this.amount_to_save = amount_to_save;
    }

    public double getSpending_limit(){
        return spending_limit;
    }

    public void setSpending_limit(double spending_limit) {
        this.spending_limit = spending_limit;
    }

    public double getAmount_to_invest() {
        return amount_to_invest;
    }

    public void setAmount_to_invest(double amount_to_invest) {
        this.amount_to_invest = amount_to_invest;
    }

    public double getEmergency_fund() {
        return emergency_fund;
    }

    public void setEmergency_fund(double emergency_fund) {
        this.emergency_fund = emergency_fund;
    }

    public int getApp_id() {
        return app_id;
    }

    public void setApp_id(int app_id) {
        this.app_id = app_id;
    }

    public int getCheck_id() {
        return check_id;
    }

    public void setCheck_id(int check_id) {
        this.check_id = check_id;
    }

    public int getUser_id(){
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public LocalDateTime getBudget_period() {
        return budget_period;
    }

    public void setBudget_period(LocalDateTime budget_period) {
        this.budget_period = budget_period;
    }

    @Override
    public String toString(){
        return "Budget{" +
                "id=" + id +
                ", amount to save='" + amount_to_save + '\'' +
                ", spending limit='" + spending_limit + '\'' +
                ", amount to invest='" + amount_to_invest + '\'' +
                ", emergency fund =" + emergency_fund + '\'' +
                ", app id='" + app_id + '\'' +
                ", check id=" + check_id + '\'' +
                ", user id=" + user_id + '\'' +
                '}';
    }
}
