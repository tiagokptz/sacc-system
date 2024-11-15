package com.catolica.sacc_system.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class SpeakerID implements Serializable {
    @Column(name = "codeLecture")
    private Integer codeLecture;

    @Column(name = "nameSpeaker", length = 50)
    private String nameSpeaker;
}
