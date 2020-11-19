package com.findmyteacher.api.student;

import java.util.Set;

public class Student {

    private String iPcn;
    private Set<Favourites> favourites;

    public String getiPcn() {
        return iPcn;
    }

    public void setiPcn(String iPcn) {
        this.iPcn = iPcn;
    }

    public Set<Favourites> getFavourites() {
        return favourites;
    }

    public void setFavourites(Set<Favourites> favourites) {
        this.favourites = favourites;
    }

    public Student() {

    }

    public Student(String iPcn, Set<Favourites> favourites) {
        this.iPcn = iPcn;
        this.favourites = favourites;
    }
}
