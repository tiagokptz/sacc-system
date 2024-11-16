package com.catolica.sacc_system.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "mini_course")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MiniCourseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;

    @ManyToOne
    @JoinColumn(name = "id_coordinator")
    private CoordinatorModel coordinator;

    @NotNull
    @Size(min = 35, max = 70)
    private String title;

    @NotNull
    @Size(min = 50, max = 350)
    private String description;

    @NotNull
    @Column(name = "number_vacancies")
    private Integer numberVacancies; //fazer um CHECK > 0

    @NotNull
    @Column(name = "start_date")
    private LocalDate startDate;

    @NotNull
    @Column(name = "end_date")
    private LocalDate endDate;

    @NotNull
    private LocalTime shedule;

    @ManyToMany(mappedBy = "courses")
    private Set<TeacherModel> teachers = new HashSet<>();

    @ManyToMany(mappedBy = "courses")
    private Set<StudentModel> students = new HashSet<>();
}
