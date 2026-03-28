package com.example.project6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project6.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
