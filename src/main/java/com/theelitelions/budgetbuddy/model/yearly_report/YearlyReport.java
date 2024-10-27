package com.theelitelions.budgetbuddy.model.yearly_report;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class YearlyReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double annual_amount_made;
    private double amount_made_from_investments;
    private boolean end_of_the_year;
    private double annual_amount_spent;
    private double annual_amount_saved;
    private double annual_amount_invested;
    private double what_if_savings_amount;
    private int bank_account_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAnnual_amount_made() {
        return annual_amount_made;
    }

    public void setAnnual_amount_made(double annual_amount_made) {
        this.annual_amount_made = annual_amount_made;
    }

    public double getAmount_made_from_investments() {
        return amount_made_from_investments;
    }

    public void setAmount_made_from_investments(double amount_made_from_investments) {
        this.amount_made_from_investments = amount_made_from_investments;
    }

    public boolean isEnd_of_the_year() {
        return end_of_the_year;
    }

    public void setEnd_of_the_year(boolean end_of_the_year) {
        this.end_of_the_year = end_of_the_year;
    }

    public double getAnnual_amount_spent() {
        return annual_amount_spent;
    }

    public void setAnnual_amount_spent(double annual_amount_spent) {
        this.annual_amount_spent = annual_amount_spent;
    }

    public double getAnnual_amount_saved() {
        return annual_amount_saved;
    }

    public void setAnnual_amount_saved(double annual_amount_saved) {
        this.annual_amount_saved = annual_amount_saved;
    }

    public double getAnnual_amount_invested() {
        return annual_amount_invested;
    }

    public void setAnnual_amount_invested(double annual_amount_invested) {
        this.annual_amount_invested = annual_amount_invested;
    }

    public double getWhat_if_savings_amount() {
        return what_if_savings_amount;
    }

    public void setWhat_if_savings_amount(double what_if_savings_amount) {
        this.what_if_savings_amount = what_if_savings_amount;
    }

    public int getBank_account_id() {
        return bank_account_id;
    }

    public void setBank_account_id(int bank_account_id) {
        this.bank_account_id = bank_account_id;
    }


    @Override
    public String toString(){
        return "Yearly Report{" +
                "id=" + id +
                ", annual amount made='" + annual_amount_made + '\'' +
                ", amount made from investments='" + amount_made_from_investments + '\'' +
                ", end of the year='" + end_of_the_year + '\'' +
                ", annual amount spent=" + annual_amount_spent + '\'' +
                ", annual amount saved='" + annual_amount_saved + '\'' +
                ", annual amount invested=" + annual_amount_invested + '\'' +
                ", what if savings amount='" + what_if_savings_amount + '\'' +
                ", bank account id='" + bank_account_id + '\'' +
                '}';
    }
}
