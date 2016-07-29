package com.endava.jpa.service.impl;

import com.endava.jpa.dao.EmployeeDao;
import com.endava.jpa.model.Employee;
import com.endava.jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDaoDao;

    public Employee find(int index) {
        return null;
    }

    public List<Employee> find(String cityName) {
        return employeeDaoDao.find(cityName);
    }

    public void save(Employee toBeSaved) {
        employeeDaoDao.save(toBeSaved);
    }

    public void update(Employee toBeUpdated) {
        employeeDaoDao.update(toBeUpdated);
    }

    public void remove(Employee toBeRemoved) {

    }
}
