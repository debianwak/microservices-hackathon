package com.lendingclub.hackathon.linvestors.linvestors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.sun.glass.ui.Application;

@SpringBootApplication
public class LinvestorsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LinvestorsApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
