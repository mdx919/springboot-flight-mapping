package com.jsonapi.naim;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Flights {
   private static List<Flight> flights;


    public List<Flight> getFlights() {
        flights = new ArrayList<>();
        Flight fl = new Flight();
        fl.setDeparts(new Date(2016-1900, 6, 22));
        fl.setId(4);
        fl.setDestination("London");
        Flight fl2 = new Flight();

        fl2.setDeparts(new Date(2016-1900, 6, 22));
        fl2.setId(6);
        fl2.setDestination("NYC");

        List<Flight> flights = new ArrayList<>();
        flights.add(fl);
        flights.add(fl2);

        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }


}
