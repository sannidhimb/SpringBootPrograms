package com.example.project6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project6.Entity.RegistrationNumberEntity;

public interface RegistrationNumberRepository extends JpaRepository<RegistrationNumberEntity, Long> {
    
}
