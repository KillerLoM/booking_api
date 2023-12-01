package meu.booking.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "bus")
@Data
public class BusModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String plateNum;
    private String type;

//    @OneToOne
//    @JoinColumn(name = "driver_id") // Tên cột khoá ngoại trong bảng "bus"
//    private DriverModel driver;
}
