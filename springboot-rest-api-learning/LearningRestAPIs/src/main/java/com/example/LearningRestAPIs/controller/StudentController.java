package com.example.LearningRestAPIs.controller;

import com.example.LearningRestAPIs.dto.StudentDto;
import com.example.LearningRestAPIs.entity.Student;
import com.example.LearningRestAPIs.respository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {


    private StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student")
    public List<Student> getStudent(){
        return  studentRepository.findAll();
    }

    @GetMapping("/student/{id}")
        public StudentDto getStudentById(){
            return new StudentDto(4L,"Nikhil","nikhil@gmail.com");

    }
}
