package com.detroitlabs.TheFinal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class FilmTwoCharacters {
    private String Name;
    private String characterHeight;
    private String characterMass;
    private String CharacterHairColor;
    private String characterEyeColor;
    private String characterBirthYear;
    private String characterGender;
    private String characterHomeTown;
    private String url;


    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("name")
    public String getName() {
        return Name;
    }


    @JsonProperty("name")
    public void setName(String name) {
        Name = name;
    }

    @JsonProperty("height")
    public String getCharacterHeight() {
        return characterHeight;
    }

    @JsonProperty("height")
    public void setCharacterHeight(String characterHeight) {
        this.characterHeight = characterHeight;
    }

    @JsonProperty("mass")
    public String getCharacterMass() {
        return characterMass;
    }


    @JsonProperty("mass")
    public void setCharacterMass(String characterMass) {
        this.characterMass = characterMass;
    }


    @JsonProperty("hair_color")
    public String getCharacterHairColor() {
        return CharacterHairColor;
    }


    @JsonProperty("hair_color")
    public void setCharacterHairColor(String characterHairColor) {
        CharacterHairColor = characterHairColor;
    }

    @JsonProperty("eye_color")
    public String getCharacterEyeColor() {
        return characterEyeColor;
    }

    @JsonProperty("eye_color")
    public void setCharacterEyeColor(String characterEyeColor) {
        this.characterEyeColor = characterEyeColor;
    }

    @JsonProperty("birth_year")
    public String getCharacterBirthYear() {
        return characterBirthYear;
    }


    @JsonProperty("birth_year")
    public void setCharacterBirthYear(String characterBirthYear) {
        this.characterBirthYear = characterBirthYear;
    }


    @JsonProperty("gender")
    public String getCharacterGender() {
        return characterGender;
    }

    @JsonProperty("gender")
    public void setCharacterGender(String characterGender) {
        this.characterGender = characterGender;
    }


    @JsonProperty("homeworld")
    public String getCharacterHomeTown() {
        return characterHomeTown;
    }

    @JsonProperty("homeworld")
    public void setCharacterHomeTown(String characterHomeTown) {
        this.characterHomeTown = characterHomeTown;
    }



    @Override
    public String toString() {
        return "CharacterResults{" +
                "Name='" + Name + '\'' +
                ", characterHeight='" + characterHeight + '\'' +
                ", characterMass='" + characterMass + '\'' +
                ", CharacterHairColor='" + CharacterHairColor + '\'' +
                ", characterEyeColor='" + characterEyeColor + '\'' +
                ", characterBirthYear='" + characterBirthYear + '\'' +
                ", characterGender='" + characterGender + '\'' +
                ", characterHomeTown='" + characterHomeTown + '\'' +
                '}';
    }
}
