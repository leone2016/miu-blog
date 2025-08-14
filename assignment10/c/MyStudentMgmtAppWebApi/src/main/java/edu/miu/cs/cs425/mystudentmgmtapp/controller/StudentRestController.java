package edu.miu.cs.cs425.mystudentmgmtapp.controller;

import edu.miu.cs.cs425.mystudentmgmtapp.controller.DTO.StudentRequest;
import edu.miu.cs.cs425.mystudentmgmtapp.model.Student;
import edu.miu.cs.cs425.mystudentmgmtapp.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class StudentRestController {

    private final StudentService studentService;

    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }

    // GET /eregistrar/api/student/list
    @GetMapping("/list")
    public List<Student> listStudents() {
        return studentService.getAllStudents();
    }

    // GET /eregistrar/api/student/get/{id}
    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getById(@PathVariable Long id) {
        return studentService.getStudentById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // POST /eregistrar/api/student/register
    @PostMapping("/register")
    public ResponseEntity<Student> register(@Valid @RequestBody StudentRequest req) {
        Student s = toEntity(req);
        Student saved = studentService.saveStudent(s);
        return ResponseEntity.created(URI.create("/eregistrar/api/student/get/" + saved.getStudentId()))
                .body(saved);
    }

    // PUT /eregistrar/api/student/update/{id}
    @PutMapping("/update/{id}")
    public ResponseEntity<Student> update(@PathVariable Long id, @Valid @RequestBody StudentRequest req) {
        return studentService.getStudentById(id)
                .map(existing -> {
                    apply(existing, req);
                    return ResponseEntity.ok(studentService.saveStudent(existing));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETE /eregistrar/api/student/delete/{id}
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (studentService.deleteStudentById(id)) return ResponseEntity.noContent().build();
        return ResponseEntity.notFound().build();
    }

    private Student toEntity(StudentRequest r) {
        Student s = new Student();
        apply(s, r);
        return s;
    }
    private void apply(Student s, StudentRequest r) {
        s.setStudentNumber(r.studentNumber());
        s.setFirstName(r.firstName());
        s.setMiddleName(r.middleName());
        s.setLastName(r.lastName());
        s.setCgpa(r.cgpa());
        s.setEnrollmentDate(r.enrollmentDate());
        s.setInternational(r.isInternational());
    }
}
