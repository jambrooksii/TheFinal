package com.detroitlabs.TheFinal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CharacterWrapper {

    ArrayList<CharactersData> results = new ArrayList<>();

    @JsonProperty("results")
    public ArrayList<CharactersData> getResults() {
        return results;
    }


    @JsonProperty("results")
    public void setResults(ArrayList<CharactersData> results) {
        this.results = results;
    }
}