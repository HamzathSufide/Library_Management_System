package com.hamzath.Library_Management_System.repository;

import com.hamzath.Library_Management_System.model.LibraryUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<LibraryUser,Integer> {
}
