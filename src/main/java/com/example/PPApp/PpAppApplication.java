package com.example.PPApp;

import jakarta.validation.Validator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class PpAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(PpAppApplication.class, args);
	}

	@Bean //Managed by Spring
	Validator validator() {
		return new LocalValidatorFactoryBean();
	}


}
