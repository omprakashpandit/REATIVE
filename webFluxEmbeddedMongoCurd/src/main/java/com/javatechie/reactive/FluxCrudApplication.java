package com.javatechie.reactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FluxCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(FluxCrudApplication.class, args);
	}

}
/* 
localhost:2022/students --POST
{
    "id":"1",
    "firstName":"OM",
    "lastName":"PRAKASH"
}
localhost:2022/students --GET
[
    {
        "id": "1",
        "firstName": "OM",
        "lastName": "PRAKASH"
    },
    {
        "id": "2",
        "firstName": "RAVI",
        "lastName": "MALHORA"
    }
]
localhost:2022/students/2 --GET
localhost:2022/students/2 --PUT
{
    "id":"2",
    "firstName":"RAJ", ------
    "lastName":"MALHORA"
}
*/