package com.example.academyregistration.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

    @RequestMapping(path = "/addCourses")
    public ResponseEntity addCourse() {
        System.out.println("Courses Added");
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
