package com.poc.springboot.employeedetails;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EmployeeDetailsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EmployeeDetailsApplication.class, args);
	}

}
