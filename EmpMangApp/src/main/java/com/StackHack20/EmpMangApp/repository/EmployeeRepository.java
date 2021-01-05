package com.StackHack20.EmpMangApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StackHack20.EmpMangApp.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
