package com.spring.jdbc.Dao;

import java.util.List;

import com.spring.jdbc.entities.Employee;

public interface EmpDao  {
	
	public int insert(Employee employee);
	public int update(Employee employee);
	public int delete(Employee employee);
	
	public Employee getEmployee(int eid);
	
	public List<Employee> getAllEmp();

}
