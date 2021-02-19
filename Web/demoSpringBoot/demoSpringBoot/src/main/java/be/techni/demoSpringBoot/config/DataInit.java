package be.techni.demoSpringBoot.config;


import be.techni.demoSpringBoot.model.entities.Game;
import be.techni.demoSpringBoot.services.GameService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DataInit implements InitializingBean {

    private final GameService gameservice;

    private List<Game> games = Arrays.asList(
            Game.builder()
            .name("Stratego")
            .nbJoueurs(2)
            .build(),
            Game.builder()
                    .name("Puissance 4")
            .nbJoueurs(2)
            .build(),
            Game.builder()
                    .name("Monopoly")
            .nbJoueurs(4)
            .build()
    );


    public DataInit(GameService service) {
        this.gameservice = service;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.games.forEach(gameservice::insert);
    }
}
