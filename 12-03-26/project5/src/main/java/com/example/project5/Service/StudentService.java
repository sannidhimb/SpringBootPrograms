package com.example.project5.Service;

import org.springframework.stereotype.Service;

import com.example.project5.Entity.RegistrationNumberEntity;
import com.example.project5.Entity.Student;
import com.example.project5.dto.request.StudentRequest;
import com.example.project5.dto.response.StudentResponse;
import com.example.project5.repository.RegistrationNumberRepository;
import com.example.project5.repository.StudentRepository;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final RegistrationNumberRepository registrationNumberRepository;

    
    public StudentService(StudentRepository studentRepository,
            RegistrationNumberRepository registrationNumberRepository) {
        this.studentRepository = studentRepository;
        this.registrationNumberRepository = registrationNumberRepository;
    }
    public StudentResponse saveStudent(StudentRequest studentRequest){

        Student student = new Student();
        student.setName(studentRequest.getName());
        Student savedstudent=studentRepository.save(student);
        
        return new StudentResponse(savedstudent.getId(),savedstudent.getName(), null);

    }
    public StudentResponse assignRegistration(Long StudentId,String regNumber){
        Student student = studentRepository.findById(StudentId)
                        .orElseThrow(() -> new RuntimeException("Student Not Found"));
        RegistrationNumberEntity register = new RegistrationNumberEntity();
        register.setRegNumber(regNumber);
        RegistrationNumberEntity savedRegister = registrationNumberRepository.save(register);

        student.setRegisterationNumber(savedRegister);
        studentRepository.save(student);

        return new StudentResponse(student.getId(),student.getName(),savedRegister.getRegNumber());
    }
}
