package nikhilsable.restapis.controller;

import lombok.RequiredArgsConstructor;
import nikhilsable.restapis.entity.Student;
import nikhilsable.restapis.service.StudentServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/students")
public class StudentController {

    private final StudentServiceImpl studentService;

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.creatStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
