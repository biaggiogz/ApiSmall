package com.project.apiSmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ApiSmallApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSmallApplication.class, args);


	}
    @Bean
	public BCryptPasswordEncoder passwordEncoder(){

		return new BCryptPasswordEncoder();
	}
}
