package meu.booking.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "destinations")
public class DestinationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String nameplug;
    private String address;
    @ManyToMany
    @JoinTable(name = "destionation_terminal",
            joinColumns = @JoinColumn(name = "destination_id"),
            inverseJoinColumns = @JoinColumn(name = "terminal_id"))
    private List<TerminalModel> terminal;
}
