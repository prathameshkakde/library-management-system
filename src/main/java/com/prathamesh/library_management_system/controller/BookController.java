package com.prathamesh.library_management_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;


/**
 * Handles book-related web requests.
 */
@Controller
public class BookController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
