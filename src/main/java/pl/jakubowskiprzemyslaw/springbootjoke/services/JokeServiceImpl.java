package pl.jakubowskiprzemyslaw.springbootjoke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{
    public String getJoke(){
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
