package com.ubb.sistema_planes_estrategicos.domain;

public class BusinessPlan {
    String title;
    String creator;
    String creationDate;

    public BusinessPlan(String title, String creator, String creationDate) {
        this.title = title;
        this.creator = creator;
        this.creationDate = creationDate;
    }

    public BusinessPlan() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
}
