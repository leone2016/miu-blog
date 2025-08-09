package edu.miu.cs.cs425.mystudentmgmtapp.service;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudents();
    Optional<Student> getStudentById(Long id);
    Student saveStudent(Student s);
    boolean deleteStudentById(Long id);

}
