package com.sandcoder.employeeregistry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sandcoder.employeeregistry.model.Employee;
import com.sandcoder.employeeregistry.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Transactional
	public Employee createEmployee(Employee employee) {
		return this.employeeRepository.save(employee);
	}

	public Iterable<Employee> getAllEmployees() {
		return this.employeeRepository.findAll();
	}

	public Employee getEmployee(int employeeId) {
		return this.employeeRepository.findById(employeeId).get();
	}

	@Transactional
	public void updateEmployee(int employeeId, Employee employee) {
		this.employeeRepository.findById(employeeId).ifPresentOrElse(foundEmployee -> {
			foundEmployee = employee;
			this.employeeRepository.save(foundEmployee);
		}, () -> {
			System.out.println("Not there");
		});

	}
	
	@Transactional
	public void deleteEmployee(int employeeId) {
		this.employeeRepository.deleteById(employeeId);
	}

}
