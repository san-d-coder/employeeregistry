package com.sandcoder.employeeregistry.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {
	
	private AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = null;
	private ServletRegistration.Dynamic dispatcherServlet;

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		this.annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
		this.annotationConfigWebApplicationContext.register(WebMvcConfig.class);
		this.dispatcherServlet = servletContext.addServlet("employeeRegistry",new DispatcherServlet(annotationConfigWebApplicationContext));
		this.dispatcherServlet.setLoadOnStartup(1);
		this.dispatcherServlet.addMapping("/");
	}

}
