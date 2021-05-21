package com.sandcoder.employeeregistry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@PostMapping(value = "/editEmployee")
	public String editEmployee(@ModelAttribute Employee employee) {
		System.out.println(employee.toString());
		this.employeeService.updateEmployee(employee.getEmployeeId(), employee);
		return "redirect:/home";
	}
	
	@PostMapping(value = "/deleteEmployee")
	public String deleteEmployee(@ModelAttribute Employee employee) {
		System.out.println(employee.toString());
		this.employeeService.deleteEmployee(employee.getEmployeeId());
		return "redirect:/home";
	}

}
