package com.catolica.sacc_system.model;


import jakarta.persistence.*;

@Entity
@Table(name = "coordinator")
public class CoordinatorModel {
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
    private String account_type;

    @Column(name = "url_photo")
    private String url_photo;
}
