package com.example.project5.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project5.Service.StudentService;
import com.example.project5.dto.request.StudentRequest;
import com.example.project5.dto.response.ApiResponse;
import com.example.project5.dto.response.StudentResponse;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    
    @PostMapping("/add")
    public ApiResponse<StudentResponse> createStudent(@RequestBody StudentRequest request){
        StudentResponse studentResponse =studentService.saveStudent(request);
        return new ApiResponse<StudentResponse>("Success", studentResponse);
    }

   @PostMapping("/{id}/register")
   public ApiResponse<StudentResponse> assignRegister(
    @PathVariable Long id,
    @RequestBody String registerNumber
   ){
    StudentResponse response =studentService.assignRegistration(id, registerNumber);
    return new ApiResponse<StudentResponse>("Success", response);
   }
        
    
}
