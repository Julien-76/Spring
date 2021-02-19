package be.jul.medecin.repository;

import be.jul.medecin.entities.Cabinet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CabinetRepository extends JpaRepository<Cabinet, Integer> {
}
