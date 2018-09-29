package com.ubb.sistema_planes_estrategicos.domain;

public class CourseOfAction extends Means{
    String creator;

    public CourseOfAction(String title, String description, String identifier, String creator) {
        super(title, description, identifier);
        this.creator = creator;
    }

    public CourseOfAction() {

    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
