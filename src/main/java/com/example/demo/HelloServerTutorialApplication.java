package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableDiscoveryClient
public class HelloServerTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloServerTutorialApplication.class, args);
	}
}