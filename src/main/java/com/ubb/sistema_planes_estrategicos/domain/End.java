package com.ubb.sistema_planes_estrategicos.domain;

public class End extends Concept {
    String creator;
    String creationDate;
    String organizationUnit;

    public End(String title, String description, String identifier, String creator, String creationDate, String organizationUnit) {
        super(title, description, identifier);
        this.creator = creator;
        this.creationDate = creationDate;
        this.organizationUnit = organizationUnit;
    }

    public End() {

    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getOrganizationUnit() {
        return organizationUnit;
    }

    public void setOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
    }
}
