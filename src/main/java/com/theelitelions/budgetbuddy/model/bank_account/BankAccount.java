package com.theelitelions.budgetbuddy.model.bank_account;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int user_id;
    private boolean bank_connected;
    private int account_number;
    private int routing_number;
    private String bank_name;
    private int check_id;
    private double monthly_earnings;
    private String encryption;
    private double account_balance;
    private LocalDateTime check_frequency;
    private LocalDateTime date_paid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public boolean isBank_connected(){
        return bank_connected;
    }

    public void setBank_connected(boolean bank_connected) {
        this.bank_connected = bank_connected;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public int getRouting_number() {
        return routing_number;
    }

    public void setRouting_number(int routing_number) {
        this.routing_number = routing_number;
    }

    public String getBank_name(){
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public int getCheck_id() {
        return check_id;
    }

    public void setCheck_id(int check_id) {
        this.check_id = check_id;
    }

    public double getMonthly_earnings() {
        return monthly_earnings;
    }

    public void setMonthly_earnings(double monthly_earnings) {
        this.monthly_earnings = monthly_earnings;
    }

    public String getEncryption(){
        return encryption;
    }

    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    public double getAccount_balance(){
        return account_balance;
    }

    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }

    public LocalDateTime getCheck_frequency() {
        return check_frequency;
    }

    public void setCheck_frequency(LocalDateTime check_frequency) {
        this.check_frequency = check_frequency;
    }

    public LocalDateTime getDate_paid() {
        return date_paid;
    }

    public void setDate_paid(LocalDateTime date_paid) {
        this.date_paid = date_paid;
    }

    @Override
    public String toString(){
        return "Bank Account{" +
                "id=" + id +
                ", user id='" + user_id + '\'' +
                ", bank connected='" + bank_connected + '\'' +
                ", account number='" + account_number + '\'' +
                ", routing number=" + routing_number + '\'' +
                ", bank name='" + bank_name + '\'' +
                ", check id=" + check_id + '\'' +
                ", monthly earnings='" + monthly_earnings + '\'' +
                ", encryption='" + encryption + '\'' +
                ", account balance='" + account_balance + '\'' +
                ", check frequency='" + check_frequency + '\'' +
                ", date paid='" + date_paid + '\'' +
                '}';
    }
}
