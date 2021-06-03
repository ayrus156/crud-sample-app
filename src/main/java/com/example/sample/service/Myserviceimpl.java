package com.example.sample.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.model.Employee;
import com.example.sample.repo.Mydaorepository;



@Service
public class Myserviceimpl implements Myservice {
 
    @Autowired
    Mydaorepository dao;
 
    @Override
    public List<Employee> getEmployees() {
        return dao.findAll();
    }
    @Override
    public Optional<Employee> getEmployeeById(int empid) {
        return dao.findById(empid);
    }
    @Override
    public Employee addNewEmployee(Employee emp) {
        return dao.save(emp);
    }
    @Override
    public Employee updateEmployee(Employee emp) {
        return dao.save(emp);
    }
    @Override
    public void deleteEmployeeById(int empid) {
        dao.deleteById(empid);
    }
    @Override
    public void deleteAllEmployees() {
        dao.deleteAll();
    }
}