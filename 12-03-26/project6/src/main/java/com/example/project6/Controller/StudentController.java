package com.example.project6.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project6.Entity.Profile;
import com.example.project6.Entity.RegistrationNumberEntity;
import com.example.project6.Service.StudentService;
import com.example.project6.dto.request.ProfileRequest;
import com.example.project6.dto.request.RegistrationRequest;
import com.example.project6.dto.request.StudentRequest;
import com.example.project6.dto.response.StudentResponse;

@RestController
@RequestMapping("/student")
public class StudentController {
    
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public StudentResponse createStudent(@RequestBody StudentRequest request) {
        return studentService.createStudent(request);
    }

    @PostMapping("/{studentId}/registration")
    public RegistrationNumberEntity addRegistration(
            @PathVariable Long studentId,
            @RequestBody RegistrationRequest request) {

        return studentService.addRegistration(studentId, request);
    }

    @PostMapping("/{studentId}/profile")
    public Profile addProfile(
            @PathVariable Long studentId,
            @RequestBody ProfileRequest request) {

        return studentService.addProfile(studentId, request);
    }
}
