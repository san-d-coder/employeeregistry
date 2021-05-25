package com.sandcoder.employeeregistry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sandcoder.employeeregistry.model.Employee;
import com.sandcoder.employeeregistry.service.EmployeeService;

@Controller
@RequestMapping(value="/api")
public class ApiController {
	
	@Autowired
	private EmployeeService employeeService = null;
	
	@RequestMapping(value = "/edit/{employeeId}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Employee> editEmployeePage(@PathVariable(value = "employeeId") int employeeId) {
		try{
			return new ResponseEntity<Employee>(
				this.employeeService.getEmployee(employeeId), 
				HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Employee>(
					HttpStatus.BAD_REQUEST);
		}
	}

}
