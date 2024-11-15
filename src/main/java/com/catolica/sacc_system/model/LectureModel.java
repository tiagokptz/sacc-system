package com.catolica.sacc_system.model;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "lecture")
public class LectureModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code")
    private Integer code;

    @ManyToOne
    @JoinColumn(name = "id_coordinator", referencedColumnName = "id", foreignKey = @ForeignKey(name = "id_coord_lecture_FK"))
    private CoordinatorModel coordinator;

    @Column(name = "title", nullable = false, length = 70)
    private String title;

    @Column(name = "description", nullable = false, length = 350)
    private String description;

    @Column(name = "shedule", nullable = false)
    private LocalTime shedule;

    @ManyToMany(mappedBy = "lectures")
    private Set<StudentModel> students = new HashSet<>();
}
