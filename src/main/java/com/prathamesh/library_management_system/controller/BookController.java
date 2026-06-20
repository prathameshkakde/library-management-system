package com.prathamesh.library_management_system.controller;

import com.prathamesh.library_management_system.entity.Book;
import com.prathamesh.library_management_system.service.BookService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


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

    @GetMapping("/books/add")
    public String showAddBookForm() {
        return "add-book";
    }

    @PostMapping("/books/save")
    public String saveBook(
            @ModelAttribute Book book) {

        bookService.saveBook(book);
        return "redirect:/books";
    }
}
