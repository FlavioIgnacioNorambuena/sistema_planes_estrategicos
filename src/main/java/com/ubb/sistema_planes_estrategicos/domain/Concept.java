package com.ubb.sistema_planes_estrategicos.domain;

public class Concept {
    String title;
    String description;
    String identifier;

    public Concept(String title, String description, String identifier) {
        this.title = title;
        this.description = description;
        this.identifier = identifier;
    }

    public Concept() {
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
