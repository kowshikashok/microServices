package com.javainuse.microServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class MicroServicesApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesApplication.class, args);
	}
	
	@Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	      return builder.sources(MicroServicesApplication.class);
	  }
	
}
