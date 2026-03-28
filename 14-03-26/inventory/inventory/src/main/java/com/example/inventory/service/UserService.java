package com.example.inventory.service;

import org.springframework.stereotype.Service;

import com.example.inventory.dto.UserRequest;
import com.example.inventory.dto.UserResponse;
import com.example.inventory.entity.UserEntity;
import com.example.inventory.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public UserResponse createUser(UserRequest request){
        UserEntity userEntity = new UserEntity();
        userEntity.setName(request.getName());

        UserEntity savedUser = userRepository.save(userEntity);

        UserResponse response = new UserResponse();
        response.setId(savedUser.getId());
        response.setName(savedUser.getName());

        return response;
    }
}

