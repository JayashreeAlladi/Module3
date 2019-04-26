package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.cg.controller")
@ComponentScan("com.cg.dao")
@ComponentScan("com.cg.service")
@ComponentScan("com.cg.model")
@EntityScan(basePackages = {"com.cg.model"})
@SpringBootApplication
public class IncomeTaxDeptApplication {

	public static void main(String[] args) {
		SpringApplication.run(IncomeTaxDeptApplication.class, args);
	}

}
