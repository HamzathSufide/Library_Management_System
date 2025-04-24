package com.hamzath.Library_Management_System.controller;

import com.hamzath.Library_Management_System.model.Books;
import com.hamzath.Library_Management_System.model.LibraryUser;
import com.hamzath.Library_Management_System.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
@Autowired
    UserService userService;
@PostMapping("/create")
private ResponseEntity<LibraryUser>addUser(@RequestBody LibraryUser libraryUser){
    return userService.addUser(libraryUser);
}
    @GetMapping("/getUsers")
    public ResponseEntity<List<LibraryUser>>getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/getUser/{id}")
    public ResponseEntity<LibraryUser>getById(@PathVariable Integer id){
    return userService.getById(id);
    }

}
