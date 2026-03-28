package com.example.Task.response;

//import java.util.List;

//import com.example.Task.entity.TaskEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {
    private String status;
    private T data;
}
