package com.hamzath.Library_Management_System.service;

import com.hamzath.Library_Management_System.enums.BookStatusEnum;
import com.hamzath.Library_Management_System.model.Booking;
import com.hamzath.Library_Management_System.model.Books;
import com.hamzath.Library_Management_System.model.LibraryUser;
import com.hamzath.Library_Management_System.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BookingService {
    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    UserService userService;
    @Autowired
    BookService bookService;
    public ResponseEntity<String> rentABook(Integer userId, Integer bookId) {
        try{
            LibraryUser user= userService.getById(userId).getBody();
            Books book=bookService.getBooksById(bookId).getBody();
            if(book.getStatus()!= BookStatusEnum.AVAILABLE){
                return new ResponseEntity<>("The Book Is Unavailable now", HttpStatus.NOT_ACCEPTABLE);
            }
            Booking booking=new Booking();
            booking.setUser(user);
            booking.setBook(book);
            booking.setBorrowDate(LocalDate.now());
            booking.setReturned(false);

            book.setStatus(BookStatusEnum.NOT_AVAILABLE);

            bookingRepository.save(booking);
            bookService.addBooks(book);
            return new ResponseEntity<>("Book successfully booked!",HttpStatus.OK);
        }catch (Exception e){
            e.getMessage();
        }

        return new ResponseEntity<>("Booking Unsuccessful",HttpStatus.BAD_REQUEST);
    }
}
