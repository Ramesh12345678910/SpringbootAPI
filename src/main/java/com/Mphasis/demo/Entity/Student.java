package com.Mphasis.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Students")
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private int roll_no;

    @Column
    private String name;

    @Column
    private float percentage;

    @Column
    private String branch;

    public Student() {
    }

    public Student(int roll_no, String name, float percentage, String branch) {
        this.roll_no = roll_no;
        this.name = name;
        this.percentage = percentage;
        this.branch = branch;
    }

    public int getRollNo() {
        return roll_no;
    }

    public void setRollNo(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Student[rollno:" + roll_no + ", name:" + name + ", percentage:" + percentage + ", branch:" + branch + "]";
    }
}
