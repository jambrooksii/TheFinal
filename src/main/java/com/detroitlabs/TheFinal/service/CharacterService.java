package com.detroitlabs.TheFinal.service;


import com.detroitlabs.TheFinal.model.CharacterWorld;
import com.detroitlabs.TheFinal.model.FilmTwoCharacters;
import com.detroitlabs.TheFinal.model.FilmWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;



@Component
public class CharacterService {

@Autowired
    CharacterWorld characterWorld;


    public FilmWrapper geFilmTwo() {
        System.setProperty("http.agent", "StarWars");
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject("https://swapi.co/api/films/2", FilmWrapper.class);
    }

    public FilmTwoCharacters filmtwoCharacters(int charID){
        System.setProperty("http.agent", "n");
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://swapi.co/api/people/" + charID + "/",FilmTwoCharacters.class);

    }

    public FilmTwoCharacters getCharacterDataFromFilm(String url) {
        System.setProperty("http.agent", "StarWars");
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, FilmTwoCharacters.class);
    }

    public CharacterWorld getPlanet(int planetID){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.USER_AGENT, "");
        ResponseEntity<CharacterWorld> response = restTemplate.exchange("https://swapi.co/api/planets/" + planetID + "/?format=json",
                HttpMethod.GET, new HttpEntity<>(headers), CharacterWorld.class);
        return response.getBody();
    }


    }

