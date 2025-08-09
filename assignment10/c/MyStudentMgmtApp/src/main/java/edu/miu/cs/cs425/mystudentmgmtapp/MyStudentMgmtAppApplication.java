package edu.miu.cs.cs425.mystudentmgmtapp;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Classroom;
import edu.miu.cs.cs425.mystudentmgmtapp.model.Course;
import edu.miu.cs.cs425.mystudentmgmtapp.model.Student;
import edu.miu.cs.cs425.mystudentmgmtapp.model.Transcript;
import edu.miu.cs.cs425.mystudentmgmtapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {
    @Autowired
    private StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtAppApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // Courses
        Course cs401 = new Course("CS401", "Modern Prog Practices");
        List<Course> courses = List.of(cs401);

        // Transcript
        Transcript transcript = new Transcript("BS Computer Science");

        // Classroom
        Classroom classroom = new Classroom("McLaughlin building", "M105");

        // Student Anna
        Student anna = new Student();
        anna.setStudentNumber("000-61-0001");
        anna.setFirstName("Anna");
        anna.setMiddleName("Lynn");
        anna.setLastName("Smith");
        anna.setCgpa(3.45);
        anna.setDateOfEnrollment(LocalDate.of(2019, 5, 24));
        anna.setTranscript(transcript);
        anna.setClassroom(classroom);
        anna.setCourses(courses);

        studentService.saveStudent(anna);
    }

    /*@Override
    public void run(String... args) throws Exception {
        Course fpp1 = new Course("FPP", "Fundamentals of Programming");
        Course mpp1 = new Course("MPP", "Modern Programming Practices");
        Course swe1 = new Course("SWE", "Software Engineering");
        List<Course> amineCourses = List.of(fpp1, mpp1, swe1);

        Course fpp2 = new Course("FPP", "Fundamentals of Programming");
        Course mpp2 = new Course("MPP", "Modern Programming Practices");
        Course swe2 = new Course("SWE", "Software Engineering");
        List<Course> leoCourses = List.of(fpp2, mpp2, swe2);

        Student amine = new Student();
        amine.setStudentNumber("000-61-0002");
        amine.setFirstName("Mohamed");
        amine.setMiddleName("Amine");
        amine.setLastName("Atmani");
        amine.setCgpa(3.97);
        amine.setDateOfEnrollment(LocalDate.of(2025, 4, 29));
        amine.setTranscript(new Transcript("MS Computer Science"));
        amine.setClassroom(new Classroom("McLaughlin building", "M105"));
        amine.setCourses(amineCourses);

        Student leo = new Student();
        leo.setStudentNumber("000-61-0003");
        leo.setFirstName("Leonardo");
        leo.setMiddleName("Medina");
        leo.setLastName("Encalada");
        leo.setCgpa(3.95);
        leo.setDateOfEnrollment(LocalDate.of(2025, 4, 29));
        leo.setTranscript(new Transcript("MS Computer Science"));
        leo.setClassroom(new Classroom("McLaughlin building", "M105"));
        leo.setCourses(leoCourses);

        studentService.saveStudent(amine);
        studentService.saveStudent(leo);
    }*/
}
