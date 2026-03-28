package com.example.project5.dto.response;

public class StudentResponse {
    private Long id;
    private String name;
    private String registrationNumber;
    public StudentResponse(Long id, String name, String registrationNumber) {
        this.id = id;
        this.name = name;
        this.registrationNumber = registrationNumber;
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
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    
}
