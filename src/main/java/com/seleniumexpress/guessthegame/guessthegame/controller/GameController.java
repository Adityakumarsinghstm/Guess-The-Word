package com.seleniumexpress.guessthegame.guessthegame.controller;

import com.seleniumexpress.guessthegame.guessthegame.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class GameController {
    @Autowired
    private GameService gameService;
    @GetMapping("/game-home")
    public String showGamePage(Model model)
    {
        String randomWord = gameService.toString();
        model.addAttribute("wordToDisplay",randomWord);
        return "game-home-page";
    }
}
