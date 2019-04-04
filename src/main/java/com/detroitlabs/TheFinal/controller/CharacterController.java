package com.detroitlabs.TheFinal.controller;


import com.detroitlabs.TheFinal.model.CharacterResults;
import com.detroitlabs.TheFinal.model.CharacterWrapper;
import com.detroitlabs.TheFinal.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

public class CharacterController {

    @Autowired
    CharacterWrapper characterWrapper;

    @Autowired
    CharacterResults characterResults;

    @Autowired
    CharacterService characterService;




    @RequestMapping("/home")
    public String testHomePage(ModelMap modelMap){
        CharacterWrapper characterWrapper = characterService.getAllCharacter();
        ArrayList<CharacterResults> characterResults = characterWrapper.getResults();
        modelMap.put("characterResults", characterResults);



        return "home";
    }
}
