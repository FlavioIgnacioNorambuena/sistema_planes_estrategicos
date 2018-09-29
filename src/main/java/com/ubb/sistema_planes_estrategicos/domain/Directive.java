package com.ubb.sistema_planes_estrategicos.domain;

public class Directive extends Means {
    String manager;

    public Directive(String title, String description, String identifier, String manager) {
        super(title, description, identifier);
        this.manager = manager;
    }
    public Directive() {

    }
    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }


}
