package com.example.project5.dto.response;

public class RegisterResponse {
    private String registrationNumber;

    public RegisterResponse(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    
}
