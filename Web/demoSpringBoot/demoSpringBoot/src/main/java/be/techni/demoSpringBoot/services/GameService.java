package be.techni.demoSpringBoot.services;

import be.techni.demoSpringBoot.mapper.Mapper;
import be.techni.demoSpringBoot.model.dto.GameDTO;
import be.techni.demoSpringBoot.model.entities.Game;
import be.techni.demoSpringBoot.model.repositories.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class GameService implements Crudable<Game, GameDTO, Integer> {

    private final GameRepository repository;
    private final Mapper mapper;

    public GameService(GameRepository repository, Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<GameDTO> getAll() {
        return this.repository.findAll()
                .stream()
                .map(g -> mapper.toGameDto(g))
                .collect(Collectors.toList());
    }

    @Override
    public GameDTO getById(Integer integer) {
        return this.repository.findById(integer).stream().map(mapper::toGameDto).findFirst().orElseThrow(() -> new NoSuchElementException("LE game avec l'id :" + integer ));
    }

    @Override
    public boolean insert(Game game) {
        Game newGame = this.repository.save(game);

        return this.repository.findById(newGame.getId()).isPresent() ;
    }

    @Override
    public boolean update(Game game, Integer integer) {
        Game old = this.repository.getOne(integer);
        game.setId(integer);
        this.repository.save(game);
        return !old.equals(this.repository.getOne(integer));

    }

    @Override
    public boolean delete(Integer integer) {
        this.repository.deleteById(integer);
        return this.repository.findById(integer).isEmpty();
    }
}