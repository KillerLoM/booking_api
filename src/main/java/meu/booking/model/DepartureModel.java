package meu.booking.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.*;
@Entity
@Data
@Table(name = "departures")
public class DepartureModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String nameplug;
    private String address;
    @ManyToMany
    @JoinTable(name = "departure_terminal",
            joinColumns = @JoinColumn(name = "departure_id"),
            inverseJoinColumns = @JoinColumn(name = "terminal_id"))
    private List<TerminalModel> terminal;
}
