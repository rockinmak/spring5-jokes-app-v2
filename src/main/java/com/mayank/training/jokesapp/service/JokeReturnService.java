package com.mayank.training.jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeReturnService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeReturnService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getJokes(){

        return chuckNorrisQuotes.getRandomQuote();
    }
}
