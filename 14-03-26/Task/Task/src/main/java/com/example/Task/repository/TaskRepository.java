package com.example.Task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Task.entity.TaskEntity;

public interface TaskRepository extends JpaRepository<TaskEntity,Long> {

    
} 
