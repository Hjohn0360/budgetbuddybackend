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
    private double annuel_amount_made;
    private double amount_made_from_investments;
    private boolean end_of_the_year;
    private double annuel_amount_spent;
    private double annuel_amount_saved;
    private double annuel_amount_invested;
    private double what_if_savings_amount;
    private int bank_account_id;
    private int user_id;

    public double getAnnuel_amount_made() {
        return annuel_amount_made;
    }

    public void setAnnuel_amount_made(double annuel_amount_made) {
        this.annuel_amount_made = annuel_amount_made;
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

    public double getAnnuel_amount_spent() {
        return annuel_amount_spent;
    }

    public void setAnnuel_amount_spent(double annuel_amount_spent) {
        this.annuel_amount_spent = annuel_amount_spent;
    }

    public double getAnnuel_amount_saved() {
        return annuel_amount_saved;
    }

    public void setAnnuel_amount_saved(double annuel_amount_saved) {
        this.annuel_amount_saved = annuel_amount_saved;
    }

    public double getAnnuel_amount_invested() {
        return annuel_amount_invested;
    }

    public void setAnnuel_amount_invested(double annuel_amount_invested) {
        this.annuel_amount_invested = annuel_amount_invested;
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

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString(){
        return "Yearly Report{" +
                "id=" + id +
                ", annuel amount made='" + annuel_amount_made + '\'' +
                ", amount made from investments='" + amount_made_from_investments + '\'' +
                ", end of the year='" + end_of_the_year + '\'' +
                ", annuel amount spent=" + annuel_amount_spent + '\'' +
                ", annuel amount saved='" + annuel_amount_saved + '\'' +
                ", annuel amount invested=" + annuel_amount_invested + '\'' +
                ", what if savings amount='" + what_if_savings_amount + '\'' +
                ", bank account id='" + bank_account_id + '\'' +
                ", user id='" + user_id + '\'' +
                '}';
    }
}
