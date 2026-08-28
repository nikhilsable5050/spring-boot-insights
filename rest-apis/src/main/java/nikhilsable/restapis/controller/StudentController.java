package nikhilsable.restapis.controller;

import lombok.RequiredArgsConstructor;
import nikhilsable.restapis.entity.Student;
import nikhilsable.restapis.service.StudentServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/students")
public class StudentController {

    private final StudentServiceImpl studentService;

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.creatStudent(student);
    }

}
