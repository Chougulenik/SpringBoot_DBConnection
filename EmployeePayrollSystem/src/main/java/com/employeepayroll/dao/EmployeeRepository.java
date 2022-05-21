package com.employeepayroll.dao;

import org.springframework.data.repository.CrudRepository;

import com.employeepayroll.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
