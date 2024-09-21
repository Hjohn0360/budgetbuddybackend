package com.theelitelions.budgetbuddy.model.investment_portfolio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Entity
public class InvestmentPortfolio {
    private int id;
    private String first_name;
    private String last_name;
    private String username;
    private String  return;
    private int company;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    







}
