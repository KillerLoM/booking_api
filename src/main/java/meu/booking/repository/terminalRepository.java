package meu.booking.repository;

import meu.booking.model.TerminalModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface terminalRepository extends JpaRepository<TerminalModel, UUID> {
}
