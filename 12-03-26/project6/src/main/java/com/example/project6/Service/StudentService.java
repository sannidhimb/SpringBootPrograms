package com.example.project6.Service;

import org.springframework.stereotype.Service;

import com.example.project6.Entity.Profile;
import com.example.project6.Entity.RegistrationNumberEntity;
import com.example.project6.Entity.Student;
import com.example.project6.dto.request.ProfileRequest;
import com.example.project6.dto.request.RegistrationRequest;
import com.example.project6.dto.request.StudentRequest;
import com.example.project6.dto.response.StudentResponse;
import com.example.project6.repository.ProfileRepository;
import com.example.project6.repository.RegistrationNumberRepository;
import com.example.project6.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final RegistrationNumberRepository registrationNumberRepository;
    private final ProfileRepository profileRepository;

    public StudentService(ProfileRepository profileRepository,
                          RegistrationNumberRepository registrationNumberRepository,
                          StudentRepository studentRepository) {

        this.profileRepository = profileRepository;
        this.registrationNumberRepository = registrationNumberRepository;
        this.studentRepository = studentRepository;
    }

    
    public StudentResponse createStudent(StudentRequest studentRequest) {

        Student student = new Student();
        student.setName(studentRequest.getName());

        Student savedStudent = studentRepository.save(student);

        return new StudentResponse(
                savedStudent.getId(),
                savedStudent.getName(),
                null
        );
    }

    
    public RegistrationNumberEntity addRegistration(Long studentId, RegistrationRequest request) {

        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        RegistrationNumberEntity registration = new RegistrationNumberEntity();
        registration.setRegistrationNumber(request.getRegistrationNumber());
        registration.setStudent(student);

        return registrationNumberRepository.save(registration);
    }

    public Profile addProfile(Long studentId, ProfileRequest request) {

        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        Profile profile = new Profile();
        profile.setDob(request.getDob());
        profile.setAddress(request.getAddress());
        profile.setPhoneNumber(request.getPhoneNumber());
        profile.setStudent(student);

        return profileRepository.save(profile);
    }
}