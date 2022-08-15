package com.javatechie.reactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringReactiveMongoCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringReactiveMongoCrudApplication.class, args);
	}

}
/*
localhost:9292/products --POST

{
"name": "mobile",
"qty": "1",
"price":"400"
}
localhost:9292/products --GET
*/
