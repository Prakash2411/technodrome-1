package com.example.restApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
public class EmployeeRestproject1Application {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRestproject1Application.class, args);
	}

}
