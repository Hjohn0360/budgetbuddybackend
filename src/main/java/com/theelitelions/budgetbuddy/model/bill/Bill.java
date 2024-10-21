package com.theelitelions.budgetbuddy.model.bill;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private boolean automatic_payments_on;
    private double price;
    private LocalDateTime due_date;
    private LocalDateTime sign_up_date;
    private boolean recurring_payment;

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

    public boolean isAutomatic_payments_on() {
        return automatic_payments_on;
    }

    public void setAutomatic_payments_on(boolean automatic_payments_on) {
        this.automatic_payments_on = automatic_payments_on;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isRecurring_payment() {
        return recurring_payment;
    }

    public void setRecurring_payment(boolean recurring_payment) {
        this.recurring_payment = recurring_payment;
    }

    public LocalDateTime getDue_date() {
        return due_date;
    }

    public void setDue_date(LocalDateTime due_date) {
        this.due_date = due_date;
    }

    public LocalDateTime getSign_up_date() {
        return sign_up_date;
    }

    public void setSign_up_date(LocalDateTime sign_up_date) {
        this.sign_up_date = sign_up_date;
    }

    @Override
    public String toString(){
        return "Bill{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", automatic payments on='" + automatic_payments_on + '\'' +
                ", price=" + price + '\'' +
                ", recurring payment=" + recurring_payment + '\'' +
                ", due date='" + due_date + '\'' +
                ", sign up date='" + sign_up_date + '\'' +
                '}';
    }
}
