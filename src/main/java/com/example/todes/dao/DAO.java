package com.example.todes.dao;

import com.example.todes.entity.Employee;

public interface DAO {
    public Employee getEmployeeById(int id);

    public Employee getAll();

    public void deleteEmployeeById(int id);
}
