package org.example;

import jakarta.persistence.*;

//by-default tableName = className
@Entity//table
@Table(name="student_info")
public class student_detail {  //POJO class
    @Id
    private int id;
    @Transient
    private int roll_no;
    private String First_Name;
    private String Last_Name;
    @Column(name="email_address")
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
