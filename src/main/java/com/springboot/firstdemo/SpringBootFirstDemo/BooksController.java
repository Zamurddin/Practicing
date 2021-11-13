package com.springboot.firstdemo.SpringBootFirstDemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@GetMapping("/books")
	public List<Book> getBooks(){
		
		return Arrays.asList(new Book(1l,"Java Spring Boot3","Zameeruddin"));		
	}
}
