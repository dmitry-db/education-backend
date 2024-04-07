package com.example.core.service;

import com.example.core.dto.StudentDto;
import com.example.core.mapper.StudentMapper;
import com.example.core.model.entity.CourseEntity;
import com.example.core.model.entity.StudentEntity;
import com.example.core.repository.CourseRepository;
import com.example.core.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final CourseService courseService;
    private final StudentRepository studentRepository;

    public StudentDto getInfoFromStudent(int i) {
        Optional<StudentEntity> studentEntityOpt = studentRepository.findById(1L);
        StudentEntity studentEntity = studentEntityOpt.get();

        StudentDto studentDto = StudentMapper.getStudentDto(studentEntity);

        courseService.fillCoursesStudentDto(studentDto ,studentEntity);

        return studentDto;
    }
}
