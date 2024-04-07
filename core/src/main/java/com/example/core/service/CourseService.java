package com.example.core.service;

import com.example.core.dto.CourseFinishAndProgressDto;
import com.example.core.dto.StudentDto;
import com.example.core.mapper.CourseMapper;
import com.example.core.model.entity.CourseEntity;
import com.example.core.model.entity.CourseStudentEntity;
import com.example.core.model.entity.StudentEntity;
import com.example.core.repository.CourseRepository;
import com.example.core.repository.CourseStudentRepository;
import com.example.core.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseStudentRepository courseStudentRepository;

    public void fillCoursesStudentDto(StudentDto studentDto, StudentEntity studentEntity) {
        List<CourseStudentEntity> studentCourses = courseStudentRepository.findByStudentId(studentEntity.getId());
        List<CourseEntity> allCourses = new ArrayList<>();
        List<CourseEntity> inProgressCourses = new ArrayList<>();
        List<CourseEntity> finishProgressCourses = new ArrayList<>();

        studentCourses
                .forEach(studentCourse -> {
                    allCourses.add(studentCourse.getCourseEntity());
                    if (studentCourse.isFinish()) {
                        finishProgressCourses.add(studentCourse.getCourseEntity());
                    } else {
                        inProgressCourses.add(studentCourse.getCourseEntity());
                    }
                });

        studentDto.setAllCourses(CourseMapper.toDtos(allCourses));
        studentDto.setInProgressCourses(CourseMapper.toDtos(inProgressCourses));
        studentDto.setFinishCourses(CourseMapper.toDtos(finishProgressCourses));
    }


//    public List<CourseFinishAndProgressDto> getAllCourseByStudentId(Long studentId) {
//
//    }
}
