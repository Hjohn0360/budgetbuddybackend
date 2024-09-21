package com.theelitelions.budgetbuddy.model.investment_company;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class InvestmentCompany {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String first_name;
    private String last_name;


    public int getId() {
        return id;

    }
}
