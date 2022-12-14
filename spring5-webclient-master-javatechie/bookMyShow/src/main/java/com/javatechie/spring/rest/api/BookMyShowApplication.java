package com.javatechie.spring.rest.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.rest.api.model.BookRequest;
import com.javatechie.spring.rest.api.repository.BookMyShowRepository;

@SpringBootApplication
@RestController
@RequestMapping("BookMyShow/Service")
public class BookMyShowApplication {

	@Autowired
	private BookMyShowRepository repository;

	@PostMapping("/bookingShow")
	public String bookShow(@RequestBody BookRequest bookRequest) {
		BookRequest response = repository.save(bookRequest);
		return "Hi " + response.getUserName() + " your Request for " + response.getShowName() + " on date "
				+ response.getBookingTime() + "Booking successfully..";
	}

	@GetMapping("/getAllBooking")
	public List<BookRequest> getAllBooking() {
		return repository.findAll();
	}

	@GetMapping("/getBooking/{bookingId}")
	public BookRequest getBooking(@PathVariable int bookingId) {
		return repository.findById(bookingId).get();
	}

	@DeleteMapping("/cancelBooking/{bookingId}")
	public String cancelBooking(@PathVariable int bookingId) {
		repository.deleteById(bookingId);
		return "Booking cancelled with bookingId : " + bookingId;
	}

	@PutMapping("/updateBooking/{bookingId}")
	public BookRequest updateBooking(@RequestBody BookRequest updateBookRequest, @PathVariable int bookingId) {
		BookRequest dbResponse = repository.findById(bookingId).get();
		dbResponse.setBookingTime(updateBookRequest.getBookingTime());
		dbResponse.setPrice(updateBookRequest.getPrice());
		dbResponse.setShowName(updateBookRequest.getShowName());
		dbResponse.setUserCount(updateBookRequest.getUserCount());
		repository.saveAndFlush(dbResponse);
		return dbResponse;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
	}
}
/*
http://localhost:2022/BookMyShow/Service/bookingShow --POST
{
    "bookingId":"1",
	"userName":"OM",
	"showName":"Major",
    "bookingTime":"15/08/22",
	"userCount":4,
	"price":200
}
http://localhost:2022/BookMyShow/Service/getAllBooking --GET
[
    {
        "bookingId": 1,
        "userName": "OM",
        "showName": "Major",
        "bookingTime": "15/08/0022",
        "userCount": 4,
        "price": 200.0
    },
    {
        "bookingId": 2,
        "userName": "PRAKASH",
        "showName": "Diljale",
        "bookingTime": "20/08/0022",
        "userCount": 3,
        "price": 500.0
    }
]
http://localhost:2022/BookMyShow/Service/getBooking/1 --GET
*/