package com.ubb.sistema_planes_estrategicos.domain;

public class BusinessPolicy extends Directive {
    public BusinessPolicy(String title, String description, String identifier, String manager) {
        super(title, description, identifier, manager);
    }

    public BusinessPolicy() {
    }
}
