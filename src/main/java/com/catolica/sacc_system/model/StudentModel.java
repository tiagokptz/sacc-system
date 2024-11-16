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
@Table(name = "student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel {
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
    @Size(min = 15, max = 35)
    private String course;

    @NotNull
    @Size(min = 35, max = 50)
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
