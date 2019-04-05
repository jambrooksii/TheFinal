package com.detroitlabs.TheFinal.controller;


import com.detroitlabs.TheFinal.CharacterSet;
import com.detroitlabs.TheFinal.model.FilmTwoCharacters;
import com.detroitlabs.TheFinal.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class CharacterController {


    @Autowired
    CharacterService characterService;

    @Autowired
    CharacterSet characterSet;









    @RequestMapping("/")
    public String characterHomePage(ModelMap modelMap){
        characterSet.filmTwoCharactersToArray();
        ArrayList<FilmTwoCharacters> filmTwoCharacters = characterSet.getFilmCharacters();
        modelMap.put("filmTwoCharacters", filmTwoCharacters);
  return "home";
    }

@RequestMapping("/new/{name}")
    public String characterData(@PathVariable String name, ModelMap modelMap){
        FilmTwoCharacters filmTwoCharacters = characterSet.findByName(name);
        modelMap.put("filmTwoCharacters", filmTwoCharacters);
        return "new";
}


}
