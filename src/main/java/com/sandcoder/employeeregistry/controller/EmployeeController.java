package com.sandcoder.employeeregistry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sandcoder.employeeregistry.model.Employee;
import com.sandcoder.employeeregistry.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(value="/createEmployee")
	public String createEmployee(@ModelAttribute Employee employee) {
		System.out.println(employee.toString());
		this.employeeService.createEmployee(employee);
		return "redirect:/home";
	}
	
	@PostMapping(value = "/editEmployee/{employeeId}")
	public String editEmployee(@ModelAttribute Employee employee, @PathVariable(value = "employeeId") int employeeId) {
		System.out.println(employee.toString());
		System.out.println(employee.getEmployeeId());
		this.employeeService.updateEmployee(employeeId, employee);
		return "redirect:/home";
	}
	
	@GetMapping(value = "/deleteEmployee/{employeeId}")
	public String deleteEmployee(@PathVariable(value = "employeeId") int employeeId) {
		System.out.println(employeeId);
		this.employeeService.deleteEmployee(employeeId);
		return "redirect:/home";
	}

}
