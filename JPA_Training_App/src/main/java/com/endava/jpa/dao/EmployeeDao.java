package com.endava.jpa.dao;

import com.endava.jpa.model.Employee;

import java.util.List;

public interface EmployeeDao {

    public Employee find(int index);

    public List<Employee> find(String employeeName);

    public void save(Employee toBeSaved);

    public void update(Employee toBeUpdated);

    public void remove(Employee toBeRemoved);
}
