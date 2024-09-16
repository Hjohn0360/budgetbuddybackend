package com.theelitelions.budgetbuddy.model.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String first_name;
    private String last_name;
    private String username;
    private int age;
    private String email;
    private int phone_number;
    private String password;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFirst_Name(){
        return first_name;
    }

    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }

    public String getLast_Name(){
        return last_name;
    }

    public void setLast_name(String last_name){
        this.last_name = last_name;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getPhoneNumber(){
        return phone_number;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phone_number = phone_number;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return "User{" +
                "id=" + id +
                ", first name='" + first_name + '\'' +
                ", last name='" + last_name + '\'' +
                ", username='" + username + '\'' +
                ", age=" + age + '\'' +
                ", email='" + email + '\'' +
                ", phone_number=" + phone_number + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
