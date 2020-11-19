package com.findmyteacher.api.student.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;

@Document
public class Student {

    @Id
    private String iPcn;

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
