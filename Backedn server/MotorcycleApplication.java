package com.jonathan.motorcycle;

import javax.persistence.Entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Entity
@SpringBootApplication
public class MotorcycleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotorcycleApplication.class, args);
	}

}