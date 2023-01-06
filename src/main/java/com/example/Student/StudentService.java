package com.example.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Students student){
        studentRepository.save(student);
    }

    public List<Students> getAllStudents(){
        return studentRepository.findAll();
    }
}
