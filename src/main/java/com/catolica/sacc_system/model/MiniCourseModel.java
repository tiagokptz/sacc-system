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

    @Column(name = "title", nullable = false, length = 70)
    private String title;

    @Column(name = "description", nullable = false, length = 350)
    private String description;

    @Column(name = "number_vacancies", nullable = false)
    private Integer number_vacancies; //fazer um CHECK > 0

    @Column(name = "start_date", nullable = false)
    private LocalDate start_date;

    @Column(name = "end_date", nullable = false)
    private LocalDate end_date;

    @Column(name = "shedule", nullable = false)
    private LocalTime shedule;

    @ManyToMany(mappedBy = "courses")
    private Set<TeacherModel> teachers = new HashSet<>();

    @ManyToMany(mappedBy = "courses")
    private Set<StudentModel> students = new HashSet<>();
}
