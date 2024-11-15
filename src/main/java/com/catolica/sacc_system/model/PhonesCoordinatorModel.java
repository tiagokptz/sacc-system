package com.catolica.sacc_system.model;

import jakarta.persistence.*;

@Entity
@Table(name = "coordinator_phones")
public class PhonesCoordinatorModel {
    @EmbeddedId
    private CoordinatorPhoneID id;

    @ManyToOne
    @MapsId("idCoordinator")
    @JoinColumn(name = "id_coordinator", referencedColumnName = "id", foreignKey = @ForeignKey(name = "id_coordinator_FK"))
    private CoordinatorModel coordinator;
}
