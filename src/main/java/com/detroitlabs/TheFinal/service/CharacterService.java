package com.detroitlabs.TheFinal.service;


import com.detroitlabs.TheFinal.model.FillTwoCharacters;
import com.detroitlabs.TheFinal.model.FilmWrapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;



@Component
public class CharacterService {

    public FillTwoCharacters filltwoCharacters(String url){
        System.setProperty("http.agent", "name");
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, FillTwoCharacters.class);

    }


    public FilmWrapper geFilmTwo() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("user-agent", "spring");
        HttpEntity entity = new HttpEntity(headers);
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<FilmWrapper> response = restTemplate.exchange("https://swapi.co/api/films/2", HttpMethod.GET, entity, FilmWrapper.class);
        return response.getBody();
    }

    public FillTwoCharacters getCharacterDataFromFilm(String url) {
        System.setProperty("http.agent", "StarWars");
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, FillTwoCharacters.class);
    }

    @Component
    public class SwapiWebService {

        public FilmWrapper filmWrapper() {
            System.setProperty("http.agent", "StarWars");

            RestTemplate restTemplate = new RestTemplate();
            return restTemplate.getForObject("https://swapi.co/api/films/2", FilmWrapper.class);
        }

    }
}
