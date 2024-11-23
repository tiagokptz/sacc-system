package com.catolica.sacc_system.services;

import com.catolica.sacc_system.models.StudentModel;
import com.catolica.sacc_system.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    private String encryptPassword(String password) {
        return Base64.getEncoder().encodeToString(password.getBytes(StandardCharsets.UTF_8));
    }

    public void registerStudent(StudentModel student) {
        studentRepository.save(student);
    }
}
