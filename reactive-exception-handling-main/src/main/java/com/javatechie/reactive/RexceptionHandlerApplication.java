package com.javatechie.reactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RexceptionHandlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RexceptionHandlerApplication.class, args);
	}

}
/*
http://localhost:8080/books --GET
http://localhost:8080/books/20 --GET
http://localhost:8080/books/21 --GET
{
    "error message": "Book not found with id 21",
    "status": "400 BAD_REQUEST"
}
--REACTIVE
server.error.include-message=always --add into application.properties file
http://localhost:8080/route/books
http://localhost:8080/route/book/20
http://localhost:8080/route/book/21
{
    "endpoint url ": "/route/book/21",
    "message": "Book not found with bookId : 21"
}
*/