package com.detroitlabs.TheFinal.service;


import com.detroitlabs.TheFinal.model.CharacterWrapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;



@Component
public class CharacterService {

    public CharacterWrapper getAllCharacter(){
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.USER_AGENT, "Spring");
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<CharacterWrapper> characterResponse = restTemplate.exchange("https://swapi.co/api/people/?format=json",
                HttpMethod.GET, new HttpEntity<>(headers), CharacterWrapper.class);

        return characterResponse.getBody();
    }
}
