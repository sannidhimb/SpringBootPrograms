package com.example.billmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "bills")
public class BillEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bill_id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;


    public long getBill_id() {
        return bill_id;
    }

    public void setBill_id(long bill_id) {
        this.bill_id = bill_id;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
    
}
