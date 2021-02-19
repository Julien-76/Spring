package be.techni.demoSpringBoot.controlleur;


import be.techni.demoSpringBoot.services.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "games")
public class GameControlleur {

    private final GameService service;

    public GameControlleur(GameService service) {
        this.service = service;
    }

    @GetMapping
    public ModelAndView getAllGames() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("game/getAll");
        mv.addObject("games", this.service.getAll());
        return mv;
    }

    @GetMapping("/one")
    public ModelAndView getOneById(@RequestParam("id") int id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("game/getOne");
        mv.addObject("game", this.service.getById(id));
        return mv;
    }
}
