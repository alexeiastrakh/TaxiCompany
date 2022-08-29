package com.solvd.taxiCompany.utils;

import java.util.ArrayList;
import com.solvd.taxiCompany.Passenger;


public class PassengerUtil {
    public static ArrayList<Passenger> createPassengers() {
        ArrayList<Passenger> passengers = new ArrayList<>();
        Passenger passenger = new Passenger("Cristiano", "Ronaldo");
        Passenger passenger1 = new Passenger("Andrey", "Yarmolenko");
        passengers.add(passenger);
        passengers.add(passenger1);

        return passengers;
    }
}
