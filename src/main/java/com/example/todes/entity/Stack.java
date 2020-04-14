package com.example.todes.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Stack {

    @Id
    @Column(name = "stack_id")
    private int stackId;
    @Column(name = "stack_name")
    private  String stackName;

    @ManyToMany(mappedBy = "stacks")
    private Set<Employee> employeeSet;

    @Override
    public String toString() {
        return "Stack{" +
                "stackId=" + stackId +
                ", stackName='" + stackName + '\'' +
                '}';
    }
}
