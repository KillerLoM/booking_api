package meu.booking.repository;

import meu.booking.model.DepartureModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface departureRepository extends JpaRepository<DepartureModel, Integer> {
}
