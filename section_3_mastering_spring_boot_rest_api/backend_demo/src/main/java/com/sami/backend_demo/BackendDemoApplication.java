package com.sami.backend_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @ComponentScan(basePackages = {"com.sami.outside.controller"})
@SpringBootApplication  //(exclude = {ErrorMvcAutoConfiguration.class})
public class BackendDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendDemoApplication.class, args);
	}

}