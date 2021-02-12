package com.findmyteacher.api.locations.model;

public class Coordinates {

    private float x;
    private float y;
    private String mapHierarchyFloor;

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

    public String getMapHierarchyFloor() {
        return mapHierarchyFloor;
    }

    public void setMapHierarchyFloor(String mapHierarchyFloor) {
        this.mapHierarchyFloor = mapHierarchyFloor;
    }

    public Coordinates() {

    }

    public Coordinates(float x, float y, String mapHierarchyFloor) {
        this.x = x;
        this.y = y;
        this.mapHierarchyFloor = mapHierarchyFloor;
    }
}
