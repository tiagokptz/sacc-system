package com.catolica.sacc_system.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "coordinator_phones")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TelephoneModel {
    @EmbeddedId
    private TelephoneID id;

    @ManyToOne
    @MapsId("idCoordinator")
    @JoinColumn(name = "id_coordinator")
    private CoordinatorModel coordinator;
}
