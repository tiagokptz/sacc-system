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

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "account_type")
    private String account_type;

    @Column(name = "url_photo")
    private String url_photo;

    @Column(name = "description")
    private String description;

    @ManyToMany
    @JoinTable(
            name = "teacher_mini_course",
            joinColumns = @JoinColumn(name = "id_teacher"),
            inverseJoinColumns = @JoinColumn(name = "code_course")
    )
    private Set<MiniCourseModel> courses = new HashSet<>();
}
