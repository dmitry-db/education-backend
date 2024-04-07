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
public class CourseFinishAndProgressDto {

    private List<CourseDto> inProgressCourseDtos;

    private List<CourseDto> finishCourseDtos;
}
