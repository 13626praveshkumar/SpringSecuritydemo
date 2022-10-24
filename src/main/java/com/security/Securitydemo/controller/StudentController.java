package com.security.Securitydemo.controller;

import com.security.Securitydemo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("v1/api/student")
public class StudentController {

    private static final List<Student> student= Arrays.asList(new Student(101,"Pravesh"),
            new Student(102,"Rohit"));

    @GetMapping(path = "{studentId}")
    private Student getStudent(@PathVariable("studentId") Integer studentId)
    {
        return student.stream().filter(s->studentId.equals(s.getStudentID()))
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("Student"+studentId+"does not exist"));
    }
}
