package com.findmyteacher.api.student.model;

import java.util.Set;

public class Favourites {

    private Set<String> iPcns;

    public Set<String> getiPcns() {
        return iPcns;
    }

    public void setiPcns(Set<String> iPcns) {
        this.iPcns = iPcns;
    }

    public Favourites() {

    }

    public Favourites(Set<String> iPcns) {
        this.iPcns = iPcns;
    }
}
