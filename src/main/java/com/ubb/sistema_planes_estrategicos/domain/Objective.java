package com.ubb.sistema_planes_estrategicos.domain;

public class Objective extends DesiredResult {
    String measure;
    String timeTargeted;

    public Objective(String title, String description, String identifier, String creator, String creationDate, String organizationUnit, String stakeholder, String measure, String timeTargeted) {
        super(title, description, identifier, creator, creationDate, organizationUnit, stakeholder);
        this.measure = measure;
        this.timeTargeted = timeTargeted;
    }

    public Objective() {

    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public String getTimeTargeted() {
        return timeTargeted;
    }

    public void setTimeTargeted(String timeTargeted) {
        this.timeTargeted = timeTargeted;
    }
}
