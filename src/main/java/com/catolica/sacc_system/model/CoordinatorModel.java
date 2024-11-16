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

@Entity
@Table(name = "coordinator")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CoordinatorModel {
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
}
