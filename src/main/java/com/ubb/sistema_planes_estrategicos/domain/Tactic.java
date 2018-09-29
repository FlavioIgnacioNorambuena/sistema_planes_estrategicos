package com.ubb.sistema_planes_estrategicos.domain;

public class Tactic extends CourseOfAction{
    String validity;


    public Tactic(String title, String description, String identifier, String creator, String validity) {
        super(title, description, identifier, creator);
        this.validity = validity;
    }

    public Tactic() {

    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }
}
