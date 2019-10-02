package com.ozaytunctan.model;


import com.ozaytunctan.model.base.BaseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Student")
public class Student extends BaseEntity<Integer> {


    @Column(name = "firstName",length = 100,nullable = false)
    private String firstName;

    @Column(name = "lastName",length = 100,nullable = false)
    private String lastName;

    @Column(name = "age",nullable = false)
    private Integer age;



    @OneToMany(
            mappedBy = "student",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Address> addresses = new ArrayList<>();

    public Student() {
    }

    public void addAddresses(Address address) {
        addresses.add(address);
        address.setStudent(this);
    }

    public void removeAddresses(Address address) {
        addresses.remove(address);
        address.setStudent(null);
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
