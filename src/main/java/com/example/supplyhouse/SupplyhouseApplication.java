package com.example.supplyhouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SupplyhouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupplyhouseApplication.class, args);
	}

}
