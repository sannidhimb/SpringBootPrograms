package com.example.project6.Entity;

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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="username")
    private String name;

    @OneToOne
    @JoinColumn(name="registration_id")
     private RegistrationNumberEntity registration;

    @OneToOne
    @JoinColumn(name="profile_id")
    private Profile profile;
    

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

    public RegistrationNumberEntity getRegistration() {
        return registration;
    }

    public void setRegistration(RegistrationNumberEntity registration) {
        this.registration = registration;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    


}
