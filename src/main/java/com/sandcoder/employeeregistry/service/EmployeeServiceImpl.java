package com.sandcoder.employeeregistry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sandcoder.employeeregistry.model.Employee;
import com.sandcoder.employeeregistry.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	/* (non-Javadoc)
	 * @see com.sandcoder.employeeregistry.service.EmployeeService#createEmployee(com.sandcoder.employeeregistry.model.Employee)
	 */
	@Override
	@Transactional
	public Employee createEmployee(Employee employee) {
		return this.employeeRepository.save(employee);
	}

	/* (non-Javadoc)
	 * @see com.sandcoder.employeeregistry.service.EmployeeService#getAllEmployees()
	 */
	@Override
	public Iterable<Employee> getAllEmployees() {
		return this.employeeRepository.findAll();
	}

	/* (non-Javadoc)
	 * @see com.sandcoder.employeeregistry.service.EmployeeService#getEmployee(int)
	 */
	@Override
	public Employee getEmployee(int employeeId) {
		return this.employeeRepository.findById(employeeId).get();
	}

	/* (non-Javadoc)
	 * @see com.sandcoder.employeeregistry.service.EmployeeService#updateEmployee(int, com.sandcoder.employeeregistry.model.Employee)
	 */
	@Override
	@Transactional
	public void updateEmployee(int employeeId, Employee employee) {
		this.employeeRepository.findById(employeeId).ifPresentOrElse(foundEmployee -> {
			foundEmployee = employee;
			this.employeeRepository.save(foundEmployee);
		}, () -> {
			System.out.println("Not there");
		});

	}
	
	/* (non-Javadoc)
	 * @see com.sandcoder.employeeregistry.service.EmployeeService#deleteEmployee(int)
	 */
	@Override
	@Transactional
	public void deleteEmployee(int employeeId) {
		this.employeeRepository.deleteById(employeeId);
	}

}
