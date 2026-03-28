package com.example.project5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project5.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

    
} 
