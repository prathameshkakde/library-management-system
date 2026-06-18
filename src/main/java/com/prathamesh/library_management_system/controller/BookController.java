package com.prathamesh.library_management_system.controller;

import com.prathamesh.library_management_system.service.BookService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


/**
 * Handles book-related web requests.
 */
@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/books")
    public String books(Model model) {

        model.addAttribute("books", bookService.getAllBooks());
        return "books";
    }
}
