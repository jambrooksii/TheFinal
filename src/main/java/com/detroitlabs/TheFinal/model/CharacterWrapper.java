package com.detroitlabs.TheFinal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CharacterWrapper {

    ArrayList<CharacterResults> results = new ArrayList<>();

    @JsonProperty("results")
    public ArrayList<CharacterResults> getResults() {
        return results;
    }


    @JsonProperty("results")
    public void setResults(ArrayList<CharacterResults> results) {
        this.results = results;
    }
}