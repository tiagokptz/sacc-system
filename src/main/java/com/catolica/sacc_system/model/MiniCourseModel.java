package com.catolica.sacc_system.model;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "mini_course")
public class MiniCourseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code")
    private Integer code;

    @ManyToOne
    @JoinColumn(name = "id_coordinator", referencedColumnName = "id", foreignKey = @ForeignKey(name = "id_coord_course_FK"))
    private CoordinatorModel coordinator;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "number_vacancies")
    private Integer number_vacancies; //fazer um CHECK > 0

    @Column(name = "start_date")
    private LocalDate start_date;

    @Column(name = "end_date")
    private LocalDate end_date;

    @Column(name = "shedule")
    private LocalTime shedule;

    @ManyToMany(mappedBy = "courses")
    private Set<TeacherModel> teachers = new HashSet<>();

    @ManyToMany(mappedBy = "courses")
    private Set<StudentModel> students = new HashSet<>();
}
