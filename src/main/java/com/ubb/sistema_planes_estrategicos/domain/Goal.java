package com.ubb.sistema_planes_estrategicos.domain;

public class Goal extends DesiredResult{
    public Goal(String title, String description, String identifier, String creator, String creationDate, String organizationUnit, String stakeholder) {
        super(title, description, identifier, creator, creationDate, organizationUnit, stakeholder);
    }

    public Goal() {
    }
}
