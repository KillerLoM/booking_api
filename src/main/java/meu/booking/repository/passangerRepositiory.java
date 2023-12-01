package meu.booking.repository;

import meu.booking.model.DestinationModel;
import meu.booking.model.PassangerModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;

public interface passangerRepositiory  extends JpaRepository<PassangerModel, Integer> {
    PassangerModel findByTime(Timestamp time);
}
