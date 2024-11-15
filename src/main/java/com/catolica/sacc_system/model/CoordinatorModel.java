package com.catolica.sacc_system.model;


import jakarta.persistence.*;

@Entity
@Table(name = "coordinator")
public class CoordinatorModel {
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
}
