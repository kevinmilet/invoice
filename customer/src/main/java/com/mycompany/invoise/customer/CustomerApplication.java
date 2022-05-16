package com.mycompany.invoise.customer;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EntityScan("com.mycompany.invoise.core.entity.customer")
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

	@Bean
	public Hibernate5Module datatypeHibernateModule() {
		return new Hibernate5Module();
	}
}
