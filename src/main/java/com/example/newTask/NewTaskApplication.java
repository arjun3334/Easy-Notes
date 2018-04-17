package com.example.newTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class NewTaskApplication {




	public static void main(String[] args) {
		SpringApplication.run(NewTaskApplication.class, args);
	}
}
