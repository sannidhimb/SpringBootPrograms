package com.example.addition.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.addition.entity.AddEntity;

public interface AddRepository extends JpaRepository<AddEntity,Long>{
    
}
