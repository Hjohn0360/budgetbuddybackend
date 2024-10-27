package com.theelitelions.budgetbuddy.model.account;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float goal;
    private float currentSavings;
    private String investmentName;
    private float investmentAmount;
    private float yearlyIncome;
    private float yearlyExpenses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getGoal() {
        return goal;
    }

    public void setGoal(float goal) {
        this.goal = goal;
    }

    public float getCurrentSavings() {
        return currentSavings;
    }

    public void setCurrentSavings(float currentSavings) {
        this.currentSavings = currentSavings;
    }

    public String getInvestmentName() {
        return investmentName;
    }

    public void setInvestmentName(String investmentName) {
        this.investmentName = investmentName;
    }

    public float getInvestmentAmount() {
        return investmentAmount;
    }

    public void setInvestmentAmount(float investmentAmount) {
        this.investmentAmount = investmentAmount;
    }

    public float getYearlyIncome() {
        return yearlyIncome;
    }

    public void setYearlyIncome(float yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }

    public float getYearlyExpenses() {
        return yearlyExpenses;
    }

    public void setYearlyExpenses(float yearlyExpenses) {
        this.yearlyExpenses = yearlyExpenses;
    }

    @Override
    public String toString(){
        return "Account{" +
                "id=" + id +
                ", goal=" + goal + '\'' +
                ", current savings=" + currentSavings + '\'' +
                ", investment name='" + investmentName + '\'' +
                ", investment amount=" + investmentAmount + '\'' +
                ", yearly income=" + yearlyIncome + '\'' +
                ", yearly expenses=" + yearlyExpenses + '\'' +
                '}';
    }
}