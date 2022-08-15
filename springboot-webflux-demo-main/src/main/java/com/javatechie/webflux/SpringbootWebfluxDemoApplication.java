package com.javatechie.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringbootWebfluxDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebfluxDemoApplication.class, args);
	}

}
//Cancel then backed running
//Run:- http://localhost:9191/customers --blocking and syncronous
//Cancel then immediate stop
//http://localhost:9191/customers/stream --Non blocking and asyncronous
//Router -> as controller
//Handler ->as Service
//http://localhost:9191/router/customers --GET
//http://localhost:9191/router/customers/stream --GET
//http://localhost:9191/router/customer/8 --GET
//localhost:9191/router/customer/save --POST
/*{
"id": 8,
"name": "customer8"
}
*/