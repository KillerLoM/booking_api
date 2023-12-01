package meu.booking.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "bus29")
public class Bus29S {
    @Id
    private UUID id = UUID.randomUUID();

    @OneToOne()
    private PassangerModel passanger1;
    @OneToOne()
    private PassangerModel passanger2;
    @OneToOne()
    private PassangerModel passanger3;
    @OneToOne()
    private PassangerModel passanger4;
    @OneToOne()
    private PassangerModel passanger5;
    @OneToOne()
    private PassangerModel passanger6;
    @OneToOne()
    private PassangerModel passanger7;
    @OneToOne()
    private PassangerModel passanger8;
    @OneToOne()
    private PassangerModel passanger9;
    @OneToOne()
    private PassangerModel passanger10;
    @OneToOne()
    private PassangerModel passanger11;
    @OneToOne()
    private PassangerModel passanger12;
    @OneToOne()
    private PassangerModel passanger13;
    @OneToOne()
    private PassangerModel passanger14;
    @OneToOne()
    private PassangerModel passanger15;
    @OneToOne()
    private PassangerModel passanger16;
    @OneToOne()
    private PassangerModel passanger17;
    @OneToOne()
    private PassangerModel passanger18;
    @OneToOne()
    private PassangerModel passanger19;
    @OneToOne()
    private PassangerModel passanger20;
    @OneToOne()
    private PassangerModel passanger21;
    @OneToOne()
    private PassangerModel passanger22;
    @OneToOne()
    private PassangerModel passanger23;
    @OneToOne()
    private PassangerModel passanger24;
    @OneToOne()
    private PassangerModel passanger25;
    @OneToOne()
    private PassangerModel passanger26;
    @OneToOne()
    private PassangerModel passanger27;
    @OneToOne()
    private PassangerModel passanger28;
    @OneToOne()
    private PassangerModel passanger29;
}
