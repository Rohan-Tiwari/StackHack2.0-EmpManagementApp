package com.StackHack20.EmpMangApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	private long emp_id;
	@Column(name="emp_name")
	private String empname;
	private int salary;
	private String job_id;
	private long manager_id;
	private long dept_id;
	private String password;
	
	public Employee() {
		
	}
	
	public Employee(long emp_id, String empname, int salary, String job_id, long manager_id, long dept_id) {
		super();
		this.emp_id = emp_id;
		this.empname = empname;
		this.salary = salary;
		this.job_id = job_id;
		this.manager_id = manager_id;
		this.dept_id = dept_id;
	}

	

	public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", empname=" + empname + ", salary=" + salary + ", job_id=" + job_id
				+ ", manager_id=" + manager_id + ", dept_id=" + dept_id + "]";
	}

	public long getManager_id() {
		return manager_id;
	}

	public void setManager_id(long manager_id) {
		this.manager_id = manager_id;
	}

	public long getDept_id() {
		return dept_id;
	}

	public void setDept_id(long dept_id) {
		this.dept_id = dept_id;
	}
	
	
}
