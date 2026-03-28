package com.example.billmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.billmanagement.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>   {
    
}
