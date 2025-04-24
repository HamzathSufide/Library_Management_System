package com.hamzath.Library_Management_System.model;

import com.hamzath.Library_Management_System.enums.BookStatusEnum;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tittle;
    private String author;
    private String category;
    @Enumerated(EnumType.STRING)
    private BookStatusEnum status;
    @OneToMany(mappedBy = "books", cascade = CascadeType.ALL)
    private List<Booking> bookings;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookStatusEnum getStatus() {
        return status;
    }

    public void setStatus(BookStatusEnum status) {
        this.status = status;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
