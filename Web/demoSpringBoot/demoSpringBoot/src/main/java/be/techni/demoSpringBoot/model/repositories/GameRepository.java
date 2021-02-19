package be.techni.demoSpringBoot.model.repositories;

import be.techni.demoSpringBoot.model.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {

}
