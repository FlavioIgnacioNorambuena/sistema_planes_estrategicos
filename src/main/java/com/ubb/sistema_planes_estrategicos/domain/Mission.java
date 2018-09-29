package com.ubb.sistema_planes_estrategicos.domain;

public class Mission extends Means {
    String action;
    String market;
    String result;

    public Mission(String title, String description, String identifier, String action, String market, String result) {
        super(title, description, identifier);
        this.action = action;
        this.market = market;
        this.result = result;
    }

    public Mission() {

    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
