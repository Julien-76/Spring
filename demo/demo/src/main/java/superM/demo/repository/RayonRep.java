package superM.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import superM.demo.entities.Rayon;

public interface RayonRep extends JpaRepository<Rayon, Integer> {
}
