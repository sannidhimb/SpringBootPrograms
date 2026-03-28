package com.example.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inventory.entity.BillItemEntity;

public interface BillItemRepository extends JpaRepository<BillItemEntity, Long>{
    List<BillItemEntity> findByBillId(Long billId);
}

