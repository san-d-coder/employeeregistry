package com.sandcoder.employeeregistry.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sandcoder.employeeregistry.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
