package com.ozaytunctan.model;

import com.ozaytunctan.model.base.BaseEntity;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;


@Entity
@Table(name = "Address")
public class Address extends BaseEntity<Integer> {


    private String city;

    private String zipCode;

    private String country;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id",referencedColumnName = "id")
    private Student student;


    public Address() {

    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
