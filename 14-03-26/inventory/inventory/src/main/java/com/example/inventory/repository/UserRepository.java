package com.example.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inventory.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

} 
