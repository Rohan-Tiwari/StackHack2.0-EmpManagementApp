package com.StackHack20.EmpMangApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StackHack20.EmpMangApp.model.Employee;
import com.StackHack20.EmpMangApp.service.EmployeeServiceImpl;


@RestController
//@RequestMapping("")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	/*
	 * @Autowired private LoginServiceImpl loginServiceImpl;
	 */
	@PostMapping("/register")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee e){
		Employee employee = employeeServiceImpl.addEmployee(e);
		return new ResponseEntity<Employee>(employee, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/viewAll")
	public List<Employee> viewAllEmployee(){
		return employeeServiceImpl.viewAllEmployee();
	}
}
