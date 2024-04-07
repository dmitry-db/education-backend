package com.example.core.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private String surname;

    private String name;

    private String middlename;

    private List<CourseDto> allCourses;

    private List<CourseDto> inProgressCourses;

    private List<CourseDto> finishCourses;
}
