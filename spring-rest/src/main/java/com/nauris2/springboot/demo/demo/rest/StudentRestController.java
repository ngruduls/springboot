package com.nauris2.springboot.demo.demo.rest;

import com.nauris2.springboot.demo.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    // define endpoint for "/students" - return a list of students
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> theStudents = new ArrayList<>();
        theStudents.add(new Student("Student1", "Name1"));
        theStudents.add(new Student("Student2", "Name2"));
        theStudents.add(new Student("Student3", "Name3"));

        return theStudents;
    }
}
