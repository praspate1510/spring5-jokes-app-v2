package com.yukraainfo.spring5jokesappv2.controller;

import com.yukraainfo.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/")
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}
