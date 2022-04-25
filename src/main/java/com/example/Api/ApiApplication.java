package com.example.Api;

import com.example.Api.model.Book;
import com.example.Api.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext configurableApplicationContext=
				SpringApplication.run(ApiApplication.class, args);
		BookRepository bookRepository=configurableApplicationContext.getBean(BookRepository.class);
	}

}
