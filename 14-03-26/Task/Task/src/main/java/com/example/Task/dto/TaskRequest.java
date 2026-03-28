package com.example.Task.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class TaskRequest {
    @NotBlank(message = "Title cannot be empty")
    private String title;

    private String description;

    @Positive(message = "Priority should be positive")
    private Integer priority;
}
