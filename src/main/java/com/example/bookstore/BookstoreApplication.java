package com.example.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import com.example.bookstore.domain.Book;
import com.example.bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
    public CommandLineRunner demo(BookRepository repository) {
        return (args) -> {
            // Your code...add some demo data to db
 
            repository.save(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "9780743273565", 19.99));
            repository.save(new Book("To Kill a Mockingbird", "Harper Lee", 1960, "9780061120084", 19.99));
            repository.save(new Book("1984", "George Orwell", 1949, "9780451524935", 19.99));
        };
    }
}
