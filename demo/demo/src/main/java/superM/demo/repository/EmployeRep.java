package superM.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import superM.demo.entities.Employe;

public interface EmployeRep extends JpaRepository<Employe, Integer> {
}
