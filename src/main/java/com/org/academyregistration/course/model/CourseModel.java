package com.org.academyregistration.course.model;


import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseModel {
    private int courseId;
    private String courseName;

}
