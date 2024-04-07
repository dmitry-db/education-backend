package com.example.core.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "lecture")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LectureEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "doc")
    private byte[] document;

    @OneToOne(mappedBy = "lecture")
    private TestEntity test;
}
