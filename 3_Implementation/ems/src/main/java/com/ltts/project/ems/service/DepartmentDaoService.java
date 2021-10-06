package com.ltts.project.ems.service;

import java.util.List;

import com.ltts.project.ems.dao.DepartmentDao;
import com.ltts.project.ems.model.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentDaoService {

    @Autowired
    DepartmentDao departmentDao;
    
    public Department insertDepartment(Department department){
        return departmentDao.save(department);
    }

    public Department updateDepartment(Department department){
        return departmentDao.save(department);
    }

    public List<Department> getAllDepartments(){
        return departmentDao.findAll();
    }

    public Department getDepartmentById(int id){
        return departmentDao.getById(id);
    }

    public void deleteById(int id){
        departmentDao.deleteById(id);
    }
}
