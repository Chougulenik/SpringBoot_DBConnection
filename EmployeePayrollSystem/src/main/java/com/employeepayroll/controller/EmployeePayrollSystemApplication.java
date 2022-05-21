package com.employeepayroll.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.employeepayroll.dao.EmployeeRepository;
import com.employeepayroll.model.Employee;

@SpringBootApplication
public class EmployeePayrollSystemApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(EmployeePayrollSystemApplication.class, args);
		EmployeeRepository userRepository = context.getBean(EmployeeRepository.class);
		
		Employee employee = new Employee();
		employee.setName("archna");
		employee.setGender("female");
		employee.setDepartment("mec");
		employee.setSalary(120000);
		
		Employee emp = userRepository.save(employee);
		System.out.println(emp);
	}

}
