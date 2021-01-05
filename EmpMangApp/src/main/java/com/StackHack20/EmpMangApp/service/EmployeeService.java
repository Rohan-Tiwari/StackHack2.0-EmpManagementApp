package com.StackHack20.EmpMangApp.service;

import java.util.List;

import com.StackHack20.EmpMangApp.model.Employee;


public interface EmployeeService {
	public Employee addEmployee(Employee e);
	public List<Employee> viewAllEmployee();
}
