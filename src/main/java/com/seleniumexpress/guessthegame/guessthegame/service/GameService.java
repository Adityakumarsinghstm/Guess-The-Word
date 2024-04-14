package com.seleniumexpress.guessthegame.guessthegame.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Random;
@Service
public class GameService {
    private String randomlyChoosenWord = null;
    private String[] randomWords = {"java","spring","developer","programmer","word","fater","mother"};
    private char[] allCharacterOfTheWord ;
    Random random = new Random();


    public GameService() {
        randomlyChoosenWord = randomWords[random.nextInt(randomWords.length)];
        System.out.println("random word is : "+randomlyChoosenWord);
        allCharacterOfTheWord = new char[randomlyChoosenWord.length()];
    }

    @Override
    public String toString() {
        //System.out.println(randomWords.length);
        String ret = "";
        for(char c : allCharacterOfTheWord)
        {
            if(c == '\u0000')
            {
                ret = ret +"_";
            }
            ret = ret +" ";
        }

        return ret;
    }
}
