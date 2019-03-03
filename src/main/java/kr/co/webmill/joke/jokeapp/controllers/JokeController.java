package kr.co.webmill.joke.jokeapp.controllers;

import kr.co.webmill.joke.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    private JokeService jokeService;

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }


}
