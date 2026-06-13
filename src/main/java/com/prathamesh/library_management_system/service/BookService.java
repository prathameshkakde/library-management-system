package com.prathamesh.library_management_system.service;

import com.prathamesh.library_management_system.repository.BookRepository;
import com.prathamesh.library_management_system.entity.Book;
import org.springframework.stereotype.Service;

/**
 * Service class for book-related business logic.
 */
@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
}
