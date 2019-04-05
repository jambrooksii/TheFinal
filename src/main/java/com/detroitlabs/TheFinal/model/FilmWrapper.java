package com.detroitlabs.TheFinal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FilmWrapper {

private List<String> charactersData;


@JsonProperty("characters")
    public List<String> getCharactersData() {
        return charactersData;
    }

    @JsonProperty("characters")
    public void setCharactersData(List<String> charactersData) {
        this.charactersData = charactersData;
    }

    @Override
    public String toString() {
        return "FilmWrapper{" +
                "charactersData=" + charactersData +
                '}';
    }
}
