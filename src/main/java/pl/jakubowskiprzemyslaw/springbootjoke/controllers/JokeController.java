package pl.jakubowskiprzemyslaw.springbootjoke.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.jakubowskiprzemyslaw.springbootjoke.services.JokeService;

@Controller
public class JokeController {

    JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping(value = {"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
}
