package com.findmyteacher.api.teachers.models;

import com.findmyteacher.api.locations.model.Coordinates;

public class Teacher {

    private String iPcn;
    private Coordinates coordinates;

    public String getiPcn() {
        return iPcn;
    }

    public void setiPcn(String iPcn) {
        this.iPcn = iPcn;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Teacher() {

    }

    public Teacher(String iPcn, Coordinates coordinates) {
        this.iPcn = iPcn;
        this.coordinates = coordinates;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Teacher))
            return false;
        Teacher teacher = (Teacher) obj;

        return iPcn.equals(((Teacher) obj).getiPcn());
    }
}
