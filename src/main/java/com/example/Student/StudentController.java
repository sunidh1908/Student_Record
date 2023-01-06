package com.example.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public ResponseEntity addStudent(@RequestBody Students student){
        studentService.addStudent(student);
        return new ResponseEntity("Student Added Successfully!!", HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public List<Students> getStudent(){
        return studentService.getAllStudents();
    }
}
