package com.company;

public class Hammer extends AbstractEntity {
    private String type;

    public Hammer(String type) {
        super();
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
