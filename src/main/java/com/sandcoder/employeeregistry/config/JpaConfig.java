package com.sandcoder.employeeregistry.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = {"com.sandcoder.employeeregistry.repository"})
@EnableTransactionManagement
public class JpaConfig {

	private LocalEntityManagerFactoryBean entityManagerFactoryBean = null;
	private JpaTransactionManager transactionManager = null;

	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory() {
		this.entityManagerFactoryBean = new LocalEntityManagerFactoryBean();
		this.entityManagerFactoryBean.setPersistenceUnitName("employeeRegistry");
		return this.entityManagerFactoryBean;
	}

	public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		this.transactionManager = new JpaTransactionManager();
		this.transactionManager.setEntityManagerFactory(entityManagerFactory);
		return this.transactionManager;
	}

}
