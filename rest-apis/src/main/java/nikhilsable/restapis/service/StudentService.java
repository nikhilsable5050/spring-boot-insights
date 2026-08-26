package nikhilsable.restapis.service;

import nikhilsable.restapis.entity.Student;

import java.util.List;

public interface StudentService {
    Student creatStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(long id);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);
}
