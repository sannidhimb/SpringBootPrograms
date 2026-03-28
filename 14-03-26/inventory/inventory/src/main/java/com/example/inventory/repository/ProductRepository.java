package com.example.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inventory.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{
}

