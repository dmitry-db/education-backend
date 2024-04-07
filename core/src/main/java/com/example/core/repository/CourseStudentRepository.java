package com.example.core.repository;

import com.example.core.model.entity.CourseStudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseStudentRepository extends JpaRepository<CourseStudentEntity, Long> {

    @Query("select c from CourseStudentEntity c " +
            "where c.studentEntity.id = :studentId")
    List<CourseStudentEntity> findByStudentId(@Param("studentId") Long studentId);
}
