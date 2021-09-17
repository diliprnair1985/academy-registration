package com.org.academyregistration.course.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.org.academyregistration.course.model.CourseModel;
import com.org.academyregistration.course.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/course")
public class CourseController {


    private final CourseServiceImpl courseService;
    private final ObjectMapper objectMapper;

    @Autowired
    public CourseController(CourseServiceImpl courseService, ObjectMapper objectMapper) {
        this.courseService = courseService;
        this.objectMapper = objectMapper;
    }


    @PostMapping(path = "/createCourses")
    public ResponseEntity<Object> createCourse(@RequestBody(required = true) final String requestBody) throws JsonProcessingException {

        CourseModel courseModel = objectMapper.readValue(requestBody, CourseModel.class);
        String status = courseService.addCourse(courseModel);
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(status);
    }

    @GetMapping(path = "/readCourses")
    public ResponseEntity<String> readCourse() {
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @PutMapping(path = "/updateCourses")
    public ResponseEntity<String> updateCourse() {
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @DeleteMapping(path = "/deleteCourses")
    public ResponseEntity<String> deleteCourse() {
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
