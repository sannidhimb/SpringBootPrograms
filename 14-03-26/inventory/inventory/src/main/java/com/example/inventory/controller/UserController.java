package com.example.inventory.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventory.dto.UserRequest;
import com.example.inventory.dto.UserResponse;
import com.example.inventory.response.ApiResponse;
import com.example.inventory.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @PostMapping
    public ApiResponse<UserResponse> createUser(@RequestBody UserRequest request){
        UserResponse response = userService.createUser(request);
        return new ApiResponse<>("success", response);
    }
}

