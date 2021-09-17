package com.org.academyregistration.course.service;

import com.org.academyregistration.course.model.CourseModel;
import org.springframework.stereotype.Service;

@Service
public interface CourseService {

    String addCourse(CourseModel courseModel);

    void getCourses();

    void updateCourse();

    void deleteCourse();
}
