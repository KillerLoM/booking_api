package meu.booking.repository;

import meu.booking.model.DepartureModel;
import meu.booking.model.DestinationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface destinationRepository extends JpaRepository<DestinationModel, Integer> {
}
