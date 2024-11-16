package com.catolica.sacc_system.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "teacher")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeacherModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @NotBlank
    @Size(min = 3, max = 50)
    private String name;

    @NotNull
    @NotBlank
    @Email
    @Column(unique = true)
    private String email;

    @NotNull
    @NotBlank
    @Size(min = 6, max = 50)
    private String password;

    @NotNull
    @Column(name = "account_type")
    private String accountType;

    @NotNull
    @Column(name = "url_photo")
    private String photoUrl;

    @NotNull
    @Size(min = 50, max = 250)
    private String description;

    @ManyToMany
    @JoinTable(
            name = "teacher_mini_course",
            joinColumns = @JoinColumn(name = "id_teacher"),
            inverseJoinColumns = @JoinColumn(name = "code_course")
    )
    private Set<MiniCourseModel> courses = new HashSet<>();
}
