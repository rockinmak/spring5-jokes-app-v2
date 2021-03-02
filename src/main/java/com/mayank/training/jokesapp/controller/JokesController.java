package com.mayank.training.jokesapp.controller;

import com.mayank.training.jokesapp.service.JokeReturnService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {


    private final JokeReturnService jokeReturnService;

    public JokesController(JokeReturnService jokeReturnService) {
        this.jokeReturnService = jokeReturnService;
    }

    @RequestMapping("/jokes")
    public String getJokes(Model model){

        model.addAttribute("jokes", jokeReturnService.getJokes());
        return "joketemplate";
    }



}
