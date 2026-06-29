package com.sami.jobportal_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAwareImpl")  // تفعيل Auditing
public class JobportalDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobportalDemoApplication.class, args);
	}

}

