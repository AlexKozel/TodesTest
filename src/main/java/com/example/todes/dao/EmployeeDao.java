package com.example.todes.dao;

import com.example.todes.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class EmployeeDao {

    @Autowired
    QueryBuilder.Builder builder;

    public Employee findById(String id) {
        Object o = builder
                .with("id", id)
                .find();
        return (Employee) o;
    }

    public Employee findAnother(){
        return (Employee) builder
                .with("first_name", "Петр")
                .with("last_name", "Петров")
                .with("patronymic","Петрович")
                .find();
    }
}

