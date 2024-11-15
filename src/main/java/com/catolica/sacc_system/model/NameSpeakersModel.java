package com.catolica.sacc_system.model;

import jakarta.persistence.*;

@Entity
@Table(name = "name_speakers")
public class NameSpeakersModel {
    @EmbeddedId
    private NameSpeakersID id;

    @ManyToOne
    @MapsId("codeLecture")
    @JoinColumn(name = "code_lecture", referencedColumnName = "code", foreignKey = @ForeignKey(name = "code_lecture_FK"))
    private LectureModel lecture;
}
