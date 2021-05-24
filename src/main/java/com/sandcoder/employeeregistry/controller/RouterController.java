package com.sandcoder.employeeregistry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sandcoder.employeeregistry.model.Employee;
import com.sandcoder.employeeregistry.service.EmployeeService;

@Controller
public class RouterController {
	
	@Autowired
	private EmployeeService employeeService;
	
	private Iterable<Employee> employees;
	private Employee employee;
		
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePage(Model model) {
		this.employees = this.employeeService.getAllEmployees();
		if(this.employees.iterator().hasNext())
			model.addAttribute("employees", this.employees);
		return "home";
	}
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String aboutPage() {
		return "about";
	}
	
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contactPage() {
		return "contact";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String createNewEmployeePage() {
		return "createNew";
	}
	
	@RequestMapping(value = "/edit/{employeeId}", method = RequestMethod.GET)
	public String editEmployeePage(@PathVariable int employeeId, Model model) {
		this.employee = this.employeeService.getEmployee(employeeId);
		model.addAttribute("employee",this.employee);
		return "home";
	}
	
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String findEmployeePage() {
		return "find";
	}
	
	

}
