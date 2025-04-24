package com.hamzath.Library_Management_System.repository;

import com.hamzath.Library_Management_System.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Books,Integer> {
}
