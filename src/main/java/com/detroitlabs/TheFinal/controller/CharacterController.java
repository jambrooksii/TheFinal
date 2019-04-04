package com.detroitlabs.TheFinal.controller;


import com.detroitlabs.TheFinal.model.CharactersData;
import com.detroitlabs.TheFinal.model.CharacterWrapper;
import com.detroitlabs.TheFinal.model.FillTwoCharacters;
import com.detroitlabs.TheFinal.model.FilmWrapper;
import com.detroitlabs.TheFinal.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class CharacterController {

    @Autowired
    CharacterWrapper characterWrapper;

    @Autowired
    CharactersData characterResults;

    @Autowired
    CharacterService characterService;









    @RequestMapping("/")

    public String testHomePage(ModelMap modelMap){
FilmWrapper filmWrapper = characterService.geFilmTwo();
modelMap.put("StarWars2",filmWrapper );

        ArrayList<String> movieTwoCharacters = new ArrayList<>();

        for (String character : filmWrapper.getCharactersData()) {
            movieTwoCharacters.add(character);
        }

        modelMap.put("Character", movieTwoCharacters);

        ArrayList<FillTwoCharacters> fillTwoCharacters = new ArrayList<>();

        for (String character2: movieTwoCharacters) {
            fillTwoCharacters.add(characterService.filltwoCharacters(character2));
        }

        for (int i = 0; i < movieTwoCharacters.size() ; i++) {
            fillTwoCharacters.get(i).setUrl(movieTwoCharacters.get(i));
        }

        ArrayList<FillTwoCharacters> movieCharacterObjects =

  return "home";
    }


}
