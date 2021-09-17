package com.org.academyregistration.course.service;

import com.org.academyregistration.course.model.CourseModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CourseServiceImpl implements CourseService {
    @Override
    public String addCourse(CourseModel courseModel) {
        List<CourseModel> courseModels = new ArrayList<>();
        courseModels.add(courseModel);
        return "CourseAdded";

    }

    @Override
    public void getCourses() {

    }

    @Override
    public void updateCourse() {

    }

    @Override
    public void deleteCourse() {

    }
}
