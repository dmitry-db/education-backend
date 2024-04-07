package com.example.core.controller;

import com.example.core.dto.StudentDto;
import com.example.core.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("student")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public StudentDto getStudentById() {
        Long id = 1L;

        return studentService.getInfoFromStudent(1);
    }
}
