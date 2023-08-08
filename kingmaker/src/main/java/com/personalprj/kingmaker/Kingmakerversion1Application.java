package com.personalprj.kingmaker;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.personalprj.kingmaker.repo")
//@EntityScan("com.personalprj.kingmaker.entity")
public class Kingmakerversion1Application {

	public static void main(String[] args) {
		SpringApplication.run(Kingmakerversion1Application.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
