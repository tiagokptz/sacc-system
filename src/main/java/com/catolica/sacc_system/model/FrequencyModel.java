package com.catolica.sacc_system.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "frequency")
public class FrequencyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;

    @NotNull
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "code_course")
    private MiniCourseModel miniCourse;

    @ManyToOne
    @JoinColumn(name = "code_lecture")
    private LectureModel lecture;

    @ManyToMany(mappedBy = "frequencies")
    private Set<StudentModel> students = new HashSet<>();
}
