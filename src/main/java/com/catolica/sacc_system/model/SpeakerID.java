package com.catolica.sacc_system.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

@Embeddable
public class SpeakerID implements Serializable {
    private Integer codeLecture;

    @NotBlank
    @Size(min = 15, max = 50)
    private String nameSpeaker;
}
