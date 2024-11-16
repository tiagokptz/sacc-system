package com.catolica.sacc_system.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

@Embeddable
public class TelephoneID implements Serializable {
    private Integer idCoordinator;

    @NotBlank
    @Size(max = 20)
    private String telephone;

}
