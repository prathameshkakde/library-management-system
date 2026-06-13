package com.prathamesh.library_management_system.repository;

import com.prathamesh.library_management_system.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for Book entities.
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}