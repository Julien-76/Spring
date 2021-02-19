package be.techni.demoSpringBoot.mapper;

import be.techni.demoSpringBoot.model.dto.GameDTO;
import be.techni.demoSpringBoot.model.entities.Game;
import org.springframework.stereotype.Service;

@Service
public class Mapper {

    public GameDTO toGameDto(Game game) {
        return GameDTO.builder().id(game.getId()).name(game.getName()).nbJoueurs(game.getNbJoueurs()).build();
    }

    public Game toGameEntity(GameDTO game) {
        return Game.builder().id(game.getId()).name(game.getName()).nbJoueurs(game.getNbJoueurs()).build();
    }
}
