package com.detroitlabs.TheFinal.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
@Component
public class CharactersData extends ArrayList<FilmTwoCharacters> {


}
