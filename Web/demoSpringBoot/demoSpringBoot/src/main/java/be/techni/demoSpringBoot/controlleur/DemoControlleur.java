package be.techni.demoSpringBoot.controlleur;


import be.techni.demoSpringBoot.model.entities.Game;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(path = "/test")
public class DemoControlleur {

    List<Game> games = Arrays.asList(
            new Game(1,"Stratego", 2),
            new Game(2,"Monopoly", 4),
            new Game(3,"Puissance 4", 2)
    );

    @RequestMapping(path = "/coucou", method = RequestMethod.GET)
    public ModelAndView sayHello() {
        ModelAndView mv = new ModelAndView("coucou");
        mv.addObject("game", games);
        return mv;
    }
}
