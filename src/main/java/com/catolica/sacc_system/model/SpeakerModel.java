package com.catolica.sacc_system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "name_speakers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SpeakerModel {
    @EmbeddedId
    private SpeakerID id;

    @ManyToOne
    @MapsId("codeLecture")
    @JoinColumn(name = "code_lecture")
    private LectureModel lecture;
}
