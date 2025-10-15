package com.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementSystemApplication {

	public static void main(String[] args) {
		System.out.println("!!! ---- Welcome to EMS ---- !!!");
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

}
