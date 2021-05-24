package com.sandcoder.employeeregistry.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan({"com.sandcoder.employeeregistry"})
public class WebMvcConfig implements WebMvcConfigurer {
	
	private InternalResourceViewResolver viewResolver = null;
	
	@Bean
	public InternalResourceViewResolver getViewResolver() {
		this.viewResolver = new InternalResourceViewResolver();
		this.viewResolver.setPrefix("/WEB-INF/views/jsps/");
		this.viewResolver.setSuffix(".jsp");
		return viewResolver;
		
	}
	
	public void addResourceHandlers(ResourceHandlerRegistry resourceHandlerRegistry) {
		resourceHandlerRegistry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	

}
