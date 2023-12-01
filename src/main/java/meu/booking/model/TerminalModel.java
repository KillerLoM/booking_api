package meu.booking.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "terminals")
@Data
public class TerminalModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String address;
    private boolean transit;
    @JsonIgnore
    @ManyToMany(mappedBy = "terminal")
    private List<DepartureModel> departures;
    @JsonIgnore
    @ManyToMany(mappedBy = "terminal")
    private List<DepartureModel> destionation;
}
