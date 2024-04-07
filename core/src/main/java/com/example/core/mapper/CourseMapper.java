package com.example.core.mapper;

import com.example.core.dto.CourseDto;
import com.example.core.model.entity.CourseEntity;

import java.util.List;
import java.util.stream.Collectors;

public class CourseMapper {

    public static CourseDto toDto(CourseEntity courseEntity) {
        CourseDto courseDto = new CourseDto();

        courseDto.setId(courseEntity.getId());
        courseDto.setName(courseEntity.getName());
        courseDto.setDescription(courseEntity.getDescription());

        return courseDto;
    }

    public static List<CourseDto> toDtos(List<CourseEntity> courseEntities) {
        return courseEntities.stream()
                .map(CourseMapper::toDto)
                .collect(Collectors.toList());
    }
}
