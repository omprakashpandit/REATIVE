package com.reactivespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesInfoServiceApplication.class, args);
	}

}
//Run:- http://localhost:8080/flux
//      http://localhost:8080/mono
//      http://localhost:8080/stream