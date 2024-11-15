package com.catolica.sacc_system.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CoordinatorPhoneID implements Serializable {
    @Column(name = "idCoordinator")
    private Integer idCoordinator;

    @Column(name = "telephone")
    private String telephone;

}
