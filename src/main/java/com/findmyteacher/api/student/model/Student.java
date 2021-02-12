package com.findmyteacher.api.student.model;


import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Student {

    @Id
    private String iPcn;

    @ElementCollection
    private Set<String> favourites;

    public String getiPcn() {
        return iPcn;
    }

    public void setiPcn(String iPcn) {
        this.iPcn = iPcn;
    }

    public Set<String> getFavourites() {
        return favourites;
    }

    public void setFavourites(Set<String> favourites) {
        this.favourites = favourites;
    }

    public Student() {

    }

    public Student(String iPcn, Set<String> favourites) {
        this.iPcn = iPcn;
        this.favourites = favourites;
    }
}
