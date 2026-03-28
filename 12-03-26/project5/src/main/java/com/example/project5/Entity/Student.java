package com.example.project5.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String name;

    @OneToOne
    @JoinColumn(name = "register_id")
    private RegistrationNumberEntity registerationNumber;

    public RegistrationNumberEntity getRegisterationNumber() {
        return registerationNumber;
    }
    public void setRegisterationNumber(RegistrationNumberEntity registerationNumber) {
        this.registerationNumber = registerationNumber;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
     

}
