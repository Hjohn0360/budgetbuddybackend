package com.theelitelions.budgetbuddy.model.bill_reminder;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity


public class BillReminder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private int bill_id;
    private int reminder_time_before_due_date;

    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getBill_id() {
        return bill_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public int getReminder_time_before_due_date() {
        return reminder_time_before_due_date;
    }

    public void setReminder_time_before_due_date(int reminder_time_before_due_date){
        this.reminder_time_before_due_date = reminder_time_before_due_date;
    }

    @Override
    public String toString(){
        return "Bill Reminder{" +
                "id=" + id +
                ", bill id=" + bill_id + '\'' +
                ", reminder time before due date =" + reminder_time_before_due_date + '\'' +
                '}';
    }
}
