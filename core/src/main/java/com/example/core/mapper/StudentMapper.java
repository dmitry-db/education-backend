package com.example.core.mapper;

import com.example.core.dto.StudentDto;
import com.example.core.model.entity.StudentEntity;
import org.apache.commons.lang3.StringUtils;

public class StudentMapper {

    public static StudentDto getStudentDto(StudentEntity studentEntity) {
        StudentDto studentDto = new StudentDto();

        studentDto.setName(studentEntity.getName());
        studentDto.setSurname(studentEntity.getSurname());

        if (StringUtils.isNotEmpty(studentEntity.getMiddlename())) {
            studentDto.setMiddlename(studentEntity.getMiddlename());
        } else {
            studentDto.setMiddlename("");
        }

        return studentDto;
    }
}
