package com.barkalov.jerseyIDP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JerseyIdpApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new JerseyIdpApplication().configure(new SpringApplicationBuilder(JerseyIdpApplication.class)).run(args);
	}
}
