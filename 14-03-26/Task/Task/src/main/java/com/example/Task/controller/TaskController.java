package com.example.Task.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Task.dto.TaskRequest;
import com.example.Task.dto.TaskResponse;
import com.example.Task.entity.TaskEntity;
//import com.example.Task.entity.TaskEntity;
import com.example.Task.response.ApiResponse;
import com.example.Task.service.TaskService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    public final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/bulk")
    public ApiResponse<List<TaskResponse>> createTasks(@Valid @RequestBody List<TaskRequest> requests){
        List<TaskResponse> response = taskService.createTasks(requests);
        return new ApiResponse<List<TaskResponse>>("Success", response);
    }

    @GetMapping
    public ApiResponse<Page<TaskEntity>> getTasks(Pageable pageable){
        Page<TaskEntity> response = taskService.getTasks(pageable);
        return new ApiResponse<Page<TaskEntity>>("Success", response);
    }


}
