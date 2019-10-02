package com.ozaytunctan.service.spec;

import com.ozaytunctan.model.Student;
import org.apache.log4j.Logger;

import java.util.List;

public interface StudentService {

    Logger logger=Logger.getLogger(StudentService.class);


    Student insert(Student student);

    Student update(Student student);

    Student delete(Integer id);

    List<Student> findByAgeGreaterThanEqual(Integer age);




}
