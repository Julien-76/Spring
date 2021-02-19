package superM.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import superM.demo.entities.Supermarche;

public interface SupermarcheRep extends JpaRepository<Supermarche, Integer> {
}
