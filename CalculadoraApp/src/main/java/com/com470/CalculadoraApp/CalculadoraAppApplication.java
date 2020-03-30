package com.com470.CalculadoraApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.com470.CalculadoraApp;" })
public class CalculadoraAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraAppApplication.class, args);
	}

}
