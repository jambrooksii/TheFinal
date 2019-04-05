package com.detroitlabs.TheFinal;

import com.detroitlabs.TheFinal.model.CharacterWorld;
import com.detroitlabs.TheFinal.model.FilmTwoCharacters;
import com.detroitlabs.TheFinal.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CharacterSet {

    @Autowired
    private CharacterService characterService;

    @Autowired
    FilmTwoCharacters filmTwoCharacters;

    public ArrayList<FilmTwoCharacters> filmCharacter;


    public ArrayList<FilmTwoCharacters> getFilmCharacters() {
        return filmCharacter;
    }

    public void setFilmCharacters(ArrayList<FilmTwoCharacters> filmCharacters) {
        this.filmCharacter = filmCharacters;
    }


    public void filmTwoCharactersToArray(){

        CharacterWorld tatoo = characterService.getPlanet(1);
        CharacterWorld aldereen = characterService.getPlanet(2);
        CharacterWorld bespin = characterService.getPlanet(6);
        CharacterWorld naboo = characterService.getPlanet(8);
        CharacterWorld kamino = characterService.getPlanet(10);
        CharacterWorld kashyyyk = characterService.getPlanet(14);
        CharacterWorld stewjon = characterService.getPlanet(20);
        CharacterWorld corellia = characterService.getPlanet(22);
        CharacterWorld trandosha = characterService.getPlanet(29);
        CharacterWorld socorro = characterService.getPlanet(30);
        CharacterWorld unknown = characterService.getPlanet(28);

        FilmTwoCharacters lukeSkywalker = characterService.filmtwoCharacters(1);
        filmCharacter.add(lukeSkywalker);
        lukeSkywalker.setCharacterHomeTown(tatoo.getName());

        FilmTwoCharacters c3PO = characterService.filmtwoCharacters(2);
        filmCharacter.add(c3PO);
        c3PO.setCharacterHomeTown(tatoo.getName());

        FilmTwoCharacters r2D2 = characterService.filmtwoCharacters(3);
        filmCharacter.add(r2D2);
        r2D2.setCharacterHomeTown(naboo.getName());

        FilmTwoCharacters darthVader = characterService.filmtwoCharacters(4);
        filmCharacter.add(darthVader);
        darthVader.setCharacterHomeTown(tatoo.getName());

        FilmTwoCharacters obiWanKenobi = characterService.filmtwoCharacters(10);
        filmCharacter.add(obiWanKenobi);
        obiWanKenobi.setCharacterHomeTown(aldereen.getName());

        FilmTwoCharacters chewbacca = characterService.filmtwoCharacters(13);
        filmCharacter.add(chewbacca);
        chewbacca.setCharacterHomeTown(stewjon.getName());

        FilmTwoCharacters hanSoLo = characterService.filmtwoCharacters(14);
        filmCharacter.add(hanSoLo);
        hanSoLo.setCharacterHomeTown(kashyyyk.getName());

        FilmTwoCharacters wedgeAntilles = characterService.filmtwoCharacters(18);
        filmCharacter.add(wedgeAntilles);
        wedgeAntilles.setCharacterHomeTown(corellia.getName());

        FilmTwoCharacters yoda = characterService.filmtwoCharacters(20);
        filmCharacter.add(yoda);
        yoda.setCharacterHomeTown(unknown.getName());


        FilmTwoCharacters palpatine = characterService.filmtwoCharacters(21);
        filmCharacter.add(palpatine);
        palpatine.setCharacterHomeTown(naboo.getName());

        FilmTwoCharacters bobaFett = characterService.filmtwoCharacters(22);
        filmCharacter.add(bobaFett);
        bobaFett.setCharacterHomeTown(kamino.getName());

        FilmTwoCharacters iG88 = characterService.filmtwoCharacters(23);
        filmCharacter.add(iG88);
        iG88.setCharacterHomeTown(unknown.getName());

        FilmTwoCharacters bossk = characterService.filmtwoCharacters(24);
        filmCharacter.add(bossk);
        bossk.setCharacterHomeTown(trandosha.getName());

        FilmTwoCharacters landoCalrissian = characterService.filmtwoCharacters(25);
        filmCharacter.add(landoCalrissian);
        landoCalrissian.setCharacterHomeTown(socorro.getName());

        FilmTwoCharacters lobot = characterService.filmtwoCharacters(26);
        filmCharacter.add(lobot);
        lobot.setCharacterHomeTown(bespin.getName());
    }

    public FilmTwoCharacters findByName(String name){
        for (FilmTwoCharacters filmTwoCharacters: filmCharacter){
            if (filmTwoCharacters.getName().equalsIgnoreCase(name)){
                return filmTwoCharacters;
            }
        }
        return null;
    }


}


