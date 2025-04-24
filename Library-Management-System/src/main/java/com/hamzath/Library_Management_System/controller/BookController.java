package com.hamzath.Library_Management_System.controller;

import com.hamzath.Library_Management_System.model.Books;
import com.hamzath.Library_Management_System.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("/addBook")
    public ResponseEntity<Books>addBooks(@RequestBody Books books){
        return bookService.addBooks(books);
    }
    @GetMapping("/getBooks")
    public ResponseEntity<List<Books>>getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Books>getBooksById(@PathVariable Integer id)
    {
        return bookService.getBooksById(id);
    }
}
