package com.ubb.sistema_planes_estrategicos.domain;

public class DesiredResult extends End {
    String stakeholder;

    public DesiredResult(String title, String description, String identifier, String creator, String creationDate, String organizationUnit, String stakeholder) {
        super(title, description, identifier, creator, creationDate, organizationUnit);
        this.stakeholder = stakeholder;
    }

    public DesiredResult() {
    }

    public String getStakeholder() {
        return stakeholder;
    }

    public void setStakeholder(String stakeholder) {
        this.stakeholder = stakeholder;
    }
}
