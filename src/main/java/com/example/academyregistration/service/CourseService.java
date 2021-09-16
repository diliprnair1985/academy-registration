package com.example.academyregistration.service;

import org.springframework.stereotype.Service;

@Service
public interface CourseService {

    void addCourse();
    void getCourses();
    void updateCourse();
    void deleteCourse();
}
