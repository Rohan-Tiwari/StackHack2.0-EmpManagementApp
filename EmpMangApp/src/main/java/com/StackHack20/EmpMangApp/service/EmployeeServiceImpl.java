package com.StackHack20.EmpMangApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.StackHack20.EmpMangApp.model.Employee;
import com.StackHack20.EmpMangApp.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;	

	@Override
	public Employee addEmployee(Employee e) {
		System.out.println("this is the emp data from front end " + e.toString());
		return employeeRepository.save(e);//registration of the employee onto the platform
	}

	@Override
	public List<Employee> viewAllEmployee() {
		return employeeRepository.findAll();
	}

	public String addEmpToLoginService(Employee emp) {
		return null;
	}
	
}
