package com.solvd.taxiCompany.utils;

import com.solvd.taxiCompany.License;
import com.solvd.taxiCompany.Passenger;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class PassengerUtil  {
    public static ArrayList<Passenger> createPassengers() {
        ArrayList<Passenger> passengers = new ArrayList<>();
        Passenger passenger = new Passenger("Cristiano", "Ronaldo");
        Passenger passenger1 = new Passenger("Andrey", "Yarmolenko");
        passengers.add(passenger);
        passengers.add(passenger1);

        return passengers;
    }



}
