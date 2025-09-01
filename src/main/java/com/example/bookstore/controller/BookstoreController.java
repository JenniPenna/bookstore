package com.example.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.bookstore.domain.BookRepository;

@Controller
public class BookstoreController {
    private BookRepository repository;
    public BookstoreController(BookRepository repository) {
        this.repository = repository;
    }

 @RequestMapping(value= {"/", "/booklist"})
    public String bookList(Model model) {	
        model.addAttribute("books", repository.findAll());
        return "booklist";
    }
}
