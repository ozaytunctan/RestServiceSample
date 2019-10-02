package com.ozaytunctan.controller;


import com.ozaytunctan.model.Student;
import com.ozaytunctan.service.spec.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    private StudentService studentService;



    @PostMapping(path = "/findStudentsByAgeGreaterThanEqual")
    public ResponseEntity<List<Student>>findByAgeGreaterThanEqual(@RequestBody Integer age){
        return  ResponseEntity.ok(studentService.findByAgeGreaterThanEqual(age));
    }



}
