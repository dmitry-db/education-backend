package com.example.core.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "course_student_link")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseStudentEntity {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private CourseEntity courseEntity;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentEntity studentEntity;

    @Column(name = "finish")
    private boolean finish;
}
