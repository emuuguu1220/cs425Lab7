package edu.mum.cs.cs425.studentmgmt.studentmgmt.controller;

import edu.mum.cs.cs425.studentmgmt.studentmgmt.exception.ResourceNotFoundException;
import edu.mum.cs.cs425.studentmgmt.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.studentmgmt.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")

public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Create a new Student
    @PostMapping("/students")
    public Student createStudent(@Valid @RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping("/students/{studentID}")
    public Student getStudentById(@PathVariable(value = "studentID") Long studentID) {
        return studentRepository.findById(studentID)
                .orElseThrow(() -> new ResourceNotFoundException("Student", "studentID", studentID));
    }
}