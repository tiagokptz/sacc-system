package com.catolica.sacc_system.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "student")
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "email", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "password", nullable = false, length = 50)
    private String password;

    @Column(name = "account_type", nullable = false, length = 20)
    private String accountType;

    @Column(name = "url_photo")
    private String photoUrl;

    @Column(name = "course", nullable = false, length = 35)
    private String course;

    @Column(name = "institution", nullable = false, length = 50)
    private String institution;

    @Column(name = "payment_confirm")
    private boolean paymentConfirm;

    @ManyToMany
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "id_student"),
            inverseJoinColumns = @JoinColumn(name = "code_course")
    )
    private Set<MiniCourseModel> courses = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "student_lecture",
            joinColumns = @JoinColumn(name = "id_student"),
            inverseJoinColumns = @JoinColumn(name = "code_lecture")
    )
    private Set<LectureModel> lectures = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "student_lecture",
            joinColumns = @JoinColumn(name = "id_student"),
            inverseJoinColumns = @JoinColumn(name = "code_frequency")
    )
    private Set<FrequencyModel> frequencies = new HashSet<>();
}
