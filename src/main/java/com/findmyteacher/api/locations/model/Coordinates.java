package com.findmyteacher.api.locations.model;

public class Coordinates {

    private float x;
    private float y;
    private String floorHierarchy;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String getFloorHierarchy() {
        return floorHierarchy;
    }

    public void setFloorHierarchy(String floorHierarchy) {
        this.floorHierarchy = floorHierarchy;
    }

    public Coordinates() {

    }

    public Coordinates(float x, float y, String floorHierarchy) {
        this.x = x;
        this.y = y;
        this.floorHierarchy = floorHierarchy;
    }
}
