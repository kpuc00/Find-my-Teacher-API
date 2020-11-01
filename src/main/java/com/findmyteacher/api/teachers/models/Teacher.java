package com.findmyteacher.api.teachers.models;

import com.findmyteacher.api.locations.Location;

public class Teacher {

    private int pcn;
    private String firstName;
    private String lastName;
    private boolean isVisible;

    private Location location;

    public Teacher() {
    }

    public Teacher(int pcn, String firstName, String lastName, boolean isVisible, Location location) {
        this.pcn = pcn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isVisible = isVisible;
        this.location = location;
    }

    public int getPcn() {
        return pcn;
    }

    public void setPcn(int pcn) {
        this.pcn = pcn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
