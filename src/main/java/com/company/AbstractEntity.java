package com.company;

public abstract class AbstractEntity {

    private static int idTracker = 0;

    private int id;

    public AbstractEntity() {
        this.id = getNextId();
    }

    public int getId() {
        return id;
    }

    private static int getNextId() {
        idTracker++;
        return idTracker;
    }
}
