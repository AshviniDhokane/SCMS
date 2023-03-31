package com.elementsoftech.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class AckBusinessServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AckBusinessServiceApplication.class, args);
		System.out.println("business app started..");
	}

}
