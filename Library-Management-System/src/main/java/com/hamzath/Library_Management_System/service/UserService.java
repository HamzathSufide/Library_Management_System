package com.hamzath.Library_Management_System.service;

import com.hamzath.Library_Management_System.model.LibraryUser;
import com.hamzath.Library_Management_System.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public ResponseEntity<LibraryUser> addUser(LibraryUser libraryUser) {
        return new ResponseEntity<>(userRepository.save(libraryUser),HttpStatus.CREATED);

    }

    public ResponseEntity<List<LibraryUser>> getAllUsers() {
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<LibraryUser> getById(Integer id) {
        try{
           LibraryUser user= userRepository.findById(id).get();
            return new ResponseEntity<>(user,HttpStatus.OK);
        }catch (Exception e){
            e.getMessage();
        }
       return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
