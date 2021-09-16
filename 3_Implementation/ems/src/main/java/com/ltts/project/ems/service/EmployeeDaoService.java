package com.ltts.project.ems.service;

import java.util.List;

import com.ltts.project.ems.dao.EmployeeDao;
import com.ltts.project.ems.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDaoService {

    @Autowired
    EmployeeDao employeeDao;
    public Employee insertEmployee(Employee employee){
        return employeeDao.save(employee);

    }

    public Employee updateEmployee(Employee employee){
        return employeeDao.save(employee);
    }
    
    public List<Employee> getAllEmployees(){
        return employeeDao.findAll();
    }

    public Employee getEmployeeById(int id){
        return employeeDao.getById(id);
    }

    public void deleteById(int id){
        employeeDao.deleteById(id);
        return;
    }
}
