package com.hamzath.Library_Management_System.repository;

import com.hamzath.Library_Management_System.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Integer> {
}
