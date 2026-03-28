package com.example.Project3.Contoller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project3.Service.StudentService;
import com.example.Project3.dto.request.StudentRequest;
import com.example.Project3.dto.response.ApiResponse;
import com.example.Project3.dto.response.StudentResponse;
@RestController
@RequestMapping("/student")
public class StudentController {
    private final  StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping("/calc")
    public ApiResponse<StudentResponse> calResult(@RequestBody StudentRequest request){
        StudentResponse result=studentService.processStudent(request);
        return new ApiResponse<StudentResponse>("Success", result);
    }
    @GetMapping("/result")
    public ApiResponse<List<StudentResponse>> getAllStudentResult(){
     List<StudentResponse> results=studentService.getAllStudentResults(); 
        return new ApiResponse<List<StudentResponse>>("Success", results);
    }
}
