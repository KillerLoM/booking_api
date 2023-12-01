package meu.booking.model;

import com.fasterxml.jackson.databind.DatabindException;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "drivers")
public class DriverModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Date dob;
    private String numberphone;
    private String address;
//    @OneToOne(mappedBy = "driver")
//    private BusModel bus;

}
