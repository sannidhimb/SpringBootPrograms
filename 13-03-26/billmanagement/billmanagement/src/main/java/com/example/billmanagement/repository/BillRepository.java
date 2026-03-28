package com.example.billmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.billmanagement.entity.BillEntity;

public interface BillRepository extends JpaRepository<BillEntity, Long> {
    
}
