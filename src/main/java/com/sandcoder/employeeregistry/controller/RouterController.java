package com.sandcoder.employeeregistry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RouterController {
		
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePage() {
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
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String editEmployeePage() {
		return "edit";
	}
	
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String findEmployeePage() {
		return "find";
	}
	
	

}
