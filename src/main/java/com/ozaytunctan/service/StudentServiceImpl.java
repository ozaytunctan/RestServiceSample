package com.ozaytunctan.service;


import com.ozaytunctan.model.Student;
import com.ozaytunctan.repository.StudentRepository;
import com.ozaytunctan.service.spec.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student insert(Student student) {

        return null;
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public Student delete(Integer id) {
        return null;
    }

    @Override
    public List<Student> findByAgeGreaterThanEqual(Integer age) {
        return studentRepository.findByAgeGreaterThanEqual(age);
    }
}
