package com.catolica.sacc_system.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "lecture")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LectureModel {
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
    private LocalTime shedule;

    @ManyToMany(mappedBy = "lectures")
    private Set<StudentModel> students = new HashSet<>();
}
