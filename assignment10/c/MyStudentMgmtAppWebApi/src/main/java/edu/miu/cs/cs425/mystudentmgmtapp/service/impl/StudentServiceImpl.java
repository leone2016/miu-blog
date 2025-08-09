package edu.miu.cs.cs425.mystudentmgmtapp.service.impl;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Student;
import edu.miu.cs.cs425.mystudentmgmtapp.repository.StudentRepository;
import edu.miu.cs.cs425.mystudentmgmtapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public boolean deleteStudentById(Long id) {
        if(studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
