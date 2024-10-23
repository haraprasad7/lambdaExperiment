package com.experiment.application;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	 @Bean
	  public Function<String, String> greet() {
	        return input -> "Hello, " + input + "! Welcome to Spring Cloud Function with AWS Lambda.";
	    }

}
