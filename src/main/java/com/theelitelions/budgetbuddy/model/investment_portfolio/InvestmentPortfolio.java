package com.theelitelions.budgetbuddy.model.investment_portfolio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InvestmentPortfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private int user_id;
    private double total_annual_return;
    private int company_id;

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id(){
    return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public double getTotal_annual_return() {
        return total_annual_return;
    }

    public void setTotal_annual_return(double total_annual_return) {
        this.total_annual_return = total_annual_return;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

}
