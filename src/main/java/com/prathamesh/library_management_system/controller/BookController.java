package com.prathamesh.library_management_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;


/**
 * Handles book-related web requests.
 */
@Controller
public class BookController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Welcome to Library Management System";
    }
}
