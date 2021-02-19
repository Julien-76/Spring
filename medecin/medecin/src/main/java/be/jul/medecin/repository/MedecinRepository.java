package be.jul.medecin.repository;

import be.jul.medecin.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin, Integer> {
}
