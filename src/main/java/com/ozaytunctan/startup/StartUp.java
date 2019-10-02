package com.ozaytunctan.startup;

import com.ozaytunctan.model.Address;
import com.ozaytunctan.model.Student;
import com.ozaytunctan.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class StartUp implements CommandLineRunner {



    @Value("${application.env}")
    private String env;

    @Value("${app.message}")
    private  String  message;

    @Autowired
    StudentRepository studentRepository;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application started env:"+env+" message:"+message);
       // insertAllStudent();
        insertStudentAndAddress();
    }

    void insertAllStudent(){


        Student student=new Student();
        student.setId(0);
        student.setAge(21);
        student.setFirstName("ozay");
        student.setLastName("TUNCTAN");

        Student student2=new Student();
        student2.setId(0);
        student2.setAge(30);
        student2.setFirstName("Ali");
        student2.setLastName("TUNCTAN");

        studentRepository.saveAndFlush(student);
        studentRepository.saveAndFlush(student2);


    }

    void insertStudentAndAddress(){

        Address add1=new Address();
        add1.setCity("ISTANBUL");
        add1.setCountry("Türkiye");
        add1.setZipCode("34000");


        Address add2=new Address();
        add2.setCountry("Türkiye");
        add2.setCity("BITLIS");
        add2.setZipCode("13000");



        Student student2=new Student();
        student2.setId(0);
        student2.setAge(42);
        student2.setFirstName("Ahmet");
        student2.setLastName("TUNCTAN");

        student2.addAddresses(add2);
        student2.addAddresses(add1);

        studentRepository.saveAndFlush(student2);
    }

}
