package com.ubb.sistema_planes_estrategicos.domain;

public class Influencer extends Concept {
    String type;

    public Influencer(String title, String description, String identifier, String type) {
        super(title, description, identifier);
        this.type = type;
    }
    public Influencer() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
