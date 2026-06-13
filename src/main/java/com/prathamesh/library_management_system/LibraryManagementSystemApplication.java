package com.prathamesh.library_management_system;

import com.prathamesh.library_management_system.entity.Book;
import com.prathamesh.library_management_system.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementSystemApplication.class, args);
	}

	@Bean
	CommandLineRunner testBookSave(BookService bookService) {
		return args -> {

			Book book = new Book();

			book.setTitle("Clean Code");
			book.setAuthor("Robert C. Martin");
			book.setCategory("Programming");
			book.setAvailableCopies(5);

			bookService.saveBook(book);

			System.out.println("Book saved successfully!");
		};
	}
}
