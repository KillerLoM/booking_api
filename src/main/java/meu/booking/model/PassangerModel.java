package meu.booking.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Data
@Entity
@Table(name = "passangers")
public class PassangerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String numberphone;
    private String address;
    private Timestamp time;
    @Column(nullable = false, columnDefinition = "INT DEFAULT 1")
    private int numbertickets = 1;

}
