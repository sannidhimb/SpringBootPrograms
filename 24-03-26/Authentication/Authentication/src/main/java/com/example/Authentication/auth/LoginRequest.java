package com.example.Authentication.auth;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}
