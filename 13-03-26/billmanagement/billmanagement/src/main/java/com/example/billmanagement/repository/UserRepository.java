package com.example.billmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.billmanagement.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>     {
    
}
