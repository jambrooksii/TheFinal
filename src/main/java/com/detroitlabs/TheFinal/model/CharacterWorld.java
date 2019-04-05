package com.detroitlabs.TheFinal.model;

import org.springframework.stereotype.Component;

@Component
public class CharacterWorld {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CharacterWorld{" +
                "name='" + name + '\'' +
                '}';
    }
}
