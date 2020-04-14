package com.example.todes.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class EmployeeDao {

    @Autowired
    QueryBuilder.Builder builder;

    public List findById(String id) {
        return builder
                .with("id", id)
                .find();
    }

    public List findAnother(){
        return  builder
                .with("first_name", "Петр")
                .with("last_name", "Петров")
                .with("patronymic","Петрович")
                .find();
    }
}

