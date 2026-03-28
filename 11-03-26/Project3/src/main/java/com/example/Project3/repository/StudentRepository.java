package com.example.Project3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project3.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
    
}
