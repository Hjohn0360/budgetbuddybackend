

package com.theelitelions.budgetbuddy.model.invested_company;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class InvestedCompany {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private double dividend_value;
    private double dividend_yield;
    private double annual_return;
    private double projected_annual_return;
    private double invested_amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDividend_value() {
        return dividend_value;
    }

    public void setDividend_value(double dividend_yield) {
        this.dividend_value = dividend_yield;
    }

    public double getAnnual_return() {
        return annual_return;
    }

    public void setAnnual_return(double annual_return) {
        this.annual_return = annual_return;
    }

    public double getDividend_yield() {
        return dividend_yield;
    }

    public void setDividend_yield(double dividend_yield) {
        this.dividend_yield= dividend_yield;
    }

    public double getProjected_annual_return() {
        return projected_annual_return;
    }

    public void setProjected_annual_return(double projected_annual_return) {
        this.projected_annual_return = projected_annual_return;
    }

    public double getInvested_amount() {
        return invested_amount;
    }

    public void setInvested_amount(double invested_amount) {
        this.invested_amount = invested_amount;
    }

    @Override
    public String toString(){
        return "Invested Company{" +
                "id=" + id +
                ", dividend value='" + dividend_value + '\'' +
                ", name='" + name + '\'' +
                ", dividend yield='" + dividend_yield + '\'' +
                ", annual return=" + annual_return+ '\'' +
                ", project annual return='" + projected_annual_return + '\'' +
                ", invested amount=" + invested_amount + '\'' +
                '}';
    }

}









