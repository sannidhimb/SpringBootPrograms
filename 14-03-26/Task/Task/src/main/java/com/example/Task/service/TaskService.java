package com.example.Task.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.Task.dto.TaskRequest;
import com.example.Task.dto.TaskResponse;
import com.example.Task.repository.TaskRepository;
import com.example.Task.entity.TaskEntity;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

     public TaskService(TaskRepository taskRepository) {
         this.taskRepository = taskRepository;
    }
    public List<TaskResponse> createTasks(List<TaskRequest> request){
        List<TaskEntity> tasks = request.stream().map(
            req -> {
                TaskEntity task = new TaskEntity();
                task.setTitle(req.getTitle());
                task.setDescription(req.getDescription());
                task.setPriority(req.getPriority());
                return task;
            }).collect(Collectors.toList());

            List<TaskEntity> savedTasks = taskRepository.saveAll(tasks);

            return savedTasks.stream().map(
                task -> {
                    TaskResponse res = new TaskResponse();
                    res.setId(task.getId());
                    res.setTitle(task.getTitle());
                    res.setDescription(task.getDescription());
                    res.setPriority(task.getPriority());
                    return res;
                }
            ).collect(Collectors.toList());

    }
    public Page<TaskEntity> getTasks(Pageable pageable){
        return taskRepository.findAll(pageable);
    }

}
