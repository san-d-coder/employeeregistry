package com.sandcoder.employeeregistry.service;

import com.sandcoder.employeeregistry.model.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee employee);

	Iterable<Employee> getAllEmployees();

	Employee getEmployee(int employeeId);

	void updateEmployee(int employeeId, Employee employee);

	void deleteEmployee(int employeeId);

}