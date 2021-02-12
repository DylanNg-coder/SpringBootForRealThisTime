package com.example.omanda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@ComponentScan("com.example.omanda")
public class SpringBootTutorialApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringBootTutorialApplication.class, args);
	}



}
