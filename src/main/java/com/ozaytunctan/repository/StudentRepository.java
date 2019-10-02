package com.ozaytunctan.repository;

import com.ozaytunctan.model.Student;
import com.ozaytunctan.repository.spec.CustomizedStudentRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>, CustomizedStudentRepository{


    List<Student> findByAgeGreaterThanEqual(Integer age);



}
