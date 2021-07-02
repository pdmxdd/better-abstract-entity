package com.company;

public class Screwdriver extends AbstractEntity {
    private String type;

    public Screwdriver(String type) {
        super();
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
