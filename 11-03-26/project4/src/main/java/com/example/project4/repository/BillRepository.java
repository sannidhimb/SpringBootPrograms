package com.example.project4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project4.Entity.Bill;

public interface BillRepository extends JpaRepository<Bill,Long>{
    
}
