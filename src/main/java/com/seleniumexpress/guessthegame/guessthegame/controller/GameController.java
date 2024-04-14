package com.seleniumexpress.guessthegame.guessthegame.controller;

import com.seleniumexpress.guessthegame.guessthegame.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {
    @Autowired
    private GameService gameService;
    @GetMapping("/game-home")
    public String showGamePage(@RequestParam(value = "guessedChar", required = false) String guessedChar, Model model)
    {
        System.out.println("guessed char is :"+guessedChar);
        String randomWord = gameService.toString();
        model.addAttribute("wordToDisplay",randomWord);
        return "game-home-page";
    }
}
