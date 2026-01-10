package com.example.LearningRestAPIs.service.impl;

import com.example.LearningRestAPIs.dto.StudentDto;
import com.example.LearningRestAPIs.entity.Student;
import com.example.LearningRestAPIs.respository.StudentRepository;
import com.example.LearningRestAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;


    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students.stream().map(student -> new StudentDto(student.getId(), student.getName(),student.getEmail()))
                .toList();
    }
}
