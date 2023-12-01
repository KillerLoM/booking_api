package meu.booking.repository;

import meu.booking.model.Bus29S;
import meu.booking.model.TerminalModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface bus29sRepository extends JpaRepository<Bus29S, UUID> {
    Bus29S findBus29SById(UUID id);
}
