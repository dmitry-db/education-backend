package com.example.core.controller;

import com.example.core.dto.CourseFinishAndProgressDto;
import com.example.core.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

//    @GetMapping("/by-student/{studentId}")
//    public List<CourseFinishAndProgressDto> getCoursesByStudentId(@PathVariable("studentId") Long studentId) {
//        return courseService.getAllCourseByStudentId(studentId);
//    }
}
