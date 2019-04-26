package com.jsonapi.naim;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Flight {
    private Date departs;
    private int id;
    private String destination;

    public Flight() { }

    public Flight(Date departs, int id, String destination) {
        this.departs = departs;
        this.id = id;
        this.destination = destination;
    }

    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getDeparts() {
        return departs;
    }

    public void setDeparts(Date departs) {
        this.departs = departs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
