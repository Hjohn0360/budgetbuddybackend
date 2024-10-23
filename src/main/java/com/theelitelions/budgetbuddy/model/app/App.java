package com.theelitelions.budgetbuddy.model.app;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class App {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private boolean blocked;
    private boolean spending_limit_exceeded;
    private int spending_limit;
    private boolean limit_reset;
    private boolean limit_ignored;
    private int ignore_limit_amount;

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

    public boolean isBlocked(){
        return blocked;
    }

    public void setBlocked(boolean blocked){
        this.blocked = blocked;
    }

    public boolean isSpending_limit_exceeded(){
        return spending_limit_exceeded;
    }

    public void setSpending_limit_exceeded(boolean spending_limit_exceeded){
        this.spending_limit_exceeded = spending_limit_exceeded;
    }

    public int getSpending_limit(){
        return spending_limit;
    }

    public void setSpending_limit(int spending_limit){
        this.spending_limit = spending_limit;
    }

    public boolean isLimit_reset(){
        return limit_reset;
    }

    public void setLimit_reset(boolean limit_reset){
        this.limit_reset = limit_reset;
    }

    public boolean isLimit_ignored(){
        return limit_ignored;
    }

    public void setLimit_ignored(boolean limit_ignored){
        this.limit_ignored = limit_ignored;
    }

    public int getIgnore_limit_amount(){
        return ignore_limit_amount;
    }

    public void setIgnore_limit_amount(int ignoreLimitAmount){
        this.ignore_limit_amount = ignore_limit_amount;
    }

    @Override
    public String toString(){
        return "App{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", blocked='" + blocked + '\'' +
                ", spending limit exceeded='" + spending_limit_exceeded + '\'' +
                ", spending limit=" + spending_limit + '\'' +
                ", limit reset='" + limit_reset + '\'' +
                ", limit ignored=" + limit_ignored + '\'' +
                ", ignore limit amount='" + ignore_limit_amount + '\'' +
                '}';
    }
}
