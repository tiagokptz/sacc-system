package com.catolica.sacc_system.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "teacher")
public class TeacherModel {
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

    @Column(name = "description", length = 250)
    private String description;

    @ManyToMany
    @JoinTable(
            name = "teacher_mini_course",
            joinColumns = @JoinColumn(name = "id_teacher"),
            inverseJoinColumns = @JoinColumn(name = "code_course")
    )
    private Set<MiniCourseModel> courses = new HashSet<>();
}
