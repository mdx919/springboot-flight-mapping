package com.jsonapi.naim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class PageController {

    @Autowired
    Flights flights;

    @GetMapping("/json/simple-object")
    public Person helloWorld() {
        Person p = new Person("md", "uddin");

        p.setFirstname("md");
        p.setLastname("uddin");

        return p;
    }

    @GetMapping("/json/simple-array")
    public List<Person> createArray() {
        List<Person> p = new ArrayList<>();

        p.add(new Person("md", "uddin"));
        p.add(new Person("hello", "world"));

        return p;
    }

    @GetMapping("/flights")
    public List<Flight> listFlights() {

        return flights.getFlights();
    }

//    @GetMapping("/flights")
//    public List<Flight> listFlights() {
//        List<Flight> flights = new ArrayList<>();
//        Flight fl = new Flight(new Date(2014 - 1900, 6, 8), 1, "London");
//
//        flights.add(fl);
//        return flights;
//    }


}
