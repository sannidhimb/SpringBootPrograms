package com.example.project6.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dob;

    private String address;

    private String phoneNumber;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Long getId() {
        return id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Student getStudent() {
        return student;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}