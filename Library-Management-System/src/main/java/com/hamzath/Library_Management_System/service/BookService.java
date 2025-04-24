package com.hamzath.Library_Management_System.service;

import com.hamzath.Library_Management_System.model.Books;
import com.hamzath.Library_Management_System.model.LibraryUser;
import com.hamzath.Library_Management_System.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public ResponseEntity<Books> addBooks(Books books) {
        Books book=bookRepository.save(books);
        return new ResponseEntity<>(book, HttpStatus.CREATED);

    }

    public ResponseEntity<List<Books>> getAllBooks() {
        List<Books>books=bookRepository.findAll();
        return new ResponseEntity<>(books,HttpStatus.OK);
    }

    public ResponseEntity<Books> getBooksById(Integer id) {
        try{
            Books book= bookRepository.findById(id).get();
            return new ResponseEntity<>(book,HttpStatus.OK);
        }catch (Exception e){
            e.getMessage();
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
