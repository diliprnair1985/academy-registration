package com.org.academyregistration.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping(path = "/user")
public class UserController {

    @PostMapping(path = "/createUsers")
    public ResponseEntity<String> addUser() {
        log.info("Users Added");
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    @GetMapping(path = "/readUsers")
    public ResponseEntity<String> readUser() {
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    @PutMapping(path = "/updateUsers")
    public ResponseEntity<String> updateUser() {
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    @DeleteMapping(path = "/deleteUsers")
    public ResponseEntity<String> deleteUser() {
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
