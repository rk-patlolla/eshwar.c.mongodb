package com.rohteksolutions.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.rohteksolutions")
@SpringBootApplication
public class CustomerInfoApplication extends SpringBootServletInitializer {

	public static void main(String[] args){
		SpringApplication.run(CustomerInfoApplication.class, args);
	}
}
