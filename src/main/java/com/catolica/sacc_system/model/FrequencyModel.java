package com.catolica.sacc_system.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "frequency")
public class FrequencyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;

    @Column(name = "date")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "code_course", referencedColumnName = "code", foreignKey = @ForeignKey(name="code_course_freq_FK"))
    private MiniCourseModel miniCourse;

    @ManyToOne
    @JoinColumn(name = "code_lecture", referencedColumnName = "code", foreignKey = @ForeignKey(name = "code_lecture_freq_FK"))
    private LectureModel lecture;

    @ManyToMany(mappedBy = "frequencies")
    private Set<StudentModel> students = new HashSet<>();
}
