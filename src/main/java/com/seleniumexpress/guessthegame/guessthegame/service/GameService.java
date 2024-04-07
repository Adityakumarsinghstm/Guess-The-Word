package com.seleniumexpress.guessthegame.guessthegame.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Random;
@Service
public class GameService {
    private String[] randomWords = {"java","spring","developer","programmer","word","fater","mother"};

    Random random = new Random();
    @Override
    public String toString() {
        System.out.println(randomWords.length);
        return randomWords[random.nextInt(randomWords.length)];
    }
}
